/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveTeleop extends Command {
  public DriveTeleop() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveSubsystem); //böylece neyi kontrol ettiğini biliyor.
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double move = Robot.m_oi.stick.getY(); //ipucu: bazı durumlarda negatif yapman gerekebilir. tam tersi çaışıyorsa - koymalısın.
    double turn = Robot.m_oi.stick.getX();
    Robot.driveSubsystem.teleopDrive(move, turn); //robota gelen değerlere göre hareket etmesini söyledik.
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
  }
}
