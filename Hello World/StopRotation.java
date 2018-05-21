import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.*;

/**
 * Write a description of class InterruptRotation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StopRotation
{
    public static void main(String[] args)
    {
        System.out.println( "Program 4" );
        Motor.A.rotateTo(1440, true);
        while (Button.readButtons()>0)
        {
            LCD.clear();
            Motor.A.rotateTo(1440, true);
        }
        while (Motor.A.isMoving())
        {
            LCD.clear();
            System.out.println(Motor.A.getTachoCount());
            if(Button.readButtons()>0) Motor.A.stop();
        }
        
        LCD.drawInt(Motor.A.getTachoCount(),0,1);
        Button.waitForAnyPress();
    }
}
