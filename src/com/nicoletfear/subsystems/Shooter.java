/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nicoletfear.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Jaguar;
import com.nicoletfear.commands.RunShooterBelt;

/**
 *
 * @author fear
 */
public class Shooter extends Subsystem {
    private SpeedController motorController = new Jaguar(3);

    public void initDefaultCommand() {
        setDefaultCommand(new RunShooterBelt());
    }
    
    public void setBeltSpeed(double speed) {
        motorController.set(speed);
    }
}
