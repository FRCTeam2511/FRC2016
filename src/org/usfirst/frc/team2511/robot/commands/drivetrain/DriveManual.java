package org.usfirst.frc.team2511.robot.commands.drivetrain;

import org.usfirst.frc.team2511.robot.Robot;
import org.usfirst.frc.team2511.robot.commands.Delay;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveManual extends CommandGroup {
    
    public  DriveManual(String direction, double time, double speed) {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	if(direction.equals("left")) {
    		addSequential(new ManualSpeed(0, -1*speed));
    		addSequential(new Delay(time));
    		addSequential(new ManualSpeed(0, 0));
    	}
    	if(direction.equals("right")) {
    		addSequential(new ManualSpeed(0, speed));
    		addSequential(new Delay(time));
    		addSequential(new ManualSpeed(0, 0));
    	}
    	if(direction.equals("forwards")) {
    		addSequential(new ManualSpeed(-1*speed, 0));
    		addSequential(new Delay(time));
    		addSequential(new ManualSpeed(0, 0));
    	}
    	if(direction.equals("backwards")) {
    		addSequential(new ManualSpeed(speed, 0));
    		addSequential(new Delay(time));
    		addSequential(new ManualSpeed(0, 0));
    	}
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
