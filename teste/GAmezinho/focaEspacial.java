import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class focaEspacial extends Actor
{

    /**
     * Act - do whatever the focaEspacial wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) >= 5) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
