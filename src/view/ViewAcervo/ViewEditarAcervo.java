/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.ViewAcervo;

import dao.ItemDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Item;

/**
 *
 * @author Pedro Santos
 */
public class ViewEditarAcervo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewListarUsuarios
     */
    public ViewEditarAcervo() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisaOpcoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        pesquisaInput = new javax.swing.JTextField();
        pesquisarBtn = new javax.swing.JButton();
        categoriaInput = new javax.swing.JComboBox<>();
        labelId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editoraInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoInput = new javax.swing.JTextArea();
        anoPublicacaoInput = new javax.swing.JTextField();
        editarBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        autorInput = new javax.swing.JTextField();
        tituloInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dispCheckbox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Editar Item");
        setMinimumSize(new java.awt.Dimension(1280, 695));
        setPreferredSize(new java.awt.Dimension(1280, 695));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pesquisaInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        pesquisarBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pesquisarBtn.setText("Pesquisar");
        pesquisarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarBtnActionPerformed(evt);
            }
        });

        categoriaInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        categoriaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração, Negócios e Economia", "Arte, Cinema e Fotografia", "Artesanato, Casa e Estilo de Vida", "Autoajuda", "Biografias e Histórias Reais", "Ciências", "Computação, Informática e Mídias Digitais", "Crônicas, Humor e Entretenimento", "Direito", "Educação, Referência e Didáticos", "Engenharia e Transporte", "Erótico", "Esportes e Lazer", "Fantasia, Horror e Ficção Científica", "Gastronomia e Culinária", "História", "HQs, Mangás e Graphic Novels", "Infantil", "LGBTQ+", "Literatura e Ficção", "Medicina", "Policial, Suspense e Mistério", "Política, Filosofia e Ciências Sociais", "Religião e Espiritualidade", "Romance", "Saúde e Família", "Turismo e Guias de Viagem", "Inglês e Outras Línguas", "Jovens e Adolescentes" }));

        labelId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Descrição");

        editoraInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        descricaoInput.setColumns(20);
        descricaoInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        descricaoInput.setLineWrap(true);
        descricaoInput.setRows(5);
        jScrollPane1.setViewportView(descricaoInput);

        anoPublicacaoInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        editarBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Título");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Editora");

        autorInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        tituloInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("ID:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Ano de Publicação:");

        dispCheckbox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dispCheckbox.setText("Disponível");
        dispCheckbox.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pesquisaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editarBtn)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(tituloInput)
                                    .addComponent(jLabel3)
                                    .addComponent(autorInput)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categoriaInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel2)
                                    .addComponent(editoraInput)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(anoPublicacaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(396, 396, 396))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pesquisarBtn))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(dispCheckbox)))
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pesquisaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pesquisarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dispCheckbox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editoraInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(categoriaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(anoPublicacaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(984, 984, 984)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editarBtnActionPerformed
        Item item = new Item(Integer.parseInt(labelId.getText()),
                Integer.parseInt(anoPublicacaoInput.getText()),
                tituloInput.getText(), autorInput.getText(), editoraInput.getText(),
                categoriaInput.getSelectedItem().toString(), descricaoInput.getText());
        ItemDAO dao;
        try {
            dao = new ItemDAO();
            if (dao.updateItem(item)) {
                JOptionPane.showMessageDialog(null, "Item atualizado!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Item não atualizado, tente novamente!");
            }
            dao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }// GEN-LAST:event_editarBtnActionPerformed

    private void pesquisarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pesquisarBtnActionPerformed
        Item item = null;
        ItemDAO dao;
        try {
            dao = new ItemDAO();
            item = dao.findItem(Integer.parseInt(pesquisaInput.getText()));
            dao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (item != null) {
            labelId.setText(Integer.toString(item.getId()));
            tituloInput.setText(item.getTitle());
            autorInput.setText(item.getAuthor());
            editoraInput.setText(item.getPublisher());
            anoPublicacaoInput.setText(Integer.toString(item.getPublicationYear()));
            descricaoInput.setText(item.getDescription());
            categoriaInput.setSelectedItem(item.getKind());
            dispCheckbox.setSelected(item.getIsAvailable());
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado!");
            labelId.setText("");
            tituloInput.setText("");
            autorInput.setText("");
            editoraInput.setText("");
            anoPublicacaoInput.setText("");
            descricaoInput.setText("");
            categoriaInput.setSelectedIndex(0);
            dispCheckbox.setSelected(false);
        }

    }// GEN-LAST:event_pesquisarBtnActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameActivated
    }// GEN-LAST:event_formInternalFrameActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoPublicacaoInput;
    private javax.swing.JTextField autorInput;
    private javax.swing.JComboBox<String> categoriaInput;
    private javax.swing.JTextArea descricaoInput;
    private javax.swing.JCheckBox dispCheckbox;
    private javax.swing.JButton editarBtn;
    private javax.swing.JTextField editoraInput;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField pesquisaInput;
    private javax.swing.ButtonGroup pesquisaOpcoes;
    private javax.swing.JButton pesquisarBtn;
    private javax.swing.JTextField tituloInput;
    // End of variables declaration//GEN-END:variables
}
