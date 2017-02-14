package com.pattern.CommandDesignPattern.CrossPlatformfile;

public class WriteFileCommand implements Command{

	private FileSystemReceiver fs ;
	
	public WriteFileCommand(FileSystemReceiver fs) {
		
		this.fs =fs ;
		
	}
	@Override
	public void execute() {
		fs.writeFile();
		
	}

}
