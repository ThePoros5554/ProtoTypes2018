package org.usfirst.frc.team5554.robot;

import commands.ActivateMechSys;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import systems.RobotManager;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{
	
	Triggery[] b;
	ActivateMechSys[] command;
	
	public OI()
	{
//		Button[] Button = new Button[6];
//		Button[] BackButton = new Button[6];
//		
//		for (int i = 4; i <= 9; i++)
//		{
//			String PortEnabled = ("port" + i + "Enabled");
//			String PortFrontButton = ("port" + i + "FrontButton");
//			String PortFrontspeed = ("port" + i + "Frontspeed");
//			String PortBackButton = ("port" + i + "BackButton");
//			String PortBackSpeed = ("port" + i + "BackSpeed");
//			String Port = ("port" + i);
//			
//		if (SmartDashboard.getBoolean(PortEnabled, false) == true)
//		{
//			Button[i] = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortFrontButton, 0));
//			Button[i].whileHeld(new ActivateMechSys(Port,  (double) SmartDashboard.getNumber(PortFrontspeed, 0)));
//			BackButton[i] = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortBackButton, 0)); 
//			BackButton[i].whileHeld(new ActivateMechSys(Port, -1 * (double) SmartDashboard.getNumber(PortBackSpeed, 0)));
//		}
//		}
		
//		String PortFrontButton = ("port4FrontButton");
//		String PortFrontspeed = ("port4Frontspeed");
//		String Port = ("port4");
//		
//		Button b4 = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortFrontButton, 12));
//		
//		System.out.println("bUTTON: " + (int) SmartDashboard.getNumber(PortFrontButton, 12));
//		
//		b4.whileHeld(new ActivateMechSys("port4",  (double) SmartDashboard.getNumber(PortFrontspeed, 0)));
//		
//		System.out.println("Speed: " + (double) SmartDashboard.getNumber(PortFrontspeed, 0));
	
		
		b = new Triggery[6];
		command = new ActivateMechSys[6];
		SetComms();
		
	}
	
	public void SetComms()
	{
		for(int i = 4;i <=9;i++)
		{
		if(b[i-4] == null)
		{
			b[i-4] = new Triggery(RobotManager.GetDriveJoy(), (int)SmartDashboard.getNumber("port" + i + "FrontButton", 12));				
		}
		else
		{
			b[i-4].SetButton((int)SmartDashboard.getNumber("port" + i + "FrontButton", 12));
		}
		
		if(command[i-4] == null)
		{
			command[i-4] = new ActivateMechSys("port" + i, (double)SmartDashboard.getNumber("port" + i + "Frontspeed", 12));
			b[i-4].whileHeld(command[i-4]);

		}
		else
		{
			command[i-4].SetSpeed((double)SmartDashboard.getNumber("port" + i + "Frontspeed", 12));
		}
		}

	}

}
