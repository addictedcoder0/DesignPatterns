package com.pattern.CommandDesignPattern.RemoteControl;

public class CeilingFanUndoCommand {
	int prevSpeed;
	CeilingFan ceilingFan;
	public CeilingFanUndoCommand() {
	ceilingFan=new CeilingFan();
	prevSpeed=ceilingFan.prevSpeed();
	
	}
	
	public void undo(){
		if (prevSpeed == CeilingFan.HIGH){
			ceilingFan.high();
			
		}else if (prevSpeed == CeilingFan.LOW){
			ceilingFan.low();
			
		}else if (prevSpeed == CeilingFan.MEDIUM){
			ceilingFan.medium();
			
		}else if (prevSpeed == CeilingFan.OFF){
			ceilingFan.off();
			
	}

	}
}
