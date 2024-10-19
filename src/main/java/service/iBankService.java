package service;

import entities.CompteEntity;
import exception.NotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import java.util.Set;

// Interface declaration
@WebService
public interface iBankService {
    @WebMethod
    double convertEuroToTnd(@WebParam(name = "amount") double amount);

    @WebMethod
    double convertUsdToAny(@WebParam(name = "amount") double amount, @WebParam String currency) throws NotFoundException;

    @WebMethod
    double convertTndToAny(@WebParam(name = "amount") double amount, @WebParam String currency) throws NotFoundException;

    @WebMethod
    Set<String> getAllCurrencies();

    @WebMethod
    CompteEntity getCompte(@WebParam int id);

    @WebMethod
    List<CompteEntity> getComptes();
}
