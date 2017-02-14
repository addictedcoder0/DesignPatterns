package com.pattern.Singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private  static ChocolateBoiler uniqueinstance;
	// starting the boiler at empty condition
	private ChocolateBoiler(){
		empty= true;
		boiled=false;
		
	}
	
	public static ChocolateBoiler getInstance(){
		if (uniqueinstance == null){
			uniqueinstance=new ChocolateBoiler();
			
		}
		return uniqueinstance;
	}
	
	/*this object instantiation suffers a major problem due to  multi threading
	 * in order to resolve such issue we have 3 approach 
	 * 	/
	 * 1.make the getInstance() synchronized
	 * 		demerit: it is expensive 
	 * 
	 * 2.move to an eagrly created instance rather than a lazily created one
	 * 		private static ChocolateBoiler uniqueinstance = new ChocolateBoiler();
	 * 		public static ChocolateBoiler getInstance(){
	 * 			return uniqueinstance;
	 * 			}
	 * 	using this approach we rely on the JVM to create a unique instance of the Singleton when the class is loaded.
	 * 	the JVM guarantees that the instance will be created before any theead accesses the static uniqueinstance 
	 * 	variable.
	 * 
	 * 3.double checking the locking
	 * 	private volatile static ChocolateBoiler uniqueinstance;
	 *  
	 *  public static ChocolateBoiler getInstance(){
	 *  	if (uniqueinstance==null){          //first check
	 *  		synchronized(ChocolateBoiler.class){
	 *  		if(uniqueinstance == null){      //second check after locking the class
	 *  		uniqueinstance = new ChocolateBoiler();
	 *  		}
	 *  			}
	 *  }
	 * 
	 * */	
	
	public void fill(){
		if (isEmpty()){
			empty=false;
			boiled=false;
			// fill the boiler with milk and chocolate
		}
	}
	// to drain boiler must be filled(non empty) and already-boiled
	public void drain(){
		if (isEmpty() && isBoiled()){
			//drain the boiled milk and chocolate
			empty=true;
		}
	}
	
	//before boiling just cross check that it is filled and not boiled
	public void boil(){
		if (!isEmpty() && !isBoiled()){
			//bring the milk and chocolate for boiling
			boiled=true;
		}
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	
}
