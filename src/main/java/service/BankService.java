package service;

import entities.CompteEntity;
import exception.NotFoundException;
import repository.CurrencyRepository;
import repository.CompteRepository;

import javax.jws.WebService;
import java.util.List;
import java.util.Set;

@WebService(endpointInterface = "service.iBankService") // Specify full interface name
public class BankService implements iBankService {
    private final CurrencyRepository currencyRepository;
    private final double tauxEuroTnd = 3.38;
    private final List<CompteEntity> compteList;

    public BankService(CompteRepository compteRepository, CurrencyRepository currencyRepository) {
        this.compteList = compteRepository.getLC();
        this.currencyRepository = currencyRepository;
    }

    @Override
    public double convertEuroToTnd(double amount) {
        return amount * tauxEuroTnd;
    }

    @Override
    public double convertUsdToAny(double amount, String currency) throws NotFoundException {
        return amount * getExchangeRate(currency);
    }

    @Override
    public double convertTndToAny(double amount, String currency) throws NotFoundException {
        double usdAmount = amount / tauxEuroTnd;  // Convert TND to USD first
        return convertUsdToAny(usdAmount, currency);
    }

    @Override
    public Set<String> getAllCurrencies() {
        return currencyRepository.getCurrencyRates().keySet();
    }

    @Override
    public CompteEntity getCompte(int id) {
        return compteList.stream()
                .filter(compte -> compte.getCode() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<CompteEntity> getComptes() {
        return compteList;
    }

    private double getExchangeRate(String currency) throws NotFoundException {
        Double rate = currencyRepository.getCurrencyRates().get(currency);
        if (rate == null) {
            throw new NotFoundException("Currency Not Found: " + currency);
        }
        return rate;
    }
}
