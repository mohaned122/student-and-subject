package com.mohanned.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String cin;
    private LocalDate dns;
    private String classe;

    public Student() {
    }

    public Student(int id, String nom, String prenom, LocalDate dns, String classe,String cin) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dns = dns;
        this.classe = classe;
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDns() {
        return dns;
    }

    public void setDns(LocalDate dns) {
        this.dns = dns;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
