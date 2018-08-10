package com.learn.demos.solid.lsp;

public class LiskovSubsitutionPrinciple {

	/**
	 * bad example
	 */
	
	/*interface Bird{
		
		void fly(); 
	}
	
	
	class FlyingBird implements Bird{

		@Override
		public void fly() {
			
			
			
		}
		
	}
	
	
	class NonFlyingBird implements Bird{

		@Override
		public void fly() throws Exception {
			
			throw new Exception("Unsupported exception!!");
			
		}
		
		
	}*/
	
	// Good
	
	public static interface Bird {

	}

	public static class FlyingBird implements Bird {

		public void fly(){
			System.out.println("Flying...");
		}
	}

	public static class NonFlyingBird implements Bird {

		public void roam(){
			System.out.println("Roaming...");
		}
	}
	
	public static void main(String[] args) {
		
		Bird bird = new FlyingBird();
		//bird.fly();
		
	}

}
