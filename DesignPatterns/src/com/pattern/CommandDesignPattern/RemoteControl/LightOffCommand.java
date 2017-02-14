package com.pattern.CommandDesignPattern.RemoteControl;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(){
	light=new Light();	
	}
	public void execute() {
			light.off();
	}
	@Override
	public void undo() {
		light.on();
		// TODO Auto-generated method stub
		
	}
}
