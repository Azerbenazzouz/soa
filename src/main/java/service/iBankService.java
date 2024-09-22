package service;

import entites.compteEntite;

import java.util.ArrayList;

public interface iBankService {
    double convEuroToTnd(double montent);
    compteEntite getCompte(int id);
    ArrayList<compteEntite> getComptes();
}
