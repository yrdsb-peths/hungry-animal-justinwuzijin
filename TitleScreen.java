import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Justin Wu
 * @version December 2022
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 70);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 250, 100);
        prepare();
    }

    /**
     * Main world act loop
     */
    public void act(){
        //Starts game when user presses space bar
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,600,200);
        elephant.setLocation(467,105);
        elephant.setLocation(488,118);
        elephant.setLocation(489,134);
        elephant.setLocation(505,116);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,262,219);
        label.setLocation(299,246);
        label.setLocation(298,294);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,268,228);
        label2.setLocation(336,234);
        elephant.setLocation(462,144);
        elephant.setLocation(505,136);
        label2.setLocation(372,255);
        elephant.setLocation(534,103);
        label2.setLocation(311,254);
        elephant.setLocation(528,104);
        elephant.setLocation(317,189);
        elephant.setLocation(334,154);
        label.setLocation(331,329);
        label2.setLocation(331,260);
        label.setLocation(313,313);
        elephant.setLocation(314,188);
    }
}
