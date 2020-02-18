public class Animal{
	
	//-----------------Fields/Proprties/State---------------------
	private string name;
	private int weight;
	private int noOfLegs;
	// ---------------------------------------------------------- //
	
	// ---------------Default Constructor------------------------
	public Animal(){
		this.name = "Dinosaur";
		this.weight = 4600;
		this.noOfLegs = 2;
	}
	
	// Parameterized Constructor
	public Animal(string _name, int _weight, int _noOfLegs){
		this.name = _name;
		this.weight = _weight;
		this.noOfLegs = _noOfLegs;
	}
	// ----------------------------------------------------------//
	
	//------------Getter and Setter - Name Field ----------------//
	public string getName() {
		return this.name;
	}
	
	public void setName(string _name) {
		if (_name != "") {
			this.name = _name;
		}
		else {
			this.name = "Dinosaur";
		}
	}
	
	
	// Getter and Setter - Weight Field
	public int getWeight(){
		return this.weight;
	}
	
	public void setWeight(int _weight) {
		if (_weight >= 0) {
			this.weight = _weight;
		}
		else {
			this.weight = 4600;
		}
	}
	
	// Getter and Setter - NoOfLegs Field
	public int getNoOfLegs() {
		return this.noOfLegs;
	}
	
	public void setNoOfLegs(int _noOfLegs) {
		if (_noOfLegs >= 2 && _noOfLegs <= 4) {
			this.noOfLegs = _noOfLegs;
		}
		else {
			this.noOfLegs = 2;
		}
	}
	
	// Parent Methods
	public void eat(){
		System.out.println("I am eating");
	}
	
	public void sleep(){
		System.out.println("I am going to sleep");
	}
} // End of Parent Class "Animal"
	

public class pet extends Animal {
	
	// Fields of Child Class
	private bool isVaccinated;
	private bool isBathed;
	
	// Default Constructor of Child Class
	public pet(){
		this.isVaccinated = false;  
		this.isBathed = false;
	}
	
	// Parameterized Constructor of Child Class
	public pet(string _name, int _weight, int _noOfLegs, bool _isVaccinated, bool _isBathed){
		super(_name, _weight, _noOfLegs);
		this.isVaccinated = _isVaccinated;
		this.isBathed = _isBathed;
	}
	
	// Getter and Setter - IsVaccinated Field
	public bool getVaccinated(){
		return this.isVaccinated;
	}
	public void setVaccinated(bool _isVaccinated){
		this.isVaccinated = _isVaccinated;
	}
	
	// Getter and Setter - IsVaccinated Field
	public bool getBathed(){
		return this.isBathed;
	}
	public void setBathed(bool _isBathed){
		this.isBathed = _isBathed;
	}
	
	// Child Methods 
	public void play(){
		System.out.println("I am playing with human");
	}	
} // End of Child Class "Pet"	