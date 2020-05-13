/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saltosynctool;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author 58088
 */
public class InterfaceLangas extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceLangas
     */
    public InterfaceLangas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Sinchronizacijos įrankis: Pagrindinis");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        StartSyncBtn = new javax.swing.JButton();
        LogsEventsBtn = new javax.swing.JButton();
        TestConButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        TestMenuBtn = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        ExitMenuBtn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        HelpBtn = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartSyncBtn.setText("Pradėti sinchronizaciją");
        StartSyncBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartSyncBtnActionPerformed(evt);
            }
        });

        LogsEventsBtn.setText("Įrašai ir įvykiai");
        LogsEventsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogsEventsBtnActionPerformed(evt);
            }
        });

        TestConButton.setText("Testuoti Prisijungimą");
        TestConButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestConButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu1.setText("Meniu");

        TestMenuBtn.setText("Testuoti prisijungimą");
        TestMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestMenuBtnActionPerformed(evt);
            }
        });
        jMenu1.add(TestMenuBtn);

        jMenuItem3.setText("Pradėti sinchronizaciją");
        jMenu1.add(jMenuItem3);

        ExitMenuBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitMenuBtn.setText("Išeiti");
        ExitMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuBtnActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenuBtn);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Nustatymai");
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Rodymas");

        jMenuItem4.setText("Pagrindinis langas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Įrašų ir įvykių langas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Pagalba");

        HelpBtn.setText("IT Pagalba");
        HelpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpBtnActionPerformed(evt);
            }
        });
        jMenu4.add(HelpBtn);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartSyncBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(TestConButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogsEventsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 454, Short.MAX_VALUE)
                        .addComponent(TestConButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartSyncBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogsEventsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class CustomOutputStream extends OutputStream {
    private JTextArea textArea;

    public CustomOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        // redirects data to the text area
        textArea.append(String.valueOf((char)b));
        // scrolls the text area to the end of data
        textArea.setCaretPosition(textArea.getDocument().getLength());
        // keeps the textArea up to dat
        textArea.update(textArea.getGraphics());
    }
}
    
    
    private void StartSyncBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartSyncBtnActionPerformed
        try{
            
        
          String command = "powershell.exe  \"C:\\Users\\58088\\Desktop\\bakiotestai\\importusers.ps1 > C:\\Users\\58088\\Desktop\\bakiotestai\\output.txt";
        
          JTextArea textArea = jTextArea1;
          
          Font font = new Font("Times New Roman", Font.PLAIN, 14);
          
          Charset charset = Charset.forName("Cp1256");
          
          jTextArea1.setFont(font);
          
          PrintStream printStream = new PrintStream(new CustomOutputStream(textArea), true);
          System.setOut(printStream);
          System.setErr(printStream);
          
          DateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
          DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HH:mm:ss");
          
          LocalDateTime now = LocalDateTime.now();
          String date = dtf.format(now); 
          
          date = date.replaceAll("\\s+","");
          date= date.replaceAll(":","");
          
         String fileseparator = System.getProperty("file.separator");
         
         File file = new File(fileseparator+ "Users" + fileseparator + "58088" + fileseparator + "Desktop" + fileseparator 
         + "bakiotestai" + fileseparator + "logs" + fileseparator + "Synclog" + date + ".txt");
          
         FileWriter write = new FileWriter(file);
         
         FileOutputStream fos = new FileOutputStream(file);
          
         PrintWriter print_line = new PrintWriter(write);
          
         print_line.println("Pradedama sinchronizacija " + date);
          
         textArea.setText("");
        
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        powerShellProcess.getOutputStream().close();
        String line;
        System.out.println("Paleidziama procedura:");
        jTextArea1.getDocument().insertString(22, "\n", null);
        
        print_line.println("Paleidžiama procedūra");
        String outline = "";
        
        BufferedReader stdout = new BufferedReader(new InputStreamReader(
        powerShellProcess.getInputStream(), "UTF-8"));
           
            String csvFile = "/Users/58088/Desktop/bakiotestai/import_converted.csv";
            String csvline = "";
            String cvsSplitBy = ",";
            int indeks = 0;

            try (BufferedReader csvbr = new BufferedReader(new FileReader(csvFile))) 
            {

                while ((line = csvbr.readLine()) != null)
                {
                    String[] user = line.split(cvsSplitBy);

                    outline = outline + (user[0] + " " + user[1] + " " + user[2] + " " +user[3] + " " + user[4] + " " + user[5] + " " + user[6] + "\n"); 
                    
                    indeks++;
                }
                
                fos.write(outline.getBytes());
                fos.write('\n');

            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
            
        try
        {
         jTextArea1.getDocument().insertString(23, outline, null); 
     //    jTextArea1.getDocument().insertString(outline.length(), "Proceduros pabaiga. " + (indeks-1) + " irasu rasta.", null); 
        }
        catch (BadLocationException ex)
        {
         ex.printStackTrace();
        }
        
        fos.flush();
        fos.close();
        stdout.close();
        
        System.out.println("Proceduros pabaiga. " + (indeks-1) + " irasu rasta.");
        print_line.println("Procedūros pabaiga.");               
        } //try pabaiga
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Sujungimas nesėkmingas" + "\n" + ee, "Test", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_StartSyncBtnActionPerformed

    static JTextField textfield1, textfield2;
    static JPasswordField textfield3;
    static JLabel spacer;
    
    private void TestConButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestConButtonActionPerformed
           
        JFrame f = new JFrame("Duomenų bazės sujungimo testavimas");
        f.getContentPane().setLayout(new MigLayout());
        
        textfield1 = new JTextField("jdbc:oracle:thin:@alma-ora12.vgtu.lt:1521:alma");
        textfield2 = new JTextField("DSPS");
        textfield3 = new JPasswordField("123456");
        
        f.setLocationRelativeTo(null);
                
        f.setSize(300,400);
        f.getContentPane().add(spacer = new JLabel("Įveskite prisijungimo nuorodą:"), "span, grow");
        f.getContentPane().add(textfield1);
        f.getContentPane().add(spacer = new JLabel(" "), "span, grow");
        f.getContentPane().add(spacer = new JLabel("Įveskite DB vartotojo pavadinimą:"), "span, grow");
        f.getContentPane().add(textfield2);
        f.getContentPane().add(spacer = new JLabel(" "), "span, grow");
        f.getContentPane().add(spacer = new JLabel("Įveskite DB vartotojo slaptažodį:"), "span, grow");
        f.getContentPane().add(textfield3);
        f.getContentPane().add(spacer = new JLabel(" "), "span, grow");
        
        JButton TestBtn = new JButton("Testuoti");
        
        f.getContentPane().add(TestBtn);
        
        TestBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
              
                Connection con = null;
                    try{

                       Class.forName("oracle.jdbc.driver.OracleDriver");

                     //  String constring = "jdbc:oracle:thin:@alma-ora12.vgtu.lt:1521:alma";
                       String constring = textfield1.getText();
                       
                       String DBuser = textfield2.getText();
                       
                       String DBpass = textfield3.getText();

                       String DBstring = "PRAEJ_KONT_VW";

                        con = DriverManager.getConnection(constring, DBuser, DBpass);

                        Statement stmt=con.createStatement();  

                        ResultSet rs = stmt.executeQuery("SELECT VARTOTOJO_ID, VARDAS, PAVARDE, RFID, PRAEJ_ID, VEIKSMAS, AUDITOPEN, GALIOJ_DATA FROM PRAEJ_KONT_VW");

                        if(rs.next() == true)
                        {
                          JOptionPane.showMessageDialog(new JFrame(), "Sujungimas sėkmingas", "Sujungimo testavimo eiga rodoma lange.", JOptionPane.INFORMATION_MESSAGE);
                        }

                      JTextArea textArea = jTextArea1;
                      PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
                      System.setOut(printStream);
                      System.setErr(printStream);

                      int usercount = 0;

                        while(rs.next()){
                            usercount++;  
                        }  

                        System.out.println("Sujungimas sekmingas, " + usercount + " irasu rasta lenteleje "+ DBstring);
                        System.out.println("Sujungimo nuoroda: " + constring);

                        con.close(); 
                    }
                    catch (SQLException er) 
                    {
                        er.printStackTrace();
                        JOptionPane.showMessageDialog(new JFrame(), "Connection Unsuccessful" + "\n" + e, "Test", JOptionPane.ERROR_MESSAGE);
                    }
                    catch(Exception ee){JOptionPane.showMessageDialog(null, ee);}
                        }
                    });
         
        f.pack();
        f.setVisible(true);
                
    }//GEN-LAST:event_TestConButtonActionPerformed

    private void ExitMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuBtnActionPerformed

    //same kaip ir testbtn
    private void TestMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestMenuBtnActionPerformed
        Connection con = null;
        try{
            
           Class.forName("oracle.jdbc.driver.OracleDriver");
           
           String constring = "jdbc:oracle:thin:@alma-ora12.vgtu.lt:1521:alma";
           
           String DBstring = "PRAEJ_KONT_VW";
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@alma-ora12.vgtu.lt:1521:alma", "DSPS", "VHfJXQ1M5ioR");
            
            Statement stmt=con.createStatement();  

            ResultSet rs = stmt.executeQuery("SELECT VARTOTOJO_ID, VARDAS, PAVARDE, RFID, PRAEJ_ID, VEIKSMAS, AUDITOPEN, GALIOJ_DATA FROM PRAEJ_KONT_VW");
            
            if(rs.next() == true)
            {
                JOptionPane.showMessageDialog(new JFrame(), "Connection Successful", "Test", JOptionPane.INFORMATION_MESSAGE);
            }
            
          JTextArea textArea = jTextArea1;
          PrintStream printStream = new PrintStream(new CustomOutputStream(textArea));
          System.setOut(printStream);
          System.setErr(printStream);
            
          int usercount = 1;
                        
            while(rs.next()){
                usercount++;
//                System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8));   
            }  
            
            System.out.println("Connection successful, " + usercount + " entries found in "+ DBstring);
            System.out.println("Connection string: " + constring);

            con.close(); 
            
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Connection Unsuccessful" + "\n" + e, "Test", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ee)
        {
            JOptionPane.showMessageDialog(null, ee);
        }
        
    }//GEN-LAST:event_TestMenuBtnActionPerformed

    private void LogsEventsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogsEventsBtnActionPerformed
        this.setVisible(false);
        new Logseventswindow().setVisible(true);
    }//GEN-LAST:event_LogsEventsBtnActionPerformed

    private void HelpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpBtnActionPerformed
        
    String urlString = "http://www.google.com";    
        
    try {
        Desktop.getDesktop().browse(new URL(urlString).toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_HelpBtnActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);     
        new Logseventswindow().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       JOptionPane.showMessageDialog(new JFrame(), "Jau esate pagrindiniame lange.", "Informacija", JOptionPane.INFORMATION_MESSAGE);    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceLangas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLangas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLangas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLangas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLangas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitMenuBtn;
    private javax.swing.JMenuItem HelpBtn;
    public javax.swing.JButton LogsEventsBtn;
    public javax.swing.JButton StartSyncBtn;
    public javax.swing.JButton TestConButton;
    private javax.swing.JMenuItem TestMenuBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
