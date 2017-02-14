package com.pattern.CommandDesignPattern.RemoteControl;

public class CeilingFanHighCommand extends CeilingFanUndoCommand implements Command{
	CeilingFan ceilingFan;
	//int prevSpeed;
	
	public CeilingFanHighCommand() {
	this.ceilingFan= new CeilingFan();
	
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		//prevSpeed=ceilingFan.prevSpeed();
		ceilingFan.high();
			
	}

	@Override
	public void undo() {
		super.undo();
		}
		
		// TODO Auto-generated method stub
		
	}


