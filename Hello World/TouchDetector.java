import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.Button;
import lejos.nxt.Sound;
/**
 * Write a description of class SoundDetector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TouchDetector
{
    public static void main( String[] args)
    {
        TouchSensor touch = new TouchSensor(SensorPort.S1);
        
        Button.waitForAnyPress();
        if( touch.isPressed()==true)
        {
            Sound.beep();
            
        }
        Button.waitForAnyPress();
    }
}
