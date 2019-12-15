/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. THE THİNGS THAT DONT CHANGE.
 */
public class RobotMap {
 
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  //bu kod için bir sağ bir sol motor var toplam 2 motor kontrol edilmeli 
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  public static int leftMotorPort = 1; //port yazmamız robotların bağlandığı portu gösterdiği için önemli 
  public static int rightMotorPort = 2;

  public static int joystickPort = 0;







 
}

