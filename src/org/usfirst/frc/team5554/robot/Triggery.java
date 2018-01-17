package org.usfirst.frc.team5554.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class Triggery extends JoystickButton
{
	private int buttonNum;
	private GenericHID joy;
	
	public Triggery(GenericHID joystick, int buttonNumber) 
	{
		super(joystick, buttonNumber);
		
		this.buttonNum = buttonNumber;
		this.joy = joystick;
	}
	
	public void SetButton(int buttonNumber)
	{
		this.buttonNum = buttonNumber;
	}
	
	@Override
	public boolean get()
	{
		if(joy.getRawButton(this.buttonNum))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	


	

}
