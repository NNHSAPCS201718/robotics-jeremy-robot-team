import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.UltrasonicSensor;
/**
 * Write a description of class objectDetector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class objectDetector
{
    public static void main( String[] args)
    {
        UltrasonicSensor s = new UltrasonicSensor(SensorPort.S1);
        
        Button.waitForAnyPress();
        System.out.println(s.getDistance());
        Button.waitForAnyPress();
    }
    
}
