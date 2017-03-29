/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows.produtor;

/**
 *
 * @author Chrysthian
 */
public class JDPesquisaProdutor extends javax.swing.JDialog {

    /**
     * Creates new form JDAlterarProdutor
     */
    public JDPesquisaProdutor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanelPesquisarProdutor = new javax.swing.JPanel();
        jLabelFiltrar = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jScrollPaneProdutores = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Filtro de Produtor");
        setResizable(false);

        jPanelPesquisarProdutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabelFiltrar.setText("Filtrar por:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "RG" }));

        jLabelNome.setText("Nome:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Data Nasc."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneProdutores.setViewportView(jTable1);

        jButtonAlterar.setText("Alterar");

        jButtonExcluir.setText("Excluir");

        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelPesquisarProdutorLayout = new javax.swing.GroupLayout(jPanelPesquisarProdutor);
        jPanelPesquisarProdutor.setLayout(jPanelPesquisarProdutorLayout);
        jPanelPesquisarProdutorLayout.setHorizontalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFiltrar)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneProdutores, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButtonAlterar)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPesquisarProdutorLayout.setVerticalGroup(
            jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarProdutorLayout.createSequentialGroup()
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFiltrar)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneProdutores, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPesquisarProdutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPesquisarProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelFiltrar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelPesquisarProdutor;
    private javax.swing.JScrollPane jScrollPaneProdutores;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}