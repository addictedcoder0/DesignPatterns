package com.pattern.CommandDesignPattern.RemoteControl;

public class CeilingFanMediumCommand extends CeilingFanUndoCommand implements Command{
	CeilingFan ceilingFan;
	//int prevSpeed;
	
	public CeilingFanMediumCommand() {
	this.ceilingFan= new CeilingFan();
	
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		//prevSpeed=ceilingFan.prevSpeed();
		ceilingFan.medium();
			
	}

	@Override
	public void undo() {
		super.undo();
		}
		
		// TODO Auto-generated method stub
		
	}


