/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
/**
 * An example command that uses an example subsystem.
 */
public class ArmDown extends CommandBase {
  private final Arm arm;


  /**
   * Creates a new ExampleCommand.
   *
   *   * @param _arm The subsystem used by this command.

   */
  public ArmDown(Arm _arm) {
    arm = _arm;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(_arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    arm.down();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arm.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
