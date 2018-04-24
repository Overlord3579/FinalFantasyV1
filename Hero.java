/*
Riley Hogue
Period 2
Honers Java
*/

public class Hero
{
   public Hero()
   {
      myWidth = 50;
      myHeight = 50;
      myHealth = 1000;
      myAttack = 76; //- enemyDefense;
      myDefense = 100;
      myX = 50;
      myY = 50;
   }
   public Hero(int width, int height, int health, int attack, int defense)
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
   public int getX()
   {
      return myX;
   }
   public void setX(int heroX)
   {
      myX = heroX;
   }
   public int getY()
   {
      return myY;
   }
   public void setY(int heroY)
   {
      myY = heroY;
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
   public int myY;
   public int myX;
}
