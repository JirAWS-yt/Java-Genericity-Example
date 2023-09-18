package com.jiraws.genericity;

public class Boite<T> {
	
	private T contenu;
	
	public T getContenu() {
		return this.contenu;
	}
	
	public void setContenu(T contenu) {
		this.contenu = contenu;
	}

	// --------------------- EXAMPLE ---------------------
	
	public static void main(String[] args) {
		
		Boite<Integer> boiteInteger = new Boite<>();
		
		boiteInteger.setContenu(1);
// 		boiteInteger.setContenu("JirAWS");  // Not working, as expected
		
		Integer contenu = boiteInteger.getContenu();
		System.out.println(contenu);
		
		
		
		Boite<String> boiteString  = new Boite<>();
		
		boiteString.setContenu("JirAWS");
//		boiteString.setContenu(1); 			// Not working, as expected
		
//		String contenu2 = (Integer) boiteString.getContenu(); // Error, Java already knows about the getContenu() type so it indicates we can not Cast to Integer
		
		String contenu2 = boiteString.getContenu();
		System.out.println(contenu2);
		
		
		// As you can see, things are clearer and secured using Genericity (take a look at the other Class "BoiteNoGenericity")
				
	}

}
