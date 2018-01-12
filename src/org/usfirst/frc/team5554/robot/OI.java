package org.usfirst.frc.team5554.robot;

import commands.ActivateMechSys;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import systems.RobotManager;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
	public OI()
	{
		Button[] Button = new Button[6];
		Button[] BackButton = new Button[6];
		
		for (int i = 4; i <= 9; i++)
		{
			String PortEnabled = ("port" + i + "Enabled");
			String PortFrontButton = ("port" + i + "FrontButton");
			String PortFrontspeed = ("port" + i + "Frontspeed");
			String PortBackButton = ("port" + i + "BackButton");
			String PortBackSpeed = ("port" + i + "BackSpeed");
			String Port = ("port" + i);
			
		if (SmartDashboard.getBoolean(PortEnabled, false) == true)
		{
			Button[i] = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortFrontButton, 0));
			Button[i].whileHeld(new ActivateMechSys(Port,  (double) SmartDashboard.getNumber(PortFrontspeed, 0)));
			BackButton[i] = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortBackButton, 0)); 
			BackButton[i].whileHeld(new ActivateMechSys(Port, -1 * (double) SmartDashboard.getNumber(PortBackSpeed, 0)));
		}
		}
	}

}
