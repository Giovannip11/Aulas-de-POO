import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class foguete extends Actor
{

    /**
     * Act - do whatever the foguete wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(0);
        
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("space")) {
            
        }
    }
}
