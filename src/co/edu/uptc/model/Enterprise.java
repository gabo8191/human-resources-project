package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Enterprise {
    private List<Team> teams;
    Employee employee;
    JobEmployee jobEmployee;

    public Enterprise(List<Team> teams) {
        employee = new Employee();
        jobEmployee = new JobEmployee();
        this.teams = teams;
    }

    public ArrayList<String> getAllNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                names.add(leader.getName());
            }
            for (Employee employee : team.getMembersTeam()) {
                names.add(employee.getName());
            }
        }
        return names;
    }

    public ArrayList<String> getAllIds() {
        ArrayList<String> ids = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                ids.add(leader.getId() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                ids.add(employee.getId() + "");
            }
        }
        return ids;
    }

    public ArrayList<String> getTeamsByEmployee() {
        ArrayList<String> teamsByEmployee = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                teamsByEmployee.add(team.getNameTeam());
            }
            for (Employee employee : team.getMembersTeam()) {
                teamsByEmployee.add(team.getNameTeam());
            }
        }
        return teamsByEmployee;
    }

    public ArrayList<String> getAllIsLeaders() {
        ArrayList<String> isLeaders = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                isLeaders.add("Sí");
            }
            for (Employee employee : team.getMembersTeam()) {
                isLeaders.add("No");
            }
        }
        return isLeaders;
    }

    public ArrayList<String> getAllSalariesGrosses() {
        ArrayList<String> salariesGrosses = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                salariesGrosses.add(leader.getSalaryEmployee().getSalaryGross() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                salariesGrosses.add(employee.getSalaryEmployee().getSalaryGross() + "");
            }
        }
        return salariesGrosses;
    }

    public ArrayList<String> getAllHealthContributionsEmployees() {
        ArrayList<String> healthContributionsEmployees = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                healthContributionsEmployees.add(leader.getSalaryEmployee().getHealthContribution() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                healthContributionsEmployees.add(employee.getSalaryEmployee().getHealthContribution() + "");
            }
        }
        return healthContributionsEmployees;
    }

    public ArrayList<String> getAllPensionContributionsEmployees() {
        ArrayList<String> pensionContributionsEmployees = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                pensionContributionsEmployees.add(leader.getSalaryEmployee().getPensionContribution() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                pensionContributionsEmployees.add(employee.getSalaryEmployee().getPensionContribution() + "");
            }
        }
        return pensionContributionsEmployees;
    }

    public ArrayList<String> getAllHealthContributionsEmployers() {
        ArrayList<String> healthContributionsEmployers = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                healthContributionsEmployers.add((long) (leader.getSalaryEmployee().getSalaryGross() * 0.125) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                healthContributionsEmployers.add((long) (employee.getSalaryEmployee().getSalaryGross() * 0.125) + "");
            }
        }
        return healthContributionsEmployers;
    }

    public ArrayList<String> getAllPensionContributionsEmployers() {
        ArrayList<String> pensionContributionsEmployers = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                pensionContributionsEmployers.add((long) (leader.getSalaryEmployee().getSalaryGross() * 0.16) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                pensionContributionsEmployers.add((long) (employee.getSalaryEmployee().getSalaryGross() * 0.16) + "");
            }
        }
        return pensionContributionsEmployers;
    }

    public ArrayList<String> getAllTransportAids() {
        ArrayList<String> transportAids = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                transportAids.add(leader.getSalaryEmployee().getAuxTransport() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                transportAids.add(employee.getSalaryEmployee().getAuxTransport() + "");
            }
        }
        return transportAids;
    }

    public ArrayList<String> getAllProductivityBonuses() {
        ArrayList<String> productivityBonuses = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                productivityBonuses.add((long) (leader.getSalaryEmployee().getSalaryGross() *
                        (leader.getBenefitsEmployee().getProductivityBonusesPercent() / 100)) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                productivityBonuses.add((long) (employee.getSalaryEmployee().getSalaryGross() *
                        (employee.getBenefitsEmployee().getProductivityBonusesPercent() / 100)) + "");
            }
        }
        return productivityBonuses;
    }

    public ArrayList<String> getAllQuantityExtraHoursDays() {
        ArrayList<String> quantityExtraHoursDays = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                quantityExtraHoursDays.add(leader.getSalaryEmployee().getExtraHoursDays() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                quantityExtraHoursDays.add(employee.getSalaryEmployee().getExtraHoursDays() + "");
            }
        }
        return quantityExtraHoursDays;
    }

    public ArrayList<String> getAllValueExtraHoursDays() {
        ArrayList<String> valueExtraHoursDays = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                valueExtraHoursDays.add((long) (6042 * leader.getSalaryEmployee().getExtraHoursDays()) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                valueExtraHoursDays.add((long) (6042 * employee.getSalaryEmployee().getExtraHoursDays()) + "");
            }
        }
        return valueExtraHoursDays;
    }

    public ArrayList<String> getAllQuantityExtraHoursNights() {
        ArrayList<String> quantityExtraHoursNights = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                quantityExtraHoursNights.add(leader.getSalaryEmployee().getExtraHoursNight() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                quantityExtraHoursNights.add(employee.getSalaryEmployee().getExtraHoursNight() + "");
            }
        }
        return quantityExtraHoursNights;
    }

    public ArrayList<String> getAllValueExtraHoursNights() {
        ArrayList<String> valueExtraHoursNights = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                valueExtraHoursNights.add((long) (8458 * leader.getSalaryEmployee().getExtraHoursNight()) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                valueExtraHoursNights.add((long) (8458 * employee.getSalaryEmployee().getExtraHoursNight()) + "");
            }
        }
        return valueExtraHoursNights;
    }

    public ArrayList<String> getAllQuantityExtraHoursSundaysDays() {
        ArrayList<String> quantityExtraHoursSundaysDays = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                quantityExtraHoursSundaysDays.add(leader.getSalaryEmployee().getExtraHoursFestiveDay() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                quantityExtraHoursSundaysDays.add(employee.getSalaryEmployee().getExtraHoursFestiveDay() + "");
            }
        }
        return quantityExtraHoursSundaysDays;
    }

    public ArrayList<String> getAllValueExtraHoursSundaysDays() {
        ArrayList<String> valueExtraHoursSundaysDays = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                valueExtraHoursSundaysDays
                        .add((long) (9667 * leader.getSalaryEmployee().getExtraHoursFestiveDay()) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                valueExtraHoursSundaysDays
                        .add((long) (9667 * employee.getSalaryEmployee().getExtraHoursFestiveDay()) + "");
            }
        }
        return valueExtraHoursSundaysDays;
    }

    public ArrayList<String> getAllQuantityExtraHoursSundaysNights() {
        ArrayList<String> quantityExtraHoursSundaysNights = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                quantityExtraHoursSundaysNights.add(leader.getSalaryEmployee().getExtraHoursFestiveNight() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                quantityExtraHoursSundaysNights.add(employee.getSalaryEmployee().getExtraHoursFestiveNight() + "");
            }
        }
        return quantityExtraHoursSundaysNights;
    }

    public ArrayList<String> getAllValueExtraHoursSundaysNights() {
        ArrayList<String> valueExtraHoursSundaysNights = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                valueExtraHoursSundaysNights
                        .add((long) (12083 * leader.getSalaryEmployee().getExtraHoursFestiveNight()) + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                valueExtraHoursSundaysNights
                        .add((long) (12083 * employee.getSalaryEmployee().getExtraHoursFestiveNight()) + "");
            }
        }
        return valueExtraHoursSundaysNights;
    }

    public ArrayList<String> getAllSalariesNets() {
        ArrayList<String> salariesNets = new ArrayList<>();
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null) {
                salariesNets.add(leader.getSalaryEmployee().getSalaryNet() + "");
            }
            for (Employee employee : team.getMembersTeam()) {
                salariesNets.add(employee.getSalaryEmployee().getSalaryNet() + "");
            }
        }
        return salariesNets;
    }

    public Employee getEmployeeById(String id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                return leader;
            }

            for (Employee employee : team.getMembersTeam()) {
                if (employee.getId() == Long.parseLong(id)) {
                    return employee;
                }
            }
        }

        return null;
    }

    public List<Employee> getEmployeesInTeam(int teamIndex) {
        if (teamIndex >= 0 && teamIndex < teams.size()) {
            return teams.get(teamIndex).getMembersTeam();
        }
        return new ArrayList<>();
    }

    public Team getTeam(int index) {
        return teams.get(index);
    }

    public Team getTeamOfEmployee(String id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                return team;
            }
            for (Employee employee : team.getMembersTeam()) {
                if (employee.getId() == Long.parseLong(id)) {
                    return team;
                }
            }
        }
        return null;
    }

    public TeamLeader getLeaderOfTeam(String id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                return team.getLeaderTeam();
            }
        }
        return null;
    }

    public String[] getPaymentDataAsArray(String id) {
        String[] employee = getEmployeeAsArray(id);
        double productivityBonusPercentage = (Double.parseDouble(employee[21])) / 100;
        long productivityBonus = (long) (Double.parseDouble(employee[24]) * productivityBonusPercentage);
        int vacationsDays = Integer.parseInt(employee[22]) - Integer.parseInt(employee[23]);
        long healthContributionCompany = (long) (Long.parseLong(employee[24]) * 0.125);
        long pensionContributionCompany = (long) (Long.parseLong(employee[24]) * 0.16);
        long healthContributionEmployee = (long) (Long.parseLong(employee[24]) * 0.04);
        long pensionContributionEmployee = (long) (Long.parseLong(employee[24]) * 0.04);
        long grossSalary = Long.parseLong(employee[24]);

        String[] paymentData = new String[13];
        paymentData[0] = "9667";
        paymentData[1] = "6042";
        paymentData[2] = "8458";
        paymentData[7] = "12083";

        long totalValueExtraHours = Long.parseLong(paymentData[0]) * Integer.parseInt(employee[30]);
        totalValueExtraHours += Long.parseLong(paymentData[1]) * Integer.parseInt(employee[28]);
        totalValueExtraHours += Long.parseLong(paymentData[2]) * Integer.parseInt(employee[29]);
        totalValueExtraHours += Long.parseLong(paymentData[7]) * Integer.parseInt(employee[31]);

        paymentData[3] = totalValueExtraHours + "";
        paymentData[4] = healthContributionCompany + "";
        paymentData[5] = pensionContributionCompany + "";
        paymentData[6] = productivityBonus + "";
        paymentData[8] = vacationsDays + "";
        paymentData[9] = "140606";
        paymentData[10] = healthContributionEmployee + "";
        paymentData[11] = pensionContributionEmployee + "";
        long netSalary = grossSalary - healthContributionEmployee - pensionContributionEmployee + productivityBonus +
                totalValueExtraHours + Long.parseLong(paymentData[9]);
        paymentData[12] = netSalary + "";
        return paymentData;
    }

    public ArrayList<String> calculatePayrollEmployee(ArrayList<String> data) {
        ArrayList<String> payrollData = new ArrayList<>();
        double productivityBonusPercentage = (Double.parseDouble(data.get(12))) /
                100;
        payrollData.add((long) (Long.parseLong(data.get(3)) *
                productivityBonusPercentage) + "");
        int vacationsDays = Integer.parseInt(data.get(10)) -
                Integer.parseInt(data.get(11));
        payrollData.add(vacationsDays + "");
        long healthContributionCompany = (long) (Long.parseLong(data.get(3)) *
                0.125);
        payrollData.add(healthContributionCompany + "");
        long pensionContributionCompany = (long) (Long.parseLong(data.get(3)) *
                0.16);
        payrollData.add(pensionContributionCompany + "");
        long healthContributionEmployee = (long) (Long.parseLong(data.get(3)) *
                0.04);
        payrollData.add(healthContributionEmployee + "");
        long pensionContributionEmployee = (long) (Long.parseLong(data.get(3)) *
                0.04);
        payrollData.add(pensionContributionEmployee + "");
        long grossSalary = Long.parseLong(data.get(3));
        payrollData.add(grossSalary + "");
        long valueExtraHoursDay = 9667;
        long valueExtraHoursNight = 6042;
        long valueExtraHoursFestiveDay = 8458;
        long valueExtraHoursFestiveNight = 12083;
        long totalValueExtraHours = valueExtraHoursDay *
                Integer.parseInt(data.get(16));
        totalValueExtraHours += valueExtraHoursNight *
                Integer.parseInt(data.get(18));
        totalValueExtraHours += valueExtraHoursFestiveDay *
                Integer.parseInt(data.get(20));
        totalValueExtraHours += valueExtraHoursFestiveNight *
                Integer.parseInt(data.get(22));
        payrollData.add(totalValueExtraHours + "");
        payrollData.add(data.get(9));
        long netSalary = grossSalary - healthContributionEmployee -
                pensionContributionEmployee +
                Long.parseLong(payrollData.get(0)) + totalValueExtraHours +
                Long.parseLong(payrollData.get(8));
        payrollData.add(netSalary + "");
        payrollData.add(data.get(16));
        payrollData.add(data.get(18));
        payrollData.add(data.get(20));
        payrollData.add(data.get(22));
        return payrollData;
    }

    public String validationDataPayroll(ArrayList<String> data) {
        if (data.get(3).matches(".*[a-zA-Z]+.*")) {
            return "El salario bruto no puede contener letras";
        }
        if (data.get(4).matches(".*[a-zA-Z]+.*")) {
            return "El auxilio de transporte no puede contener letras";
        }
        if (data.get(8).matches(".*[a-zA-Z]+.*")) {
            return "El salario neto no puede contener letras";
        }
        if (data.get(9).matches(".*[a-zA-Z]+.*")) {
            return "El auxilio de transporte no puede contener letras";
        }
        if (data.get(10).matches(".*[a-zA-Z]+.*")) {
            return "Los días de vacaciones no pueden contener letras";
        }
        if (data.get(11).matches(".*[a-zA-Z]+.*")) {
            return "Las vacaciones tomadas no pueden contener letras";
        }
        if (data.get(12).matches(".*[a-zA-Z]+.*")) {
            return "El porcentaje de bonificaciones de productividad no puede contener letras";
        }
        if (data.get(16).matches(".*[a-zA-Z]+.*")) {
            return "Las horas extras diurnas no pueden contener letras";
        }
        if (data.get(18).matches(".*[a-zA-Z]+.*")) {
            return "Las horas extras nocturnas no pueden contener letras";
        }
        if (data.get(20).matches(".*[a-zA-Z]+.*")) {
            return "Las horas extras festivas diurnas no pueden contener letras";
        }
        if (data.get(22).matches(".*[a-zA-Z]+.*")) {
            return "Las horas extras festivas nocturnas no pueden contener letras";
        }
        if (data.get(24).matches(".*[a-zA-Z]+.*")) {
            return "El valor total de horas extras no puede contener letras";
        }

        return "";
    }

    public boolean validateAdminLogin(String id, String yearBirth) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)
                    && leader.getYearBirth() == Integer.parseInt(yearBirth)
                    && leader.getJobEmployee().getIsAdmin()) {
                return true;
            }
        }
        return false;
    }

    public TeamLeader getLeaderById(String id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                return team.getLeaderTeam();
            }
        }
        return null;
    }

    public String[] getEmployeeAsArray(String id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                return getEmployeeArray(leader);
            }
            for (Employee employee : team.getMembersTeam()) {
                if (employee.getId() == Long.parseLong(id)) {
                    return getEmployeeArray(employee);
                }
            }
        }
        return new String[0];
    }

    public String[] getTeamAsArray(String id) {
        for (Team team : teams) {
            if (team.getIdTeam().equals(id)) {
                return getTeamArray(team);
            }
        }
        return new String[0];
    }

    private String[] getTeamArray(Team team) {
        String[] teamArray = new String[15];
        teamArray[0] = team.getNameTeam();
        teamArray[1] = team.getAreaTeam();
        teamArray[2] = team.getIdTeam();
        teamArray[3] = team.getLeaderTeam().getName();
        teamArray[5] = String.valueOf(team.getLeaderTeam().getId());
        return teamArray;
    }

    public String updateTeam(ArrayList<String> team, String id) {
        if (!validateInformationTeams(team, true).equals("")) {
            return validateInformationTeams(team, true);
        }
        Employee employee = getEmployeeById(team.get(4));
        if (employee != null) {
            employee.getJobEmployee().setIsLeader(true);
            TeamLeader teamLeader = convertEmployeeToTeamLeader(employee);
            for (Team teamInList : teams) {
                if (teamInList.getIdTeam().equals(id)) {
                    teamInList.setNameTeam(team.get(0));
                    teamInList.setAreaTeam(team.get(1));
                    teamInList.setIdTeam(team.get(2));
                    Employee leader = convertTeamLeaderToEmployee(teamInList.getLeaderTeam());
                    teamInList.getMembersTeam().add(leader);
                    teamInList.setLeaderTeam(teamLeader);
                    deleteEmployee(Long.parseLong(team.get(4)));
                    return "Actualizado exitosamente.";
                }
            }
        }
        return "Algo salió mal.";
    }

    public String addTeam(ArrayList<String> team) {
        if (!validateInformationTeams(team, false).equals("")) {
            return validateInformationTeams(team, false);
        }

        Team newTeam = new Team();
        newTeam.setNameTeam(team.get(0));
        newTeam.setAreaTeam(team.get(1));
        newTeam.setIdTeam(team.get(2));
        String idLeader = team.get(4);
        Employee leader = getEmployeeById(idLeader);
        if (leader != null) {
            leader.getJobEmployee().setIsLeader(true);
            TeamLeader teamLeader = convertEmployeeToTeamLeader(leader);
            teamLeader.getJobEmployee().setIsLeader(true);
            newTeam.setLeaderTeam(teamLeader);
            teams.add(newTeam);
            deleteEmployee(Long.parseLong(idLeader));
        }
        return "Creado exitosamente.";
    }

    public String validateInformationTeams(ArrayList<String> team, boolean isEdit) {

        if (team.get(0).matches(".*\\d.*")) {
            return "El nombre no debe contener números";
        }
        if (team.get(1).matches(".*\\d.*")) {
            return "El área no debe contener números";
        }
        if (team.get(2).matches(".*[a-zA-Z]+.*")) {
            return "El id no puede contener letras";
        }
        if (!isEdit) {
            for (Team teamInList : teams) {
                if (teamInList.getIdTeam().equals(team.get(2))) {
                    return "El id ya existe";
                }
            }
            for (Team teamInList : teams) {
                Employee leader = teamInList.getLeaderTeam();
                if (leader != null && leader.getId() == Long.parseLong(team.get(4))) {
                    return "El empleado ya es líder";
                }
            }
        }
        for (int i = 0; i < team.size(); i++) {
            if (i != 3 && (team.get(i) == null || team.get(i).equals(""))) {
                return "No puede haber campos vacíos";
            }
        }
        boolean employeeExists = false;
        for (Team teamInList : teams) {
            Employee leader = teamInList.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(team.get(4))) {
                employeeExists = true;
            }
            for (Employee employee : teamInList.getMembersTeam()) {
                if (employee.getId() == Long.parseLong(team.get(4))) {
                    employeeExists = true;
                }
            }
        }
        if (!employeeExists) {
            return "El empleado no existe";
        }
        return "";
    }

    public void deleteTeam(String id) throws Exception {
        Team currentTeam = getTeamById(id);

        if (currentTeam != null) {
            TeamLeader leader = currentTeam.getLeaderTeam();
            if (leader != null) {
                Employee employeeLeader = convertTeamLeaderToEmployee(leader);
                employeeLeader.getJobEmployee().setIsLeader(false);
                List<Employee> members = currentTeam.getMembersTeam();
                if (members != null) {
                    Team newTeam = getTeamById("0");
                    if (newTeam != null) {
                        members.add(employeeLeader);
                        newTeam.setMembersTeam(members);
                        teams.add(newTeam);
                        teams.removeIf(team -> team.getIdTeam().equals(id));
                    } else {
                        throw new Exception("Error: Team with ID 0 not found.");
                    }
                } else {
                    throw new Exception("Error: Members list is null.");
                }
            } else {
                throw new Exception("Error: Team leader is null.");
            }
        } else {
            throw new Exception("Error: Team with ID " + id + " not found.");
        }
    }

    public Team getTeamById(String id) {
        for (Team team : teams) {
            if (team.getIdTeam().equals(id)) {
                return team;
            }
        }
        return null;
    }

    private String[] getEmployeeArray(Employee employee) {
        String[] employeeArray = new String[40];
        employeeArray[0] = employee.getName();
        employeeArray[1] = employee.getLastName();
        employeeArray[2] = employee.getAge() + "";
        employeeArray[3] = employee.getGender();
        employeeArray[4] = employee.getId() + "";
        employeeArray[5] = employee.getEmail();
        employeeArray[6] = employee.getPhone() + "";
        employeeArray[7] = employee.getAddress();
        employeeArray[8] = employee.getCity();
        employeeArray[9] = employee.getCountry();
        employeeArray[10] = employee.getYearBirth() + "";
        employeeArray[11] = employee.getMonthBirth() + "";
        employeeArray[12] = employee.getDayBirth() + "";
        employeeArray[13] = employee.getJobEmployee().getArea();
        employeeArray[14] = employee.getJobEmployee().getPosition();
        employeeArray[15] = employee.getJobEmployee().getIsLeader() + "";
        employeeArray[16] = employee.getJobEmployee().getIsAdmin() + "";
        employeeArray[17] = employee.getBankEmployee().getBank();
        employeeArray[18] = employee.getBankEmployee().getAccountType();
        employeeArray[19] = employee.getBankEmployee().getAccountNumber() + "";
        employeeArray[20] = employee.getBenefitsEmployee().getHealthPrepaid() + "";
        employeeArray[21] = employee.getBenefitsEmployee().getProductivityBonusesPercent() + "";
        employeeArray[22] = employee.getVacationsEmployee().getVacationsDays() + "";
        employeeArray[23] = employee.getVacationsEmployee().getVacationsTaken() + "";
        employeeArray[24] = employee.getSalaryEmployee().getSalaryGross() + "";
        employeeArray[25] = employee.getSalaryEmployee().getAuxTransport() + "";
        employeeArray[26] = employee.getSalaryEmployee().getHealthContribution() + "";
        employeeArray[27] = employee.getSalaryEmployee().getPensionContribution() + "";
        employeeArray[28] = employee.getSalaryEmployee().getExtraHoursDays() + "";
        employeeArray[29] = employee.getSalaryEmployee().getExtraHoursNight() + "";
        employeeArray[30] = employee.getSalaryEmployee().getExtraHoursFestiveDay() + "";
        employeeArray[31] = employee.getSalaryEmployee().getExtraHoursFestiveNight() + "";
        employeeArray[32] = employee.getSalaryEmployee().getValueTotalExtraHours() + "";
        employeeArray[33] = employee.getSalaryEmployee().getSalaryNet() + "";
        employeeArray[34] = employee.getEducationEmployee().getEducationLevel();
        employeeArray[35] = employee.getEducationEmployee().getEducationTitle();
        employeeArray[36] = employee.getEducationEmployee().getEducationInstitution();
        employeeArray[37] = employee.getEducationEmployee().getEducationYear() + "";
        employeeArray[39] = employee.getBenefitsEmployee().getEPS();
        employeeArray[38] = getTeamOfEmployee(employee.getId() + "").getIdTeam();
        return employeeArray;
    }

    public boolean validateEmployeeLogin(String id, String yearBirth) {
        long idLong = Long.parseLong(id);
        int yearBirthInt = Integer.parseInt(yearBirth);
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == idLong && leader.getYearBirth() == yearBirthInt) {
                return true;
            }
            for (Employee employee : team.getMembersTeam()) {
                if (employee.getId() == idLong && employee.getYearBirth() == yearBirthInt) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Team> getAllTeams() {
        return teams;
    }

    public String addLeader(ArrayList<String> employee, String teamId, boolean isEdit) {
        if (!validateInformation(employee, isEdit).equals("")) {
            return validateInformation(employee, isEdit);
        }
        for (Team team : teams) {
            if (team.getIdTeam().equals(teamId)) {
                Employee newLeader = new Employee();
                updateEmployeeData(employee, newLeader);
                team.setLeaderTeam(convertEmployeeToTeamLeader(newLeader));
                return "Creado exitosamente.";
            }
        }
        return "Algo salió mal.";
    }

    public String addEmployee(ArrayList<String> employee, String teamId, boolean isEdit) {
        if (!validateInformation(employee, isEdit).equals("")) {
            return validateInformation(employee, isEdit);
        }
        for (Team team : teams) {
            if (team.getIdTeam().equals(teamId)) {
                if (team.getMembersTeam() == null) {
                    team.setMembersTeam(new ArrayList<>());
                }
                Employee newEmployee = new Employee();
                updateEmployeeData(employee, newEmployee);
                team.getMembersTeam().add(newEmployee);
                return "Creado exitosamente.";
            }
        }
        return "Algo salió mal.";
    }

    public String updateEmployee(ArrayList<String> employee, String id, boolean isEdit) {
        if (!validateInformation(employee, isEdit).equals("")) {
            return validateInformation(employee, isEdit);
        }
        boolean isPossibleLeader = Boolean.parseBoolean(employee.get(16));
        if (isPossibleLeader) {
            for (Team team : teams) {
                if (team.getIdTeam().equals(employee.get(30))) {
                    if (team.getLeaderTeam() == null) {
                        Employee newLeader = new Employee();
                        updateEmployeeData(employee, newLeader);
                        team.setLeaderTeam(convertEmployeeToTeamLeader(newLeader));
                        return "Actualizado exitosamente.";
                    } else {
                        employee.get(16).equals("false");
                        Employee leader = team.getLeaderTeam();
                        if (leader.getId() != Long.parseLong(id)) {
                            return "Ya existe un líder en el equipo";
                        }
                    }
                }
            }
        }

        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == Long.parseLong(id)) {
                updateEmployeeData(employee, leader);
                return "Actualizado exitosamente.";
            }
            for (Employee employeeInTeam : team.getMembersTeam()) {
                if (employeeInTeam.getId() == Long.parseLong(id)) {
                    updateEmployeeData(employee, employeeInTeam);
                    return "Actualizado exitosamente.";
                }
            }
        }
        return "Algo salió mal.";
    }

    public String updateEmployeePayroll(ArrayList<String> dataEmployee, ArrayList<String> calculePayroll) {
        if (!validationDataPayroll(dataEmployee).equals("")) {
            return validationDataPayroll(dataEmployee);
        }

        for (Team team : teams) {
            Employee leader = convertTeamLeaderToEmployee(team.getLeaderTeam());

            if (leader != null && leader.getId() == Long.parseLong(dataEmployee.get(2))) {
                updateEmployeeDataPayroll(dataEmployee, leader, calculePayroll);
                return "Actualizado exitosamente.";
            }
            for (Employee employeeInTeam : team.getMembersTeam()) {
                if (employeeInTeam.getId() == Long.parseLong(dataEmployee.get(2))) {
                    updateEmployeeDataPayroll(dataEmployee, employeeInTeam, calculePayroll);
                    return "Actualizado exitosamente.";
                }
            }
        }
        return "Algo salió mal.";
    }

    public void updateEmployeeDataPayroll(ArrayList<String> dataEmployee, Employee employee,
            ArrayList<String> calculePayroll) {
        employee.getBenefitsEmployee().setProductivityBonusesPercent(Double.parseDouble(dataEmployee.get(12)));
        employee.getVacationsEmployee().setVacationsDays(Integer.parseInt(calculePayroll.get(1)));
        employee.getSalaryEmployee().setHealthContribution(Long.parseLong(calculePayroll.get(4)));
        employee.getSalaryEmployee().setPensionContribution(Long.parseLong(calculePayroll.get(5)));
        employee.getSalaryEmployee().setExtraHoursDays(Integer.parseInt(calculePayroll.get(10)));
        employee.getSalaryEmployee().setExtraHoursNight(Integer.parseInt(calculePayroll.get(11)));
        employee.getSalaryEmployee().setExtraHoursFestiveDay(Integer.parseInt(calculePayroll.get(12)));
        employee.getSalaryEmployee().setExtraHoursFestiveNight(Integer.parseInt(calculePayroll.get(13)));
        employee.getSalaryEmployee().setValueTotalExtraHours(Long.parseLong(calculePayroll.get(7)));
        employee.getSalaryEmployee().setSalaryNet(Long.parseLong(calculePayroll.get(9)));
        employee.getSalaryEmployee().setAuxTransport(Long.parseLong(dataEmployee.get(9)));
        employee.getSalaryEmployee().setSalaryGross(Long.parseLong(dataEmployee.get(3)));

    }

    public String validateInformation(ArrayList<String> employee, boolean isEdit) {

        if (employee.get(0).matches(".*\\d.*")) {
            return "El nombre no debe contener números";
        }
        if (employee.get(1).matches(".*\\d.*")) {
            return "El apellido no debe contener números";
        }
        if (employee.get(2).matches(".*[a-zA-Z]+.*")) {
            return "La edad debe ser un número";
        }
        if (!employee.get(3).equals("Masculino") && !employee.get(3).equals("Femenino")) {
            return "El género debe ser Masculino o Femenino";
        }

        if (employee.get(4).matches(".*[a-zA-Z]+.*")) {
            return "El id no puede contener letras";
        }
        if (!employee.get(5).contains("@")) {
            return "El email debe contener @";
        }
        if (employee.get(6).matches(".*[a-zA-Z]+.*")) {
            return "El teléfono no puede contener letras";
        }

        if (employee.get(8).matches(".*\\d.*")) {
            return "La ciudad no puede contener números";
        }
        if (employee.get(9).matches(".*\\d.*")) {
            return "El país no puede contener números";
        }
        if (employee.get(10).matches(".*[a-zA-Z]+.*")) {
            return "El año de nacimiento no puede contener letras";
        }
        if (employee.get(11).matches(".*[a-zA-Z]+.*")) {
            return "El mes de nacimiento no puede contener letras";
        }
        if (employee.get(12).matches(".*[a-zA-Z]+.*")) {
            return "El día de nacimiento no puede contener letras";
        }
        if (employee.get(13).matches(".*\\d.*")) {
            return "El área no puede contener números";
        }
        if (employee.get(14).matches(".*\\d.*")) {
            return "El cargo no puede contener números";
        }
        if (!employee.get(15).equals("true") && !employee.get(15).equals("false")) {
            return "El admin debe ser true o false";
        }
        if (!employee.get(16).equals("true") && !employee.get(16).equals("false")) {
            return "El líder debe ser true o false";
        }
        if (employee.get(17).matches(".*\\d.*")) {
            return "El banco no puede contener números";
        }
        if (employee.get(18).matches(".*[a-zA-Z]+.*")) {
            return "El número de cuenta no puede contener letras";
        }
        if (employee.get(19).matches(".*\\d.*")) {
            return "El tipo de cuenta no puede contener números";
        }
        if (!employee.get(20).equals("true") && !employee.get(20).equals("false'")) {
            return "La medicina prepagada debe ser true o false";
        }
        if (employee.get(21).matches(".*[a-zA-Z]+.*")) {
            return "El porcentaje de bonos de productividad no puede contener letras";
        }
        if (employee.get(22).matches(".*[a-zA-Z]+.*")) {
            return "Los días de vacaciones no puede contener letras";
        }
        if (employee.get(23).matches(".*[a-zA-Z]+.*")) {
            return "Los días de vacaciones tomados no puede contener letras";
        }
        if (employee.get(24).matches(".*[a-zA-Z]+.*")) {
            return "El salario bruto no puede contener letras";
        }
        if (employee.get(25).matches(".*[a-zA-Z]+.*")) {
            return "El auxilio de transporte no puede contener letras";
        }
        if (employee.get(26).matches(".*\\d.*")) {
            return "El nivel de educación no puede contener números";
        }
        if (employee.get(27).matches(".*\\d.*")) {
            return "El título de educación no puede contener números";
        }
        if (employee.get(28).matches(".*\\d.*")) {
            return "La institución de educación no puede contener números";
        }
        if (employee.get(29).matches(".*[a-zA-Z]+.*")) {
            return "El año de educación no puede contener letras";
        }
        for (String string : employee) {
            if (string == null || string.equals("")) {
                return "No puede haber campos vacíos";
            }
        }
        boolean teamExists = false;
        for (Team team : teams) {
            if (team.getIdTeam().equals(employee.get(30))) {
                teamExists = true;
            }
        }
        if (!teamExists) {
            return "El equipo no existe";
        }
        if (!isEdit) {

            for (Team team : teams) {
                Employee leader = team.getLeaderTeam();
                if (leader != null && leader.getId() == Long.parseLong(employee.get(4))) {
                    return "El id ya existe";
                }
                for (Employee employeeInTeam : team.getMembersTeam()) {
                    if (employeeInTeam.getId() == Long.parseLong(employee.get(4))) {
                        return "El id ya existe";
                    }
                }
            }
            boolean isPossibleLeader = Boolean.parseBoolean(employee.get(16));

            if (isPossibleLeader) {
                for (Team team : teams) {
                    if (team.getIdTeam().equals(employee.get(30))) {
                        Employee existingLeader = team.getLeaderTeam();
                        if (existingLeader != null && !isEmptyEmployee(existingLeader)) {
                            return "Ya existe un líder en el equipo";
                        }
                    }
                }
            }
        }
        return "";

    }

    public boolean isEmptyEmployee(Employee employee) {
        return employee.getName() == null && employee.getLastName() == null && employee.getAge() == 0
                && employee.getGender() == null && employee.getId() == 0 && employee.getEmail() == null
                && employee.getPhone() == 0 && employee.getAddress() == null && employee.getCity() == null
                && employee.getCountry() == null && employee.getYearBirth() == 0 && employee.getMonthBirth() == 0
                && employee.getDayBirth() == 0 && employee.getJobEmployee().getArea() == null
                && employee.getJobEmployee().getPosition() == null && employee.getJobEmployee().getIsLeader() == false
                && employee.getJobEmployee().getIsAdmin() == false && employee.getBankEmployee().getBank() == null
                && employee.getBankEmployee().getAccountType() == null
                && employee.getBankEmployee().getAccountNumber() == 0
                && employee.getBenefitsEmployee().getHealthPrepaid() == false
                && employee.getBenefitsEmployee().getProductivityBonusesPercent() == 0
                && employee.getVacationsEmployee().getVacationsDays() == 0
                && employee.getVacationsEmployee().getVacationsTaken() == 0
                && employee.getSalaryEmployee().getSalaryGross() == 0
                && employee.getSalaryEmployee().getAuxTransport() == 0
                && employee.getSalaryEmployee().getHealthContribution() == 0
                && employee.getSalaryEmployee().getPensionContribution() == 0
                && employee.getSalaryEmployee().getExtraHoursDays() == 0
                && employee.getSalaryEmployee().getExtraHoursNight() == 0
                && employee.getSalaryEmployee().getExtraHoursFestiveDay() == 0
                && employee.getSalaryEmployee().getExtraHoursFestiveNight() == 0
                && employee.getSalaryEmployee().getValueTotalExtraHours() == 0
                && employee.getSalaryEmployee().getSalaryNet() == 0
                && employee.getEducationEmployee().getEducationLevel() == null
                && employee.getEducationEmployee().getEducationTitle() == null
                && employee.getEducationEmployee().getEducationInstitution() == null
                && employee.getEducationEmployee().getEducationYear() == 0;
    }

    public void deleteEmployee(long id) {
        for (Team team : teams) {
            Employee leader = team.getLeaderTeam();
            if (leader != null && leader.getId() == id) {
                team.setLeaderTeam(null);
                return;
            }
            Iterator<Employee> iterator = team.getMembersTeam().iterator();
            while (iterator.hasNext()) {
                Employee employeeInTeam = iterator.next();
                if (employeeInTeam.getId() == id) {
                    iterator.remove();
                    return;
                }
            }
        }
    }

    private void updateEmployeeData(ArrayList<String> employee, Employee employeeToUpdate) {
        employeeToUpdate.setName(employee.get(0));
        employeeToUpdate.setLastName(employee.get(1));
        employeeToUpdate.setAge(Integer.parseInt(employee.get(2)));
        employeeToUpdate.setGender(employee.get(3));
        employeeToUpdate.setId(Long.parseLong(employee.get(4)));
        employeeToUpdate.setEmail(employee.get(5));
        employeeToUpdate.setPhone(Long.parseLong(employee.get(6)));
        employeeToUpdate.setAddress(employee.get(7));
        employeeToUpdate.setCity(employee.get(8));
        employeeToUpdate.setCountry(employee.get(9));
        employeeToUpdate.setYearBirth(Integer.parseInt(employee.get(10)));
        employeeToUpdate.setMonthBirth(Integer.parseInt(employee.get(11)));
        employeeToUpdate.setDayBirth(Integer.parseInt(employee.get(12)));
        employeeToUpdate.getJobEmployee().setArea(employee.get(13));
        employeeToUpdate.getJobEmployee().setPosition(employee.get(14));
        employeeToUpdate.getJobEmployee().setIsLeader(Boolean.parseBoolean(employee.get(15)));
        employeeToUpdate.getJobEmployee().setIsAdmin(Boolean.parseBoolean(employee.get(16)));
        employeeToUpdate.getBankEmployee().setBank(employee.get(17));
        employeeToUpdate.getBankEmployee().setAccountType(employee.get(19));
        employeeToUpdate.getBankEmployee().setAccountNumber(Long.parseLong(employee.get(18)));
        employeeToUpdate.getBenefitsEmployee().setHealthPrepaid(employee.get(20).equals("true") ? true : false);
        employeeToUpdate.getBenefitsEmployee().setProductivityBonusesPercent(Double.parseDouble(employee.get(21)));
        employeeToUpdate.getVacationsEmployee().setVacationsDays(Integer.parseInt(employee.get(22)));
        employeeToUpdate.getVacationsEmployee().setVacationsTaken(Integer.parseInt(employee.get(23)));
        employeeToUpdate.getSalaryEmployee().setSalaryGross(Long.parseLong(employee.get(24)));
        employeeToUpdate.getSalaryEmployee().setAuxTransport(Long.parseLong(employee.get(25)));
        employeeToUpdate.getEducationEmployee().setEducationLevel(employee.get(26));
        employeeToUpdate.getEducationEmployee().setEducationTitle(employee.get(27));
        employeeToUpdate.getEducationEmployee().setEducationInstitution(employee.get(28));
        employeeToUpdate.getEducationEmployee().setEducationYear(Integer.parseInt(employee.get(29)));
    }

    public TeamLeader convertEmployeeToTeamLeader(Employee employee) {
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setName(employee.getName());
        teamLeader.setLastName(employee.getLastName());
        teamLeader.setAge(employee.getAge());
        teamLeader.setGender(employee.getGender());
        teamLeader.setId(employee.getId());
        teamLeader.setEmail(employee.getEmail());
        teamLeader.setPhone(employee.getPhone());
        teamLeader.setAddress(employee.getAddress());
        teamLeader.setCity(employee.getCity());
        teamLeader.setCountry(employee.getCountry());
        teamLeader.setYearBirth(employee.getYearBirth());
        teamLeader.setMonthBirth(employee.getMonthBirth());
        teamLeader.setDayBirth(employee.getDayBirth());
        teamLeader.setJobEmployee(employee.getJobEmployee());
        teamLeader.setBankEmployee(employee.getBankEmployee());
        teamLeader.setBenefitsEmployee(employee.getBenefitsEmployee());
        teamLeader.setVacationsEmployee(employee.getVacationsEmployee());
        teamLeader.setSalaryEmployee(employee.getSalaryEmployee());
        teamLeader.setEducationEmployee(employee.getEducationEmployee());
        return teamLeader;
    }

    public Employee convertTeamLeaderToEmployee(TeamLeader leader) {
        Employee employee = new Employee();
        employee.setName(leader.getName());
        employee.setLastName(leader.getLastName());
        employee.setAge(leader.getAge());
        employee.setGender(leader.getGender());
        employee.setId(leader.getId());
        employee.setEmail(leader.getEmail());
        employee.setPhone(leader.getPhone());
        employee.setAddress(leader.getAddress());
        employee.setCity(leader.getCity());
        employee.setCountry(leader.getCountry());
        employee.setYearBirth(leader.getYearBirth());
        employee.setMonthBirth(leader.getMonthBirth());
        employee.setDayBirth(leader.getDayBirth());
        employee.setJobEmployee(leader.getJobEmployee());
        employee.setBankEmployee(leader.getBankEmployee());
        employee.setBenefitsEmployee(leader.getBenefitsEmployee());
        employee.setVacationsEmployee(leader.getVacationsEmployee());
        employee.setSalaryEmployee(leader.getSalaryEmployee());
        employee.setEducationEmployee(leader.getEducationEmployee());
        return employee;
    }

}
