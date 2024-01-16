package co.edu.uptc.model;

public class VacationsEmployee {
	private int vacationsDays;
	private int vacationsTaken;

	public int getVacationsDays() {
		return vacationsDays;
	}

	public void setVacationsDays(int vacationsDays) {
		this.vacationsDays = vacationsDays;
	}

	public int getVacationsTaken() {
		return vacationsTaken;
	}

	public void setVacationsTaken(int vacationsTaken) {
		this.vacationsTaken = vacationsTaken;
	}

	@Override
	public String toString() {
		return "VacationsEmployee [vacationsDays=" + vacationsDays + ", vacationsTaken=" + vacationsTaken + "]";
	}

}
