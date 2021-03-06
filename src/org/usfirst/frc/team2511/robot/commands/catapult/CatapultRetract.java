package org.usfirst.frc.team2511.robot.commands.catapult;

import org.usfirst.frc.team2511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CatapultRetract extends Command {

	boolean finished = false;
	
    public CatapultRetract() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.catapultSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.catapultSubsystem.retract();
    	finished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	finished = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
