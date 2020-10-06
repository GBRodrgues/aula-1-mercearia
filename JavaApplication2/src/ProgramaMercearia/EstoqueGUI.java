/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaMercearia;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel <gabrielcr18@outlook.com>
 */
public class EstoqueGUI extends javax.swing.JPanel {

    private TabelaEstoque infTabela;

    public EstoqueGUI() {
        initComponents();
        meuInit();
    }

    private void meuInit() {
        infTabela = new TabelaEstoque();
        this.estoqueTabela.setModel(infTabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomePesquisaTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        estoqueTabela = new javax.swing.JTable();
        nomePesquisaBT = new javax.swing.JButton();
        excluiBT = new javax.swing.JButton();
        novoBT = new javax.swing.JButton();
        voltarBT = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(706, 405));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Estoque");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        nomePesquisaTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomePesquisaTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomePesquisaTFKeyReleased(evt);
            }
        });

        estoqueTabela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estoqueTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(estoqueTabela);

        nomePesquisaBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nomePesquisaBT.setText("Pesquisar");

        excluiBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluiBT.setText("Excluir");
        excluiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluiBTActionPerformed(evt);
            }
        });

        novoBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        novoBT.setText("Novo");
        novoBT.setPreferredSize(new java.awt.Dimension(77, 25));
        novoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoBTActionPerformed(evt);
            }
        });

        voltarBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        voltarBT.setText("Voltar");
        voltarBT.setPreferredSize(new java.awt.Dimension(77, 25));
        voltarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomePesquisaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomePesquisaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(excluiBT)
                    .addComponent(novoBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltarBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomePesquisaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePesquisaBT)
                    .addComponent(excluiBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltarBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBTActionPerformed
        JanelaPrincipal.fazTransicao(null, "compra");
    }//GEN-LAST:event_voltarBTActionPerformed

    private void nomePesquisaTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomePesquisaTFKeyReleased
        String digitado = this.nomePesquisaTF.getText();
        infTabela.atualizaDadosTabela(digitado);

        //atualiza as informações na tabela
        estoqueTabela.updateUI();    }//GEN-LAST:event_nomePesquisaTFKeyReleased

    private void excluiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluiBTActionPerformed
        int indice = estoqueTabela.getSelectedRow();
        if (indice == -1) {
            //nada foi selecionado
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            //produto selecionado
            infTabela.removeProduto(indice);
            estoqueTabela.updateUI();
        }
    }//GEN-LAST:event_excluiBTActionPerformed

    private void novoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoBTActionPerformed
        //criando uma nova janela jdialog
        JDialog janelaCadastro = new JDialog();

        //bloqueando as janelas que estão por baixo
        janelaCadastro.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);

        //definindo o tamanho da JDialog com base no tamanho da janela cadastro
        janelaCadastro.setSize(435, 281);
        
        //definindo localidade cde centro pra janela aparecer
        janelaCadastro.setLocation(null);

        //Adicionando o painel de cadastro dentro do JDialog
        janelaCadastro.add(new CadastroGUI(janelaCadastro, infTabela));

        //definindo visibilidade como verdadeira
        janelaCadastro.setVisible(true);
    }//GEN-LAST:event_novoBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable estoqueTabela;
    private javax.swing.JButton excluiBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nomePesquisaBT;
    private javax.swing.JTextField nomePesquisaTF;
    private javax.swing.JButton novoBT;
    private javax.swing.JButton voltarBT;
    // End of variables declaration//GEN-END:variables
}
