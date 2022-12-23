package com.isi;

public class DocTexte implements Document{
    private String nom;
    private String extension;
    private String commentaire;


    public DocTexte(String nom, String extension, String commentaire) {
        this.nom = nom;
        this.extension = extension;
        this.commentaire = commentaire;
    }

    public String getNom() {
        return nom;
    }

    public String getExtension() {
        return extension;
    }

    public String getCommentaire() {
        return commentaire;
    }
}
