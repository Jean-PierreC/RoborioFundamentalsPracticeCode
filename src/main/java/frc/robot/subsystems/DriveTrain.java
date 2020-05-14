/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  private TalonSRX left = new TalonSRX(1);
  private TalonSRX right = new TalonSRX(1);

  public DriveTrain() {

  }
  public void tankDrive(double Lspeed,double Rspeed){
    left.set(ControlMode.PercentOutput,Lspeed);
    right.set(ControlMode.PercentOutput,Rspeed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
