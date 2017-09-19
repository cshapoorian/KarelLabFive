
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    int beepers = 0;
    
    
    
    public void choosePile() {
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        
        if (beepers%2 == 0) {
            turnRight();
            move();
            while (nextToABeeper()) {
                pickBeeper();
            }
            turnLeft();
            turnLeft();
            move();
        }
        
        if (beepers%2 == 1) {
            turnLeft();
            move();
            while (nextToABeeper()) {
                pickBeeper();
            }
            turnLeft();
            turnLeft();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}

