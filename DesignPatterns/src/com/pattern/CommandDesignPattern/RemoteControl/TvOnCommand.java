package com.pattern.CommandDesignPattern.RemoteControl;

public class TvOnCommand implements Command{
	Tv tv;
	
	public TvOnCommand(){
	tv=new Tv();	
	}
	public void execute() {
			tv.on();
	}
	@Override
	public void undo() {
		tv.off();
		// TODO Auto-generated method stub
		
	}
}
