/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveTeleop;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  // instantiate new motor controller objects
  public Spark leftMotor = new Spark(RobotMap.leftMotorPort);
  public Spark rightMotor = new Spark(RobotMap.rightMotorPort);

  // instantiate a new DifferentialDrive object pass motor controllers as arguments
  public DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);
  //DifferentialDrive ile if durumu kullanılabiliyor o yüzden DifferentialDrive kullandık.
  //arcade drive drivetrainin hız ve dönüş hızı için kullanılan bir moddur. 
  //manual driving turn- x axis left and right, move- y axis up and down
  //move ve turn diyorum joystick üzerinde sağ ve sol dönüşler için
  //ileri ve geri hareket ise ileri geri hareket etmek için kullanılacak
 
 
  public void teleopDrive(double move, double turn){ //double kullanıyoruz çünkü kesirli sayıları da dahil etmek zorundayız.
    drive.arcadeDrive(move, turn);}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveTeleop());
  }
}
