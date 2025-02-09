package sparqlquerymanager;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManagerGUI extends javax.swing.JFrame {

    private QueryExecutor queryExecutor = new QueryExecutor();
    
    public ManagerGUI() {
        initComponents();
        setTitle("SPARQL Query Manager");
        setResizable(true);
        setLocationRelativeTo(null);
        buttonGroup.add(radioButtonLocal);
        buttonGroup.add(radioButtonEndpoint);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeApplicationDialog();
            }
        });
    }
    
    private void closeApplicationDialog(){
        int res = JOptionPane.showConfirmDialog(this, "Do you want to exit the application?", 
                "Exit", JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radioButtonLocal = new javax.swing.JRadioButton();
        radioButtonEndpoint = new javax.swing.JRadioButton();
        labelFileUrl = new javax.swing.JLabel();
        fileOrUrlField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        queryArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        exeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        radioButtonLocal.setText("RDF Local");

        radioButtonEndpoint.setText("URL Endpoint");

        labelFileUrl.setText("RDF file / URL");

        fileOrUrlField.setToolTipText("Wirte a url or file path");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileOrUrlField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioButtonLocal)
                            .addComponent(radioButtonEndpoint)
                            .addComponent(labelFileUrl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonLocal)
                .addGap(18, 18, 18)
                .addComponent(radioButtonEndpoint)
                .addGap(18, 18, 18)
                .addComponent(labelFileUrl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileOrUrlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        queryArea.setColumns(20);
        queryArea.setRows(5);
        jScrollPane1.setViewportView(queryArea);

        resultArea.setEditable(false);
        resultArea.setColumns(20);
        resultArea.setRows(5);
        jScrollPane2.setViewportView(resultArea);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Run Query"));

        exeButton.setText("Execute");
        exeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exeButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(exeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exeButton)
                    .addComponent(clearButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 279, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exeButtonActionPerformed
        if (buttonGroup.getSelection() == radioButtonLocal.getModel()) {
            if(!isValidFile(fileOrUrlField.getText())){
                printErrorMessage(fileOrUrlField.getText() + " is not a File",
                        "Error - Bad File");
                return;
            }
            String result = queryExecutor.queryInLocalFile(
                    fileOrUrlField.getText(),
                    queryArea.getText()
            );
            setResultText(result);
            return;
        }
        
        if (buttonGroup.getSelection() == radioButtonEndpoint.getModel()) {
            if(!isValidUrl(fileOrUrlField.getText())){
                printErrorMessage(fileOrUrlField.getText() + " is not a URL",
                        "Error - Bad url");
                return;
            }
            String result = "";
            try {
                result = queryExecutor.queryInEndpoint(
                    fileOrUrlField.getText(), 
                    queryArea.getText()
                );
            } catch (Exception e) {
                printErrorMessage("Bad request, the internet have problems or the url are bad", "Error - Http");
            }
            setResultText(result);
            return;
        }
        
        printErrorMessage("You did not selected a file or a url option",
                "Error - options ignore");
    }//GEN-LAST:event_exeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        resultArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    public static void main(String args[]){
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exeButton;
    private javax.swing.JTextField fileOrUrlField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFileUrl;
    private javax.swing.JTextArea queryArea;
    private javax.swing.JRadioButton radioButtonEndpoint;
    private javax.swing.JRadioButton radioButtonLocal;
    private javax.swing.JTextArea resultArea;
    // End of variables declaration//GEN-END:variables
    
    private void printErrorMessage(String message, String typeError) {
        JOptionPane.showMessageDialog(this,
                    message, 
                    typeError, JOptionPane.ERROR_MESSAGE);
    }

    private void setResultText(String result) {
        resultArea.setText(result);
    }

    private boolean isValidUrl(String url) { 
        try { 
            new URL(url).toURI(); 
            return true; 
        }catch (Exception e) { 
            return false; 
        } 
    }

    private boolean isValidFile(String text) {
        return new File(text).exists();
    }

}
