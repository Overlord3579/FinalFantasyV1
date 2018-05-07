/*
Riley Hogue
Period 2
*/

public class Hydra
{
   public Hydra()
   {
      myWidth = 150;
      myHeight = 150;
      myHealth = 1000;
      myAttack = 76; //- enemyDefense;
   }
      public Hydra(int width, int height, int health, int attack, int defense)
   {
      myWidth = width;
      myHeight = height;
      myHealth = health;
      myAttack = attack;
   }
   public int getHealth()
   {
      return myHealth;
   }
   public void setHealth(int health)
   { 
      myHealth = health;
   }
   public int calculateHealth()
   {
      return myHealth - (Hero.myAttack - myDefense); 
      System.out.println("You did _____ damage! The Hydra has" + myHealth + "left!");
   }   
   public int myWidth;
   public int myHeight;
   public int myHealth;
   public int myAttack;
}
