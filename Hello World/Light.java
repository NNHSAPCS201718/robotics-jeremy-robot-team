import lejos.nxt.*;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.Button;
import lejos.nxt.SensorPortListener;

/**
 * Write a description of class Light here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Light implements SensorPortListener
{
    public static void main(String[] args)
    {
        SensorPortListener l = new Light();
        SensorPort.S1.addSensorPortListener(l);
        Button.waitForAnyPress();
    }
    
    public void stateChanged(SensorPort S1, int x, int y)
    {
        System.out.println(x);
    }
}
