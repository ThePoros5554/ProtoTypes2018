package org.usfirst.frc.team5554.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import systems.RobotManager;
import systems.subsystems.MechSys;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {



	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
//	Button Button4;
	Scheduler mySchedular;
	OI oi;
	
	@Override
	public void robotInit() 
	{
//		//PORT 0
//		SmartDashboard.putString("Port0Side","");
//		SmartDashboard.putBoolean("Port0Enabled", false);
//		
//		//PORT 1
//		SmartDashboard.putString("Port1Side", "");
//		SmartDashboard.putBoolean("Port1Enabled", false);
//		
//		//PORT 2
//		SmartDashboard.putString("Port2Side", "");
//		SmartDashboard.putBoolean("Port2Enabled", false);
//		
//		//PORT 3
//		SmartDashboard.putString("Port3Side", "");
//		SmartDashboard.putBoolean("Port3Enabled", false);
//		
//		//JOY 1 PORT 4
//		SmartDashboard.putNumber("Joy1Speed", 0);
//		SmartDashboard.putNumber("Joy1Rotate", 0);
//		SmartDashboard.putNumber("Joy1Twist", 0);
//		SmartDashboard.putBoolean("Joy1Enabled", false);
//		
//		//JOY 2 PORT 5
//		SmartDashboard.putNumber("Joy2Speed", 0);
//		SmartDashboard.putNumber("Joy2Rotate", 0);
//		SmartDashboard.putNumber("Joy2Twist", 0);
//		SmartDashboard.putBoolean("Joy2Enabled", false);
//	
//		MechSys[] port= new  MechSys[6];
//		
//		for(int i = 4; i <= 9; i++)
//		{
//		//PORT 4-9
//		    SmartDashboard.putBoolean("port" + i + "Enabled", false);
//		    SmartDashboard.putNumber("port" + i + "FrontButton", 0);
//		    SmartDashboard.putNumber("port" + i + "Frontspeed", 0);
//		    SmartDashboard.putNumber("port" + i + "BackButton", 0);
//		    SmartDashboard.putNumber("port" + i + "BackSpeed", 0);
//		    port[i-4] = new MechSys(i);
//		    RobotManager.AddSubsystem("port" + i, port[i-4]);
//		}
		
	    SmartDashboard.putNumber("port4FrontButton", 3);
	    SmartDashboard.putNumber("port4Frontspeed", 0);
	    MechSys port4 = new MechSys(4);
	    RobotManager.AddSubsystem("port4", port4);
	    RobotManager.SetDriveJoy(0);
	    
	    oi = new OI();
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() 
	{
		// SmartDashboard.putNumber("port4FrontButton", 3);
		//SmartDashboard.putNumber("port4Frontspeed", 0);

	}

	@Override
	public void disabledPeriodic() {
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() 
	{
		Scheduler.getInstance();

	    oi.SetComms();

		
//			String PortFrontButton = ("port4FrontButton");
//			String PortFrontspeed = ("port4Frontspeed");
//			String Port = ("port4");
//			if(Button4 == null)
//			{
//				Button4 = new JoystickButton(RobotManager.GetDriveJoy(), (int) SmartDashboard.getNumber(PortFrontButton, 3));
//				Button4.whileHeld(new ActivateMechSys(Port,  (double) SmartDashboard.getNumber(PortFrontspeed, 0)));
//			}
//			else
//			{
//				Button4.whileHeld(new ActivateMechSys(Port,  (double) SmartDashboard.getNumber(PortFrontspeed, 0)));
//			}

	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
	}
}
