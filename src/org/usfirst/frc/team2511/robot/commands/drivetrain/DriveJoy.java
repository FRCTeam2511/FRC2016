package org.usfirst.frc.team2511.robot.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2511.robot.OI;
import org.usfirst.frc.team2511.robot.Robot;
/**
 *
 */
public class DriveJoy extends Command {

    public DriveJoy() {
        requires(Robot.treadSubsystem);
    }

    double joyY = 0;
    double joyZ = 0;
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    public void execute() {
    	joyY = OI.mainStick.getY();
    	joyZ = OI.mainStick.getZ();
    	Robot.treadSubsystem.changeSpeed(joyY, joyZ);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.treadSubsystem.changeSpeed(0, 0);
    }
}
