
package org.usfirst.frc.team5554.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


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
	
	@Override
	public void robotInit() 
	{
		//PORT 0
		SmartDashboard.putString("Port0Side","");
		SmartDashboard.putBoolean("Port0Enabled", false);
		
		//PORT 1
		SmartDashboard.putString("Port1Side", "");
		SmartDashboard.putBoolean("Port1Enabled", false);
		
		//PORT 2
		SmartDashboard.putString("Port2Side", "");
		SmartDashboard.putBoolean("Port2Enabled", false);
		
		//PORT 3
		SmartDashboard.putString("Port3Side", "");
		SmartDashboard.putBoolean("Port3Enabled", false);
		
		//JOY 1 PORT 4
		SmartDashboard.putNumber("Joy1Speed", 0);
		SmartDashboard.putNumber("Joy1Rotate", 0);
		SmartDashboard.putNumber("Joy1Twist", 0);
		SmartDashboard.putBoolean("Joy1Enabled", false);
		
		//JOY 2 PORT 5
		SmartDashboard.putNumber("Joy2Speed", 0);
		SmartDashboard.putNumber("Joy2Rotate", 0);
		SmartDashboard.putNumber("Joy2Twist", 0);
		SmartDashboard.putBoolean("Joy2Enabled", false);
	
		//PORT 5
		 SmartDashboard.putBoolean("Port5Enabled", false);
		 SmartDashboard.putNumber("Port5Speed", 0);
		 SmartDashboard.putNumber("Port5Button",0 );
		 
		//PORT 6
		 SmartDashboard.putBoolean("Port6Enabled", false);
		 SmartDashboard.putNumber("Port6Speed", 0);
		 SmartDashboard.putNumber("Port6Button",1 );
		
		//PORT 7
		 SmartDashboard.putBoolean("Port7Enabled", false);
		 SmartDashboard.putNumber("Port7Speed", 0);
		 SmartDashboard.putNumber("Port7Button",1 );
		 
		//PORT 8
		 SmartDashboard.putBoolean("Port8Enabled", false);
		 SmartDashboard.putNumber("Port8Speed", 0);
		 SmartDashboard.putNumber("Port8Button",1 );
		
	    //PORT 9
		 SmartDashboard.putBoolean("Port9Enabled", false);
		 SmartDashboard.putNumber("Port9Speed", 0);
		 SmartDashboard.putNumber("Port9Button",1 );
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
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
	public void teleopInit() {

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
