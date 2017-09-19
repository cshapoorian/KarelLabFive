


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;
    
    int x = 0;
    
    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        move();
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int i = beepers; i > 0; i--) {
            putBeeper();
            x++;
        }
        move();
        if (!nextToABeeper()) {
            x *= 2;
            for (int i = x; i > 0; i--) {
                putBeeper();
            }
        }
        move();
    }
}
