package com.pattern.CommandDesignPattern.RemoteControl;

public class CeilingFanOffCommand extends CeilingFanUndoCommand implements Command{
	CeilingFan ceilingFan;
	//int prevSpeed;
	
	public CeilingFanOffCommand() {
	this.ceilingFan= new CeilingFan();
	
		// TODO Auto-generated constructor stub
	}
	public void execute() {
		//prevSpeed=ceilingFan.prevSpeed();
		ceilingFan.off();
			
	}

	@Override
	public void undo() {
		super.undo();
		}
		
		// TODO Auto-generated method stub
		
	}


