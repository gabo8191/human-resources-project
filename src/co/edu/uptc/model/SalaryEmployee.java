package co.edu.uptc.model;

public class SalaryEmployee {

	private long salaryGross;
	private long auxTransport;
	private long healthContribution;
	private long pensionContribution;
	private int extraHoursDays;
	private int extraHoursNight;
	private int extraHoursFestiveDay;
	private int extraHoursFestiveNight;
	private long valueTotalExtraHours;
	private long salaryNet;

	public long getSalaryGross() {
		return salaryGross;
	}

	public void setSalaryGross(long salaryGross) {
		this.salaryGross = salaryGross;
	}

	public int getExtraHoursDays() {
		return extraHoursDays;
	}

	public void setExtraHoursDays(int extraHoursDays) {
		this.extraHoursDays = extraHoursDays;
	}

	public int getExtraHoursNight() {
		return extraHoursNight;
	}

	public void setExtraHoursNight(int extraHoursNight) {
		this.extraHoursNight = extraHoursNight;
	}

	public int getExtraHoursFestiveDay() {
		return extraHoursFestiveDay;
	}

	public void setExtraHoursFestiveDay(int extraHoursFestiveDay) {
		this.extraHoursFestiveDay = extraHoursFestiveDay;
	}

	public int getExtraHoursFestiveNight() {
		return extraHoursFestiveNight;
	}

	public void setExtraHoursFestiveNight(int extraHoursFestiveNight) {
		this.extraHoursFestiveNight = extraHoursFestiveNight;
	}

	public long getValueTotalExtraHours() {
		return valueTotalExtraHours;
	}

	public void setValueTotalExtraHours(long valueTotalExtraHours) {
		this.valueTotalExtraHours = valueTotalExtraHours;
	}

	public long getSalaryNet() {
		return salaryNet;
	}

	public void setSalaryNet(long salaryNet) {
		this.salaryNet = salaryNet;
	}

	public long getAuxTransport() {
		return auxTransport;
	}

	public void setAuxTransport(long auxTransport) {
		this.auxTransport = auxTransport;
	}

	public long getHealthContribution() {
		return healthContribution;
	}

	public void setHealthContribution(long healthContribution) {
		this.healthContribution = healthContribution;
	}

	public long getPensionContribution() {
		return pensionContribution;
	}

	public void setPensionContribution(long pensionContribution) {
		this.pensionContribution = pensionContribution;
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salaryGross=" + salaryGross + ", auxTransport=" + auxTransport
				+ ", healthContribution=" + healthContribution + ", pensionContribution=" + pensionContribution
				+ ", extraHoursDays=" + extraHoursDays + ", extraHoursNight=" + extraHoursNight
				+ ", extraHoursFestiveDay=" + extraHoursFestiveDay + ", extraHoursFestiveNight="
				+ extraHoursFestiveNight + ", valueTotalExtraHours=" + valueTotalExtraHours + ", salaryNet=" + salaryNet
				+ "]";
	}

}
