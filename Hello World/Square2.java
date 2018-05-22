import lejos.nxt.*;
import lejos.util.*;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square2
{
    public static void main(String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(56, 160, Motor.A, 
                                                        Motor.C); 
        for(int i = 1; i <= 4; i++)
        {pilot.travel(300);
        pilot.rotate(90);}
        pilot.rotate(180);
        for(int i = 1; i <= 4; i++)
        {pilot.travel(300);
        pilot.rotate(-90);}
        Button.waitForAnyPress();
    }
}