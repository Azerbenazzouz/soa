package service;

import entites.compteEntite;
import repository.compteRepository;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(name = "bank_service")
public class bankService implements iBankService {
    private final double tauxEuroTnd = 3.38;
    private ArrayList<compteEntite> LCB;

    public bankService(compteRepository compteRepository) {
        this.LCB = compteRepository.getLC();
    }

    // EURO TO TND
    @WebMethod(operationName = "convEuroToTnd")
    public double convEuroToTnd(@WebParam(name = "montant") double montent){
        return montent*tauxEuroTnd;
    }
    // GET COMPTE AVEC LE CODE
    @WebMethod
    public compteEntite getCompte(@WebParam int id){
        for(compteEntite compte : this.LCB){
            if(compte.getCode() == id) return compte;
        }
        return null;
    }

    // GET TOUS LES COMPTES
    @WebMethod
    public ArrayList<compteEntite> getComptes(){
        return this.LCB;
    }

}
