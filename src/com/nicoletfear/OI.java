
package com.nicoletfear;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public GenericHID driveStick = new Joystick(1);
    public GenericHID shootStick = new Joystick(2);
}

