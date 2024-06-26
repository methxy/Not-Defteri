
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.drjekyll.fontchooser.FontDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Mete
 */
public class NotDefteriGui extends javax.swing.JFrame {

    String yazi = "";
    int sayi = 0;

    int tiklama = 0;
    int caretPosition = 0;
    int[] bulunanlarinKonumlari = new int[0];
    int bulunacakKelimeninHarfSayisi = 0;

    /**
     * Creates new form NotDefteriGui
     */
    public NotDefteriGui() {
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

        renkButonGrup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yaziAlani = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        bulunacakTf = new javax.swing.JTextField();
        bulButon = new javax.swing.JButton();
        sonrakiButon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        degistirilecekTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        yeniTf = new javax.swing.JTextField();
        degistirBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        dosyaMenu = new javax.swing.JMenu();
        kaydetItem = new javax.swing.JMenuItem();
        acItem = new javax.swing.JMenuItem();
        cikisItem = new javax.swing.JMenuItem();
        duzenMenu = new javax.swing.JMenu();
        yaziRengiMenu = new javax.swing.JMenu();
        siyahRenkYazi = new javax.swing.JRadioButtonMenuItem();
        kirmiziRenkYazi = new javax.swing.JRadioButtonMenuItem();
        maviRenkYazi = new javax.swing.JRadioButtonMenuItem();
        yesilRenkYazi = new javax.swing.JRadioButtonMenuItem();
        sariRenkYazi = new javax.swing.JRadioButtonMenuItem();
        bicimMenu = new javax.swing.JMenu();
        yaziTipiItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        yaziAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yaziAlaniKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(yaziAlani);

        jLabel1.setText("Bulunacak Kelime:");

        bulButon.setText("Bul");
        bulButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulButonActionPerformed(evt);
            }
        });

        sonrakiButon.setText("Sonraki");
        sonrakiButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonrakiButonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(2, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Değiştirilecek Kelime:");

        jLabel3.setText("Yeni Kelime:");

        degistirBtn.setText("Değiştir");
        degistirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bulButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sonrakiButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bulunacakTf, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(degistirilecekTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(yeniTf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(degistirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(bulunacakTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bulButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sonrakiButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(degistirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(degistirilecekTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(yeniTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dosyaMenu.setText("Dosya");

        kaydetItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        kaydetItem.setText("Kaydet");
        kaydetItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetItemActionPerformed(evt);
            }
        });
        dosyaMenu.add(kaydetItem);

        acItem.setText("Aç");
        acItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acItemActionPerformed(evt);
            }
        });
        dosyaMenu.add(acItem);

        cikisItem.setText("Çıkış");
        cikisItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisItemActionPerformed(evt);
            }
        });
        dosyaMenu.add(cikisItem);

        jMenuBar1.add(dosyaMenu);

        duzenMenu.setText("Düzen");

        yaziRengiMenu.setText("Yazı Rengi");

        renkButonGrup.add(siyahRenkYazi);
        siyahRenkYazi.setText("Siyah");
        siyahRenkYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siyahRenkYaziActionPerformed(evt);
            }
        });
        yaziRengiMenu.add(siyahRenkYazi);

        renkButonGrup.add(kirmiziRenkYazi);
        kirmiziRenkYazi.setForeground(java.awt.Color.red);
        kirmiziRenkYazi.setText("Kırmızı");
        kirmiziRenkYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirmiziRenkYaziActionPerformed(evt);
            }
        });
        yaziRengiMenu.add(kirmiziRenkYazi);

        renkButonGrup.add(maviRenkYazi);
        maviRenkYazi.setForeground(java.awt.Color.blue);
        maviRenkYazi.setText("Mavi");
        maviRenkYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maviRenkYaziActionPerformed(evt);
            }
        });
        yaziRengiMenu.add(maviRenkYazi);

        renkButonGrup.add(yesilRenkYazi);
        yesilRenkYazi.setForeground(java.awt.Color.green);
        yesilRenkYazi.setText("Yeşil");
        yesilRenkYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesilRenkYaziActionPerformed(evt);
            }
        });
        yaziRengiMenu.add(yesilRenkYazi);

        renkButonGrup.add(sariRenkYazi);
        sariRenkYazi.setForeground(java.awt.Color.yellow);
        sariRenkYazi.setText("Sarı");
        sariRenkYazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sariRenkYaziActionPerformed(evt);
            }
        });
        yaziRengiMenu.add(sariRenkYazi);

        duzenMenu.add(yaziRengiMenu);

        jMenuBar1.add(duzenMenu);

        bicimMenu.setText("Biçim");

        yaziTipiItem.setText("Yazı Tipi");
        yaziTipiItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yaziTipiItemActionPerformed(evt);
            }
        });
        bicimMenu.add(yaziTipiItem);

        jMenuBar1.add(bicimMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sariRenkYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sariRenkYaziActionPerformed
        yaziAlani.setForeground(Color.yellow);
    }//GEN-LAST:event_sariRenkYaziActionPerformed

    private void siyahRenkYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siyahRenkYaziActionPerformed
        yaziAlani.setForeground(Color.black);
    }//GEN-LAST:event_siyahRenkYaziActionPerformed

    private void yaziAlaniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yaziAlaniKeyPressed
        yazi = yaziAlani.getText();
    }//GEN-LAST:event_yaziAlaniKeyPressed

    private void yesilRenkYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesilRenkYaziActionPerformed
        yaziAlani.setForeground(Color.green);
    }//GEN-LAST:event_yesilRenkYaziActionPerformed

    private void kirmiziRenkYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirmiziRenkYaziActionPerformed
        yaziAlani.setForeground(Color.red);
    }//GEN-LAST:event_kirmiziRenkYaziActionPerformed

    private void maviRenkYaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maviRenkYaziActionPerformed
        yaziAlani.setForeground(Color.blue);
    }//GEN-LAST:event_maviRenkYaziActionPerformed

    private void acItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acItemActionPerformed

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        jfc.setFileFilter(filter);
        jfc.showDialog(this, "Dosya Seçim");
        yaziAlani.setText("");
        String dosyaKonum = jfc.getSelectedFile().getAbsolutePath().replace("\\", "\\\\");
        String line = "";
        try {
            File file = new File(dosyaKonum);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            while ((line = br.readLine()) != null) {

                yaziAlani.setText(yaziAlani.getText() + "\n" + line);
            }
            yazi = yaziAlani.getText();
            if (yazi.contains("renk1")) {
                yaziAlani.setForeground(Color.red);
                yazi = yaziAlani.getText();
                yaziAlani.setText(yazi.replace("renk1", ""));
            } else if (yazi.contains("renk2")) {
                yaziAlani.setForeground(Color.yellow);
                yazi = yaziAlani.getText();
                yaziAlani.setText(yazi.replace("renk2", ""));
            } else if (yazi.contains("renk3")) {
                yaziAlani.setForeground(Color.black);
                yazi = yaziAlani.getText();
                yaziAlani.setText(yazi.replace("renk3", ""));
            } else if (yazi.contains("renk4")) {
                yaziAlani.setForeground(Color.green);
                yazi = yaziAlani.getText();
                yaziAlani.setText(yazi.replace("renk4", ""));
            } else if (yazi.contains("renk5")) {
                yaziAlani.setForeground(Color.blue);
                yazi = yaziAlani.getText();
                yaziAlani.setText(yazi.replace("renk5", ""));
            }
            br.close();
        } catch (Exception e) {
        }


    }//GEN-LAST:event_acItemActionPerformed

    private void kaydetItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetItemActionPerformed

        if (yaziAlani.getForeground().equals(Color.red)) {
            yazi += "\nrenk1";
        } else if (yaziAlani.getForeground().equals(Color.yellow)) {
            yazi += "\nrenk2";
        } else if (yaziAlani.getForeground().equals(Color.black)) {
            yazi += "\nrenk3";
        } else if (yaziAlani.getForeground().equals(Color.green)) {
            yazi += "\nrenk4";
        } else if (yaziAlani.getForeground().equals(Color.blue)) {
            yazi += "\nrenk5";
        }
        JFileChooser jfc2 = new JFileChooser();
        jfc2.showDialog(this, "Kaydetme Yeri Seçim");
        try ( FileWriter fw = new FileWriter(jfc2.getSelectedFile() + ".txt")) {
            fw.write(yazi);
        } catch (IOException ex) {
            Logger.getLogger(NotDefteriGui.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_kaydetItemActionPerformed

    private void cikisItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisItemActionPerformed
        System.exit(0);


    }//GEN-LAST:event_cikisItemActionPerformed

    private void yaziTipiItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yaziTipiItemActionPerformed

        Font secilenFont;
        FontDialog fontSecim = new FontDialog((Frame) null, "Font Seçim ", true);
        fontSecim.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        fontSecim.setVisible(true);
        if (!fontSecim.isCancelSelected()) {
            secilenFont = fontSecim.getSelectedFont();
            yaziAlani.setFont(secilenFont);
        }
    }//GEN-LAST:event_yaziTipiItemActionPerformed

    private void bulButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulButonActionPerformed

        String bulunacak;
        if (bulunacakTf.getText().equals("")) {
            bulunacak = "aa";
        } else {
            bulunacak = bulunacakTf.getText();
        }
        sayi = 0;
        bulunanlarinKonumlari = new int[10];
        bulunacakKelimeninHarfSayisi = bulunacak.length();
        if (yaziAlani.getText().contains(bulunacak)) {

            for (int index = yaziAlani.getText().indexOf(bulunacak); index >= 0; index = yaziAlani.getText().indexOf(bulunacak, index + 1)) {
                ++sayi;
            }
            bulunanlarinKonumlari = new int[sayi];
            int sayi2 = 0;
            for (int index = yaziAlani.getText().indexOf(bulunacak); index >= 0; index = yaziAlani.getText().indexOf(bulunacak, index + 1)) {

                bulunanlarinKonumlari[sayi2] = index;
                sayi2++;
            }

        }

        caretPosition = bulunanlarinKonumlari[0];
        yaziAlani.setCaretPosition(caretPosition);
        //imlecin guncellenen caret pozisyonunda gozukmesini saglar.
        //Bu metod kullanilmasaydi, caret pozisyonu guncellenmesine ragmen imlec gozukmezdi
        yaziAlani.requestFocus();
        yaziAlani.select(caretPosition, caretPosition + bulunacakKelimeninHarfSayisi);


    }//GEN-LAST:event_bulButonActionPerformed

    private void sonrakiButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonrakiButonActionPerformed

        tiklama++;
        if (tiklama < sayi) {
            caretPosition = bulunanlarinKonumlari[tiklama];
            yaziAlani.setCaretPosition(caretPosition);
            //imlecin guncellenen caret pozisyonunda gozukmesini saglar.
            //Bu metod kullanilmasaydi, caret pozisyonu guncellenmesine ragmen imlec gozukmezdi
            yaziAlani.requestFocus();
            yaziAlani.select(caretPosition, caretPosition + bulunacakKelimeninHarfSayisi);
        }

        if (tiklama == sayi) {
            tiklama = 0;
        }

    }//GEN-LAST:event_sonrakiButonActionPerformed

    private void degistirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirBtnActionPerformed
        if (degistirilecekTf.getText().equals("") && yeniTf.getText().equals("")) {

        } else {
            yazi = yaziAlani.getText();
            yazi = yaziAlani.getText().replace(degistirilecekTf.getText(), yeniTf.getText());
            yaziAlani.setText(yazi);
        }
    }//GEN-LAST:event_degistirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NotDefteriGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotDefteriGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotDefteriGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotDefteriGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotDefteriGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acItem;
    private javax.swing.JMenu bicimMenu;
    private javax.swing.JButton bulButon;
    private javax.swing.JTextField bulunacakTf;
    private javax.swing.JMenuItem cikisItem;
    private javax.swing.JButton degistirBtn;
    private javax.swing.JTextField degistirilecekTf;
    private javax.swing.JMenu dosyaMenu;
    private javax.swing.JMenu duzenMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem kaydetItem;
    private javax.swing.JRadioButtonMenuItem kirmiziRenkYazi;
    private javax.swing.JRadioButtonMenuItem maviRenkYazi;
    private javax.swing.ButtonGroup renkButonGrup;
    private javax.swing.JRadioButtonMenuItem sariRenkYazi;
    private javax.swing.JRadioButtonMenuItem siyahRenkYazi;
    private javax.swing.JButton sonrakiButon;
    private javax.swing.JTextPane yaziAlani;
    private javax.swing.JMenu yaziRengiMenu;
    private javax.swing.JMenuItem yaziTipiItem;
    private javax.swing.JTextField yeniTf;
    private javax.swing.JRadioButtonMenuItem yesilRenkYazi;
    // End of variables declaration//GEN-END:variables
}
