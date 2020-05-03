/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.copa.gui;

import br.estacio.prii.copa.bd.Tables;

/**
 *
 * @author Ruth
 */
public class FrameSplash extends javax.swing.JFrame {
    Tables table = new Tables();
    
    public FrameSplash() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        
        new Thread(){
            public void run(){
                for (int i = 0; i < 101; i++) {
                    try{    
                        sleep(50);
                        progress.setValue(i);
                        if(progress.getValue() <=20)
                        labelBarra.setText("Conectando banco de dados...");
                        else
                            if(progress.getValue() <= 60)
                            labelBarra.setText("Criando tabelas..."); 
                        else 
                             if(progress.getValue() <= 90)
                               labelBarra.setText("Atualizando tabelas...");
                        else
                                 labelBarra.setText("Finalizando...");
                    }catch(InterruptedException e){
                    
                    }
                }
            }
            
        }.start();
        
        table.createTableUsuario();
        table.createTableSelecao();
        table.createTableEstadios();
        table.createTableJogos();
        
        try{
            Thread.sleep(5000);
            
        }catch(InterruptedException e){}
        this.dispose();
        new FrameLogin();
        
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        labelBarra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Centro Universitário Estácio do Ceará");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 350, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Disciplina: Programação II");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Diego Sousa Campelo - 201602772002");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Francisco Rafael Magalhães da Silva - 201604021667");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("João Bruno Rodrigues de Sousa - 201401123988");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Professor: Newton Gomes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Projeto Copa 2018");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        progress.setForeground(new java.awt.Color(255, 0, 51));
        progress.setStringPainted(true);
        jPanel1.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 400, 30));

        labelBarra.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        labelBarra.setForeground(new java.awt.Color(255, 0, 0));
        labelBarra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 400, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/estacio/prii/copa/imagens/mascotejpg.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBarra;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
