import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this world, the hero lives
 *
 * @author Justin Wu
 * @version November 2022
 */
public class MyWorld extends World
{
    public static int s;
    Label score;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);

        //Create the elephant object
        Elephant e = new Elephant();
        addObject(e, 300, 200);

        //Create a label
        score = new Label(0, 100);
        addObject(score, 50, 50);

        createApple();
    }
    /**
     * Increases score
     */
    public void increase(){
        s++;
        score.setValue(s);
        if(s % 5 == 0){
            level++;
        }
    }
    /**
     * Ends game
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    /**
     * Creates a new apple at a random location at top of screen
     */
    public void createApple(){
        Apple a = new Apple();
        a.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(a, x, y);
    }
}
