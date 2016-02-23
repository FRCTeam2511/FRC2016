package org.usfirst.frc.team2511.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {
    
	Solenoid solenoid1 = new Solenoid(1);
	
//	public void launch(double delay) {
//		solenoid1.set(true);
//		Timer.delay(delay);
//		solenoid1.set(false);
//	}
	
	public void fire() {
		solenoid1.set(true);
	}
	
	public void retract() {
		solenoid1.set(false);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

