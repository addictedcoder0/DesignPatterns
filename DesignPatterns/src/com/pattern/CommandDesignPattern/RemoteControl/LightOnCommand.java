package com.pattern.CommandDesignPattern.RemoteControl;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(){
	light=new Light();	
	}
	public void execute() {
			light.on();
	}
	@Override
	public void undo() {
		light.off();
		// TODO Auto-generated method stub
		
	}
}
