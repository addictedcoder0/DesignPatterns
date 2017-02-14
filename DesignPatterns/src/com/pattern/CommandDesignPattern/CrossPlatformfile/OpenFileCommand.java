package com.pattern.CommandDesignPattern.CrossPlatformfile;

public class OpenFileCommand implements Command{

	private FileSystemReceiver fs ;
	
	public OpenFileCommand(FileSystemReceiver fs) {
		
		this.fs =fs ;
		
	}
	@Override
	public void execute() {
		fs.openFile();
		
	}

}
