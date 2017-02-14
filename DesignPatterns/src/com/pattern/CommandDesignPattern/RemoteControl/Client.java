package com.pattern.CommandDesignPattern.RemoteControl;

public class Client {
	public static void main(String[] args)
	{
	RemoteControl remoteControl=new RemoteControl();
	
	// initialize the instances of the Light on and off classes
	LightOnCommand lightOnCommand=new LightOnCommand();
	LightOffCommand lightOffCommand=new LightOffCommand();
	CeilingFanHighCommand ceilingFanHighCommand=new CeilingFanHighCommand();
	CeilingFanMediumCommand ceilingFanMediumCommand=new CeilingFanMediumCommand();
	CeilingFanOffCommand ceilingFanOffCommand=new CeilingFanOffCommand();
	// initialize the Tv on and off classes
	TvOnCommand tvOnCommand=new TvOnCommand();
	TvOffCommand tvOffCommand=new TvOffCommand();
	
	remoteControl.setCommand(1,lightOnCommand, lightOffCommand);
	remoteControl.setCommand(2, tvOnCommand, tvOffCommand);
	remoteControl.setCommand(3, ceilingFanHighCommand, ceilingFanOffCommand);
	remoteControl.setCommand(4, ceilingFanMediumCommand, ceilingFanOffCommand);
	System.out.println(remoteControl);
	
	remoteControl.onButtonPressed(1);
	remoteControl.offButtonPressed(2);
	remoteControl.undoButtonPressed();
	remoteControl.onButtonPressed(2);
	remoteControl.offButtonPressed(1);
	remoteControl.undoButtonPressed();
	remoteControl.onButtonPressed(3);
	remoteControl.undoButtonPressed();
	remoteControl.onButtonPressed(4);
	remoteControl.offButtonPressed(4);
	remoteControl.undoButtonPressed();

	}
}
