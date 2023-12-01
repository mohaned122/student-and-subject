package com.mohanned.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "matier")
public class Matier {
    @Id
    @GeneratedValue
    private Integer id;
    private String nomMatier;
    private String profNom;
    private String smester;
    private String classe;

    public Matier(Integer id, String nomMatier, String profNom, String smester, String classe) {
        this.id = id;
        this.nomMatier = nomMatier;
        this.profNom = profNom;
        this.smester = smester;
        this.classe = classe;
    }

    public Matier() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomMatier() {
        return nomMatier;
    }

    public void setNomMatier(String nomMatier) {
        this.nomMatier = nomMatier;
    }

    public String getProfNom() {
        return profNom;
    }

    public void setProfNom(String profNom) {
        this.profNom = profNom;
    }

    public String getSmester() {
        return smester;
    }

    public void setSmester(String smester) {
        this.smester = smester;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
