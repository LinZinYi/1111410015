package StarWar_1111410015;

public class AirCraf {
	

	private String manufacturer ;
	private String Model ;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine ;
	private String HyperSpaceEngine ;
	private String Weapon;
	private double Weapon_power;
	private int Passenger;
	
	

	
	
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String getWeapon() {
		return Weapon;
	}
	public void setWeapon(String weapon) {
		Weapon = weapon;
	}
	public double getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double weapon_power) {
		Weapon_power = weapon_power;
	}
	
	AirCraf(){}
	AirCraf(String setManufacturer,String setModel,double setLength,double setAirSpeed,String setSpaceSpeed,String setStdandardEngine){
		this.getManufacturer();
		this.getModel();
		this.getLength();
		this.getAirSpeed();
		this.getSpaceSpeed();
		this.getStdandardEngine();
	}
}
