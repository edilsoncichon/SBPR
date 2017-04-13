
package cih.propriedade;

import javax.swing.ImageIcon;

import cci.CIInterface;

public class JDCadastroPropriedade extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
   
    public JDCadastroPropriedade(java.awt.Frame parent, boolean modal, CIInterface ciInterface) {
        super(parent, modal);
        this.ciInterface = ciInterface;
        initComponents();
        this.setLocationRelativeTo(parent);
        ImageIcon icone = new ImageIcon("build/classes/cih/icones/icone-logo-reduzido.png");
        setIconImage(icone.getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPropriedade = new javax.swing.JPanel();
        jLabelResponsavel = new javax.swing.JLabel();
        jTextFieldResponsavel = new javax.swing.JTextField();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jTextFieldNomePropriedade = new javax.swing.JTextField();
        jLabelReferencia = new javax.swing.JLabel();
        jScrollPaneReferencia = new javax.swing.JScrollPane();
        jTextAreaReferencia = new javax.swing.JTextArea();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Propriedade");
        setResizable(false);

        jPanelPropriedade.setBorder(javax.swing.BorderFactory.createTitledBorder("Propriedade"));

        jLabelResponsavel.setText("Responsável:");

        jLabelNomePropriedade.setText("Nome da Propriedadade:");

        jLabelReferencia.setText("Referência:");

        jTextAreaReferencia.setColumns(20);
        jTextAreaReferencia.setRows(5);
        jScrollPaneReferencia.setViewportView(jTextAreaReferencia);

        javax.swing.GroupLayout jPanelPropriedadeLayout = new javax.swing.GroupLayout(jPanelPropriedade);
        jPanelPropriedade.setLayout(jPanelPropriedadeLayout);
        jPanelPropriedadeLayout.setHorizontalGroup(
            jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldResponsavel))
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelNomePropriedade)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomePropriedade))
                    .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                        .addComponent(jLabelReferencia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneReferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPropriedadeLayout.setVerticalGroup(
            jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropriedadeLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsavel)
                    .addComponent(jTextFieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPropriedadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePropriedade)
                    .addComponent(jTextFieldNomePropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(57, 23));

        jButtonConfirmar.setText("Confirmar");

        jButtonAlterar.setText("Limpar");
        jButtonAlterar.setPreferredSize(new java.awt.Dimension(57, 23));

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelReferencia;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JPanel jPanelPropriedade;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JScrollPane jScrollPaneReferencia;
    private javax.swing.JTextArea jTextAreaReferencia;
    private javax.swing.JTextField jTextFieldNomePropriedade;
    private javax.swing.JTextField jTextFieldResponsavel;
    // End of variables declaration//GEN-END:variables
}