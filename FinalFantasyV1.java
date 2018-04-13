/**
Riley Hogue
Period 2
Final Fantasy Project
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.*;
import java.util.Properties;
import java.io.*;
import java.net.*;
import javax.swing.JFileChooser;

public class FinalFantasyV1 extends JFrame implements KeyListener
{
   private Timer playerTimer;       // propels bottom player horizontally across screen
   private Timer timerBullet;       // propels bottom player's bullet vertically up the screen
   private int playerX;             // the x location of player
   private int playerMoveAmount;    // the player's horizontal move amount in each timer step
   private int bulletMoveAmount;    // the bullet's vertical move amount in each timer step
   private int playerScore;         // player score
   private final static int SCREEN_WIDTH = 300;   // width of screen
     
   public FinalFantasyV1()             // default constructor
   {
      playerX = 200;                // initial horizontal position of player                
        
      playerMoveAmount = 10;
      bulletMoveAmount = 10;    
     
      bulletX = -10;                // initially placing bullet off the screen so its not visible
      bulletY = 180;
      
      addKeyListener(this);         // necessary to make the KeyListener work correctly
     
      // player moving back and forth horizontally
      playerTimer = new Timer(200, new ActionListener()
      {

         public void actionPerformed(ActionEvent evt)
         {

            if (playerX <= 0)                   // left boundary detection for player
            {
               playerMoveAmount = 10;
            }
            else if (playerX >= SCREEN_WIDTH)   // right boundary detection for player
            {
               playerMoveAmount = -10;
            }
             
            playerX += playerMoveAmount;        // moving player horizontally across screen
            repaint();
         }

      });  
       
      // bullet moving up the screen
      timerBullet = new Timer(100, new ActionListener()
      {

         public void actionPerformed(ActionEvent evt)
         {            
            bulletY -= bulletMoveAmount;        // moving bullet vertically up the screen
           
            // detecting collision with enemy
            if (bulletX >= enemyX && bulletX <= enemyX + 20 // within the width of the enemy
                           && bulletY <= 10 && bulletY >= 0)// within the vertical span of the enemy
            {
               playerScore++;
               timerBullet.stop();              // stop bullet immediately to avoid double score                         
            }
            else if (bulletY <= 0)              // bullet boundary detection at top of screen
            {
               timerBullet.stop();
            }
             
           
            repaint();
         }

      });  
           
      enemyTimer.start();
      playerTimer.start();
   }

   public void paint(Graphics g)
   {
      requestFocus();
      g.setColor(Color.gray);
      g.fillRect(0, 0, SCREEN_WIDTH, SCREEN_WIDTH);         // repaint background
     
      g.setColor(Color.black);                              // repaint enemy at top of screen
      g.fillRect(enemyX, 20, 20, 20);
          
      g.setColor(Color.blue);                               // repaint player at bottom of screen  
      g.fillRect(playerX, 200, 20, 20);
                                      
      g.drawLine(bulletX, bulletY, bulletX, bulletY - 10);  // repaint bullet
          
      g.setColor(Color.black);                              // update status
      g.drawString("score: " + playerScore, 30, 250);
      g.drawString("press spacebar to fire bullet", 10, 280);
   }
  
   public void keyTyped(KeyEvent key)
   {
      // space bar shoots the bullet
      if (key.getKeyChar() == ' ' && !timerBullet.isRunning())
      {
         bulletX = playerX;     // line up bullet horizontally with current position of player
         bulletY = 180;          
         timerBullet.start();
      }
          
   }
  
   public void keyPressed(KeyEvent e) { }
   public void keyReleased(KeyEvent e) { }
  
   public static void main(String[] args)
   {
      FinalFantasyV1 prog = new FinalFantasyV1();
      prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prog.setSize(SCREEN_WIDTH, SCREEN_WIDTH);
      prog.setVisible(true);
   }// end of main method

}// end of class


