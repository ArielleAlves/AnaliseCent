/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.ModeloJanelas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alves
 */
public class Umidade extends javax.swing.JDialog implements ActionListener{
    private double  inserir1; 
    private double inserir2; 
    private double inserir3;
    private double resultadoCalculo1;
  


    /**
     * Creates new form NewJDialog
     */
    public Umidade() {
      
        initComponents();
        btninserirumidade.add(this);
    }
    
    TelaInicial ti  = new TelaInicial();
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        txtresultado2 = new javax.swing.JTextField();
        btncarcular2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcadinho2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtamostra2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfinal2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtresultado3 = new javax.swing.JTextField();
        btncalcular3 = new javax.swing.JButton();
        btnmediaumidade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcadinho3 = new javax.swing.JTextField();
        txtcadinho1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtamostra3 = new javax.swing.JTextField();
        txtamostra1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfinal1 = new javax.swing.JTextField();
        txtfinal3 = new javax.swing.JTextField();
        txtmediaumidade = new javax.swing.JTextField();
        txtresultado1 = new javax.swing.JTextField();
        btninserirumidade = new javax.swing.JButton();
        btncalcular1 = new javax.swing.JButton();
        btnDesvioPadraoUmidade = new javax.swing.JButton();
        txtDesvioPadraoUmidade = new javax.swing.JTextField();
        Varianciaumidade = new javax.swing.JButton();
        txtvarianciaumidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        jLabel23.setText("g");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CALCEN");

