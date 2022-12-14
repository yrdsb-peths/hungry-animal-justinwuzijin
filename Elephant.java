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
    GreenfootImage [] idleRight = new GreenfootImage[8];
    GreenfootImage [] idleLeft = new GreenfootImage[8];
    
    //Direction of elephant
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Constructor
     */
    public Elephant(){
        for(int i = 0; i < idleRight.length; i ++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        for(int i = 0; i < idleLeft.length;i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        animationTimer.mark();
        //Initial image
        setImage(idleRight[0]);
    }
    
    /**
     * Animation for the elephant
     */
    int imageIndex = 0;
    public void animateElephant(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(-5);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
        }
        
        //Removes apples if the elephant eats it
        eat();
        //Animates elephant
        animateElephant();
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
