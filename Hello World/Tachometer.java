import lejos.nxt.*;
import lejos.util.*;

/**
 * Write a description of class MoveMotor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tachometer
{
    public static void main(String[] args)
    {
        System.out.println( "Program 2" );
        Motor.A.setSpeed(720);
        Motor.A.forward();
        Delay.msDelay(2000);
        int x = Motor.A.getTachoCount();
        System.out.println("" + x);
        Motor.A.stop();
        System.out.println("" + Motor.A.getTachoCount());
        while(Motor.A.getTachoCount() != 0)
            Motor.A.backward();
        System.out.println("" + Motor.A.getTachoCount()); 
        Motor.A.stop();
        System.out.println("" + Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
