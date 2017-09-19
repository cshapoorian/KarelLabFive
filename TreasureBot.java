
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    int beepers = 0;
    
    public void findTreasure() {
        while (!nextToABeeper()) {
            move();
        }
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if (beepers == 5) {
            turnOff();
        }
        if (beepers == 4) {
            while (!facingWest()) {
                turnLeft();
            }
        }
        if (beepers == 3) {
            while (!facingSouth()) {
                turnLeft();
            }
        }
        if (beepers == 2) {
            while (!facingEast()) {
                turnLeft();
            }
        }
        if (beepers == 1) {
            while (!facingNorth()) {
                turnLeft();
            }
        }
        beepers = 0;
        findTreasure();
    }
   
}

