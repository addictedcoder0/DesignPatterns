package com.pattern.CommandDesignPattern.RemoteControl;

public class RemoteControl {

	/*
	 * this class defines all the commands specific controls
	 */
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	// initialization
	
	public RemoteControl()
	{
		onCommands =new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i=0;i<7;i++){
			onCommands[i]=noCommand;
			offCommands[i]=noCommand;
			
			}
		undoCommand=noCommand;
	}
	
	public void setCommand(int slot,Command onCommand ,Command offCommand){
		onCommands[slot]=onCommand;
		offCommands[slot]=offCommand;
		
	}
	
	public void onButtonPressed(int slot){
	onCommands[slot].execute();
	undoCommand=onCommands[slot];
	}
	public void offButtonPressed(int slot){
		offCommands[slot].execute();
		undoCommand=offCommands[slot];
		}
	public void undoButtonPressed(){
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer stringbuff=new StringBuffer();
		stringbuff.append("\n ----------------------- Remote Control -------------------------------\n\n");
		for(int i=0;i< onCommands.length;i++){
			stringbuff.append("[ Slot "+ i +" ]"+onCommands[i].getClass().getName()+"     "+offCommands[i].getClass().getName()+"  \n");
			
		}
		return stringbuff.toString();
	}
	


}
