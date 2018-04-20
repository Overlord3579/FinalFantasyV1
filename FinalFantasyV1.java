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
import java.util.Scanner;


public class FinalFantasyV1 extends JFrame 
{
   private int heroX;             // the x location of player
   private int heroY;             // the y location of player
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
      g.drawImage(hero, 0, 25, 50, 50, this);
      g.drawImage(hydra, 750, 750, 150, 150, this);
      g.drawImage(dragon, 750, 250, 150, 150, this);
      g.drawImage(electroWolf, 250, 750, 150, 150, this);
      
          
      g.setColor(Color.cyan);                              // update status
      g.drawString("Use WASD to move", 450, 950);  
   }
   
    public void keyTyped(KeyEvent key)
   {
      public void paint(Graphics g)
      {
      
         if (key.getKeyChar() == 'W' )
         {
            g.drawImage(hero, heroX, heroY + 25, 50, 50, this);
         }
         else if(key.getKeyChar() == 'A' )
         {
            g.drawImage(hero, heroX - 25, heroY, 50, 50, this);
         }
         else if(key.getKeyChar() == 'S' )
         {  
            g.drawImage(hero, heroX, heroY - 25, 50, 50, this);
         }
         else if(key.getKeyChar() == 'D' )
         {
            g.drawImage(hero, heroX + 25, heroY, 50, 50, this);
         }
      }
   }
   
   public static void main(String[] args)
   {
      FinalFantasyV1 prog = new FinalFantasyV1();
      prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prog.setSize(SCREEN_WIDTH, SCREEN_WIDTH);
      prog.setVisible(true);
      
      
      /*Scanner keyboard = new Scanner(System.in);
      
      int heroX = 0;
      int heroY = 25;
      String Wasd = "";
      System.out.println("Type W to move up, type A to move left, type S to move down, and type D to move right.");
      Wasd = keyboard.next();
      
      if(Wasd = "W")
      {
         g.drawImage(hero, heroX, heroY + 25, 50, 50, this);
      }
      else if(Wasd = "A")
      {
         g.drawImage(hero, heroX - 25, heroY, 50, 50, this);
      }
      else if(Wasd = "S")
      {
         g.drawImage(hero, heroX, heroY - 25, 50, 50, this);
      }
      else if(Wasd = "D")
      {
         g.drawImage(hero, heroX + 25, heroY, 50, 50, this);
      }
      */
      
      
      
   }// end of main method
   
   

}// end of class


