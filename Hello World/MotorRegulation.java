import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class MotorRegulation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MotorRegulation
{
    public static void main(String[] args)
    {
        System.out.println( "Program 5" );
        Motor.A.setSpeed(720);
        Motor.C.setSpeed(720);
        
        for(int x = 1; x <= 8; x++)
        {
            Motor.A.rotate(720, true);
            Motor.C.rotate(720, true);
            Delay.msDelay(200);
            LCD.drawInt(Motor.A.getTachoCount(), 0, x);
            LCD.drawInt(Motor.C.getTachoCount(), 6, x);
        }
        
        Button.waitForAnyPress();
    }
}
