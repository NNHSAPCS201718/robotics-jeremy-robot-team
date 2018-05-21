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
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        
        Motor.A.rotate(720);
        Motor.B.rotate(720);
        Motor.C.rotate(720);
        
    }
}
