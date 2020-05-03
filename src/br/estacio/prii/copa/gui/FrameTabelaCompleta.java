package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.bd.SelecaoDAO;
import br.estacio.prii.copa.entidade.Selecao;
import javax.swing.table.DefaultTableModel;

public class FrameTabelaCompleta extends javax.swing.JInternalFrame {
    SelecaoDAO selecao = new SelecaoDAO();
    
    public FrameTabelaCompleta() {
        initComponents();
        tableA();
        tableB();
        tableC();
        tableD();
        tableE();
        tableF();
        tableG();
        tableH();
        
        setVisible(true);
    }
    
    public void tableA(){
        DefaultTableModel modelo = (DefaultTableModel) tableA.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("A")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableB(){
        DefaultTableModel modelo = (DefaultTableModel) tableB.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("B")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableC(){
        DefaultTableModel modelo = (DefaultTableModel) tableC.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("C")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableD(){
        DefaultTableModel modelo = (DefaultTableModel) tableD.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("D")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableE(){
        DefaultTableModel modelo = (DefaultTableModel) tableE.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("E")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableF(){
        DefaultTableModel modelo = (DefaultTableModel) tableF.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("F")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableG(){
        DefaultTableModel modelo = (DefaultTableModel) tableG.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("G")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }
    
    public void tableH(){
        DefaultTableModel modelo = (DefaultTableModel) tableH.getModel();
        modelo.setNumRows(0);
        for(Selecao selecoes: selecao.buscaSelecaoGrupo("H")){
            modelo.addRow(new Object[]{selecoes.getNome()});
            System.out.println(selecoes.getNome());
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableE = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableF = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableB = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableC = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableG = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableD = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableH = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        tableA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        jScrollPane3.setViewportView(jTree1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tableE.setBackground(new java.awt.Color(204, 255, 204));
        tableE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO E"
            }
        ));
        jScrollPane4.setViewportView(tableE);

        tableF.setBackground(new java.awt.Color(204, 255, 204));
        tableF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO F"
            }
        ));
        jScrollPane5.setViewportView(tableF);

        tableB.setBackground(new java.awt.Color(204, 255, 204));
        tableB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO B"
            }
        ));
        jScrollPane6.setViewportView(tableB);

        tableC.setBackground(new java.awt.Color(204, 255, 204));
        tableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO C"
            }
        ));
        jScrollPane7.setViewportView(tableC);

        tableG.setBackground(new java.awt.Color(204, 255, 204));
        tableG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO G"
            }
        ));
        jScrollPane8.setViewportView(tableG);

        tableD.setBackground(new java.awt.Color(204, 255, 204));
        tableD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO D"
            }
        ));
        jScrollPane9.setViewportView(tableD);

        tableH.setBackground(new java.awt.Color(204, 255, 204));
        tableH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO H"
            }
        ));
        jScrollPane10.setViewportView(tableH);

        tableA.setBackground(new java.awt.Color(204, 255, 204));
        tableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRUPO A"
            }
        ));
        jScrollPane11.setViewportView(tableA);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/prii/copa/imagens/icons8-copa-do-mundo-25 (1).png"))); // NOI18N
        jLabel1.setText("Tabela Completa - Copa do Mundo Russia 2018");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnVoltar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        tableA();
        tableB();
        tableC();
        tableD();
        tableE();
        tableF();
        tableG();
        tableH();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTree jTree1;
    private javax.swing.JTable tableA;
    private javax.swing.JTable tableB;
    private javax.swing.JTable tableC;
    private javax.swing.JTable tableD;
    private javax.swing.JTable tableE;
    private javax.swing.JTable tableF;
    private javax.swing.JTable tableG;
    private javax.swing.JTable tableH;
    // End of variables declaration//GEN-END:variables
}
