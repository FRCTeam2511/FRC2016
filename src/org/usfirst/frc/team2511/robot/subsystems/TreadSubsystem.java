package org.usfirst.frc.team2511.robot.subsystems;

import org.usfirst.frc.team2511.robot.commands.drivetrain.DriveJoy;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TreadSubsystem extends Subsystem {
    
	private static Talon talon1 = new Talon(0);
	private static Talon talon2 = new Talon(1);
	private static Talon talon3 = new Talon(2);
	private static Talon talon4 = new Talon(3);
	//left = -1
	//forward = -1
	
	private double leftSpeed = 0;
	private double rightSpeed = 0;
	
	public void changeSpeed(double Y, double Z) {
		//put in phys speed control instead of smartdashboard val
		leftSpeed = ((Y-Z)*SmartDashboard.getNumber("SPEED"));
		rightSpeed = (((Y*-1)-Z)*SmartDashboard.getNumber(" SPEED"));
		talon1.set(leftSpeed); 
		talon2.set(leftSpeed*-1); 	
		talon3.set(rightSpeed*-1);
		talon4.set(rightSpeed* -1);
		SmartDashboard.putNumber("LEFTSPEED",leftSpeed);
		SmartDashboard.putNumber("RIGHTSPEED", rightSpeed);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveJoy());
    }
}