        btncarcular2.setText("Calcular:");
        btncarcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarcular2ActionPerformed(evt);
            }
        });

        jLabel6.setText("P. Cadinho Vazio");

        txtcadinho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadinho2ActionPerformed(evt);
            }
        });

        jLabel8.setText("P. Amostra");

        jLabel9.setText("P. Final");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Amostra 2:");

        txtresultado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultado3ActionPerformed(evt);
            }
        });

        btncalcular3.setText("Calcular:");
        btncalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcular3ActionPerformed(evt);
            }
        });

        btnmediaumidade.setText("Média");
        btnmediaumidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmediaumidadeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Umidade");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Amostra 3:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Amostra 1:");

        jLabel13.setText("P. Cadinho Vazio");

        jLabel3.setText("P. Cadinho Vazio");

        txtcadinho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadinho3ActionPerformed(evt);
            }
        });

        txtcadinho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcadinho1ActionPerformed(evt);
            }
        });

        jLabel14.setText("P. Amostra");

        jLabel4.setText("P. Amostra");

        txtamostra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamostra3ActionPerformed(evt);
            }
        });

        jLabel15.setText("P. Final");

        jLabel5.setText("P. Final");

        txtresultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultado1ActionPerformed(evt);
            }
        });

        btninserirumidade.setText("Inserir");
        btninserirumidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirumidadeActionPerformed(evt);
            }
        });

        btncalcular1.setText("Calcular:");
        btncalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcular1ActionPerformed(evt);
            }
        });

        btnDesvioPadraoUmidade.setText("Desvio Padrão");
        btnDesvioPadraoUmidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesvioPadraoUmidadeActionPerformed(evt);
            }
        });

        Varianciaumidade.setText("Variância");
        Varianciaumidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VarianciaumidadeActionPerformed(evt);
            }
        });

        txtvarianciaumidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvarianciaumidadeActionPerformed(evt);
            }
        });

        jLabel18.setText("g");

        jLabel19.setText("g");

        jLabel20.setText("g");

        jLabel21.setText("g");

        jLabel22.setText("g");

        jLabel24.setText("g");

        jLabel25.setText("g");

        jLabel26.setText("g");

        jLabel27.setText("g");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Varianciaumidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnmediaumidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmediaumidade, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(txtvarianciaumidade))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnDesvioPadraoUmidade)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDesvioPadraoUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btninserirumidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcadinho1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtcadinho3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(100, 100, 100)
                                                    .addComponent(txtcadinho2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel6))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel21)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtamostra3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel26))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(2, 2, 2)
                                                    .addComponent(txtamostra1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel19))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtamostra2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel22)))))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtfinal3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(5, 5, 5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel27)
                                                .addComponent(jLabel24))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btncarcular2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtresultado2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btncalcular1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btncalcular3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtresultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btncalcular3)
                        .addComponent(txtresultado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcadinho1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtresultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncalcular1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtamostra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtfinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)))
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcadinho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtresultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtamostra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtfinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncarcular2)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcadinho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel25))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtamostra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmediaumidade)
                    .addComponent(txtmediaumidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesvioPadraoUmidade)
                    .addComponent(txtDesvioPadraoUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Varianciaumidade)
                    .addComponent(txtvarianciaumidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btninserirumidade))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncarcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarcular2ActionPerformed
        // TODO add your handling code here:
        double n1, n2, n3, result2;

        n1 = Double.parseDouble (txtcadinho2.getText());
        n2 = Double.parseDouble(txtamostra2.getText());
        n3 = Double.parseDouble(txtfinal2.getText());

        result2 = ((n3-n1)*100) / n2;

        txtresultado2.setText(String.valueOf(result2));
    }//GEN-LAST:event_btncarcular2ActionPerformed

    private void txtcadinho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadinho2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadinho2ActionPerformed

    private void txtresultado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultado3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtresultado3ActionPerformed

    private void btncalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcular3ActionPerformed
        // TODO add your handling code here:
        double n1, n2, n3, result3;

        n1 = Double.parseDouble (txtcadinho3.getText());
        n2 = Double.parseDouble(txtamostra3.getText());
        n3 = Double.parseDouble(txtfinal3.getText());

        result3 = ((n3-n1)*100) / n2;

        txtresultado3.setText(String.valueOf(result3));
    }//GEN-LAST:event_btncalcular3ActionPerformed

    private void btnmediaumidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmediaumidadeActionPerformed
        // TODO add your handling code here:
        double result, result2, result3, mediaumidade;

        result = Double.parseDouble(txtresultado1.getText());
        result2 = Double.parseDouble(txtresultado2.getText());
        result3 = Double.parseDouble(txtresultado3.getText());

        mediaumidade = (result + result2 + result3) / 3;

        txtmediaumidade.setText(String.valueOf(mediaumidade));
    }//GEN-LAST:event_btnmediaumidadeActionPerformed

    private void txtcadinho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadinho3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadinho3ActionPerformed

    private void txtcadinho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcadinho1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcadinho1ActionPerformed

    private void txtamostra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamostra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamostra3ActionPerformed

    private void btninserirumidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirumidadeActionPerformed
        // TODO add your handling code here:

      
                
    }//GEN-LAST:event_btninserirumidadeActionPerformed
 /*this.inserir1 = Double.parseDouble(this.txtresultado1.getText());
        this.inserir2 = Double.parseDouble(this.txtresultado2.getText());
        this.inserir3 = Double.parseDouble(this.txtresultado3.getText());
        this.dispose(); */ 
               
    private void btncalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcular1ActionPerformed
        // TODO add your handling code here:
        double n1, n2, n3, result;
        
        n1 = Double.parseDouble (txtcadinho1.getText());
        n2 = Double.parseDouble(txtamostra1.getText());
        n3 = Double.parseDouble(txtfinal1.getText());

        result = ((n3-n1)*100) / n2;

        txtresultado1.setText(String.valueOf(result));
    }//GEN-LAST:event_btncalcular1ActionPerformed

    private void btnDesvioPadraoUmidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesvioPadraoUmidadeActionPerformed
        double n1, n2, n3, somatorio1, somatorio2, somatorio3;
        double result, result2, result3, mediaumidade, variancia, despadrao;
        
        result = Double.parseDouble(txtresultado1.getText());
        result2 = Double.parseDouble(txtresultado2.getText());
        result3 = Double.parseDouble(txtresultado3.getText());
        mediaumidade = (result + result2 + result3) / 3;   
        
        n1 = Double.parseDouble (txtresultado1.getText());
        n2 = Double.parseDouble(txtresultado2.getText());
        n3 = Double.parseDouble(txtresultado3.getText());       
        somatorio1 = Math.pow(n1-mediaumidade,2);     
        somatorio2 = Math.pow(n2-mediaumidade,2);
        somatorio3 = Math.pow(n3-mediaumidade,2);
       
        variancia = somatorio1+somatorio2+somatorio3/3;
        despadrao = Math.sqrt (variancia);
        
        txtDesvioPadraoUmidade.setText(String.valueOf(despadrao));
             
    }//GEN-LAST:event_btnDesvioPadraoUmidadeActionPerformed

    private void txtresultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultado1ActionPerformed

    private void txtvarianciaumidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvarianciaumidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvarianciaumidadeActionPerformed

    private void VarianciaumidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VarianciaumidadeActionPerformed
        // TODO add your handling code here:
        double n1, n2, n3, somatorio1, somatorio2, somatorio3, variancia;
        double result, result2, result3, mediaumidade;
        
        result = Double.parseDouble(txtresultado1.getText());
        result2 = Double.parseDouble(txtresultado2.getText());
        result3 = Double.parseDouble(txtresultado3.getText());
        mediaumidade = (result + result2 + result3) / 3;   
        
        n1 = Double.parseDouble (txtresultado1.getText());
        n2 = Double.parseDouble(txtresultado2.getText());
        n3 = Double.parseDouble(txtresultado3.getText());       
        somatorio1 = Math.pow(n1-mediaumidade,2);     
        somatorio2 = Math.pow(n2-mediaumidade,2);
        somatorio3 = Math.pow(n3-mediaumidade,2);
       
        variancia = somatorio1+somatorio2+somatorio3/3;
        txtvarianciaumidade.setText(String.valueOf(variancia));
    }//GEN-LAST:event_VarianciaumidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Umidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Umidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Umidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Umidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                   
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Varianciaumidade;
    private javax.swing.JButton btnDesvioPadraoUmidade;
    private javax.swing.JButton btncalcular1;
    private javax.swing.JButton btncalcular3;
    private javax.swing.JButton btncarcular2;
    private javax.swing.JButton btninserirumidade;
    private javax.swing.JButton btnmediaumidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDesvioPadraoUmidade;
    private javax.swing.JTextField txtamostra1;
    private javax.swing.JTextField txtamostra2;
    private javax.swing.JTextField txtamostra3;
    private javax.swing.JTextField txtcadinho1;
    private javax.swing.JTextField txtcadinho2;
    private javax.swing.JTextField txtcadinho3;
    private javax.swing.JTextField txtfinal1;
    private javax.swing.JTextField txtfinal2;
    private javax.swing.JTextField txtfinal3;
    private javax.swing.JTextField txtmediaumidade;
    private javax.swing.JTextField txtresultado1;
    private javax.swing.JTextField txtresultado2;
    private javax.swing.JTextField txtresultado3;
    private javax.swing.JTextField txtvarianciaumidade;
    // End of variables declaration//GEN-END:variables

    public double getInserir1() {
        return inserir1;
    }

    public void setInserir1(double  inserir1) {
        this.inserir1 = inserir1;
    }

    
    
    public double getInserir2() {
        return inserir2;
    }

    public void setInserir2(double inserir2) {
        this.inserir2 = inserir2;
    }

    
    
    public double getInserir3() {
        return inserir3;
    }

    public void setInserir3(double inserir3) {
        this.inserir3 = inserir3;
    }

    /**
     * @return the resultadoCalculo1
     */
    public double getResultadoCalculo1() {
        return resultadoCalculo1;
    }

    /**
     * @param resultadoCalculo1 the resultadoCalculo1 to set
     */
    public void setResultadoCalculo1(double resultadoCalculo1) {
        this.resultadoCalculo1 = resultadoCalculo1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
        resultadoCalculo1 =  Double.parseDouble(txtresultado1.getText());
        dispose();
    
    
    }
    
    
    
    
}