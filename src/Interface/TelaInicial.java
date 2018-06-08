package Interface;

import Entidades.Amostra;
import Util.AnaCentCalc;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaInicial extends javax.swing.JFrame {

    public static List<Amostra> listAmonstra = new ArrayList<>();

    public TelaInicial() {
        initComponents();
        setResizable(false);

        listAmonstra = createAmostBase();
        updateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        btnUmidade = new javax.swing.JButton();
        btnCinzas = new javax.swing.JButton();
        btnProteinas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnFibras1 = new javax.swing.JButton();
        btnCarboidratos1 = new javax.swing.JButton();
        btnLipidios1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelafinal = new javax.swing.JTable();

        jLabel51.setText("g");

        jLabel52.setText("g");

        jLabel53.setText("g");

        jLabel57.setText("g");

        jLabel58.setText("g");

        jLabel59.setText("g");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCEN");

        btnUmidade.setText("Umidade");
        btnUmidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmidadeActionPerformed(evt);
            }
        });

        btnCinzas.setText("Cinzas");
        btnCinzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinzasActionPerformed(evt);
            }
        });

        btnProteinas.setText("Proteínas");
        btnProteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProteinasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        jLabel4.setText("ANÁLISE CENTESIMAL");

        btnFibras1.setText("Fibras");
        btnFibras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibras1ActionPerformed(evt);
            }
        });

        btnCarboidratos1.setText("Carboidratos");
        btnCarboidratos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarboidratos1ActionPerformed(evt);
            }
        });

        btnLipidios1.setText("Lipídios");
        btnLipidios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLipidios1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado das amostras");

        tabelafinal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabelafinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Amostra", "Umidade", "Cinzas", "Proteínas", "Lipídios", "Fibras", "Carboidratos"
            }
        ));
        tabelafinal.setRowHeight(30);
        jScrollPane7.setViewportView(tabelafinal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCinzas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLipidios1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFibras1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCarboidratos1)))
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUmidade)
                    .addComponent(btnCinzas)
                    .addComponent(btnProteinas)
                    .addComponent(btnLipidios1)
                    .addComponent(btnFibras1)
                    .addComponent(btnCarboidratos1))
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUmidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmidadeActionPerformed

        PropostaUmidade frame = new PropostaUmidade(this, true, listAmonstra);
        frame.setModal(true);
        frame.setVisible(true);
        updateTable();
        
    }//GEN-LAST:event_btnUmidadeActionPerformed

    public void teste() {
        System.out.println("no metodo");
    }

    private void btnCinzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinzasActionPerformed
        // TODO add your handling code here:
        PropostaCinzas frame = new PropostaCinzas(this, true, listAmonstra);
        frame.setVisible(true);
        updateTable();
        
    }//GEN-LAST:event_btnCinzasActionPerformed

    private void btnProteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProteinasActionPerformed
        // TODO add your handling code here:
        PropostaProteinas frame = new PropostaProteinas(this, true, listAmonstra);
        frame.setVisible(true);
        updateTable();
    }//GEN-LAST:event_btnProteinasActionPerformed

    private void btnFibras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibras1ActionPerformed
        // TODO add your handling code here:
        PropostaFibras frame = new PropostaFibras(this, true, listAmonstra);
        frame.setVisible(true);
        updateTable();
        
    }//GEN-LAST:event_btnFibras1ActionPerformed

    private void btnCarboidratos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarboidratos1ActionPerformed
        // TODO add your handling code here:
        
        boolean pass = false;
        
        for(Amostra a : listAmonstra){
            
            if(a.getFibras() == null || 
                    a.getCinzas() == null ||
                    a.getLipidios() == null ||
                    a.getProteinas() == null ||
                    a.getUmidade() == null){
                
                pass = false;
                break;
                
            }else{
                
                pass = true;
                
            }
            
        }
        
        if(pass){
            
            for(Amostra a : listAmonstra){
                
                Double carb = AnaCentCalc.calcCarboidratos(a.getProteinas(),
                        a.getFibras(),a.getLipidios(),a.getUmidade(),a.getCinzas());
                
                a.setCarboidratos(carb);
                
            }
            
            updateTable();
            
        }else{
            
            System.err.println("Falta dados!");
            //mensagem de erro
            
        }
        
    }//GEN-LAST:event_btnCarboidratos1ActionPerformed

    private void btnLipidios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLipidios1ActionPerformed
        // TODO add your handling code here:
        PropostaLipidios frame = new PropostaLipidios(this, true, listAmonstra);
        frame.setVisible(true);
        updateTable();
        
    }//GEN-LAST:event_btnLipidios1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarboidratos1;
    private javax.swing.JButton btnCinzas;
    private javax.swing.JButton btnFibras1;
    private javax.swing.JButton btnLipidios1;
    private javax.swing.JButton btnProteinas;
    private javax.swing.JButton btnUmidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tabelafinal;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {

        
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Amostra %");
        modelo.addColumn("Umidade %");
        modelo.addColumn("Cinzas %");
        modelo.addColumn("Proteínas %");
        modelo.addColumn("Lipídios %");
        modelo.addColumn("Fibras %");
        modelo.addColumn("Carboidratos %");

        for (Amostra a : listAmonstra) {

            modelo.addRow(new Object[]{
                a.getId(),
                montPorcentResult(a.getUmidade()),
                montPorcentResult(a.getCinzas()),
                montPorcentResult(a.getProteinas()),
                montPorcentResult(a.getLipidios()),
                montPorcentResult(a.getFibras()),
                montPorcentResult(a.getCarboidratos())
            });

        }

        tabelafinal.setModel(modelo);
        
    }

    private String montPorcentResult(Double value) {

        if (value == null) {

            return "";
            
        } else {

            DecimalFormat df = new DecimalFormat("#,##0.00");
            return df.format(value);

        }
    }

    private List<Amostra> createAmostBase() {

        //ele deve ser usado na tela principal para criar o vetor base
        List<Amostra> list = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {

            Amostra a = new Amostra();
            a.setId(i);
            list.add(a);

        }

        return list;

    }

}
