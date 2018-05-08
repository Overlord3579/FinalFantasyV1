/*
Riley Hogue
Period 2
*/

public class ElectroWolf
{
   public ElectroWolf()
   {
      electroWolfWidth = 50;
      electroWolfHeight = 50;
      electroWolfHealth = 2000;
      electroWolfAttack = 50; //- enemyDefense;
   }
      public ElectroWolf(int width, int height, int health, int attack, int defense)
   {
      electroWolfWidth = width;
      electroWolfHeight = height;
      electroWolfHealth = health;
      electroWolfAttack = attack;
   }
   public int getHealth()
   {
      return electroWolfHealth;
   }
   public void setHealth(int health)
   { 
      electroWolfHealth = health;
   }
   public int calculateHealth()
   {
      return electroWolfHealth; // - (enemyAttack - myDefense);
   }   
   public int electroWolfWidth;
   public int electroWolfHeight;
   public int electroWolfHealth;
   public int electroWolfAttack;
}
