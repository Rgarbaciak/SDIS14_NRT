/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Dao.ConnexionBdd;
import Dao.PompierDAO;
import Modele.Pompier;
import java.sql.Connection;


import java.sql.ResultSet;

import javax.swing.JOptionPane;


/**
 *
 * @author zokum
 */
public class ListePompier extends javax.swing.JFrame {

   Connection cnt;
    public ListePompier() {
     initComponents();
        
        
        
        
        jLabel14.setVisible(false);
       
        Valider.setVisible(false);
         
        cleanInfo();
        fieldFalse();   
       
        listeNom();

    }
     public ListePompier(Connection pCnt) {
         cnt = pCnt;
        initComponents(); 
        cleanInfo();
        fieldFalse();   
        separatorFalse();
        listeNom();
        fillCombo();
        afficheInfo();
     }
    

    public void cleanInfo(){
        prenomLabel.setText("");
         nomLabel.setText("");
         sexeLabel.setText("");
         telLabel.setText("");
         casLabel.setText("");
         foncLabel.setText("");
         dateLabel.setText("");
         matLabel.setText("");
         gradeLabel.setText("");
         bipLabel.setText("");
         
         prenomField.setText("");
        nomField.setText("");
        sexeField.setText("");
        telField.setText("");
        casField.setText("");
        foncField.setText("");
        dateField.setText("");
        matField.setText("");
        gradeField.setText("");
        bipField.setText("");
    }
    public void labelFalse(){
         prenomLabel.setVisible(true);
         nomLabel.setVisible(true);
         sexeLabel.setVisible(true);
         telLabel.setVisible(true);
         casLabel.setVisible(true);
         foncLabel.setVisible(true);
         dateLabel.setVisible(true);
         matLabel.setVisible(true);
         gradeLabel.setVisible(true);
         bipLabel.setVisible(true);
        }
        public void labelTrue(){
        prenomLabel.setVisible(true);
         nomLabel.setVisible(true);
         sexeLabel.setVisible(true);
         telLabel.setVisible(true);
         casLabel.setVisible(true);
         foncLabel.setVisible(true);
         dateLabel.setVisible(true);
         matLabel.setVisible(true);
         gradeLabel.setVisible(true);
         bipLabel.setVisible(true);
        }
        public void fieldFalse(){
        prenomField.setVisible(false);
        nomField.setVisible(false);
        sexeField.setVisible(false);
        telField.setVisible(false);
        casField.setVisible(false);
        foncField.setVisible(false);
        dateField.setVisible(false);
        matField.setVisible(false);
        gradeField.setVisible(false);
        bipField.setVisible(false);
    }
        public void fieldTrue(){
             prenomField.setVisible(true);
        nomField.setVisible(true);
        sexeField.setVisible(true);
        telField.setVisible(true);
        casField.setVisible(true);
        foncField.setVisible(true);
        dateField.setVisible(true);
        matField.setVisible(true);
        gradeField.setVisible(true);
        bipField.setVisible(true);
        Valider.setVisible(true);
            
        }
        public void separatorFalse(){
            jSeparator2.setVisible(false);
        jSeparator3.setVisible(false);
        jSeparator4.setVisible(false);
        jSeparator5.setVisible(false);
        jSeparator6.setVisible(false);
        jSeparator7.setVisible(false);
        jSeparator8.setVisible(false);
        jSeparator9.setVisible(false);
        jSeparator10.setVisible(false);
        jSeparator11.setVisible(false);
        jSeparator12.setVisible(false);
        }
        public void separatorTrue(){
             jSeparator2.setVisible(true);
        jSeparator3.setVisible(true);
        jSeparator4.setVisible(true);
        jSeparator5.setVisible(true);
        jSeparator6.setVisible(true);
        jSeparator7.setVisible(true);
        jSeparator8.setVisible(true);
        jSeparator9.setVisible(true);
        jSeparator10.setVisible(true);
        jSeparator11.setVisible(true);
        jSeparator12.setVisible(true);
            
        }
        
