/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.HealthProfessional;
import backend.ws.HealthProfessionalWS;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class HealthProfessionalProfile extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(HealthProfessionalProfile.class);
    private HealthProfessionalWS hpWS;
    private HealthProfessional hp;

    public HealthProfessionalProfile(int idHealthProfessional) {

        try {
            initComponents();
            hpWS = new HealthProfessionalWS();
            hp = hpWS.getHealthProfessionalById(idHealthProfessional);
            setFields(hp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(HealthProfessionalProfile.this,
                    e.getMessage(), "Erro ao carregar os dados do Profissional de Saúde", JOptionPane.ERROR_MESSAGE);
        }
    }

    HealthProfessionalProfile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setFields(HealthProfessional hp) {
        this.jTextFieldName.setText(hp.getName());
        this.jTextFieldGender.setText(hp.getLastName());
        this.jTextFieldBirthDate.setText(hp.getBirthDate());
        this.jTextFieldGender.setText(hp.getGender());
        this.jTextFieldMaritalStatus.setText(String.valueOf(hp.getNumTel()));
        this.jTextFieldBloodGroup.setText(hp.getNacionality());
        this.jTextFieldNacio.setText(hp.getAdress());
        this.jTextFieldAdress.setText(hp.getEmail());
        this.jTextFieldInstitution.setText(String.valueOf(hp.getNumCC()));
        this.jTextFieldNIF.setText(String.valueOf(hp.getNif()));
        this.jTextFieldMaritalStatus.setText(hp.getMaritalStatus());
        this.jTextFieldLastName.setText(hp.getBloodGroup());
        this.jTextFieldInstitution.setText(hp.getInstitution());

        if (hp.getPicture().equals("profile")) {
            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(hp.getPicture(), 90, 90)));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthProfessionalProfile = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelNationality = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelNIF = new javax.swing.JLabel();
        jLabelMaritalStatus = new javax.swing.JLabel();
        jLabelBloodType = new javax.swing.JLabel();
        jLabelInstitution = new javax.swing.JLabel();
        jTextFieldMaritalStatus = new javax.swing.JTextField();
        jTextFieldAdress = new javax.swing.JTextField();
        jTextFieldNacio = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldBloodGroup = new javax.swing.JTextField();
        jTextFieldInstitution = new javax.swing.JTextField();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNCC = new javax.swing.JTextField();
        jTextFieldNTel = new javax.swing.JTextField();
        jTextFieldBirthDate = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHealthProfessionalProfile.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHealthProfessionalProfile.setText("Profissional de Saúde");
        jPanelInformation.add(jLabelHealthProfessionalProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"))); // NOI18N
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, 80));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, -1, -1));

        jLabelBirthDate.setText("Data de nascimento:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 85, -1, -1));

        jLabelTel.setText("Nº Tel:");
        jPanelInformation.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 115, -1, -1));

        jLabelCC.setText(" Nº CC:");
        jPanelInformation.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 175, -1, -1));

        jLabelEmail.setText("Email:");
        jPanelInformation.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 175, -1, -1));

        jLabelLastName.setText("Apelido:");
        jPanelInformation.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 55, -1, -1));

        jLabelGender.setText("Sexo:");
        jPanelInformation.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jLabelNationality.setText("Nacionalidade:");
        jPanelInformation.add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 115, -1, -1));

        jLabelAdress.setText("Morada:");
        jPanelInformation.add(jLabelAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, -1, -1));

        jLabelNIF.setText("  NIF:");
        jPanelInformation.add(jLabelNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 205, 30, -1));

        jLabelMaritalStatus.setText(" Estado Civil:");
        jPanelInformation.add(jLabelMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 205, -1, -1));

        jLabelBloodType.setText("  Grupo sanguíneo:");
        jPanelInformation.add(jLabelBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 235, -1, -1));

        jLabelInstitution.setText(" Instituição:");
        jPanelInformation.add(jLabelInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 235, -1, -1));

        jTextFieldMaritalStatus.setEditable(false);
        jPanelInformation.add(jTextFieldMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 150, -1));

        jTextFieldAdress.setEditable(false);
        jPanelInformation.add(jTextFieldAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 410, -1));

        jTextFieldNacio.setEditable(false);
        jPanelInformation.add(jTextFieldNacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 150, -1));

        jTextFieldGender.setEditable(false);
        jPanelInformation.add(jTextFieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 150, -1));

        jTextFieldLastName.setEditable(false);
        jPanelInformation.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 150, -1));

        jTextFieldBloodGroup.setEditable(false);
        jPanelInformation.add(jTextFieldBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, -1));

        jTextFieldInstitution.setEditable(false);
        jPanelInformation.add(jTextFieldInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 150, -1));

        jTextFieldNIF.setEditable(false);
        jPanelInformation.add(jTextFieldNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 150, -1));

        jTextFieldEmail.setEditable(false);
        jPanelInformation.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, -1));

        jTextFieldNCC.setEditable(false);
        jPanelInformation.add(jTextFieldNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 150, -1));

        jTextFieldNTel.setEditable(false);
        jPanelInformation.add(jTextFieldNTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, -1));

        jTextFieldBirthDate.setEditable(false);
        jPanelInformation.add(jTextFieldBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 150, -1));

        jTextFieldName.setEditable(false);
        jPanelInformation.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 150, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new HealthProfessionalMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        new HealthProfessionalEdit(hp).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelBloodType;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHealthProfessionalProfile;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelInstitution;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMaritalStatus;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldBirthDate;
    private javax.swing.JTextField jTextFieldBloodGroup;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldInstitution;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMaritalStatus;
    private javax.swing.JTextField jTextFieldNCC;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldNTel;
    private javax.swing.JTextField jTextFieldNacio;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private Image getImageFromServer(String picture, int with, int heigth) {
        try {
            URL url = new URL("http://localhost/mu-pen-web/imagens/HealthProfessionals/" + picture.trim());
            log.debug("\n\tProfile Image: " + url.toString());
            BufferedImage image = ImageIO.read(url);
            ImageIcon pic = new ImageIcon(image);
            return pic.getImage().getScaledInstance(with, heigth, Image.SCALE_DEFAULT);
        } catch (MalformedURLException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
        } catch (IOException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
        }
    }
}
