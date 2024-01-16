package co.edu.uptc.model;

public class Employee {
	private String name;
	private String lastName;
	private int age;
	private String gender;
	private long id;
	private String email;
	private long phone;
	private String address;
	private String city;
	private String country;
	private int yearBirth;
	private int monthBirth;
	private int dayBirth;
	private JobEmployee jobEmployee;
	private BankEmployee bankEmployee;
	private BenefitsEmployee benefitsEmployee;
	private VacationsEmployee vacationsEmployee;
	private SalaryEmployee salaryEmployee;
	private EducationEmployee educationEmployee;

	public Employee() {
		this.jobEmployee = new JobEmployee();
		this.bankEmployee = new BankEmployee();
		this.benefitsEmployee = new BenefitsEmployee();
		this.vacationsEmployee = new VacationsEmployee();
		this.salaryEmployee = new SalaryEmployee();
		this.educationEmployee = new EducationEmployee();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYearBirth() {
		return yearBirth;
	}

	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}

	public int getMonthBirth() {
		return monthBirth;
	}

	public void setMonthBirth(int monthBirth) {
		this.monthBirth = monthBirth;
	}

	public int getDayBirth() {
		return dayBirth;
	}

	public void setDayBirth(int dayBirth) {
		this.dayBirth = dayBirth;
	}

	public JobEmployee getJobEmployee() {
		return jobEmployee;
	}

	public void setJobEmployee(JobEmployee jobEmployee) {
		this.jobEmployee = jobEmployee;
	}

	public BankEmployee getBankEmployee() {
		return bankEmployee;
	}

	public void setBankEmployee(BankEmployee bankEmployee) {
		this.bankEmployee = bankEmployee;
	}

	public BenefitsEmployee getBenefitsEmployee() {
		return benefitsEmployee;
	}

	public void setBenefitsEmployee(BenefitsEmployee benefitsEmployee) {
		this.benefitsEmployee = benefitsEmployee;
	}

	public VacationsEmployee getVacationsEmployee() {
		return vacationsEmployee;
	}

	public void setVacationsEmployee(VacationsEmployee vacationsEmployee) {
		this.vacationsEmployee = vacationsEmployee;
	}

	public SalaryEmployee getSalaryEmployee() {
		return salaryEmployee;
	}

	public void setSalaryEmployee(SalaryEmployee salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}

	public EducationEmployee getEducationEmployee() {
		return educationEmployee;
	}

	public void setEducationEmployee(EducationEmployee educationEmployee) {
		this.educationEmployee = educationEmployee;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", id="
				+ id + ", email=" + email + ", phone=" + phone + ", address=" + address + ", city=" + city
				+ ", country=" + country + ", yearBirth=" + yearBirth + ", monthBirth=" + monthBirth + ", dayBirth="
				+ dayBirth + ", jobEmployee=" + jobEmployee + ", bankEmployee=" + bankEmployee + ", benefitsEmployee="
				+ benefitsEmployee + ", vacationsEmployee=" + vacationsEmployee + ", salaryEmployee=" + salaryEmployee
				+ ", educationEmployee=" + educationEmployee + "]";
	}

}
