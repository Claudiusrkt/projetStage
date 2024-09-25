package View;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

import Controller.*;
import Modele.Compte;

public class Login extends JFrame {
    private JPanel loginPage;
    public JTextField champMail;
    private JButton seConnecterButton;
    private JLabel ErrorMessage;
    public JPasswordField passwordField1;
    private JLabel idText;
    private JLabel MdpText;
    private JLabel textBienv;
    private JLabel textBienv2;
    private JLabel ErrorMailMessage;
    final int longMotPasse = 8;
    public void login(){
        setContentPane(loginPage);
        setSize(700, 550);
        setLocation(250, 100);
        setVisible(true);
        setResizable(false);
        ErrorMessage.setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(Login.class.getResource("/icone/utilisateur8.png"));
        setIconImage(icon.getImage());
        champMail.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
        idText.setBorder(new ViewDesign());
        MdpText.setBorder(new ViewDesign());
        seConnecterButton.setEnabled(false);
        seConnecterButton.setBackground(Color.GRAY);
        seConnecterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficheSite();
            }
        });
        champMail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                champMail.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                ErrorMessage.setVisible(false);
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                passwordField1.setBorder(BorderFactory.createLineBorder(Color.cyan, 2));
                ErrorMessage.setVisible(false);
            }
        });
        champMail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                champMail.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            }
        });
        passwordField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                passwordField1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            }
        });
        champMail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                verifivation();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                verifivation();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                verifivation();
            }
        });
        passwordField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                verifivation();
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                verifivation();
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                verifivation();
            }
        });
    }
    private void afficheSite(){
            Site st = new Site();
            RequeteApi rq = new RequeteApi();
            Compte compte = new Compte();
            String[] profil = new String[2];
            compte.setMail(champMail.getText());
            compte.setMotPasse(passwordField1.getText());
        if (!rq.isValideAuthentif(st.driver,compte.getMail(), compte.getMotPasse())) {
            ErrorMessage.setVisible(true);
        } else {
            st.siteDispo = rq.recupereSiteDispo(st.driver);
            profil=rq.recupereNom(st.driver);
            st.compte.setNom(profil[0]);
            st.compte.setPrenom(profil[1]);
//            st.compte.setImage(rq.recupereImage(st.driver));
            st.site();
            rq.fin(st.driver);
            this.dispose();
        }
    }
    private void verifivation(){
        if(champMail.getText().endsWith("@gmail.com") || champMail.getText().endsWith("@yahoo.com") || (champMail.getText().endsWith("@outlook.com")) ){
            ErrorMailMessage.setVisible(false);
            String motPasse = passwordField1.getText();
            if((motPasse.length() >= longMotPasse)){
                seConnecterButton.setEnabled(true);
                seConnecterButton.setBackground(Color.CYAN);
            }else {
                seConnecterButton.setEnabled(false);
                seConnecterButton.setBackground(Color.GRAY);
            }
        }else {
            ErrorMailMessage.setVisible(true);
            seConnecterButton.setEnabled(false);
            seConnecterButton.setBackground(Color.GRAY);
        }
    }
}