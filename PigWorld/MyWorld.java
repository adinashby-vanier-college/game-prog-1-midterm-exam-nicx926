// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake =  new  Snake();
        addObject(snake, 25, 23);
        Pig pig =  new  Pig();
        addObject(pig, 289, 199);
        Burger burger =  new  Burger();
        addObject(burger, 353, 94);
        Burger burger2 =  new  Burger();
        addObject(burger2, 527, 197);
        Burger burger3 =  new  Burger();
        addObject(burger3, 509, 111);
        Burger burger4 =  new  Burger();
        addObject(burger4, 229, 118);
        Burger burger5 =  new  Burger();
        addObject(burger5, 66, 294);
        Burger burger6 =  new  Burger();
        addObject(burger6, 360, 333);
        pig.setLocation(308, 203);
        pig.setLocation(303, 195);
    }
}
