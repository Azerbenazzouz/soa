package repository;

import entites.compteEntite;

import java.util.ArrayList;

public class compteRepository {
    compteEntite c0 = new compteEntite(0, 44);
    compteEntite c1 = new compteEntite(1);
    compteEntite c2 = new compteEntite(2);
    compteEntite c3 = new compteEntite(3);
    compteEntite c4 = new compteEntite(4);

    private ArrayList<compteEntite> LC = new ArrayList<compteEntite>();


    public compteRepository() {
        this.LC.add(c0);
        this.LC.add(c1);
        this.LC.add(c2);
        this.LC.add(c3);
        this.LC.add(c4);
    }

    public ArrayList<compteEntite> getLC() {
        return LC;
    }

    public void setLC(ArrayList<compteEntite> LC) {
        this.LC = LC;
    }

    public void addCompte(compteEntite compte) {
        this.LC.add(compte);
    }

    public void deleteCompte(compteEntite compte) {
        this.LC.remove(compte);
    }
}
