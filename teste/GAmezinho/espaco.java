import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class espaco extends World
{

    /**
     * Constructor for objects of class espaco.
     */
    public espaco()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * 
     */
    public void addObject(foguete addFoguete)
    {
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        foguete foguete =  new foguete();
        addObject(foguete, 96, 315);
        focaEspacial focaEspacial =  new focaEspacial();
        addObject(focaEspacial, 332, 105);
        focaEspacial focaEspacial2 =  new focaEspacial();
        addObject(focaEspacial2, 668, 96);
        focaEspacial focaEspacial3 =  new focaEspacial();
        addObject(focaEspacial3, 671, 533);
        focaEspacial focaEspacial4 =  new focaEspacial();
        addObject(focaEspacial4, 451, 331);
        focaEspacial focaEspacial5 =  new focaEspacial();
        addObject(focaEspacial5, 316, 505);
        focaEspacial focaEspacial6 =  new focaEspacial();
        addObject(focaEspacial6, 640, 293);
        focaEspacial focaEspacial7 =  new focaEspacial();
        addObject(focaEspacial7, 159, 79);
    }
}
