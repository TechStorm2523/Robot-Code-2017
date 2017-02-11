package org.usfirst.frc.team2523.robot.subsystems;

import org.usfirst.frc.team2523.robot.RobotMap;
import org.usfirst.frc.team2523.robot.commands.HopperConditions;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class HopperSystem extends Subsystem {

    Spark hopper = new Spark(RobotMap.transitBelt);
    
    public void hopperGo(){
    	hopper.set(-1);
    }
    public void hopperStop(){
    	hopper.set(0);
    }
    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        setDefaultCommand(new HopperConditions());
    }
}

