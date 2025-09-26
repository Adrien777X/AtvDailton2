package frc.robot.commands.Autonomous;

import com.pathplanner.lib.commands.PathPlannerAuto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;

public class Test extends SequentialCommandGroup {
    public Test(SwerveSubsystem drivebase) {
        addCommands(
            new PathPlannerAuto("Test")
        );
    }
}