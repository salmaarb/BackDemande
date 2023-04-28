package com.example.demandeeeee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Solde {
    @Id
    @GeneratedValue
    private int id_solde;
    private Date annee;
    private int id_emp;

    private int jourRestant;private int total_solde;

    public Solde(int id_solde, Date annee, int id_emp, int jourRestant, int total_solde) {
        this.id_solde = id_solde;
        this.annee = annee;
        this.id_emp = id_emp;
        this.jourRestant = jourRestant;
        this.total_solde = total_solde;
    }

    public Solde() {

    }

    public int getId_solde() {
        return id_solde;
    }

    public void setId_solde(int id_solde) {
        this.id_solde = id_solde;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public int getJourRestant() {
        return jourRestant;
    }

    public void setJourRestant(int jourRestant) {
        this.jourRestant = jourRestant;
    }

    public int getTotal_solde() {
        return total_solde;
    }

    public void setTotal_solde(int total_solde) {
        this.total_solde = total_solde;
    }
}