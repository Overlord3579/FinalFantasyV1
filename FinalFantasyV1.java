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
   public int heroX = 50;             // the x location of player
   public int heroY = 50;             // the y location of player
   private final static int SCREEN_WIDTH = 1000;   // width of screen
    

   
   Image hero = Toolkit.getDefaultToolkit().createImage("Hero.jpg");
   Image forest = Toolkit.getDefaultToolkit().createImage("Forest.jpg");
   Image hydra = Toolkit.getDefaultToolkit().createImage("Hydra.jpg");
   Image dragon = Toolkit.getDefaultToolkit().createImage("Dragon.jpg");
   Image electroWolf = Toolkit.getDefaultToolkit().createImage("ElectroWolf.jpg");
     

   
   public void paint(Graphics g)
   {
      requestFocus();
          
      g.drawImage(forest, 0, 0, 1000, 1000, this);
      g.drawImage(hero, 0, heroX, heroY, 50, this);
      g.drawImage(hydra, 750, 750, 150, 150, this);
      g.drawImage(dragon, 750, 250, 150, 150, this);
      g.drawImage(electroWolf, 250, 750, 150, 150, this);
      
          
      g.setColor(Color.cyan);                              // update status
      g.drawString("Use WASD to move", 450, 950);  
   }
   
    public void keyTyped(KeyEvent key)
   {
   
      addKeyListener(this);
      
         if (key.getKeyChar() == 'w' )
         {
           heroY += 25;
           repaint();
         }
         else if(key.getKeyChar() == 'a' )
         {
            heroX -= 25;
            repaint();
         }
         else if(key.getKeyChar() == 's' )
         {  
            heroY -= 25;
            repaint();
         }
         else if(key.getKeyChar() == 'd' )
         {
            heroX += 25;
            System.out.println("WORK PLEASE");
            repaint();
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


