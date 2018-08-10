package com.learn.demos.solid.ocp;

public class OpenClosedPrinciple {

	// bad
	
	/*class Greeter {

		private String formality;

		public String getFormality() {
			return formality;
		}

		public void setFormality(String formality) {
			this.formality = formality;
		}

		public void greet() {

			if (formality.equals("casual")) {

				System.out.println("Hey bro what's up?");
			} else if (formality.equals("formal")) {

				System.out.println("Hi how are you?");
			} else if (formality.equals("initmate")) {

				System.out.println("Whatup darling?");
			} else {

				System.out.println("Hello");
			}

		}

	}*/
	
	
	
	// good
	
	public static class Greeter {

		Personality personality;

		public Greeter(Personality personality) {
			this.personality = personality;
		}

		public void greet() {

			personality.greet();
		}
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter(new IntimatePersonality());
		greeter.greet();
	}

}
