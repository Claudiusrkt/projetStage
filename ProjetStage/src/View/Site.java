package View;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;
import Controller.*;
import Modele.Compte;
import Modele.SiteWeb;
import org.openqa.selenium.WebDriver;


public class Site extends JFrame {
    public JPanel site;
    private JButton confirmerButton;
    private JButton precedentButton;
    private JButton button1;
    private JTable listeSite;
    private JLabel texteProfil;
    private JLabel imageImage;
    private JLabel nom;
    private JLabel prenom;
    private JPanel panelProfil;
    private JLabel textDispo;
    private JScrollPane scrollListeSite;
    private JLabel vide;
    public String siteDispo;
    Pilote pilote = new Pilote();
    public WebDriver driver = pilote.driverNoGui();
    SiteWeb siteData = new SiteWeb();
    Compte compte = new Compte();
    public void site() {
        setContentPane(site);
        setSize(700, 550);
        setLocation(250, 100);
        setVisible(true);
        setResizable(false);
        confirmerButton.setEnabled(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        ImageIcon icon = new ImageIcon("/icone/utilisateur8.png");
        ImageIcon icon = new ImageIcon(Site.class.getResource("../icone/utilisateur8.png"));
        setIconImage(icon.getImage());
        listeSite.setRowHeight(60);
        precedentButton.setBackground(Color.GREEN);

        texteProfil.setBorder(new ViewDesign());
        nom.setText(compte.getNom());
        prenom.setText(compte.getPrenom());
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        button1.setFocusPainted(false);
        button1.setOpaque(false);
        JTableHeader header = listeSite.getTableHeader();
        header.setPreferredSize(new Dimension(0, 0));
        header.setVisible(false);
        listeSite.setDefaultEditor(Object.class, new DefaultCellEditor(new JTextField()) {
            @Override
            public boolean isCellEditable(EventObject anEvent) {
                return false;
            }
        });
        rempliTableau();
        precedentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                precedent();
            }
        });
        listeSite.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int selectionner = listeSite.getSelectedRow();
                if (selectionner == -1) {
                    confirmerButton.setEnabled(false);
                    confirmerButton.setBackground(Color.GRAY);
                } else {
                    confirmerButton.setEnabled(true);
                    confirmerButton.setBackground(Color.CYAN);
                    confirmerButton.setForeground(Color.white);
                }
                System.out.println(recuperlign());
            }
        });
        confirmerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToSiteWeb();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                help();
            }
        });
    }
    private void help() {
        JOptionPane.showMessageDialog(this, "Veuillez choisir un site sur cette liste \nen cliquant sur le nom du site de votre\n choix et après vous devez cliquez sur\n le bouton confirmer", "Aide", JOptionPane.INFORMATION_MESSAGE);
    }
    private void precedent() {
        ViewDesign view = new ViewDesign();
        int oui = view.message(this,"Voulez-vous vraiment retourner\n à la page d'authentification");
        if (oui == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.login();
            this.dispose();
        }
    }
    private String recuperlign() {
        int selectionner = listeSite.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) listeSite.getModel();
        String siteSelect = (String) model.getValueAt(selectionner, 1);
        return siteSelect;
    }
    private void ToSiteWeb() {
        envoiData(recuperlign());
        RemplirLogin remplir = new RemplirLogin();
        switch (recuperlign()) {
            case "Facebook":
                remplir.remplirLogFb(siteData.getUrlSite(),siteData.getloginSite(), siteData.getPasswordSite());
                break;
            case "Whatsapp":
                remplir.remplirLogWhat(siteData.getUrlSite());
                break;
            case "Linkedin":
                remplir.rempliLogLin(siteData.getUrlSite(),siteData.getloginSite(), siteData.getPasswordSite());
                break;
            case "Instagram":
                remplir.remplirLogInsta(siteData.getUrlSite(),siteData.getloginSite(), siteData.getPasswordSite());
                break;
            case "Twitter":
                remplir.rempliLogTwitter(siteData.getUrlSite(),siteData.getloginSite(),siteData.getPasswordSite());
                break;
            case "GitHub":
                remplir.remplirLogGit(siteData.getUrlSite(),siteData.getloginSite(),siteData.getPasswordSite());
                break;
            case "Stack Overflow":
                remplir.remplirLogStack(siteData.getUrlSite(),siteData.getloginSite(),siteData.getPasswordSite());
                break;
        }
        System.exit(0);
    }
    private void rempliTableau() {
        RequeteApi rqApi = new RequeteApi();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("icone");
        model.addColumn("Site Disponible pour votre compte :");
        listeSite.setModel(model);
        String[] sitedispo = rqApi.analyeContentJson(siteDispo, "Name");

        ImageIcon icon1 = new ImageIcon(Site.class.getResource("../icone/facebook20.png"));
        ImageIcon icon2 = new ImageIcon(Site.class.getResource("../icone/whatsapp20.png"));
        ImageIcon icon3 = new ImageIcon(Site.class.getResource("../icone/linkedin20.png"));
        ImageIcon icon4 = new ImageIcon(Site.class.getResource("../icone/instagram10.png"));
        ImageIcon icon5 = new ImageIcon(Site.class.getResource("../icone/twitter11.png"));
        ImageIcon icon6 = new ImageIcon(Site.class.getResource("../icone/github10.png"));
        ImageIcon icon7 = new ImageIcon(Site.class.getResource("../icone/stack20.png"));

        if (sitedispo.length==0){
            textDispo.setText("Aucun site n'est disponible pour votre compte");
        }else {
            for (String element : sitedispo) {
                System.out.println(element);
                switch (element) {
                    case "Facebook":
                        model.addRow(new Object[]{icon1, "Facebook"});
                        break;
                    case "Whatsapp":
                        model.addRow(new Object[]{icon2, "Whatsapp"});
                        break;
                    case "Linkedin":
                        model.addRow(new Object[]{icon3, "Linkedin"});
                        break;
                    case "Instagram":
                        model.addRow(new Object[]{icon4, "Instagram"});
                        break;
                    case "Twitter":
                        model.addRow(new Object[]{icon5, "Twitter"});
                        break;
                    case "GitHub":
                        model.addRow(new Object[]{icon6, "GitHub"});
                        break;
                    case "Stack Overflow":
                        model.addRow(new Object[]{icon7, "Stack Overflow"});
                        break;
                    default:
                        System.out.println("Aucun site web");
                }
                TableCellRenderer iconRenderer = new DefaultTableCellRenderer() {
                    @Override
                    public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        if (value instanceof Icon) {
                            setIcon((Icon) value);
                        } else {
                            setIcon(null);
                        }
                        return this;
                    }
                };
                listeSite.getColumnModel().getColumn(0).setCellRenderer(iconRenderer);
            }
        }
    }
    private void envoiData(String name){
        RequeteApi rqApi = new RequeteApi();
        siteData.setCategory(rqApi.recupereSiteData(siteDispo,name,"Category"));
        siteData.setloginSite(rqApi.recupereSiteData(siteDispo,name,"Login"));
        siteData.setPasswordSite(rqApi.recupereSiteData(siteDispo,name,"Password"));
        siteData.setUrlSite(rqApi.recupereSiteData(siteDispo,name,"Url"));
    }
}
