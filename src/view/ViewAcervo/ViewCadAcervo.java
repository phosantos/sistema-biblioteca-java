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
public class ViewCadAcervo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewCadUsuarios
     */
    public ViewCadAcervo() {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editoraInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastrarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        autorInput = new javax.swing.JTextField();
        tituloInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        categoriaInput = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        anoPublicacaoInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoInput = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Cadastrar Item");
        setMinimumSize(new java.awt.Dimension(1280, 695));
        setPreferredSize(new java.awt.Dimension(1280, 695));

        editoraInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setText("Editora");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Categoria:");

        cadastrarBtn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Autor");

        autorInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        tituloInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Título");

        categoriaInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        categoriaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração, Negócios e Economia", "Arte, Cinema e Fotografia", "Artesanato, Casa e Estilo de Vida", "Autoajuda", "Biografias e Histórias Reais", "Ciências", "Computação, Informática e Mídias Digitais", "Crônicas, Humor e Entretenimento", "Direito", "Educação, Referência e Didáticos", "Engenharia e Transporte", "Erótico", "Esportes e Lazer", "Fantasia, Horror e Ficção Científica", "Gastronomia e Culinária", "História", "HQs, Mangás e Graphic Novels", "Infantil", "LGBTQ+", "Literatura e Ficção", "Medicina", "Policial, Suspense e Mistério", "Política, Filosofia e Ciências Sociais", "Religião e Espiritualidade", "Romance", "Saúde e Família", "Turismo e Guias de Viagem", "Inglês e Outras Línguas", "Jovens e Adolescentes" }));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Ano de Publicação:");

        anoPublicacaoInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Descrição");

        descricaoInput.setColumns(20);
        descricaoInput.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        descricaoInput.setLineWrap(true);
        descricaoInput.setRows(5);
        jScrollPane1.setViewportView(descricaoInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cadastrarBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(tituloInput)
                            .addComponent(jLabel3)
                            .addComponent(autorInput)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoriaInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(editoraInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoPublicacaoInput)))))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editoraInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(categoriaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(anoPublicacaoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cadastrarBtnActionPerformed
        ItemDAO dao;
        Item item = new Item(Integer.parseInt(anoPublicacaoInput.getText()), tituloInput.getText(),
                autorInput.getText(), editoraInput.getText(),
                categoriaInput.getSelectedItem().toString(), descricaoInput.getText());
        try {
            dao = new ItemDAO();
            if (dao.insertItem(item)) {
                JOptionPane.showMessageDialog(null, "Item cadastrado!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro! Item não cadastrado!");
            }

            dao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }// GEN-LAST:event_cadastrarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoPublicacaoInput;
    private javax.swing.JTextField autorInput;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JComboBox<String> categoriaInput;
    private javax.swing.JTextArea descricaoInput;
    private javax.swing.JTextField editoraInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tituloInput;
    // End of variables declaration//GEN-END:variables
}
