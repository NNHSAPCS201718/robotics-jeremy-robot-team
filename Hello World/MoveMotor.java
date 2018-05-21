import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.LCD;

/**
 * Write a description of class MoveMotor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveMotor
{
    public static void main(String[] args)
    {
        System.out.println( "Program 1" );
        Button.waitForAnyPress();
        Motor.A.forward();
        LCD.drawString( "FORWARD", 0, 0 );
        Button.waitForAnyPress();
        LCD.drawString( "BACKWARD", 0, 0 );
        Motor.A.backward();
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
