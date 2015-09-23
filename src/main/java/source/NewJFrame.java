/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import source.domain.Doctor;
import source.domain.Patient;

/**
 *
 * @author B2jKa
 */
public class NewJFrame extends javax.swing.JFrame {

    private JSpinner jSpinner1;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simpleDialog = new javax.swing.JDialog();
        labelName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        labelSurname = new javax.swing.JLabel();
        textSurname = new javax.swing.JTextField();
        labelPhone = new javax.swing.JLabel();
        labelNip = new javax.swing.JLabel();
        labelHour = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        labelDoctor = new javax.swing.JLabel();
        comboDoctor = new javax.swing.JComboBox();
        addVisitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        spinnHour = new javax.swing.JSpinner(sm);
        nipField = new javax.swing.JFormattedTextField();
        phoneField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        comboSpec = new javax.swing.JComboBox();
        emptyMassage = new javax.swing.JDialog();
        Massage = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        addVisit = new javax.swing.JButton();

        simpleDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        simpleDialog.setTitle("Dodaj wizytę");
        simpleDialog.setAlwaysOnTop(true);
        simpleDialog.setLocationByPlatform(true);
        simpleDialog.setMinimumSize(new java.awt.Dimension(460, 365));
        simpleDialog.setPreferredSize(new java.awt.Dimension(460, 365));
        simpleDialog.setResizable(false);

        labelName.setText("Imię:");

        textName.setToolTipText("");
        textName.setName(""); // NOI18N

        labelSurname.setText("Nazwisko:");

        labelPhone.setText("Nr telefonu:");

        labelNip.setText("NIP (opcjonalnie):");

        labelHour.setText("Godzina wizyty:");

        labelDate.setText("Data wizyty:");

        labelDoctor.setText("Lekarz:");

        comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>" }));

        addVisitButton.setText("Dodaj wizytę");
        addVisitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Wyczyść");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        JSpinner.DateEditor de = new JSpinner.DateEditor(spinnHour, "HH:mm");
        spinnHour.setEditor(de);
        spinnHour.setMinimumSize(new java.awt.Dimension(29, 22));

