package com.example.demandeeeee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employer {
    @Id
    @GeneratedValue
    private int id_emp;
    private String nom;
    private String prenom;
    private int solde;

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Employer(int id_emp, String nom, String prenom,int solde) {
        this.id_emp = id_emp;
        this.nom = nom;
        this.prenom = prenom;
        this.solde=solde;
    }

    public Employer() {

    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
