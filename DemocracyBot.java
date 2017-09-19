
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void democracy() {
        for (int i = 9; i > 0; i--) {
            fixBallots();
        }
    }
    
    public void fixBallots() {
        move();
        if (nextToABeeper()) {
            turnLeft();
            move();
            if (nextToABeeper()) {
                turnLeft();
                turnLeft();
                move();
                move();
                if (nextToABeeper()) {
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                    turnLeft();
                    turnLeft();
                }
            }
        }
        if (!nextToABeeper()) {
            clear();
        }
    }
    
    public void clear() {
        turnLeft();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