        try {
            nipField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            phoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("### ### ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phoneField.setMinimumSize(new java.awt.Dimension(6, 27));
        phoneField.setPreferredSize(new java.awt.Dimension(39, 27));

        jLabel1.setText("Poradnia:");

        comboSpec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>", "Patamorfologiczna", "Kardiologiczna", "Chirurgiczna", "Gastrologiczna", "Chirurgiczna dziecięca", "Laryngologiczna", "Okulistyczna", "Urologiczna", "Neurologiczna", "Ortopedyczna", "Dietetyczna", "Internistyczna", "Dermatologiczna", "Pediatryczna", "Ginekologiczna" }));
        comboSpec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSpecItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout simpleDialogLayout = new javax.swing.GroupLayout(simpleDialog.getContentPane());
        simpleDialog.getContentPane().setLayout(simpleDialogLayout);
        simpleDialogLayout.setHorizontalGroup(
            simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, simpleDialogLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSpec, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(addVisitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelHour, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spinnHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelNip, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nipField))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addComponent(labelDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        simpleDialogLayout.setVerticalGroup(
            simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(simpleDialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSurname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(simpleDialogLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nipField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHour, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(spinnHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSpec, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(simpleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVisitButton)
                    .addComponent(resetButton))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        textName.getAccessibleContext().setAccessibleName("");

        emptyMassage.setAlwaysOnTop(true);
        emptyMassage.setMinimumSize(new java.awt.Dimension(449, 147));
        emptyMassage.setResizable(false);

        Massage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Massage.setForeground(new java.awt.Color(255, 0, 51));
        Massage.setText("Nie wszystkie pola są uzupełnione!");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emptyMassageLayout = new javax.swing.GroupLayout(emptyMassage.getContentPane());
        emptyMassage.getContentPane().setLayout(emptyMassageLayout);
        emptyMassageLayout.setHorizontalGroup(
            emptyMassageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyMassageLayout.createSequentialGroup()
                .addGroup(emptyMassageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emptyMassageLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Massage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(emptyMassageLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(okButton)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        emptyMassageLayout.setVerticalGroup(
            emptyMassageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emptyMassageLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Massage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addVisit.setText("Dodaj wizytę");
        addVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVisitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(addVisit)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(addVisit)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVisitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitButtonActionPerformed

        if (textName.getText().equals("") || textSurname.getText().equals("") || phoneField.getText().equals("           ")
                || dateChooser.getDate() == null || comboDoctor.getSelectedItem().toString().equals("<none>")) {
            emptyMassage.setVisible(true);
        } else {
            LocalTime tm = new LocalTime(spinnHour.getValue());
            LocalDate dt = new LocalDate(dateChooser.getDate());
            addVisit(textName.getText(), textSurname.getText(), phoneField.getText(), nipField.getText(), tm, dt, comboDoctor.getSelectedItem().toString(), comboSpec.getSelectedItem().toString());
            clean();
            simpleDialog.dispose();
        }
    }//GEN-LAST:event_addVisitButtonActionPerformed

    private void addVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVisitActionPerformed
        simpleDialog.setVisible(true);
    }//GEN-LAST:event_addVisitActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        emptyMassage.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clean();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void comboSpecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSpecItemStateChanged
        String choice = comboSpec.getSelectedItem().toString();
        switch (choice) {
            case "Laryngologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Adam Gresyk", "Wojciech Kaniuk"}));
                break;
            case "Patamorfologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"M. Kajor"}));
                break;
            case "Kardiologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Rafał Nowak", "Wojciech Fil"}));
                break;
            case "Chirurgiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Łukasz Noras", "Robert Repeć"}));
                break;
            case "Gastrologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Sebastian Kulski"}));
                break;
            case "Chirurgiczna dziecięca":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Andrzej Grabowski"}));
                break;
            case "Okulistyczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Barbara Kawalec-Herbut", "Bożena Bazielich"}));
                break;
            case "Urologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Krzysztof Sacha", "K.Mielniczuk"}));
                break;
            case "Neurologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Barbara Rutka"}));
                break;
            case "Ortopedyczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Jan  Bonikowski"}));
                break;
            case "Dietetyczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Bzymek Dominika"}));
                break;
            case "Internistyczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Agnieszka Jagieła-Szymala", "Alina Zakrzewska", "Mariola Okopień", "Maria Rykowska"}));
                break;
            case "dermatologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Alicja Zamorska"}));
                break;
            case "pediatryczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Magdalena .Uznańska"}));
                break;
            case "Ginekologiczna":
                comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Tomasz Jureczko", "Krzysztof Nowosielski", "Tomasz Szulik", "Maciej Jędrzejko", "Marta Szulik"}));
                break;
    }//GEN-LAST:event_comboSpecItemStateChanged
    }

    private void addVisit(String name, String sname, String phone, String nip, LocalTime time, LocalDate date, String doctor, String spec) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setSurname(sname);
        patient.setPhoneNumber(phone);
        patient.setNip(nip);
        patient.setDate(date);
        patient.setTime(time);
        List<Patient> patients = new ArrayList<>();
        patients.add(patient);

        Doctor doctors = new Doctor();
        doctors.setName(doctor);
        doctors.setSpecialization(spec);
        doctors.setPatients(patients);

        persist(doctors);
    }

    private void clean() {
        textName.setText(null);
        textSurname.setText(null);
        phoneField.setValue(null);
        nipField.setValue(null);
        comboSpec.setSelectedItem("<none>");
        comboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"<none>"}));
    }

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Massage;
    private javax.swing.JButton addVisit;
    private javax.swing.JButton addVisitButton;
    private javax.swing.JComboBox comboDoctor;
    private javax.swing.JComboBox comboSpec;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JDialog emptyMassage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDoctor;
    private javax.swing.JLabel labelHour;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelNip;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelSurname;
    private javax.swing.JFormattedTextField nipField;
    private javax.swing.JButton okButton;
    private javax.swing.JFormattedTextField phoneField;
    private javax.swing.JButton resetButton;
    private javax.swing.JDialog simpleDialog;
    private javax.swing.JSpinner spinnHour;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textSurname;
    // End of variables declaration//GEN-END:variables
@javax.persistence.PersistenceUnit(unitName = "persistence") private EntityManagerFactory emf;
@Resource private UserTransaction utx;
    public void persist(Doctor object) {
      
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence.xml");
        EntityManager em = emf.createEntityManager();
        try {
            utx.begin();
            
            em.persist(object);
            
            utx.commit();
        } catch (Exception e) {
            System.out.print("you have a problem!!");
            try {
                utx.rollback();
            } catch (IllegalStateException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SystemException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            em.close();
        }
   }
}