package windows;

import windows.FrmPrincipal;

public class JPInicio extends javax.swing.JPanel {

    private FrmPrincipal janelaPrincipal;

    public JPInicio(FrmPrincipal janelaPrincipal) {
        initComponents();
        this.janelaPrincipal = janelaPrincipal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonProdutor = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonMaquina = new javax.swing.JButton();
        jButtonTipoMaquina = new javax.swing.JButton();
        jButtonPropriedades = new javax.swing.JButton();
        jButtonTipoServico = new javax.swing.JButton();
        jButtonServico = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(2, 4, 5, 5));

        jButtonProdutor.setText("Produtor");
        jButtonProdutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutorActionPerformed(evt);
            }
        });
        add(jButtonProdutor);

        jButtonFuncionario.setText("Funcionário");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        add(jButtonFuncionario);

        jButtonMaquina.setText("Máquina");
        jButtonMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaquinaActionPerformed(evt);
            }
        });
        add(jButtonMaquina);

        jButtonTipoMaquina.setText("Tipo de Máquina");
        jButtonTipoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoMaquinaActionPerformed(evt);
            }
        });
        add(jButtonTipoMaquina);

        jButtonPropriedades.setText("Propriedades");
        jButtonPropriedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPropriedadesActionPerformed(evt);
            }
        });
        add(jButtonPropriedades);

        jButtonTipoServico.setText("Tipo de Serviço");
        jButtonTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoServicoActionPerformed(evt);
            }
        });
        add(jButtonTipoServico);

        jButtonServico.setText("Serviços");
        jButtonServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicoActionPerformed(evt);
            }
        });
        add(jButtonServico);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPropriedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPropriedadesActionPerformed
        janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 2));
    }//GEN-LAST:event_jButtonPropriedadesActionPerformed

    private void jButtonServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicoActionPerformed
        janelaPrincipal.trocarPanel(new JPServico(janelaPrincipal, 0));
    }//GEN-LAST:event_jButtonServicoActionPerformed

    private void jButtonProdutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutorActionPerformed
        janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 1));
    }//GEN-LAST:event_jButtonProdutorActionPerformed

    private void jButtonTipoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoMaquinaActionPerformed
        janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 6));
    }//GEN-LAST:event_jButtonTipoMaquinaActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 4));
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jButtonMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaquinaActionPerformed
        janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 3));
    }//GEN-LAST:event_jButtonMaquinaActionPerformed

    private void jButtonTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoServicoActionPerformed
       janelaPrincipal.trocarPanel(new JPCrud(janelaPrincipal, 5));
    }//GEN-LAST:event_jButtonTipoServicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonMaquina;
    private javax.swing.JButton jButtonProdutor;
    private javax.swing.JButton jButtonPropriedades;
    private javax.swing.JButton jButtonServico;
    private javax.swing.JButton jButtonTipoMaquina;
    private javax.swing.JButton jButtonTipoServico;
    // End of variables declaration//GEN-END:variables
}