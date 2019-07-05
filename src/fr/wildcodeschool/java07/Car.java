package fr.wildcodeschool.java07;

public class Car extends Vehicle {
	
	// Constructor
	public Car(String brand, int kilometers) {  
        super(brand, kilometers);  
    }
	
	// Methods
	@Override  
    public String doStuff() {  
		return "Je suis " + this.getBrand() + " et je fais vroum vroum."; 
    }

}
