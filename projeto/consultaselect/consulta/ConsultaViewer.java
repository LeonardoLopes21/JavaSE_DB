/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package consultaselect.consulta;

import consultaselect.ConsultaSelector;
import java.time.LocalDate;
import java.util.ArrayList;
import models.Consulta;
import projeto.java.controller.ConsultaController;
import services.Formatter;

/**
 *
 * @author Leo
 */
public class ConsultaViewer extends javax.swing.JFrame {
    
    

    /**
     * Creates new form ConsultaViewer
     */
    public ConsultaViewer() {
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

        jLabel1 = new javax.swing.JLabel();
        filterComboBox = new javax.swing.JComboBox<>();
        filterTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        realizarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setText("Consulta");

        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Todas", "Especialidade", "Paciente", "Agendada para Hoje" }));
        filterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterComboBoxItemStateChanged(evt);
            }
        });
        filterComboBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                filterComboBoxMouseMoved(evt);
            }
        });
        filterComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filterComboBoxFocusGained(evt);
            }
        });
        filterComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterComboBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                filterComboBoxMousePressed(evt);
            }
        });
        filterComboBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                filterComboBoxComponentMoved(evt);
            }
        });
        filterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterComboBoxActionPerformed(evt);
            }
        });
        filterComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                filterComboBoxPropertyChange(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        realizarConsulta.setText("Consulta");
        realizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(realizarConsulta))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(filterComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE)
                            .addComponent(filterTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(filterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(realizarConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarConsultaActionPerformed
        // TODO add your handling code here:
        
        textArea.setText("");
        
        ArrayList<Consulta> all = ConsultaController.getAllConsultas();
        
        switch(String.valueOf(filterComboBox.getSelectedItem())){
            case "Todas": for(Consulta a : all){
             textArea.append("\nID: " + a.getId() + "\nMedico: " + a.getMedico().getNome() + "\nPaciente: " + a.getPaciente().getNome() + "\nData: " + Formatter.fixLocalDateFormatting(a.getData()) + "\nHora: " + Formatter.formatHour(a.getHora()) + "\n ===================================================");
            };break;
            case "Medico": for(Consulta a : all){
                if(a.getMedico().getNome().equals(filterTextField.getText())){
                    textArea.append("\nID: " + a.getId() + "\nMedico: " + a.getMedico().getNome() + "\nPaciente: " + a.getPaciente().getNome() + "\nData: " + Formatter.fixLocalDateFormatting(a.getData()) + "\nHora: " + Formatter.formatHour(a.getHora()) + "\n ===================================================");
                }
            }; break;
            case "Especialidade": for(Consulta a : all){
                if(a.getMedico().getEspecialidade().equals(filterTextField.getText())){
                    textArea.append("\nID: " + a.getId() + "\nMedico: " + a.getMedico().getNome() + "\nPaciente: " + a.getPaciente().getNome() + "\nData: " + Formatter.fixLocalDateFormatting(a.getData()) + "\nHora: " + Formatter.formatHour(a.getHora()) + "\n ===================================================");
                }
            }; break;
            case "Agendada para Hoje": for(Consulta a : all){
                if(a.getData().equals(LocalDate.now())){
                    textArea.append("\nID: " + a.getId() + "\nMedico: " + a.getMedico().getNome() + "\nPaciente: " + a.getPaciente().getNome() + "\nData: " + Formatter.fixLocalDateFormatting(a.getData()) + "\nHora: " + Formatter.formatHour(a.getHora()) + "\n ===================================================");
                }
            }; break;
            
            case "Paciente": for(Consulta a : all){
                if(a.getPaciente().getNome().equals(filterTextField.getText())){
                    textArea.append("\nID: " + a.getId() + "\nMedico: " + a.getMedico().getNome() + "\nPaciente: " + a.getPaciente().getNome() + "\nData: " + Formatter.fixLocalDateFormatting(a.getData()) + "\nHora: " + Formatter.formatHour(a.getHora()) + "\n ===================================================");
                }
            }; break;
        }
    }//GEN-LAST:event_realizarConsultaActionPerformed

    private void filterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterComboBoxActionPerformed
        // TODO add your handling code here:
        if(!filterComboBox.getSelectedItem().equals("Todas") && !filterComboBox.getSelectedItem().equals("Agendada para Hoje")){
            filterTextField.setVisible(true);
            filterTextField.setSize(200, 30);
        } else {
            filterTextField.setVisible(false);
        }
    }//GEN-LAST:event_filterComboBoxActionPerformed

    
    private void filterComboBoxComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_filterComboBoxComponentMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_filterComboBoxComponentMoved

    private void filterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterComboBoxItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_filterComboBoxItemStateChanged

    private void filterComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filterComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_filterComboBoxFocusGained

    private void filterComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterComboBoxMousePressed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_filterComboBoxMousePressed

    private void filterComboBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterComboBoxMouseMoved
        // TODO add your handling code here:
        if(!filterComboBox.getSelectedItem().equals("Todas") && !filterComboBox.getSelectedItem().equals("Agendada para Hoje")){
            filterTextField.setVisible(true);
            filterTextField.setSize(200, 30);
        } else {
            filterTextField.setVisible(false);
        }
        
    }//GEN-LAST:event_filterComboBoxMouseMoved

    private void filterComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_filterComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_filterComboBoxPropertyChange

    private void filterComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterComboBoxMouseClicked
        // TODO add your handling code here:
        if(!filterComboBox.getSelectedItem().equals("Todas") && !filterComboBox.getSelectedItem().equals("Agendada para Hoje")){
            filterTextField.setVisible(true);
            filterTextField.setSize(200, 30);
        } else {
            filterTextField.setVisible(false);
        }
    }//GEN-LAST:event_filterComboBoxMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new ConsultaSelector().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ConsultaViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JTextField filterTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton realizarConsulta;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables


}
