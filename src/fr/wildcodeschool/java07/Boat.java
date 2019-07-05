package fr.wildcodeschool.java07;

public class Boat extends Vehicle {
	
	// Constructor
	public Boat(String brand, int kilometers) {  
        super(brand, kilometers);  
    }
	
	// Methods
	@Override  
    public String doStuff() {  
		return "Je suis " + this.getBrand() + " et je fais glou glou."; 
    }

}
