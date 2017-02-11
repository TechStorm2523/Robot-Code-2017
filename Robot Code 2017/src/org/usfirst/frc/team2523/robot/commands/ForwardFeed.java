package org.usfirst.frc.team2523.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2523.robot.OI;
import org.usfirst.frc.team2523.robot.Robot;

/**
 *
 */
public class ForwardFeed extends Command {
	public ForwardFeed() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.feedSystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		if(OI.controlStick.getY()>0){
		Robot.feedSystem.feedIn();
		} else {
		Robot.feedSystem.stopFeed();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.feedSystem.stopFeed();
	}
}
