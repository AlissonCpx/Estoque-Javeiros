package View;

import Connection.Conexao;
import Control.FornecedorControl;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaFornecedor extends javax.swing.JFrame {
    FornecedorControl control;

    public TelaFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // instancia o controle
        control  = new FornecedorControl(this);
        // exibir a lista na tabela
        exibirNaTab(control.selecionarTodos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fcnp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fnum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fbai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fcom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fcep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ftel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btIncluir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ftab = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        fcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcodActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO");

        fcnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcnpActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

        fnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnomActionPerformed(evt);
            }
        });

        jLabel3.setText("NOME");

        fend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fendActionPerformed(evt);
            }
        });

        jLabel4.setText("ENDEREÇO");

        fnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnumActionPerformed(evt);
            }
        });

        jLabel5.setText("NÚMERO");

        fbai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbaiActionPerformed(evt);
            }
        });

        jLabel6.setText("BAIRRO");

        fcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcomActionPerformed(evt);
            }
        });

        jLabel7.setText("COMPLEMENTO");

        fcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcepActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP");

        ftel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftelActionPerformed(evt);
            }
        });

        jLabel9.setText("TELEFONE");

        jButton1.setText("Pesquisar");

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");

        jButton4.setText("Alterar");

        ftab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CNPJ", "NOME", "ENDEREÇO", "NÚMERO", "BAIRRO", "COMPLEMENTO", "CEP", "TELEFONE"
            }
        ));
        jScrollPane2.setViewportView(ftab);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fcep))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fcom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fbai))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fnum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fend))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fnom))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fcnp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fcod, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(btIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(fcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(fcnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(fnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(fend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(fnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(fbai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(fcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(fcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ftel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(btIncluir)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcodActionPerformed

    private void fcnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcnpActionPerformed

    private void fnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnomActionPerformed

    private void fendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fendActionPerformed

    private void fnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnumActionPerformed

    private void fbaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbaiActionPerformed

    private void fcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcomActionPerformed

    private void fcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcepActionPerformed

    private void ftelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftelActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
                
        if(control.inserir()){
            // axibir mensagem
            JOptionPane.showMessageDialog(this, "Inserção Realizada com Sucesso!");
            
            // exibir a lista na tabela
            exibirNaTab(control.selecionarTodos());
        }
        else{
            JOptionPane.showMessageDialog(this, "Falha Inserção");
        }
        
    }//GEN-LAST:event_btIncluirActionPerformed

    // METODOS
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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }
    
    // le os dados do formulario e retorna um objeto Fornecedor
    public Fornecedor lerForm(){
        Fornecedor f = new Fornecedor();
        f.setCod( 0 );
        f.setCnpj(fcnp.getText() );
        f.setNome(fnom.getText() );
        f.setEndereco( fend.getText() );
        f.setNumero( fnum.getText() );
        f.setComplemento( fcom.getText() );
        f.setBairro( fbai.getText() );
        f.setCep( fcep.getText() );
        f.setFone( ftel.getText() );
        
        return f;
    }
    
    // exibe um dado objeto Fornecedor no formulario
    public void exibirNoForm(Fornecedor f){
        fcod.setText( Integer.toString(f.getCod()) );
        fcnp.setText( f.getCnpj() );
        fnom.setText( f.getNome() );
        fend.setText( f.getEndereco() );
        fnum.setText( f.getNumero() );
        fcom.setText( f.getComplemento() );
        fbai.setText( f.getBairro() );
        fcep.setText( f.getCep() );
        ftel.setText( f.getFone() );
    }

    // exibe uma dada lista de objetos Fornecedor na tabela
    public void exibirNaTab(List<Fornecedor> l){
        DefaultTableModel tabMod = (DefaultTableModel) ftab.getModel();
        tabMod.setRowCount(0);
        
        for(Fornecedor f : l){
            String[] row = new String[9];  
            row[0] = (String.valueOf(f.getCod()));
            row[1] = f.getCnpj();
            row[2] = f.getNome();
            row[3] = f.getEndereco();
            row[4] = f.getNumero();
            row[5] = f.getComplemento();
            row[6] = f.getBairro();
            row[7] = f.getCep();
            row[8] = f.getFone();
            
            tabMod.addRow(row);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JTextField fbai;
    private javax.swing.JTextField fcep;
    private javax.swing.JTextField fcnp;
    private javax.swing.JTextField fcod;
    private javax.swing.JTextField fcom;
    private javax.swing.JTextField fend;
    private javax.swing.JTextField fnom;
    private javax.swing.JTextField fnum;
    private javax.swing.JTable ftab;
    private javax.swing.JTextField ftel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
