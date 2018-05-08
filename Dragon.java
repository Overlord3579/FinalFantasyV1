/*
Riley Hogue
Period 2
*/

public class Dragon
{
   public Dragon()
   {
      myWidth = 50;
      myHeight = 50;
      myHealth = 4000;
      myAttack = 100; //- enemyDefense;
   }
      public Dragon(int width, int height, int health, int attack, int defense)
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
      return myHealth; // - (enemyAttack - myDefense);
   }   
   public int myWidth;
   public int myHeight;
   public int myHealth;
   public int myAttack;
}
