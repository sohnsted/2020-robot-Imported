/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import frc.robot.subsystems.Climber;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class ClimbUp extends CommandBase {
  private final Climber climber;


  /**
   * Creates a new ExampleCommand.
   *
   * @param _climber The subsystem used by this command.
   */
  public ClimbUp(Climber _climber) {
    climber = _climber;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(_climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    climber.climberUp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    climber.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
