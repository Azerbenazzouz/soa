package service;

import entites.compteEntite;

import java.util.ArrayList;

public class bankService implements iBankService {
    private final double tauxEuroTnd = 3.38;
    private ArrayList<compteEntite> LCB;

    public bankService(ArrayList<compteEntite> LCB) {
        this.LCB = LCB;
    }

    // EURO TO TND
    public double convEuroToTnd(double montent){
        return montent*tauxEuroTnd;
    }
    // GET COMPTE AVEC LE CODE
    public compteEntite getCompte(int id){
        for(compteEntite compte : this.LCB){
            if(compte.getCode() == id) return compte;
        }
        return null;
    }

    // GET TOUS LES COMPTES
    public ArrayList<compteEntite> getComptes(){
        return this.LCB;
    }

}
