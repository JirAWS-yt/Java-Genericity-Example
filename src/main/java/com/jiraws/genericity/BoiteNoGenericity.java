package com.jiraws.genericity;

public class BoiteNoGenericity {
	
	private Object contenu;
	
	public Object getContenu() {
		return this.contenu;
	}
	
	public void setContenu(Object contenu) {
		this.contenu = contenu;
	}

	// --------------------- EXAMPLE ---------------------
	
	public static void main(String[] args) {
		
		BoiteNoGenericity boiteInteger = new BoiteNoGenericity();
		
		boiteInteger.setContenu(1);
 		boiteInteger.setContenu("JirAWS"); // Everything works; you can do whatever you want because the Object class is universal
 		
// 		Integer contenu = boiteInteger.getContenu(); 			// Error, we must "Cast" the value if we want to affect it to our Integer variable
// 		Integer contenu = (Integer) boiteInteger.getContenu();  // Error, we are Casting a String value to a Integer one (not possible!)
 		
 		String  contenu = (String) boiteInteger.getContenu();   // Working well, if we do things properly
 		System.out.println(contenu);
 		
 		
 		
		BoiteNoGenericity boiteString  = new BoiteNoGenericity();
		
		boiteString.setContenu("JirAWS");
		boiteString.setContenu(1);
		
// 		String contenu2 = boiteInteger.getContenu(); 			 // Error, we must "Cast" the value if we want to affect it to our Integer variable
// 		String contenu2 = (String) boiteInteger.getContenu();   // Error, we are Casting an Integer value to a String one (not possible!)
		
		Integer contenu2 = (Integer) boiteInteger.getContenu();  // Working well, if we do things properly
		System.out.println(contenu2);
		
		
		// As you can see, things can go wrong quickly without Genericity (take a look at the other Class "Boite")
				
	}

}
