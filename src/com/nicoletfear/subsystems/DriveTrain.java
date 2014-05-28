/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nicoletfear.subsystems;

import com.nicoletfear.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.GenericHID;
/**
 *
 * @author fear
 */
public class DriveTrain extends Subsystem {
    private SpeedController leftControllers;
    private SpeedController rightControllers;
    private RobotDrive driveSystem;
    
    public DriveTrain()
    {
        leftControllers = new Victor(RobotMap.LeftMotorsPort);
        rightControllers = new Victor(RobotMap.RightMotorsPort);
        driveSystem = new RobotDrive(leftControllers, rightControllers); //Passing 2 motors sets the rear controllers in RobotDrive
        driveSystem.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void Drive(GenericHID controller){
        driveSystem.arcadeDrive(controller, true);
    }
}
