package co.edu.uptc.presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import co.edu.uptc.model.Employee;
import co.edu.uptc.model.Enterprise;
import co.edu.uptc.model.TeamLeader;
import co.edu.uptc.persistence.Persistence;
import co.edu.uptc.view.MyFrame;

public class Presenter implements ActionListener {
    private MyFrame view;
    private boolean isAdmin;
    private boolean isEmployee;
    private String validateEmployeeLoginId;
    private String IdEmployeeSearch;
    private String IdTeamSearch;
    private Map<String, String[]> paymentDataCache;

    private static String JSON_FILE = "data/HumanResources.json";
    private Persistence persistence;
    private Enterprise enterprise;

    private List<String> names;
    private List<String> teams;
    private List<String> ids;
    private List<String> isLeaders;
    private List<String> salaryGrosses;
    private List<String> healthContributionsEmployees;
    private List<String> pensionContributionsEmployees;
    private List<String> healthContributionsEmployers;
    private List<String> pensionContributionsEmployers;
    private List<String> transportAids;
    private List<String> productivityBonuses;
    private List<String> quantityExtraHoursDays;
    private List<String> valueExtraHoursDays;
    private List<String> quantityExtraHoursNights;
    private List<String> valueExtraHoursNights;
    private List<String> quantityExtraHoursSundaysDays;
    private List<String> valueExtraHoursSundaysDays;
    private List<String> quantityExtraHoursSundaysNights;
    private List<String> valueExtraHoursSundaysNights;
    private List<String> totalPayrolls;

    public Presenter() {
        view = new MyFrame(this);
        paymentDataCache = new HashMap<>();
        persistence = new Persistence(JSON_FILE);
        enterprise = new Enterprise(persistence.loadTeams());
        names = new ArrayList<>();
        teams = new ArrayList<>();
        ids = new ArrayList<>();
        isLeaders = new ArrayList<>();
        salaryGrosses = new ArrayList<>();
        healthContributionsEmployees = new ArrayList<>();
        pensionContributionsEmployees = new ArrayList<>();
        healthContributionsEmployers = new ArrayList<>();
        pensionContributionsEmployers = new ArrayList<>();
        transportAids = new ArrayList<>();
        productivityBonuses = new ArrayList<>();
        quantityExtraHoursDays = new ArrayList<>();
        valueExtraHoursDays = new ArrayList<>();
        quantityExtraHoursNights = new ArrayList<>();
        valueExtraHoursNights = new ArrayList<>();
        quantityExtraHoursSundaysDays = new ArrayList<>();
        valueExtraHoursSundaysDays = new ArrayList<>();
        quantityExtraHoursSundaysNights = new ArrayList<>();
        valueExtraHoursSundaysNights = new ArrayList<>();
        totalPayrolls = new ArrayList<>();

        dataSet();
    }

    public void dataSet() {
        names = enterprise.getAllNames();
        ids = enterprise.getAllIds();
        teams = enterprise.getTeamsByEmployee();
        isLeaders = enterprise.getAllIsLeaders();
        salaryGrosses = enterprise.getAllSalariesGrosses();
        healthContributionsEmployees = enterprise.getAllHealthContributionsEmployees();
        pensionContributionsEmployees = enterprise.getAllPensionContributionsEmployees();
        healthContributionsEmployers = enterprise.getAllHealthContributionsEmployers();
        pensionContributionsEmployers = enterprise.getAllPensionContributionsEmployers();
        transportAids = enterprise.getAllTransportAids();
        productivityBonuses = enterprise.getAllProductivityBonuses();
        quantityExtraHoursDays = enterprise.getAllQuantityExtraHoursDays();
        valueExtraHoursDays = enterprise.getAllValueExtraHoursDays();
        quantityExtraHoursNights = enterprise.getAllQuantityExtraHoursNights();
        valueExtraHoursNights = enterprise.getAllValueExtraHoursNights();
        quantityExtraHoursSundaysDays = enterprise.getAllQuantityExtraHoursSundaysDays();
        valueExtraHoursSundaysDays = enterprise.getAllValueExtraHoursSundaysDays();
        quantityExtraHoursSundaysNights = enterprise.getAllQuantityExtraHoursSundaysNights();
        valueExtraHoursSundaysNights = enterprise.getAllValueExtraHoursSundaysNights();
        totalPayrolls = enterprise.getAllSalariesNets();
    }

