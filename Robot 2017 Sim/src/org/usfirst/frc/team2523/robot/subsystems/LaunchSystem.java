package org.usfirst.frc.team2523.robot.subsystems;

import org.usfirst.frc.team2523.robot.OI;
import org.usfirst.frc.team2523.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.CANTalon;

/**
 *
 */
public class LaunchSystem extends Subsystem {
	CANTalon intake = new CANTalon(RobotMap.intake);
	CANTalon transitBelt = new CANTalon(RobotMap.transitBelt);
	CANTalon liftBelt = new CANTalon(RobotMap.liftBelt);
	CANTalon outPut = new CANTalon(RobotMap.rightMotor2);
	
	public void Shoot(double speed){
		liftBelt.set(speed);
		outPut.set(speed);
		
		
	}
	public void StopShoot(){
		liftBelt.set(0);
		outPut.set(0);
		
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand();
	}
}
