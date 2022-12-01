import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An alephant class for the Hungry Animal assignment.
 * 
 * @author Justin Wu 
 * @version November 2022
 */
public class Elephant extends Actor
{
    
    GreenfootSound elephantSound = new GreenfootSound("elephant-trumpets.mp3");
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        
        //Removes apples if the elephant eats it
        eat();
    }
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld w = (MyWorld) getWorld();
            w.createApple();      
            w.increase();
            elephantSound.play();
        }
    }
}
