/*
Riley Hogue
Period 2
*/

public class ElectroWolf
{
   public ElectroWolf()
   {
      myWidth = 50;
      myHeight = 50;
      myHealth = 1000;
      myAttack = 76; //- enemyDefense;
      myDefense = 100;
   }
      public ElectroWolf(int width, int height, int health, int attack, int defense)
   {
      myWidth = width;
      myHeight = height;
      myHealth = health;
      myAttack = attack;
      myDefense = defense;
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
      return myHealth; // - (enemyAttack - myDefense);
   }   
   private int myWidth;
   private int myHeight;
   private int myHealth;
   private int myAttack;
   private int myDefense;
}
