/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import dao.UserDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Pedro Santos
 */
public class ViewCadUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCadUsuarios
     */
    public ViewCadUsuarios() {
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

        loginInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senhaInput = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cpfInput = new javax.swing.JTextField();
        nomeInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        verificaAdmInput = new javax.swing.JCheckBox();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        loginInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Senha");

        senhaInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cadastrarBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("CPF");

        cpfInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        nomeInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Nome");

        verificaAdmInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        verificaAdmInput.setText("Conta de Administrador");
        verificaAdmInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaAdmInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cadastrarBtn)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(verificaAdmInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verificaAdmInput)
                .addGap(18, 18, 18)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        User user;
        UserDAO dao;
        try {
            user = new User(nomeInput.getText(),verificaAdmInput.isSelected(),loginInput.getText(),senhaInput.getText(),cpfInput.getText());
            dao = new UserDAO();
            if(dao.insertUser(user)) {
                JOptionPane.showMessageDialog(null, "Usuario cadastrado!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Usuario não cadastrado!");
            }
            dao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ViewCadUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void verificaAdmInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaAdmInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificaAdmInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField loginInput;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JTextField senhaInput;
    private javax.swing.JCheckBox verificaAdmInput;
    // End of variables declaration//GEN-END:variables
}
