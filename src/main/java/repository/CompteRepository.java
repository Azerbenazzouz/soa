package repository;

import entities.CompteEntity;

import java.util.ArrayList;

public class CompteRepository {
    CompteEntity c0 = new CompteEntity(0, 44);
    CompteEntity c1 = new CompteEntity(1);
    CompteEntity c2 = new CompteEntity(2);
    CompteEntity c3 = new CompteEntity(3);
    CompteEntity c4 = new CompteEntity(4);

    private ArrayList<CompteEntity> LC = new ArrayList<CompteEntity>();


    public CompteRepository() {
        this.LC.add(c0);
        this.LC.add(c1);
        this.LC.add(c2);
        this.LC.add(c3);
        this.LC.add(c4);
    }

    public ArrayList<CompteEntity> getLC() {
        return LC;
    }

    public void setLC(ArrayList<CompteEntity> LC) {
        this.LC = LC;
    }

    public void addCompte(CompteEntity compte) {
        this.LC.add(compte);
    }

    public void deleteCompte(CompteEntity compte) {
        this.LC.remove(compte);
    }
}
