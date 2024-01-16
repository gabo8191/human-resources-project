package co.edu.uptc.model;

public class BenefitsEmployee {

	private boolean healthPrepaid;
	private String EPS;
	private double productivityBonusesPercent;

	public boolean getHealthPrepaid() {
		return healthPrepaid;
	}

	public void setHealthPrepaid(boolean healthPrepaid) {
		this.healthPrepaid = healthPrepaid;
	}

	public double getProductivityBonusesPercent() {
		return productivityBonusesPercent;
	}

	public void setProductivityBonusesPercent(double productivityBonusesPercent) {
		this.productivityBonusesPercent = productivityBonusesPercent;
	}

	public String getEPS() {
		return EPS;
	}

	public void setEPS(String ePS) {
		EPS = ePS;
	}

	@Override
	public String toString() {
		return "BenefitsEmployee [healthPrepaid=" + healthPrepaid + ", EPS=" + EPS + ", productivityBonusesPercent="
				+ productivityBonusesPercent + "]";
	}

}
