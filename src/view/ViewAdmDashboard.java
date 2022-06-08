/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.ViewUsuarios.ViewPesquisarUsuarios;

import view.ViewAcervo.ViewCadAcervo;
import view.ViewAcervo.ViewEditarAcervo;
import view.ViewAcervo.ViewExcluirAcervo;
import view.ViewAcervo.ViewListarAcervo;
import view.ViewAcervo.ViewPesquisarAcervo;
import view.ViewEmprestimos.ViewNovoEmprestimo;
import view.ViewUsuarios.ViewCadUsuarios;
import view.ViewUsuarios.ViewExcluirUsuarios;
import view.ViewUsuarios.ViewListarUsuarios;
import view.ViewUsuarios.ViewEditarUsuarios;

/**
 *
 * @author Pedro Santos
 */
public class ViewAdmDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdmDashboard
     */
    public ViewAdmDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAcervo = new javax.swing.JMenu();
        cadAcervo = new javax.swing.JMenuItem();
        editarAcervo = new javax.swing.JMenuItem();
        excluirAcervo = new javax.swing.JMenuItem();
        pesquisarAcervo = new javax.swing.JMenuItem();
        listarAcervo = new javax.swing.JMenuItem();
        mnClientes = new javax.swing.JMenu();
        cadClientes = new javax.swing.JMenuItem();
        editarClientes = new javax.swing.JMenuItem();
        excluirClientes = new javax.swing.JMenuItem();
        pesquisarClientes = new javax.swing.JMenuItem();
        listarClientes = new javax.swing.JMenuItem();
        mnUsuarios = new javax.swing.JMenu();
        cadUsuarios = new javax.swing.JMenuItem();
        editarUsuarios = new javax.swing.JMenuItem();
        excluirUsuarios = new javax.swing.JMenuItem();
        pesquisarUsuarios = new javax.swing.JMenuItem();
        listarUsuarios = new javax.swing.JMenuItem();
        mnEmprestimos = new javax.swing.JMenu();
        novoEmprestimo = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard (ADM)");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1280, Short.MAX_VALUE));
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 697, Short.MAX_VALUE));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1));

        mnAcervo.setText("Acervo");

        cadAcervo.setText("Cadastrar");
        cadAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAcervoActionPerformed(evt);
            }
        });
        mnAcervo.add(cadAcervo);

        editarAcervo.setText("Editar");
        editarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAcervoActionPerformed(evt);
            }
        });
        mnAcervo.add(editarAcervo);

        excluirAcervo.setText("Excluir");
        excluirAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAcervoActionPerformed(evt);
            }
        });
        mnAcervo.add(excluirAcervo);

        pesquisarAcervo.setText("Pesquisar");
        pesquisarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAcervoActionPerformed(evt);
            }
        });
        mnAcervo.add(pesquisarAcervo);

        listarAcervo.setText("Listar");
        listarAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarAcervoActionPerformed(evt);
            }
        });
        mnAcervo.add(listarAcervo);

        jMenuBar1.add(mnAcervo);

        mnClientes.setText("Clientes");

        cadClientes.setText("Cadastrar");
        mnClientes.add(cadClientes);

        editarClientes.setText("Editar");
        mnClientes.add(editarClientes);

        excluirClientes.setText("Excluir");
        mnClientes.add(excluirClientes);

        pesquisarClientes.setText("Pesquisar");
        mnClientes.add(pesquisarClientes);

        listarClientes.setText("Listar");
        mnClientes.add(listarClientes);

        jMenuBar1.add(mnClientes);

        mnUsuarios.setText("Usuários");

        cadUsuarios.setText("Cadastrar");
        cadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUsuariosActionPerformed(evt);
            }
        });
        mnUsuarios.add(cadUsuarios);

        editarUsuarios.setText("Editar");
        editarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuariosActionPerformed(evt);
            }
        });
        mnUsuarios.add(editarUsuarios);

        excluirUsuarios.setText("Excluir");
        excluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuariosActionPerformed(evt);
            }
        });
        mnUsuarios.add(excluirUsuarios);

        pesquisarUsuarios.setText("Pesquisar");
        pesquisarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUsuariosActionPerformed(evt);
            }
        });
        mnUsuarios.add(pesquisarUsuarios);

        listarUsuarios.setText("Listar");
        listarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariosActionPerformed(evt);
            }
        });
        mnUsuarios.add(listarUsuarios);

        jMenuBar1.add(mnUsuarios);

        mnEmprestimos.setText("Empréstimos");

        novoEmprestimo.setText("Novo");
        novoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoEmprestimoActionPerformed(evt);
            }
        });
        mnEmprestimos.add(novoEmprestimo);

        jMenuBar1.add(mnEmprestimos);

        mnRelatorios.setText("Relatórios");
        jMenuBar1.add(mnRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_novoEmprestimoActionPerformed
        jDesktopPane1.removeAll();
        ViewNovoEmprestimo novoEmprestimo = new ViewNovoEmprestimo();
        jDesktopPane1.add(novoEmprestimo);
        novoEmprestimo.setVisible(true);
    }// GEN-LAST:event_novoEmprestimoActionPerformed

    private void cadAcervoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cadAcervoActionPerformed
        jDesktopPane1.removeAll();
        ViewCadAcervo cadAcervo = new ViewCadAcervo();
        jDesktopPane1.add(cadAcervo);
        cadAcervo.setVisible(true);
    }// GEN-LAST:event_cadAcervoActionPerformed

    private void editarAcervoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarAcervoActionPerformed
        jDesktopPane1.removeAll();
        ViewEditarAcervo editarAcervo = new ViewEditarAcervo();
        jDesktopPane1.add(editarAcervo);
        editarAcervo.setVisible(true);
    }// GEN-LAST:event_editarAcervoActionPerformed

    private void excluirAcervoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_excluirAcervoActionPerformed
        jDesktopPane1.removeAll();
        ViewExcluirAcervo excluirAcervo = new ViewExcluirAcervo();
        jDesktopPane1.add(excluirAcervo);
        excluirAcervo.setVisible(true);
    }// GEN-LAST:event_excluirAcervoActionPerformed

    private void pesquisarAcervoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pesquisarAcervoActionPerformed
        jDesktopPane1.removeAll();
        ViewPesquisarAcervo pesquisarAcervo = new ViewPesquisarAcervo();
        jDesktopPane1.add(pesquisarAcervo);
        pesquisarAcervo.setVisible(true);
    }// GEN-LAST:event_pesquisarAcervoActionPerformed

    private void listarAcervoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listarAcervoActionPerformed
        jDesktopPane1.removeAll();
        ViewListarAcervo listarAcervo = new ViewListarAcervo();
        jDesktopPane1.add(listarAcervo);
        listarAcervo.setVisible(true);
    }// GEN-LAST:event_listarAcervoActionPerformed

    private void cadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cadUsuariosActionPerformed
        jDesktopPane1.removeAll();
        ViewCadUsuarios cadUsuarios = new ViewCadUsuarios();
        jDesktopPane1.add(cadUsuarios);
        cadUsuarios.setVisible(true);
    }// GEN-LAST:event_cadUsuariosActionPerformed

    private void editarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarUsuariosActionPerformed
        jDesktopPane1.removeAll();
        ViewEditarUsuarios editarUsuarios = new ViewEditarUsuarios();
        jDesktopPane1.add(editarUsuarios);
        editarUsuarios.setVisible(true);
    }// GEN-LAST:event_editarUsuariosActionPerformed

    private void excluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_excluirUsuariosActionPerformed
        jDesktopPane1.removeAll();
        ViewExcluirUsuarios excluirUsuarios = new ViewExcluirUsuarios();
        jDesktopPane1.add(excluirUsuarios);
        excluirUsuarios.setVisible(true);
    }// GEN-LAST:event_excluirUsuariosActionPerformed

    private void pesquisarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pesquisarUsuariosActionPerformed
        jDesktopPane1.removeAll();
        ViewPesquisarUsuarios pesquisarUsuarios = new ViewPesquisarUsuarios();
        jDesktopPane1.add(pesquisarUsuarios);
        pesquisarUsuarios.setVisible(true);
    }// GEN-LAST:event_pesquisarUsuariosActionPerformed

    private void listarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_listarUsuariosActionPerformed
        jDesktopPane1.removeAll();
        ViewListarUsuarios listarUsuarios = new ViewListarUsuarios();
        jDesktopPane1.add(listarUsuarios);
        listarUsuarios.setVisible(true);
    }// GEN-LAST:event_listarUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAdmDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdmDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdmDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdmDashboard.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadAcervo;
    private javax.swing.JMenuItem cadClientes;
    private javax.swing.JMenuItem cadUsuarios;
    private javax.swing.JMenuItem editarAcervo;
    private javax.swing.JMenuItem editarClientes;
    private javax.swing.JMenuItem editarUsuarios;
    private javax.swing.JMenuItem excluirAcervo;
    private javax.swing.JMenuItem excluirClientes;
    private javax.swing.JMenuItem excluirUsuarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem listarAcervo;
    private javax.swing.JMenuItem listarClientes;
    private javax.swing.JMenuItem listarUsuarios;
    private javax.swing.JMenu mnAcervo;
    private javax.swing.JMenu mnClientes;
    private javax.swing.JMenu mnEmprestimos;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnUsuarios;
    private javax.swing.JMenuItem novoEmprestimo;
    private javax.swing.JMenuItem pesquisarAcervo;
    private javax.swing.JMenuItem pesquisarClientes;
    private javax.swing.JMenuItem pesquisarUsuarios;
    // End of variables declaration//GEN-END:variables
}
