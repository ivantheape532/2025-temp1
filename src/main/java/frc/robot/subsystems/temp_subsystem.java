package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class temp_subsystem extends SubsystemBase{
    private static TalonFX m_leftmoter = new TalonFX(0);
    public static void set(double pct){
        m_leftmoter.set(pct);
    }
}