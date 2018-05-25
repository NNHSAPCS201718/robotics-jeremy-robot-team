import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    public static void main(String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(56, 160, Motor.A, 
                                                        Motor.C); 
        pilot.steer(50);
        Button.waitForAnyPress();
    }
}