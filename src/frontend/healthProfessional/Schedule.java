/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.Appointment;
import backend.ws.AppointmentWS;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jorge
 */
public class Schedule extends javax.swing.JFrame {

    /**
     * Creates new form Schedule
     */
    private AppointmentWS appoint;
    private List<Appointment> apList;
    private int i;

    public Schedule() {
        try {
            initComponents();
            setIcon();
            appoint = new AppointmentWS();
            //colocar idHealthProfessional
            apList = appoint.getHPAppointments(1);
            i = 1;
            paintSchedule();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Schedule.this,
                    e.getMessage(), "Erro ao aceder à internet", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void paintSchedule() {
        if (!apList.isEmpty()) {
            for (Appointment a : apList) {
                if (a.getPatientApproval() == 1 && a.getHealthProfessionalApproval() == 1) {
                    paintAppoint(a, "green");
                } else if (a.getPatientApproval() == 0 || a.getHealthProfessionalApproval() == 0) {
                    paintAppoint(a, "red");
                }
            }
        }
    }

    private void paintAppoint(Appointment a, String color) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(jCalendar.getDate());
        int month = cal.get(Calendar.MONTH) + 1;

        JPanel jpanel = jCalendar.getDayChooser().getDayPanel();
        Component component[] = jpanel.getComponents();
        String[] data = a.getDate().split("-");
        int appointMonth = parseInt(data[1]);
        int appointDay = parseInt(data[2]);
        // Calculate the offset of the first day of the month
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int offset = cal.get(Calendar.DAY_OF_WEEK) - 1;
        //se o offset for 0 (Sunday) offset=7 (because of the components that are leaved behind)
        if (offset == 0) {
            offset = 7;
        }
        if (month == appointMonth) {
            if (color.equals("green")) {
                Color newGreen = new Color(0, 204, 51);
                component[appointDay - 1 + offset + 6].setBackground(newGreen);
                component[appointDay - 1 + offset + 6].setForeground(Color.GREEN);

            } else {
                Color newRed = new Color(173, 0, 2);
                component[appointDay - 1 + offset + 6].setForeground(Color.RED);
                component[appointDay - 1 + offset + 6].setBackground(newRed);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jCalendar = new com.toedter.calendar.JCalendar();
        jButtonBack = new javax.swing.JButton();
        jButtonMakeAppointment = new javax.swing.JButton();
        jButtonSeeEvent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelInformation = new javax.swing.JLabel();
        jLabelInformation1 = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();
        jLabelwallpaper1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });
        jPanelInformation.add(jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 540, 270));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jButtonMakeAppointment.setText("Marcar consulta");
        jButtonMakeAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeAppointmentActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonMakeAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jButtonSeeEvent.setText("Ver consulta");
        jButtonSeeEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeeEventActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonSeeEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setText("Consulta aprovada");
        jPanelInformation.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 0, 2));
        jLabel2.setText("Consulta por aprovar");
        jPanelInformation.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jLabelInformation1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelInformation.add(jLabelInformation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelwallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeeEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeeEventActionPerformed
        new FEAppointment(1, parseDate(jCalendar.getDate())).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSeeEventActionPerformed

    private void jButtonMakeAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeAppointmentActionPerformed
        new AppointmentCreateEdit(parseDate(jCalendar.getDate())).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMakeAppointmentActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new HealthProfessionalMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        if (i >= 1) {
            paintSchedule();
        }
        i++;
    }//GEN-LAST:event_jCalendarPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonMakeAppointment;
    private javax.swing.JButton jButtonSeeEvent;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelInformation1;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JLabel jLabelwallpaper1;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    // End of variables declaration//GEN-END:variables

    public String parseDate(Date d) {
        SimpleDateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFromat.format(d);
        return date;
    }
 private void setIcon(){
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/imagens/logo-icon.png")).getImage());
        setIconImages(icons);
    }
}
