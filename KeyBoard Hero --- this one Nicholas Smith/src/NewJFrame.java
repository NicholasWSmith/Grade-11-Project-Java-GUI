/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on Jan 18, 2012, 6:27:24 PM
 */
/**
 *
 * @author Alienware
 */


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;
import sun.audio.*;
import java.io.*;
import java.applet.*;



public class NewJFrame extends javax.swing.JFrame {
   int gameEnder;
   int noteMiss;
   int noteTimer1;
   int score;
   String name;
   int noteStreak;
   int gameStarter;
   int[] scores = new int[6];
   String[] names = new String[6];
   int x = 35;
   int i;
   int j;
   AudioStream as = null;
   String output = "";
   int n;
   int m;
   int temp;
   String temp1;
    int q;
    
    javax.swing.Timer t = new javax.swing.Timer(x, new ActionListener() {
    public void actionPerformed(ActionEvent a) {
     jButton1.setLocation(jButton1.getX(), jButton1.getY() + 10);
     
        if (jButton1.getBounds().intersects(jButton17.getBounds())) {
            jButton1.setLocation(130,50);
            noteMiss++;
            score = score - 20;
            
            if (noteMiss == 10) {
                AudioPlayer.player.stop(as);
                 t.stop();
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                gameEnds.stop();
                JOptionPane.showMessageDialog(null, "I'm sorry, you have missed 10 notes. Game over!");
                JOptionPane.showMessageDialog(null, "You got a score of " + score + ". Congratulations!"); 
                scores[5] = score;
                names[5] = name;
             
                 for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
                 output = "";
             for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            }
        }
     
    }
});

javax.swing.Timer t1 = new javax.swing.Timer(x, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        jButton2.setLocation(jButton2.getX(), jButton2.getY() + 10);  
        
        if (jButton2.getBounds().intersects(jButton17.getBounds())) {
            jButton2.setLocation(260,50);
            noteMiss++;
            score = score - 20;
            
             if (noteMiss == 10) {
                AudioPlayer.player.stop(as);
                 t.stop();
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                gameEnds.stop();
                JOptionPane.showMessageDialog(null, "I'm sorry, you have missed 10 notes. Game over!");
                JOptionPane.showMessageDialog(null, "You got a score of " + score + ". Congratulations!");
               
                scores[5] = score;
                names[5] = name;
             
                 for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
                 output = "";
               for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            }
        }
    }
});
javax.swing.Timer t2 = new javax.swing.Timer(x, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        jButton8.setLocation(jButton8.getX(), jButton8.getY() + 10);  
      
        if (jButton8.getBounds().intersects(jButton17.getBounds())) {
            jButton8.setLocation(390,50);
            noteMiss++;
            score = score - 20;
            
            if (noteMiss == 10) {
                AudioPlayer.player.stop(as);
                 t.stop();
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                gameEnds.stop();
                JOptionPane.showMessageDialog(null, "I'm sorry, you have missed 10 notes. Game over!");
                JOptionPane.showMessageDialog(null, "You got a score of " + score + ". Congratulations!");
                
                scores[5] = score;
                names[5] = name;
             
                 for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
                 output = "";
              for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            }
        }
    }
});
javax.swing.Timer t3 = new javax.swing.Timer(x, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        jButton9.setLocation(jButton9.getX(), jButton9.getY() + 10);  
      
        if (jButton9.getBounds().intersects(jButton17.getBounds())) {
            jButton9.setLocation(520,50);
            noteMiss++;
             if (noteMiss == 10) {
                AudioPlayer.player.stop(as);
                 t.stop();
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                gameEnds.stop();
                JOptionPane.showMessageDialog(null, "I'm sorry, you have missed 10 notes. Game over!");
                JOptionPane.showMessageDialog(null, "You got a score of " + score + ". Congratulations!");
                
                scores[5] = score;
                names[5] = name;
             
                 for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
                 output = "";
               for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            }
        }
    }
});
javax.swing.Timer t4 = new javax.swing.Timer(x, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        jButton14.setLocation(jButton14.getX(), jButton14.getY() + 10);  
    
        if (jButton14.getBounds().intersects(jButton17.getBounds())) {
            jButton14.setLocation(640,50);
            noteMiss++;
            score = score - 20;
            
            if (noteMiss == 10) {
                AudioPlayer.player.stop(as);
                 t.stop();
                t1.stop();
                t2.stop();
                t3.stop();
                t4.stop();
                gameEnds.stop();
                JOptionPane.showMessageDialog(null, "I'm sorry, you have missed 10 notes. Game over!");
                JOptionPane.showMessageDialog(null, "You got a score of " + score + ". Congratulations!");
                
                scores[5] = score;
                names[5] = name;
             
                 for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
                 output = "";
               for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
            }
        }
    }
});
javax.swing.Timer noteTimer = new javax.swing.Timer(1, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        noteTimer1++; 
      
       if (noteTimer1 == 25){
           t.start();
         
       } 
       if (noteTimer1 == 50){
           t1.start();
           
       } 
       if (noteTimer1 == 85){
           t2.start();
           
       } 
       if (noteTimer1 == 132){
           t3.start();
           
       } 
       if (noteTimer1 == 199){
           t4.start();
           
       } 
    }
});
javax.swing.Timer gameStartTimer = new javax.swing.Timer(1000, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
        gameStarter++;
        
         if (gameStarter == 1) {
              JOptionPane.showMessageDialog(null, "Game starting in 3..");
        }
         if (gameStarter == 2) {
              JOptionPane.showMessageDialog(null, "Game starting in 2..");
        }
         if (gameStarter == 3) {
              JOptionPane.showMessageDialog(null, "Game starting in 1..");     
              JOptionPane.showMessageDialog(null, "GO!!!");
              noteTimer.start();
              gameEnds.start();
               
                
        }
     
    }
});
javax.swing.Timer gameEnds = new javax.swing.Timer(1000, new ActionListener() {
    public void actionPerformed(ActionEvent s) {
          
        gameEnder++;
        if (gameEnder == 15) {
            x = x - 5;
        }
        if (gameEnder == 30) {
            x = x - 5;      
        }
        if (gameEnder == 45) {
            x = x - 5;
        }
        if (gameEnder == 120) {
            AudioPlayer.player.stop(as);
            t.stop();
            t1.stop();
            t2.stop();
            t3.stop();
            t4.stop();
            names[5] = name;
            scores[5] = score;
            JOptionPane.showMessageDialog(null, "You have reached the 2 minute mark! Your score was" + score + "! CONGRATZ!!");  
            
            
            for (n = 0; n < scores.length - 1; n++)
                 {
                     for (m = 0; m < scores.length - 1; m++)
                     {
                         if (scores[m] < scores[m + 1])
                         {
                             temp = scores[m];
                             scores[m] = scores[m + 1];
                             scores[m + 1] = temp;
                             
                             temp1 = names[m];
                             names[m] = names[m + 1];
                             names[m + 1] = temp1;
                             
                         }
                               
                     }
                 }
            output = "";
            for (q = 0; q < 5; q++)
            {
            output = output + names[q] + "          " + (String.valueOf(scores[q])) + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
     
    }
});
    public NewJFrame() {
        initComponents();
        jButton17.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton8.setVisible(true);
        jButton9.setVisible(true);
        jButton14.setVisible(true);
        
        scores[0] = 8000;
        scores[1] = 7000;
        scores[2] = 6000;
        scores[3] = 5000;
        scores[4] = 4000;       
        names[0] = "Bob";
        names[1] = "Fred";
        names[2] = "Alex";
        names[3] = "Sylvia";
        names[4] = "Josephine";      
        int k=0;   
        
        
        File dataFile = new File("C:\\WorkArea\\GameScores.txt");
        FileWriter out;
        BufferedWriter writeFile;
        
        try
        {
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);
            
            for (i = 0; i < 5; i = i + 1)
            {
                  
                    writeFile.write(String.valueOf(scores[i]));
                    writeFile.newLine();
                    writeFile.write(names[i]);
                    writeFile.newLine();
            }
        
          writeFile.close();
          out.close();      
    }
    catch (IOException a)
    {
        JOptionPane.showMessageDialog(null, "Problem writing to file!");
        
    }
    
    FileReader in;
    BufferedReader readFile;
    String score;
    
    
    try
    {
        in = new FileReader(dataFile);
        readFile = new BufferedReader(in);
        while ((score = readFile.readLine()) != null)
        {
            
            if (k%2==0) {
                scores[j] = (Integer.parseInt(score));
                               
            }
            if (k%2==1) {
                names[j] = score;
                output = output + names[j] + "          " + (String.valueOf(scores[j])) + "\n";
                 
                j++; 
            }
            
            k++;
            
           
             
            
    }
          
     readFile.close();
     in.close();
    }
    catch (FileNotFoundException a)
    {
         JOptionPane.showMessageDialog(null, "File does not exist or could not found");
    }
    catch (IOException a)
    {
         JOptionPane.showMessageDialog(null, "Problem writing to file!");
    }
    
    //-----------------------------------------------
        try {
            InputStream inAudio = new FileInputStream("LostWoods.wav");
            try {
                 as = new AudioStream(inAudio);
              
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    //---------------------------------------------

   }
        

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(51, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 50, 40));

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton3.setText("A");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 50, 40));

        jButton5.setText("Ready to rock!");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel2.setText("KeyBoard Hero!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 50, 40));

        jButton4.setBackground(new java.awt.Color(255, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton4.setText("S");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 50, 40));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 10, 230));

        jButton8.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 50, 40));

        jButton9.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 50, 40));

        jButton12.setBackground(new java.awt.Color(255, 255, 51));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton12.setText("D");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 50, 40));

        jButton13.setBackground(new java.awt.Color(0, 0, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton13.setText("F");
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 50, 40));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 10, 230));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 79, 10, 230));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 10, 230));

        jButton14.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 50, 40));

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 10, 220));

        jButton16.setBackground(new java.awt.Color(255, 153, 51));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton16.setText("G");
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 50, 40));
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 580, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       name = JOptionPane.showInputDialog("Please enter your name");
       JOptionPane.showMessageDialog(null, "Welcome " + name + ", the game will start soon.");
       gameStartTimer.start();    
       gameEnds.start();
       names[5] = name;
       
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
    
    
    if (evt.getKeyChar()== 'a' && jButton1.getBounds().intersects(jButton3.getBounds())) {
            score = score + 50;
            jButton1.setLocation(130,50);
            AudioPlayer.player.start(as);
        }
        
        if (evt.getKeyChar()=='s' && jButton2.getBounds().intersects(jButton4.getBounds())) {
            score = score + 50;
            jButton2.setLocation(260,50);  
        }
         if (evt.getKeyChar()=='d' && jButton8.getBounds().intersects(jButton12.getBounds())) {
            score = score + 50;
            jButton8.setLocation(390,50);
        }
          if (evt.getKeyChar()=='f' && jButton9.getBounds().intersects(jButton13.getBounds())) {
            score = score + 50;
            jButton9.setLocation(520,50);
        }
         if (evt.getKeyChar()=='g' && jButton14.getBounds().intersects(jButton16.getBounds())) {
            score = score + 50;
            jButton14.setLocation(640,50);  
        }
}//GEN-LAST:event_jButton5KeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
