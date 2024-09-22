package entites;

import java.util.Date;

public class compteEntite{
     private int code;
     private Date dateCreation;
     private double solde;

    public compteEntite(int code) {
        this.code = code;
        this.dateCreation = new Date();
    }

    public compteEntite(int code, double solde) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = new Date();
    }

    public int getCode() {
        return code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
