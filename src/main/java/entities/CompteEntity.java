package entities;

import java.util.Date;

public class CompteEntity {
     private int code;
     private Date dateCreation;
     private double solde;

    public CompteEntity(int code) {
        this.code = code;
        this.dateCreation = new Date();
    }

    public CompteEntity(int code, double solde) {
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
