package com.pattern.CommandDesignPattern.RemoteControl;

public class TvOffCommand implements Command{
	Tv tv;
	
	public TvOffCommand(){
	tv=new Tv();	
	}
	public void execute() {
			tv.off();
	}
	@Override
	public void undo() {
		tv.on();
		// TODO Auto-generated method stub
		
	}
}
