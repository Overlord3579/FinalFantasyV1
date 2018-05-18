/**
Riley Hogue
Period 2
Final Fantasy Project
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;


public class FinalFantasyV1 extends JFrame implements KeyListener
{
   public int heroX = 50;             // the starting x location of player
   public int heroY = 50;             // the starting y location of player
   private final static int SCREEN_WIDTH = 1000;   // width of screen
   public Timer battleTimer;
   public int monster;
   public int wolfHealth;
   public int hydraHealth;
   public int dragonHealth;
   public int heroHealth;
   public int heroAttack;
   public int dragonAttack;
   public int hydraAttack;
   public int wolfAttack;
   public int heroDefense;
   private boolean paintHero = true;
   private boolean paintHydra = true;
   private boolean paintDragon = true;
   private boolean paintElectroWolf = true;
   
   Image hero = Toolkit.getDefaultToolkit().createImage("Hero.jpg");
   Image forest = Toolkit.getDefaultToolkit().createImage("Forest.jpg");
   Image hydra = Toolkit.getDefaultToolkit().createImage("Hydra.jpg");
   Image dragon = Toolkit.getDefaultToolkit().createImage("Dragon.jpg");
   Image electroWolf = Toolkit.getDefaultToolkit().createImage("ElectroWolf.jpg");
   
   
   public FinalFantasyV1()
   {
      wolfAttack = 50;
      hydraAttack = 75;
      dragonAttack = 100;
      heroAttack = 25;
      dragonHealth = 4000;
      hydraHealth = 3000;
      wolfHealth = 2000;
      heroHealth = 2000;
      heroDefense = 25;
      monster = 0;
      
      addKeyListener(this);
      
      battleTimer = new Timer(1000, new ActionListener()
      {
      
         
         public void actionPerformed(ActionEvent evt)
         {
            if(battleTimer.isRunning() && heroX == 200 && heroY == 850) //ElectroWolf battle sequence
            {
               System.out.println("Press the space bar to attack!");
            }
            
            if(battleTimer.isRunning() && heroX == 700 && heroY == 350) //dragon battle sequence
            {
               System.out.println("Press the space bar to attack!");
            }
            
            if(battleTimer.isRunning() && heroX == 700 && heroY == 850) //Hydra battle sequece
            {
               System.out.println("Press the space bar to attack!");
            }
            
            if(wolfHealth <= 0)
            {
               paintElectroWolf = false;
               monster++;
               System.out.println("Good job you've defeated " + monster + "/3 monsters!");
               System.out.println("The gods have blessed you with an attack boost!");
               heroAttack = heroAttack + 25;
               battleTimer.stop();
               repaint();
            }
          
            if(hydraHealth <= 0)
            {
               paintHydra = false;
               battleTimer.stop();
               monster++;
               System.out.println("Good job you've defeated " + monster + "/3 monsters!");
               System.out.println("The gods have blessed you with an attack boost!");
               heroAttack = heroAttack + 25;
               repaint();
            }
          
            if(dragonHealth <= 0)
            {
               paintDragon = false;
               battleTimer.stop();
               monster++;
               System.out.println("Good job you've defeated " + monster + "/3 monsters!");
               System.out.println("The gods have blessed you with an attack boost!");
               heroAttack = heroAttack + 25;
               repaint();
            }
            
            if(monster == 3)
            {
               System.out.println("Congratulations you have defeated all the monsters that have terrorized the lands for ages and now the world is safe! THE END!");
            }
            
            if(heroHealth <= 0)
            {
               paintHero = false;
               System.out.println("Your hero has died and the world is now doomed but your valiant effort will not be forgotten!");
               System.out.println("GAME OVER TRY AGAIN!");
               System.exit(0);
            }
         }
      
      });
   }
   
   public void paint(Graphics g)
   {
   
      requestFocus();
      super.paint(g);
      
          
      
      g.drawImage(forest, 0, 0, 1000, 1000, this);
      
      if (paintHero == true)
      {
         g.drawImage(hero, heroX, heroY, 50, 50, this);
      }
      else if(paintHero == false)
      {
         g.drawImage(hero, 1000, 1000, 0, 0, this);
      }
      
      if (paintHydra == true)
      {
         g.drawImage(hydra, 750, 750, 150, 150, this);
      }
      else if(paintHydra == false)
      {
         g.drawImage(hydra, 1000, 1000, 0, 0, this);
      }
      
      if(paintDragon == true)
      {
         g.drawImage(dragon, 750, 250, 150, 150, this);
      }
      else if(paintDragon == false)
      {
         g.drawImage(dragon, 1000, 1000, 0, 0, this);
      }
      
      if(paintElectroWolf == true)
      {
         g.drawImage(electroWolf, 250, 750, 150, 150, this);
      }
      else if(paintElectroWolf == false)
      {
         setVisible(electroWolf = false);
      }
          
      g.setColor(Color.cyan);                              // update status
      g.drawString("Use WASD to move and only tap", 450, 950); 
       
   }
   
   public void repaint2(Image hero)
   {
      repaint();
   }
   
    public void keyTyped(KeyEvent e) { }
  
    public void keyPressed(KeyEvent e) 
    { 
      monster = 0;
            
      if ('w' == e.getKeyChar())
      {
         heroY -= 50;
         repaint2(hero);
      }
            
      if('a' == e.getKeyChar())
      {
         heroX -= 50;
         repaint2(hero);
      }
            
      if('s' == e.getKeyChar())
      {  
         heroY += 50;
         repaint2(hero);
      }
            
      if('d' == e.getKeyChar())
      {
         heroX += 50;
         repaint2(hero);
      }
            
      if (' ' == e.getKeyChar() && heroX == 200 && heroY == 850) //wolf battle mechanics
      {
         wolfHealth =  wolfHealth - (heroAttack * (int) (Math.random() * 6) + 1);
         System.out.println("Nice hit the wolf only has " + wolfHealth + " health left!");
      }
            
      if (heroX == 200 && heroY == 850 && !battleTimer.isRunning())
      {
         System.out.println("An ElectroWolf has appeared and wants to fight!");
         battleTimer.start();
      }
            
      if(heroX == 700 && heroY == 350 && !battleTimer.isRunning())
      {
         System.out.println("A dragon has appeared and wants to fight!");
         battleTimer.start();
      }
      
      if (' ' == e.getKeyChar() && heroX == 700 && heroY == 350) //dragon battle mechanics
      {
         dragonHealth =  dragonHealth - (heroAttack * (int) (Math.random() * 6) + 1);
         System.out.println("Nice hit the wolf only has " + dragonHealth + " health left!");
      }

            
      if(heroX == 700 && heroY == 850)
      {
         System.out.println("A seven headed hydra has appeared and wants to fight!");
         battleTimer.start();
      }
      
      if (' ' == e.getKeyChar() && heroX == 700 && heroY == 850) //hydra battle mechanics
      {
         hydraHealth =  hydraHealth - (heroAttack * (int) (Math.random() * 6) + 1);
         System.out.println("Nice hit the wolf only has " + hydraHealth + " health left!");
      }

      
      if(heroX > 1000 || heroX < 0 || heroY < 0 || heroY > 1000)
      {
         System.out.println("Nice job idiot you went out of the forest and now the world is doomed!!");
         System.out.println("Now everyone including you is dead!");
         System.out.println("GAME OVER TRY AGAIN!");
         System.exit(0);
      }
      
      }
      public void keyReleased(KeyEvent e) 
      {
         
      }
     
   
   public static void main(String[] args)
   {
      FinalFantasyV1 prog = new FinalFantasyV1();
      
      prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      prog.setSize(SCREEN_WIDTH, SCREEN_WIDTH);
      prog.setVisible(true);
      
      
   }// end of main method
   
   

}// end of class


