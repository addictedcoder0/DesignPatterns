package com.pattern.CommandDesignPattern.CrossPlatformfile;

public class CloseFileCommand implements Command{

	private FileSystemReceiver fs ;
	
	public CloseFileCommand(FileSystemReceiver fs) {
		
		this.fs =fs ;
		
	}
	@Override
	public void execute() {
		fs.closeFile();
		
	}

}
