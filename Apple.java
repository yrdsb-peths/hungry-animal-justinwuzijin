import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for the elephant 
 * 
 * @author Justin Wu
 * @version Novemeber 2022
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Apple falls downwards
        setLocation(getX(), getY()+2);
        
        MyWorld w = (MyWorld) getWorld();
        if(getY() >= w.getHeight()){
            w.gameOver();
            w.removeObject(this);
        }
    }
}
