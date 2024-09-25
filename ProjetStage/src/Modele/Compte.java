package Modele;

import javax.swing.*;
import java.awt.*;

public class Compte{
    private String mail;
    private String nom;

    private String prenom;
    private String motPasse;
    private Image  image;
    public String getMail(){
        return mail;
    }
    public String getMotPasse(){
        return motPasse;
    }
    public String getNom(){return nom;}
    public String getPrenom(){return prenom;}
    public Icon getImage(){return (Icon) image;}
    public void setMail(String email){
        this.mail =email;
    }
    public void setMotPasse(String motDePasse){
        this.motPasse= motDePasse;
    }
    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setImage(Image image){this.image=image;}
}