        private Pompier listeNoma(){
            Pompier unPompier = PompierDAO.getPompierbyNom(cnt);
            return unPompier;
           
       }
    
        public void listeNom(){
            
            Pompier lePompier =listeNoma();
            String nomL= lePompier.getNom();
           
            
            
        }
        private void fillCombo(){
         
        try{
            jComboBox.removeAllItems();
            ConnexionBdd BD= new ConnexionBdd();
            ResultSet rs =BD.searchQuery("SELECT POM_NOM FROM pompier ");
            
                while(rs.next()){
                    String name =rs.getString("POM_NOM");
                  
                          jComboBox.addItem(name); 
 
            }
           
           
       }
        catch(Exception e){
             System.out.println("Error " + e.getMessage());
        }
    }
        
        private Pompier selectPage(){
        String list= jComboBox.getSelectedItem().toString();
        Pompier unPompiera=PompierDAO.afficheInfo(cnt,list);
           return unPompiera;
        }
        public void afficheInfo(){
            Pompier lePompier=selectPage();
            nomLabel.setText(lePompier.getNom());
            prenomLabel.setText(lePompier.getPrenom());
            sexeLabel.setText(lePompier.getSexe());
            dateLabel.setText(lePompier.getDteNaissance());
            telLabel.setText(lePompier.getTel());
            matLabel.setText(lePompier.getMatricule());
            bipLabel.setText(lePompier.getBip());
            gradeLabel.setText(lePompier.getUnGrade().getLibelle());
            casLabel.setText(lePompier.getUneCaserne().getNomCas());
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        Modifier = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        prenomField = new javax.swing.JTextField();
        nomLabel = new javax.swing.JLabel();
        nomField = new javax.swing.JTextField();
        sexeField = new javax.swing.JTextField();
        sexeLabel = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        telLabel = new javax.swing.JLabel();
        casField = new javax.swing.JTextField();
        casLabel = new javax.swing.JLabel();
        foncField = new javax.swing.JTextField();
        foncLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        matField = new javax.swing.JTextField();
        matLabel = new javax.swing.JLabel();
        gradeField = new javax.swing.JTextField();
        gradeLabel = new javax.swing.JLabel();
        bipField = new javax.swing.JTextField();
        bipLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ajout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        Delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("jLabel5");

        jLabel16.setBackground(new java.awt.Color(39, 38, 38));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("op");

        jTextField3.setBackground(new java.awt.Color(39, 38, 38));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 565));
        setMinimumSize(new java.awt.Dimension(920, 565));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(39, 38, 38));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(920, 565));
        jPanel1.setMinimumSize(new java.awt.Dimension(920, 565));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(39, 38, 38));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Liste de pompiers :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(86, 65, 171, 25);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(86, 96, 171, 10);

        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox);
        jComboBox.setBounds(86, 139, 171, 24);

        jLabel3.setBackground(new java.awt.Color(39, 38, 38));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nom :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(327, 146, 45, 20);

        jLabel4.setBackground(new java.awt.Color(39, 38, 38));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prénom :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 200, 66, 20);

        jLabel5.setBackground(new java.awt.Color(39, 38, 38));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Téléphone:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(327, 314, 80, 20);

        jLabel6.setBackground(new java.awt.Color(39, 38, 38));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fonctions :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(327, 426, 78, 20);

        jLabel8.setBackground(new java.awt.Color(39, 38, 38));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Caserne de ratachement :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(327, 370, 181, 20);

        jLabel9.setBackground(new java.awt.Color(39, 38, 38));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexe :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(327, 258, 44, 20);

        jLabel10.setBackground(new java.awt.Color(39, 38, 38));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date de naissance :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(640, 140, 137, 20);

        jLabel11.setBackground(new java.awt.Color(39, 38, 38));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grade :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(640, 260, 53, 20);

        jLabel12.setBackground(new java.awt.Color(39, 38, 38));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("N°Bip :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(698, 426, 52, 20);

        jLabel13.setBackground(new java.awt.Color(39, 38, 38));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Matricule :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(640, 200, 74, 20);

        prenomLabel.setBackground(new java.awt.Color(39, 38, 38));
        prenomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prenomLabel.setForeground(new java.awt.Color(255, 255, 255));
        prenomLabel.setText("op");
        jPanel1.add(prenomLabel);
        prenomLabel.setBounds(400, 200, 140, 20);

        Modifier.setBackground(new java.awt.Color(39, 38, 38));
        Modifier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setText("Modifier");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        jPanel1.add(Modifier);
        Modifier.setBounds(90, 490, 130, 32);

        Retour.setBackground(new java.awt.Color(39, 38, 38));
        Retour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Retour.setForeground(new java.awt.Color(255, 255, 255));
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        jPanel1.add(Retour);
        Retour.setBounds(772, 486, 98, 40);

        Valider.setBackground(new java.awt.Color(39, 38, 38));
        Valider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Valider.setForeground(new java.awt.Color(255, 255, 255));
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel1.add(Valider);
        Valider.setBounds(90, 430, 130, 32);

        prenomField.setBackground(new java.awt.Color(39, 38, 38));
        prenomField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prenomField.setForeground(new java.awt.Color(255, 255, 255));
        prenomField.setText("jTextField1");
        prenomField.setBorder(null);
        jPanel1.add(prenomField);
        prenomField.setBounds(400, 200, 140, 22);

        nomLabel.setBackground(new java.awt.Color(39, 38, 38));
        nomLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomLabel.setForeground(new java.awt.Color(255, 255, 255));
        nomLabel.setText("op");
        jPanel1.add(nomLabel);
        nomLabel.setBounds(380, 146, 140, 20);

        nomField.setBackground(new java.awt.Color(39, 38, 38));
        nomField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomField.setForeground(new java.awt.Color(255, 255, 255));
        nomField.setText("jTextField1");
        nomField.setBorder(null);
        jPanel1.add(nomField);
        nomField.setBounds(380, 146, 140, 22);

        sexeField.setBackground(new java.awt.Color(39, 38, 38));
        sexeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexeField.setForeground(new java.awt.Color(255, 255, 255));
        sexeField.setText("jTextField1");
        sexeField.setBorder(null);
        sexeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(sexeField);
        sexeField.setBounds(380, 259, 140, 20);

        sexeLabel.setBackground(new java.awt.Color(39, 38, 38));
        sexeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexeLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexeLabel.setText("op");
        jPanel1.add(sexeLabel);
        sexeLabel.setBounds(380, 258, 140, 20);

        telField.setBackground(new java.awt.Color(39, 38, 38));
        telField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telField.setForeground(new java.awt.Color(255, 255, 255));
        telField.setText("jTextField1");
        telField.setBorder(null);
        jPanel1.add(telField);
        telField.setBounds(410, 315, 140, 20);

        telLabel.setBackground(new java.awt.Color(39, 38, 38));
        telLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telLabel.setForeground(new java.awt.Color(255, 255, 255));
        telLabel.setText("op");
        jPanel1.add(telLabel);
        telLabel.setBounds(410, 314, 140, 20);

        casField.setBackground(new java.awt.Color(39, 38, 38));
        casField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        casField.setForeground(new java.awt.Color(255, 255, 255));
        casField.setText("jTextField1");
        casField.setBorder(null);
        jPanel1.add(casField);
        casField.setBounds(510, 371, 390, 20);

        casLabel.setBackground(new java.awt.Color(39, 38, 38));
        casLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        casLabel.setForeground(new java.awt.Color(255, 255, 255));
        casLabel.setText("op");
        jPanel1.add(casLabel);
        casLabel.setBounds(510, 370, 390, 20);

        foncField.setBackground(new java.awt.Color(39, 38, 38));
        foncField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        foncField.setForeground(new java.awt.Color(255, 255, 255));
        foncField.setText("jTextField1");
        foncField.setBorder(null);
        jPanel1.add(foncField);
        foncField.setBounds(410, 427, 140, 20);

        foncLabel.setBackground(new java.awt.Color(39, 38, 38));
        foncLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        foncLabel.setForeground(new java.awt.Color(255, 255, 255));
        foncLabel.setText("op");
        jPanel1.add(foncLabel);
        foncLabel.setBounds(410, 426, 140, 20);

        dateField.setBackground(new java.awt.Color(39, 38, 38));
        dateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateField.setForeground(new java.awt.Color(255, 255, 255));
        dateField.setText("jTextField1");
        dateField.setBorder(null);
        jPanel1.add(dateField);
        dateField.setBounds(780, 141, 140, 20);

        dateLabel.setBackground(new java.awt.Color(39, 38, 38));
        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("op");
        jPanel1.add(dateLabel);
        dateLabel.setBounds(780, 140, 140, 20);

        matField.setBackground(new java.awt.Color(39, 38, 38));
        matField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matField.setForeground(new java.awt.Color(255, 255, 255));
        matField.setText("jTextField1");
        matField.setBorder(null);
        matField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matFieldActionPerformed(evt);
            }
        });
        jPanel1.add(matField);
        matField.setBounds(719, 201, 140, 20);

        matLabel.setBackground(new java.awt.Color(39, 38, 38));
        matLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        matLabel.setForeground(new java.awt.Color(255, 255, 255));
        matLabel.setText("op");
        jPanel1.add(matLabel);
        matLabel.setBounds(719, 200, 140, 20);

        gradeField.setBackground(new java.awt.Color(39, 38, 38));
        gradeField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gradeField.setForeground(new java.awt.Color(255, 255, 255));
        gradeField.setText("jTextField1");
        gradeField.setBorder(null);
        gradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(gradeField);
        gradeField.setBounds(700, 261, 140, 20);

        gradeLabel.setBackground(new java.awt.Color(39, 38, 38));
        gradeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gradeLabel.setForeground(new java.awt.Color(255, 255, 255));
        gradeLabel.setText("op");
        jPanel1.add(gradeLabel);
        gradeLabel.setBounds(700, 260, 140, 20);

        bipField.setBackground(new java.awt.Color(39, 38, 38));
        bipField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bipField.setForeground(new java.awt.Color(255, 255, 255));
        bipField.setText("jTextField1");
        bipField.setBorder(null);
        jPanel1.add(bipField);
        bipField.setBounds(760, 427, 140, 20);

        bipLabel.setBackground(new java.awt.Color(39, 38, 38));
        bipLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bipLabel.setForeground(new java.awt.Color(255, 255, 255));
        bipLabel.setText("op");
        jPanel1.add(bipLabel);
        bipLabel.setBounds(760, 426, 140, 20);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 370, 90, 40);

        ajout.setBackground(new java.awt.Color(39, 38, 38));
        ajout.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        ajout.setForeground(new java.awt.Color(255, 255, 255));
        ajout.setText("+");
        ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutActionPerformed(evt);
            }
        });
        jPanel1.add(ajout);
        ajout.setBounds(950, 0, 55, 55);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(490, 50, 60, 20);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(510, 390, 390, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(380, 165, 140, 10);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(400, 220, 140, 10);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(780, 160, 130, 20);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(410, 334, 140, 10);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(510, 390, 270, 10);

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(380, 278, 140, 10);

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(410, 445, 140, 10);

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(760, 450, 140, 10);

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(700, 280, 130, 20);

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(720, 220, 140, 10);

        Delete.setBackground(new java.awt.Color(39, 38, 38));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Delete.png"))); // NOI18N
        Delete.setBorder(null);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(560, 470, 60, 60);

        jButton1.setBackground(new java.awt.Color(39, 38, 38));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 500, 150, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1016, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
      
       
       afficheInfo();
        
       
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetourActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
       
       
        
        
        
        fieldFalse();
        separatorFalse();
        labelTrue();
        
        
        Pompier p = new Pompier();
        p.setNom(nomField.getText());
        p.setPrenom(prenomField.getText());
        p.setSexe(sexeField.getText());
        p.setTel(telField.getText());
       /* p.setUneCaserne(op);
        p.setFonc(concField.getText());
       
        
        p.setGrade(gradeField.getText());*/
        p.setMatricule(matField.getText());
        p.setBip(bipField.getText());
        p.setDteNaissance(dateField.getText());
        
        
          String listeJBox = jComboBox.getSelectedItem().toString();
          String nom= nomField.getText();
          String prenom=prenomField.getText();
          String sexe=sexeField.getText();
          String tel=telField.getText();
          String cas=casField.getText();
          String fonc=foncField.getText();
          String date=dateField.getText();
          String mat=matField.getText();
          String grade=gradeField.getText();
          String bip=bipField.getText();
          String verif=jLabel14.getText();
         
          
          
         if(verif.equals("Modif")){
          if(nom.equals("") || prenom.equals("")|| date.equals("")|| grade.equals("")|| bip.equals("")|| sexe.equals("") || tel.equals("") || cas.equals("") || fonc.equals("") || mat.equals("")){
              JOptionPane.showMessageDialog(this,"Modification échoué car tout les élements ne sont pas remplis !"); 
          }else{
               
          }
       fillCombo();
          }
          
          else if(verif.equals("Ajout")){
          if(nom.equals("") || prenom.equals("")||  date.equals("")|| bip.equals("")){
              JOptionPane.showMessageDialog(this,"L'ajout a échoué car tout les élements ne sont pas remplis !"); 
          }else{
        PompierDAO.addPompier(cnt, p);
          }
         
        
         
        /* insertPompier( sexe ,  tel,  grade,  cas,  nom,  prenom,  date,  bip,  mat , fonc);*/
        
         
         
         
          }
        
        
        
        Valider.setVisible(false);
    }//GEN-LAST:event_ValiderActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
      separatorTrue();
        
            String prenomL= prenomLabel.getText();
            String nomL= nomLabel.getText();
            String sexeL= sexeLabel.getText();
            String telL= telLabel.getText();
            String casL= casLabel.getText();
            String foncL= foncLabel.getText();
            String dateL= dateLabel.getText();
            String matL= matLabel.getText();
            String gradeL= gradeLabel.getText();
            String bipL= bipLabel.getText();

         labelFalse();         
         
        prenomField.setText(prenomL);
        nomField.setText(nomL);
        sexeField.setText(sexeL);
        telField.setText(telL);
        casField.setText(casL);
        foncField.setText(foncL);
        dateField.setText(dateL);
        matField.setText(matL);
        gradeField.setText(gradeL);
        bipField.setText(bipL);
        
        
        jLabel14.setText("Modif");
        
    }//GEN-LAST:event_ModifierActionPerformed

    private void gradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeFieldActionPerformed

    private void ajoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutActionPerformed
        separatorTrue();
        
       cleanInfo();
        fieldTrue();
       labelFalse();
         jLabel14.setText("Ajout");
       
    }//GEN-LAST:event_ajoutActionPerformed

    private void matFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matFieldActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String list = jComboBox.getSelectedItem().toString();
        
        
       
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listeNom();
        cleanInfo();
        fillCombo();
        
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sexeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexeFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListePompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListePompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListePompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListePompier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListePompier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Retour;
    private javax.swing.JButton Valider;
    private javax.swing.JButton ajout;
    private javax.swing.JTextField bipField;
    private javax.swing.JLabel bipLabel;
    private javax.swing.JTextField casField;
    private javax.swing.JLabel casLabel;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField foncField;
    private javax.swing.JLabel foncLabel;
    private javax.swing.JTextField gradeField;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField matField;
    private javax.swing.JLabel matLabel;
    private javax.swing.JTextField nomField;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField prenomField;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JTextField sexeField;
    private javax.swing.JLabel sexeLabel;
    private javax.swing.JTextField telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