    public String[] getPaymentDataAsArray(String id) {
        if (paymentDataCache.containsKey(id)) {
            return paymentDataCache.get(id);
        }
        String[] employee = enterprise.getPaymentDataAsArray(id);
        paymentDataCache.put(id, employee);
        return employee;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "ValidateData":
                validateLogin();
                break;

            case "EmployeeLogin":
                this.isEmployee = true;
                this.isAdmin = false;
                break;

            case "ShowMyProfile":
                view.switchToPanelEmployee(1, this);
                sendDataToMyProfile();
                break;

            case "EditMyProfile":
                view.switchToPanelEmployee(2, this);
                sendDataToMyProfileEdit();
                break;

            case "SaveEditMyProfile":
                updateMyProfile();
                break;

            case "AdminLogin":
                this.isAdmin = true;
                this.isEmployee = false;
                break;

            case "ShowEmployeeValidation":
                view.switchToPanelAdmin(1, this);
                break;
            case "SendShowEmployee":
                if (IdEmployeeSearch == null || IdEmployeeSearch.isEmpty()) {
                    view.setMessageSearchEmployee("Ingrese una identificación");
                    this.IdEmployeeSearch = "";
                    return;
                } else {
                    view.switchToPanelAdmin(2, this);
                    sendDataToShowEmployee();
                }
                break;
            case "SearchShowEmployee":
                findEmployee("show");
                break;

            case "EditEmployeeValidation":
                view.switchToPanelAdmin(3, this);
                break;
            case "SendEditEmployee":
                if (IdEmployeeSearch == null || IdEmployeeSearch.isEmpty()) {
                    view.setMessageEditEmployee("Ingrese una identificación");
                    this.IdEmployeeSearch = "";
                    return;
                } else {
                    view.switchToPanelAdmin(4, this);
                    sendDataToEditEmployee();
                }
                break;
            case "SearchEditEmployee":
                findEmployee("edit");
                break;
            case "SaveEditEmployee":
                updateEmployee();
                break;
            case "DeleteEmployeeView":
                view.switchToPanelAdmin(5, this);
                break;
            case "SendDeleteEmployee":
                if (IdEmployeeSearch == null || IdEmployeeSearch.isEmpty()) {
                    view.setMessageDeleteEmployee("Ingrese una identificación");
                    this.IdEmployeeSearch = "";
                    return;
                } else {
                    deleteEmployee();
                }
                break;
            case "SearchDeleteEmployee":
                findEmployee("delete");
                break;
            case "AddEmployeeView":
                view.switchToPanelAdmin(6, this);
                break;
            case "SaveAddEmployee":
                addEmployee();
                break;
            case "ShowTeamValidation":
                view.switchToPanelAdmin(7, this);
                break;
            case "SendShowTeam":
                if (IdTeamSearch == null || IdTeamSearch.isEmpty()) {
                    view.setMessageSearchTeam("Ingrese una identificación");
                    this.IdTeamSearch = "";
                    return;
                } else {
                    view.switchToPanelAdmin(8, this);
                    sendDataToShowTeam();
                }

                break;
            case "SearchShowTeam":
                findTeam("show");

                break;

            case "EditTeamValidation":
                view.switchToPanelAdmin(9, this);
                break;
            case "SendEditTeam":
                if (IdTeamSearch == null || IdTeamSearch.isEmpty()) {
                    view.setMessageEditTeam("Ingrese una identificación");
                    this.IdTeamSearch = "";
                    return;
                } else {
                    view.switchToPanelAdmin(10, this);
                    sendDataToEditTeam();
                }
                break;
            case "SearchEditTeam":
                findTeam("edit");
                break;

            case "AddTeam":
                view.switchToPanelAdmin(11, this);
                break;
            case "SaveAddTeam":
                addTeam();
                break;

            case "DeleteTeamValidation":
                view.switchToPanelAdmin(12, this);
                break;
            case "SendDeleteTeam":
                if (IdTeamSearch == null || IdTeamSearch.isEmpty()) {
                    view.setMessageDeleteTeam("Ingrese una identificación");
                    this.IdTeamSearch = "";
                    return;
                } else {
                    try {
                        deleteTeam();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
                break;
            case "SearchDeleteTeam":
                findTeam("delete");
                break;

            case "ViewIndividualPayroll":
                view.switchToPanelAdmin(13, this);
                break;
            case "SendPayrollEmployee":
                if (IdEmployeeSearch == null || IdEmployeeSearch.isEmpty()) {
                    view.setMessagePayrollEmployee("Ingrese una identificación");
                    this.IdEmployeeSearch = "";
                    return;
                } else {
                    view.switchToPanelAdmin(14, this);
                    sendDataToPayrollEmployee();
                }
                break;
            case "SearchPayrollEmployee":
                findEmployee("payroll");
                break;

            case "ViewAllPayroll":
                view.switchToPayrollGeneral(this, names, teams, ids, isLeaders, salaryGrosses,
                        healthContributionsEmployees, pensionContributionsEmployees,
                        healthContributionsEmployers, pensionContributionsEmployers,
                        transportAids, productivityBonuses,
                        quantityExtraHoursDays, valueExtraHoursDays,
                        quantityExtraHoursNights, valueExtraHoursNights,
                        quantityExtraHoursSundaysDays, valueExtraHoursSundaysDays,
                        quantityExtraHoursSundaysNights, valueExtraHoursSundaysNights, totalPayrolls);
                break;
            case "SaveEditTeam":
                editTeam();
                break;
            case "loadEmployeePayroll":
                loadEmployeePayroll();
                break;
            case "PayrollDataEmployee":
                payrollDataEmployee();
                break;

            case "Exit":
                view.switchToPanelPresentation(this);
                break;

        }
    }

    public void payrollDataEmployee() {
        String[] employee = enterprise.getEmployeeAsArray(validateEmployeeLoginId);
        String[] dataPayment = getPaymentDataAsArray(validateEmployeeLoginId);
        view.showPayrollDataEmployeeDialog(this, dataPayment, employee);

    }

    public void loadEmployeePayroll() {
        ArrayList<String> data = view.getFieldsPayrollEmployee();
        ArrayList<String> dataPayroll = enterprise.calculatePayrollEmployee(data);
        String message = enterprise.updateEmployeePayroll(data, dataPayroll);
        String[] employee = enterprise.getEmployeeAsArray(IdEmployeeSearch);
        if (!message.equals("Actualizado exitosamente.")) {
            view.setMessagePayrollEmployeeIndividual(message);
            return;
        } else {
            view.setFieldsNewPayrollEmployee(dataPayroll);
            view.setMessagePayrollEmployeeIndividual(message);
            String isLeader = employee[15];
            if (isLeader.equals("true")) {
                TeamLeader leader = enterprise.getLeaderById(employee[4]);
                persistence.updateLeaderInJson(leader);
            } else {
                Employee updatedEmployee = enterprise.getEmployeeById(employee[4]);
                persistence.updateEmployeeInJson(updatedEmployee);
            }

        }
    }

    public void sendDataToMyProfile() {
        String[] employee = enterprise.getEmployeeAsArray(validateEmployeeLoginId);
        view.setFieldsToMyProfile(employee);
    }

    public void sendDataToMyProfileEdit() {
        String[] employee = enterprise.getEmployeeAsArray(validateEmployeeLoginId);
        view.setFieldsToMyProfileEdit(employee);
    }

    public void sendDataToPayrollEmployee() {
        if (IdEmployeeSearch == null || IdEmployeeSearch.isEmpty()) {
            view.setMessagePayrollEmployee("Ingrese una identificación");
            return;
        }
        String[] employee = enterprise.getEmployeeAsArray(IdEmployeeSearch);
        String[] dataPayment = getPaymentDataAsArray(IdEmployeeSearch);
        view.setFieldsToPayrollEmployee(employee, dataPayment);
    }

    public void findEmployee(String actionType) {
        String id = "";
        if ("show".equals(actionType)) {
            id = view.getIdSearchEmployeeShow();
        } else if ("edit".equals(actionType)) {
            id = view.getIdEditEmployee();
        } else if ("delete".equals(actionType)) {
            id = view.getIdDeleteEmployee();
        } else if ("payroll".equals(actionType)) {
            id = view.getIdPayrollEmployee();
        }
        this.IdEmployeeSearch = id;
        if (id == null || id.isEmpty()) {
            if ("show".equals(actionType)) {
                view.setFieldNameSearchEmployeeShow("");
                view.setFieldJobSearchEmployeeShow("");
                view.setMessageSearchEmployee("Ingrese una identificación");
                return;
            } else if ("edit".equals(actionType)) {
                view.setFieldNameEditEmployeeEdit("");
                view.setFieldJobEditEmployeeEdit("");
                view.setMessageEditEmployee("Ingrese una identificación");
                return;
            } else if ("delete".equals(actionType)) {
                view.setFieldNameDeleteEmployee("");
                view.setFieldJobDeleteEmployee("");
                view.setMessageDeleteEmployee("Ingrese una identificación");
                return;
            } else if ("payroll".equals(actionType)) {
                view.setFieldNamePayrollEmployee("");
                view.setFieldJobPayrollEmployee("");
                view.setMessagePayrollEmployee("Ingrese una identificación");
                return;
            }
        }
        String[] employee = enterprise.getEmployeeAsArray(id);
        if (employee.length == 0) {
            return;
        }

        String name = employee[0] + " " + employee[1];

        if ("show".equals(actionType)) {
            view.setFieldNameSearchEmployeeShow(name);
            view.setFieldJobSearchEmployeeShow(employee[14]);
        } else if ("edit".equals(actionType)) {
            view.setFieldNameEditEmployeeEdit(name);
            view.setFieldJobEditEmployeeEdit(employee[14]);
        } else if ("delete".equals(actionType)) {
            view.setFieldNameDeleteEmployee(name);
            view.setFieldJobDeleteEmployee(employee[14]);
        } else if ("payroll".equals(actionType)) {
            view.setFieldNamePayrollEmployee(name);
            view.setFieldJobPayrollEmployee(employee[14]);
        }
    }

    public void validateLogin() {
        if (!isAdmin && !isEmployee) {
            view.showErrorMessage("Seleccione un rol en la parte superior");
            return;
        }
        this.validateEmployeeLoginId = view.getFieldId();
        String yearBirth = view.getFieldYearBirth();

        if (validateEmployeeLoginId.isEmpty() || yearBirth.isEmpty()) {
            view.showErrorMessage("Ingrese todos los datos");
            return;
        }
        if (isAdmin) {
            if (enterprise.validateAdminLogin(validateEmployeeLoginId, yearBirth)) {
                view.switchToPanelOptions(isAdmin, isEmployee, this);
                view.switchToPanelRole(isAdmin, isEmployee, this,
                        enterprise.getEmployeeAsArray(validateEmployeeLoginId));
                view.switchPresentation(true, this);
            } else {
                view.showErrorMessage("Datos incorrectos para administrador");
            }
        } else if (isEmployee) {
            if (enterprise.validateEmployeeLogin(validateEmployeeLoginId, yearBirth)) {
                view.switchToPanelOptions(isAdmin, isEmployee, this);
                view.switchToPanelRole(isAdmin, isEmployee, this,
                        enterprise.getEmployeeAsArray(validateEmployeeLoginId));
                view.switchPresentation(true, this);
            } else {
                view.showErrorMessage("Datos incorrectos para empleado");
            }
        }
    }

    public void sendDataToShowEmployee() {

        String[] employee = enterprise.getEmployeeAsArray(IdEmployeeSearch);
        view.setFieldsToShowEmployee(employee);
    }

    public void sendDataToEditEmployee() {
        String[] employee = enterprise.getEmployeeAsArray(IdEmployeeSearch);
        if (employee[15].equals("true")) {
            view.setFieldIdTeamEditable(false);
        }
        view.setFieldsToEditEmployee(employee);
    }

    public void updateMyProfile() {
        ArrayList<String> data = view.getFieldsEditMyProfile();
        String id = data.get(4);
        boolean isLeader = data.get(16).equals("true");

        String message = enterprise.updateEmployee(data, id, true);
        if (isLeader) {
            Employee updatedLeader = enterprise.getEmployeeById(id);
            persistence.updateLeaderInJson(updatedLeader);

        } else {
            Employee updatedEmployee = enterprise.getEmployeeById(id);
            persistence.updateEmployeeInJson(updatedEmployee);
        }

        if (message.equals("Actualizado exitosamente.")) {
            view.setMessageUpdateMyProfile(message, true);
        } else {
            view.setMessageUpdateMyProfile(message, false);
        }
    }

    public void updateEmployee() {
        ArrayList<String> data = view.getFieldsEditEmployee();
        for (String string : data) {
            if (string.isEmpty()) {
                view.setMessageUpdateEmployee("Ingrese todos los datos", false);
                return;
            }
        }
        String id = data.get(4);
        boolean isLeader = data.get(16).equals("true");

        String message = enterprise.updateEmployee(data, id, true);
        if (message.equals("Actualizado exitosamente.")) {
            view.setMessageUpdateEmployee(message, true);
            if (isLeader) {
                Employee updatedLeader = enterprise.getEmployeeById(id);
                persistence.updateLeaderInJson(updatedLeader);
            } else {
                Employee updatedEmployee = enterprise.getEmployeeById(id);
                persistence.updateEmployeeInJson(updatedEmployee);
            }
        } else {
            view.setMessageUpdateEmployee(message, false);
        }

    }

    public void deleteEmployee() {
        long id = Long.parseLong(view.getIdDeleteEmployee());
        enterprise.deleteEmployee(id);
        persistence.deleteEmployee(id);
    }

    public void addEmployee() {
        ArrayList<String> data = view.getFieldsAddEmployee();
        for (String string : data) {
            if (string.isEmpty()) {
                view.setMessageAddEmployee("Ingrese todos los datos", false);
                return;
            }
        }

        String idTeam = data.get(30);
        boolean isLeader = Boolean.parseBoolean(data.get(16));
        if (isLeader) {
            String message = enterprise.addLeader(data, idTeam, false);
            if (message.equals("Creado exitosamente.")) {
                view.setMessageAddEmployee(message, true);
                Employee newLeader = enterprise.getEmployeeById(data.get(4));
                persistence.addLeaderToTeam(newLeader, idTeam);
            } else {
                view.setMessageAddEmployee(message, false);
                return;
            }
        } else {
            String message = enterprise.addEmployee(data, idTeam, false);
            if (message.equals("Creado exitosamente.")) {
                view.setMessageAddEmployee(message, true);
                Employee newEmployee = enterprise.getEmployeeById(data.get(4));
                persistence.addEmployee(newEmployee, idTeam);
            } else {
                view.setMessageAddEmployee(message, false);
                return;
            }
        }

    }

    public void deleteTeam() throws Exception {
        String id = view.getIdDeleteTeam();
        enterprise.deleteTeam(id);
        persistence.deleteTeam(id);
    }

    public void editTeam() {
        if (IdTeamSearch.isEmpty() || IdTeamSearch == null) {
            view.setMessageEditTeam("Ingrese una identificación");
            return;
        }
        ArrayList<String> data = view.getFieldsEditTeam();
        try {
            String message = enterprise.updateTeam(data, IdTeamSearch);
            if (message.equals("Actualizado exitosamente.")) {
                view.setMessageUpdateTeam(message, true);
                persistence.updateTeam(data, IdTeamSearch);
            } else {
                view.setMessageUpdateTeam(message, false);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTeam() {
        ArrayList<String> data = view.getFieldsAddTeam();
        String message = enterprise.addTeam(data);

        if (message.equals("Creado exitosamente.")) {
            view.setMessageAddTeam(message, true);
            persistence.addTeam(data);
        } else {
            view.setMessageAddTeam(message, false);
            return;
        }
    }

    public void findTeam(String actionType) {
        String id = "";
        if ("show".equals(actionType)) {
            id = view.getIdSearchTeamShow();
        } else if ("edit".equals(actionType)) {
            id = view.getIdEditTeam();
        } else if ("delete".equals(actionType)) {
            id = view.getIdDeleteTeam();
        }

        if (id == null || id.isEmpty()) {
            if ("show".equals(actionType)) {
                view.setFieldNameSearchTeamShow("");
                view.setFieldAreaSearchTeamShow("");
                view.setMessageSearchTeam("Ingrese una identificación");
                this.IdTeamSearch = "";
                return;
            } else if ("edit".equals(actionType)) {
                view.setFieldNameEditTeamEdit("");
                view.setFieldAreaEditTeamEdit("");
                view.setMessageEditTeam("Ingrese una identificación");
                this.IdTeamSearch = "";
                return;
            } else if ("delete".equals(actionType)) {
                view.setFieldNameDeleteTeam("");
                view.setFieldAreaDeleteTeam("");
                view.setMessageDeleteTeam("Ingrese una identificación");
                this.IdTeamSearch = "";
                return;
            }
        }

        this.IdTeamSearch = id;
        String[] team = enterprise.getTeamAsArray(id);
        String name = team[0];

        if ("show".equals(actionType)) {
            view.setFieldNameSearchTeamShow(name);
            view.setFieldAreaSearchTeamShow(team[1]);
        } else if ("edit".equals(actionType)) {
            view.setFieldNameEditTeamEdit(name);
            view.setFieldAreaEditTeamEdit(team[1]);
        } else if ("delete".equals(actionType)) {
            view.setFieldNameDeleteTeam(name);
            view.setFieldAreaDeleteTeam(team[1]);
        }
    }

    public void sendDataToShowTeam() {
        String[] team = enterprise.getTeamAsArray(IdTeamSearch);
        view.setFieldsToShowTeam(team);
    }

    public void sendDataToEditTeam() {
        String[] team = enterprise.getTeamAsArray(IdTeamSearch);
        view.setFieldsToEditTeam(team);
    }

    public static void main(String[] args) {
        new Presenter();
    }

}
