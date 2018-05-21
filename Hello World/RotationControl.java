import lejos.nxt.*;
import lejos.util.*;

/**
 * Write a description of class RotationControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RotationControl
{
    public static void main(String[] args)
    {
        System.out.println( "Program 3" );
        Button.waitForAnyPress();
        Motor.A.rotate(1440);
        System.out.println(Motor.A.getTachoCount());
        Motor.A.rotateTo(0);
        System.out.println(Motor.A.getTachoCount());
        Button.waitForAnyPress();
    }
}
