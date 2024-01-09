package StarWar_1111410015;

public class XWing extends AirCraf {
	static final String[] Shield = {"Chempat防禦者型偏轉幕發射器","Chempat偏轉防護盾投射器","鈦合金加勁外殼"};
	private double[] ShieldPower = {2000,3000,1000};
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}
}
