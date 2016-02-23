package org.usfirst.frc.team2511.robot.commands;

import org.usfirst.frc.team2511.robot.commands.catapult.LaunchCatapult;
import org.usfirst.frc.team2511.robot.commands.drivetrain.DriveManual;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousGroup extends CommandGroup {
    
    public  AutonomousGroup() {
    	
    	//DriveManual("direction", delay in seconds, speed);
    	
    	addSequential(new DriveManual("forwards", 1.5, .75));
    	addSequential(new DriveManual("left", 0.3, .75)); 	
    	addSequential(new Delay(.5));
    	addSequential(new LaunchCatapult());
    	addSequential(new DriveManual("backwards", 0.5, .75));
    	addSequential(new DriveManual("right", 0.3, .75));
    }
}
