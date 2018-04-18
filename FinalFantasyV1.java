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

public class FinalFantasyV1 extends JFrame 
{
   private int heroX;             // the x location of player
   private int playerMoveAmount;    // the player's horizontal move amount in each timer step
   private int playerScore;         // player score
   private final static int SCREEN_WIDTH = 1000;   // width of screen
   
   Image hero = Toolkit.getDefaultToolkit().createImage("Hero.jpg");
   Image forest = Toolkit.getDefaultToolkit().createImage("Forest.jpg");
     
   public FinalFantasyV1()             // default constructor
   {
      heroX = 0;                // initial horizontal position of player  
     
   }
   
   public void paint(Graphics g)
   {
      requestFocus();
          
      g.drawImage(forest, 0, 0, 1000, 1000, this);
      g.drawImage(hero, 0, 25, 50, 50, this);
      
          
      g.setColor(Color.cyan);                              // update status
      g.drawString("score: " + playerScore, 30, 250);
      g.drawString("Use WASD to move", 450, 950);
   
    
    
   }
   
   public static void main(String[] args)
   {
      FinalFantasyV1 prog = new FinalFantasyV1();
      prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prog.setSize(SCREEN_WIDTH, SCREEN_WIDTH);
      prog.setVisible(true);
   }// end of main method

}// end of class


