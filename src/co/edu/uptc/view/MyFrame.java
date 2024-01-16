package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.uptc.view.admin.OptionsPanelAdmin;
import co.edu.uptc.view.admin.employee.AddEmployeePanel;
import co.edu.uptc.view.admin.employee.EditEmployeePanel;
import co.edu.uptc.view.admin.employee.ShowEmployee;
import co.edu.uptc.view.admin.employee.ValidationDeleteEmployeePanel;
import co.edu.uptc.view.admin.employee.ValidationEditEmployeePanel;
import co.edu.uptc.view.admin.employee.ValidationShowEmployeePanel;
import co.edu.uptc.view.admin.payroll.PayrollEmployeePanel;
import co.edu.uptc.view.admin.payroll.PayrollGeneralEmployeesPanel;
import co.edu.uptc.view.admin.payroll.ValidationPayrollEmployeePanel;
import co.edu.uptc.view.admin.team.AddTeamPanel;
import co.edu.uptc.view.admin.team.EditTeamPanel;
import co.edu.uptc.view.admin.team.ShowTeamPanel;
import co.edu.uptc.view.admin.team.ValidationDeleteTeamPanel;
import co.edu.uptc.view.admin.team.ValidationEditTeam;
import co.edu.uptc.view.admin.team.ValidationShowTeam;
import co.edu.uptc.view.employee.EditMyProfilePanel;
import co.edu.uptc.view.employee.OptionsPanelEmployee;
import co.edu.uptc.view.employee.ShowMyProfilePanel;
import co.edu.uptc.view.employee.ShowPayrollDialog;

public class MyFrame extends JFrame {
    private InitialPresentation presentationPanel;
    private ValidationDataPanel validationDataPanel;
    private OptionsPanelPresentation optionsPanel;

    private OptionsPanelEmployee optionsPanelEmployee;
    private ShowMyProfilePanel showMyProfilePanel;
    private EditMyProfilePanel editMyProfilePanel;

    private OptionsPanelAdmin optionsPanelAdmin;
    private ValidationShowEmployeePanel validationShowEmployeePanel;
    private ShowEmployee showEmployeePanel;
    private ValidationEditEmployeePanel editEmployeeValidationPanel;
    private EditEmployeePanel editEmployeePanel;
    private ValidationDeleteEmployeePanel deleteEmployeeValidationPanel;
    private AddEmployeePanel addEmployeePanel;
    private ValidationShowTeam validationShowTeamPanel;
    private ShowTeamPanel showTeamPanel;
    private ValidationEditTeam validationEditTeamPanel;
    private EditTeamPanel editTeamPanel;
    private AddTeamPanel addTeamPanel;
    private ValidationDeleteTeamPanel deleteTeamPanel;
    private ValidationPayrollEmployeePanel validationPayrollEmployeePanel;
    private PayrollEmployeePanel payrollEmployeePanel;
    private PayrollGeneralEmployeesPanel payrollGeneralEmployeesPanel;
    private UserPresentation userPresentation;
    private ShowPayrollDialog showPayrollDialog;

    public MyFrame(ActionListener listener) {
        this.setSize(1080, 920);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("My Frame");
        this.setLayout(new BorderLayout());
        initComponents(listener);
        this.setVisible(true);
    }

    public void initComponents(ActionListener listener) {
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        presentationPanel = new InitialPresentation(listener);
        presentationPanel.setSize(1080, 100);
        presentationPanel.setBackground(Color.WHITE);
        contentPane.add(presentationPanel, BorderLayout.NORTH);

        optionsPanel = new OptionsPanelPresentation(listener);
        optionsPanel.setPreferredSize(new Dimension(200, 920));
        optionsPanel.setBackground(Color.decode("#272727"));
        contentPane.add(optionsPanel, BorderLayout.WEST);

        validationDataPanel = new ValidationDataPanel(listener);
        validationDataPanel.setSize(780, 920);
        validationDataPanel.setBackground(new Color(0, 125, 125));
        contentPane.add(validationDataPanel, BorderLayout.CENTER);

        this.setContentPane(contentPane);
    }

    public void switchPresentation(boolean isUser, ActionListener listener) {
        if (isUser) {
            this.remove(presentationPanel);
        }
        userPresentation = new UserPresentation(listener);
        userPresentation.setSize(1080, 100);
        userPresentation.setBackground(Color.WHITE);
        this.add(userPresentation, BorderLayout.NORTH);
        this.revalidate();
        this.repaint();
    }

    public void switchToPanelPresentation(ActionListener listener) {
        removePanels();
        removePanel(showMyProfilePanel);
        removePanel(editMyProfilePanel);
        removePanel(optionsPanelAdmin);
        removePanel(optionsPanelEmployee);
        removePanel(userPresentation);
        createAndShowPanel(validationDataPanel, listener);
        presentationPanel = new InitialPresentation(listener);
        presentationPanel.setSize(1080, 100);
        presentationPanel.setBackground(Color.WHITE);
        this.add(presentationPanel, BorderLayout.NORTH);
        this.revalidate();
        this.repaint();
        optionsPanel = new OptionsPanelPresentation(listener);
        optionsPanel.setPreferredSize(new Dimension(200, 920));
        optionsPanel.setBackground(Color.decode("#272727"));
        this.add(optionsPanel, BorderLayout.WEST);
        this.revalidate();
        this.repaint();
    }

    public void switchToPanelOptions(boolean isAdmin, boolean isEmployee, ActionListener listener) {
        if (optionsPanelEmployee != null) {
            this.remove(optionsPanelEmployee);
        }
        if (optionsPanelAdmin != null) {
            this.remove(optionsPanelAdmin);
        }

        if (optionsPanel != null) {
            this.remove(optionsPanel);
        }
        if (isEmployee && !isAdmin) {
            optionsPanelEmployee = new OptionsPanelEmployee(listener);
            optionsPanelEmployee.setPreferredSize(new Dimension(200, 920));
            optionsPanelEmployee.setBackground(Color.decode("#272727"));
            this.add(optionsPanelEmployee, BorderLayout.WEST);
        } else if (isAdmin && !isEmployee) {
            optionsPanelAdmin = new OptionsPanelAdmin(listener);
            optionsPanelAdmin.setPreferredSize(new Dimension(200, 920));
            optionsPanelAdmin.setBackground(Color.decode("#272727"));
            this.add(optionsPanelAdmin, BorderLayout.WEST);
        }
        this.revalidate();
        this.repaint();
    }

    public void switchToPanelRole(boolean isAdmin, boolean isEmployee, ActionListener listener, String[] employee) {
        if (validationDataPanel != null) {
            this.remove(validationDataPanel);
        }
        if (validationShowEmployeePanel != null) {
            this.remove(validationShowEmployeePanel);
        }
        if (isAdmin && !isEmployee) {
            validationShowEmployeePanel = new ValidationShowEmployeePanel(listener);
            validationShowEmployeePanel.setSize(780, 920);
            this.add(validationShowEmployeePanel, BorderLayout.CENTER);
        }
        if (isEmployee && !isAdmin) {
            showMyProfilePanel = new ShowMyProfilePanel(listener);
            showMyProfilePanel.setSize(780, 920);
            this.add(showMyProfilePanel, BorderLayout.CENTER);
            setFieldsToMyProfile(employee);
        }
        this.revalidate();
        this.repaint();
    }

    public void switchToPanelEmployee(int casePanel, ActionListener listener) {
        switch (casePanel) {
            case 1:
                handleShowMyProfile(listener);
                break;
            case 2:
                handleEditMyProfile(listener);
                break;
        }
    }

    public void handleShowMyProfile(ActionListener listener) {
        removePanel(editMyProfilePanel);
        removePanel(showMyProfilePanel);

        showMyProfilePanel = new ShowMyProfilePanel(listener);
        showMyProfilePanel.setSize(780, 920);
        this.add(showMyProfilePanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void handleEditMyProfile(ActionListener listener) {
        removePanel(showMyProfilePanel);
        removePanel(editMyProfilePanel);
        editMyProfilePanel = new EditMyProfilePanel(listener);
        editMyProfilePanel.setSize(780, 920);
        this.add(editMyProfilePanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void switchToPanelAdmin(int casePanel, ActionListener listener) {
        switch (casePanel) {
            case 1:
                handleShowEmployeeValidation(listener);
                break;
            case 2:
                handleShowEmployee(listener);
                break;
            case 3:
                handleEditEmployeeValidation(listener);
                break;
            case 4:
                handleEditEmployee(listener);
                break;
            case 5:
                handleDeleteEmployeeValidation(listener);
                break;
            case 6:
                handleAddEmployee(listener);
                break;
            case 7:
                handleShowTeamValidation(listener);
                break;
            case 8:
                handleShowTeam(listener);
                break;
            case 9:
                handleEditTeamValidation(listener);
                break;
            case 10:
                handleEditTeam(listener);
                break;
            case 11:
                handleAddTeamValidation(listener);
                break;
            case 12:
                handleDeleteTeamValidation(listener);
                break;
            case 13:
                handleSearchPayrollEmployee(listener);
                break;
            case 14:
                handlePayrollEmployee(listener);
                break;
        }
    }

    public void switchToPayrollGeneral(ActionListener listener,
            List<String> names, List<String> teams, List<String> ids, List<String> isLeaders,
            List<String> salaryGrosses,
            List<String> healthContributionsEmployees, List<String> pensionContributionsEmployees,
            List<String> healthContributionsEmployers, List<String> pensionContributionsEmployers,
            List<String> transportAids, List<String> productivityBonuses,
            List<String> quantityExtraHoursDays, List<String> valueExtraHoursDays,
            List<String> quantityExtraHoursNights, List<String> valueExtraHoursNights,
            List<String> quantityExtraHoursSundaysDays, List<String> valueExtraHoursSundaysDays,
            List<String> quantityExtraHoursSundaysNights, List<String> valueExtraHoursSundaysNights,
            List<String> totalPays) {
        removePanel(payrollGeneralEmployeesPanel);
        payrollGeneralEmployeesPanel = new PayrollGeneralEmployeesPanel(listener, names, teams, ids, isLeaders,
                salaryGrosses,
                healthContributionsEmployees, pensionContributionsEmployees,
                healthContributionsEmployers, pensionContributionsEmployers,
                transportAids, productivityBonuses,
                quantityExtraHoursDays, valueExtraHoursDays,
                quantityExtraHoursNights, valueExtraHoursNights,
                quantityExtraHoursSundaysDays, valueExtraHoursSundaysDays,
                quantityExtraHoursSundaysNights, valueExtraHoursSundaysNights, totalPays);
        createAndShowPanel(payrollGeneralEmployeesPanel, listener);
    }

    public void removePanels() {
        removePanel(validationShowEmployeePanel);
        removePanel(showEmployeePanel);
        removePanel(editEmployeeValidationPanel);
        removePanel(editEmployeePanel);
        removePanel(deleteEmployeeValidationPanel);
        removePanel(addEmployeePanel);
        removePanel(validationShowTeamPanel);
        removePanel(showTeamPanel);
        removePanel(validationEditTeamPanel);
        removePanel(editTeamPanel);
        removePanel(addTeamPanel);
        removePanel(deleteTeamPanel);
        removePanel(validationPayrollEmployeePanel);
        removePanel(payrollEmployeePanel);
        removePanel(payrollGeneralEmployeesPanel);
    }

    private void removePanel(Component panel) {
        if (panel != null) {
            this.remove(panel);
        }
    }

    private void createAndShowPanel(Component newPanel, ActionListener listener) {
        removePanels();
        newPanel.setSize(780, 920);
        this.add(newPanel, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    public void handleShowEmployeeValidation(ActionListener listener) {
        removePanel(validationShowEmployeePanel);
        validationShowEmployeePanel = new ValidationShowEmployeePanel(listener);
        createAndShowPanel(validationShowEmployeePanel, listener);
    }

    public void handleShowEmployee(ActionListener listener) {
        removePanel(showEmployeePanel);
        showEmployeePanel = new ShowEmployee(listener);
        createAndShowPanel(showEmployeePanel, listener);
    }

    public void handleEditEmployeeValidation(ActionListener listener) {
        removePanel(editEmployeeValidationPanel);
        editEmployeeValidationPanel = new ValidationEditEmployeePanel(listener);
        createAndShowPanel(editEmployeeValidationPanel, listener);
    }

    public void handleEditEmployee(ActionListener listener) {
        removePanel(editEmployeePanel);
        editEmployeePanel = new EditEmployeePanel(listener);
        createAndShowPanel(editEmployeePanel, listener);
    }

    public void handleDeleteEmployeeValidation(ActionListener listener) {
        removePanel(deleteEmployeeValidationPanel);
        deleteEmployeeValidationPanel = new ValidationDeleteEmployeePanel(listener);
        createAndShowPanel(deleteEmployeeValidationPanel, listener);
    }

    public void handleAddEmployee(ActionListener listener) {
        removePanel(addEmployeePanel);
        addEmployeePanel = new AddEmployeePanel(listener);
        createAndShowPanel(addEmployeePanel, listener);
    }

    public void handleShowTeamValidation(ActionListener listener) {
        removePanel(validationShowTeamPanel);
        validationShowTeamPanel = new ValidationShowTeam(listener);
        createAndShowPanel(validationShowTeamPanel, listener);
    }

    public void handleShowTeam(ActionListener listener) {
        removePanel(showTeamPanel);
        showTeamPanel = new ShowTeamPanel(listener);
        createAndShowPanel(showTeamPanel, listener);
    }

    public void handleEditTeamValidation(ActionListener listener) {
        removePanel(validationEditTeamPanel);
        validationEditTeamPanel = new ValidationEditTeam(listener);
        createAndShowPanel(validationEditTeamPanel, listener);
    }

    public void handleEditTeam(ActionListener listener) {
        removePanel(editTeamPanel);
        editTeamPanel = new EditTeamPanel(listener);
        createAndShowPanel(editTeamPanel, listener);
    }

    public void handleAddTeamValidation(ActionListener listener) {
        removePanel(addTeamPanel);
        addTeamPanel = new AddTeamPanel(listener);
        createAndShowPanel(addTeamPanel, listener);
    }

    public void handleDeleteTeamValidation(ActionListener listener) {
        removePanel(deleteTeamPanel);
        deleteTeamPanel = new ValidationDeleteTeamPanel(listener);
        createAndShowPanel(deleteTeamPanel, listener);
    }

    public void handleSearchPayrollEmployee(ActionListener listener) {
        removePanel(validationPayrollEmployeePanel);
        validationPayrollEmployeePanel = new ValidationPayrollEmployeePanel(listener);
        createAndShowPanel(validationPayrollEmployeePanel, listener);
    }

    public void handlePayrollEmployee(ActionListener listener) {
        removePanel(payrollEmployeePanel);
        payrollEmployeePanel = new PayrollEmployeePanel(listener);
        createAndShowPanel(payrollEmployeePanel, listener);
    }

    public void showErrorMessage(String message) {
        validationDataPanel.setError(message);
    }

    public void setMessageUpdateMyProfile(String message, boolean isCorrect) {
        if (isCorrect) {
            editMyProfilePanel.setMessageSuccess(message);
        } else {
            editMyProfilePanel.setMessageError(message);
        }
    }

    public void setMessageUpdateEmployee(String message, boolean isCorrect) {
        if (isCorrect) {
            editEmployeePanel.setMessageSuccess(message);
        } else {
            editEmployeePanel.setMessageError(message);
        }
    }

    public void setMessageAddEmployee(String message, boolean isCorrect) {
        if (isCorrect) {
            addEmployeePanel.setMessageSuccess(message);
        } else {
            addEmployeePanel.setMessageError(message);
        }
    }

    public void setFieldsToMyProfile(String[] employee) {
        showMyProfilePanel.setFieldsEmployee(employee);
    }

    public void setFieldsToMyProfileEdit(String[] employee) {
        editMyProfilePanel.setFieldsEmployee(employee);
    }

    public void setFieldsToShowEmployee(String[] employee) {
        showEmployeePanel.setFieldsEmployee(employee);
    }

    public void setFieldsToEditEmployee(String[] employee) {
        editEmployeePanel.setFieldsEmployee(employee);
    }

    public void setFieldIdTeamEditable(boolean value) {
        editEmployeePanel.setIdTeamEditable(value);
    }

    public void setFieldIsLeaderEditable(boolean value) {
        editEmployeePanel.setIsLeaderEditable(value);
    }

    public void setFieldsToShowTeam(String[] team) {
        showTeamPanel.setFields(team);
    }

    public void setFieldsToEditTeam(String[] team) {
        editTeamPanel.setFields(team);
    }

    public void setFieldsToPayrollEmployee(String[] employee, String[] paymentData) {
        payrollEmployeePanel.setFieldsEmployee(employee, paymentData);
    }

    public void setFieldNameSearchEmployeeShow(String name) {
        validationShowEmployeePanel.setTextFieldName(name);
    }

    public void setFieldJobSearchEmployeeShow(String job) {
        validationShowEmployeePanel.setTextFieldJob(job);
    }

    public void setFieldNameEditEmployeeEdit(String name) {
        editEmployeeValidationPanel.setTextFieldName(name);
    }

    public void setFieldJobEditEmployeeEdit(String job) {
        editEmployeeValidationPanel.setTextFieldJob(job);
    }

    public void setFieldNameDeleteEmployee(String name) {
        deleteEmployeeValidationPanel.setTextFieldName(name);
    }

    public void setFieldJobDeleteEmployee(String job) {
        deleteEmployeeValidationPanel.setTextFieldJob(job);
    }

    public void setFieldNamePayrollEmployee(String name) {
        validationPayrollEmployeePanel.setTextFieldName(name);
    }

    public void setFieldJobPayrollEmployee(String job) {
        validationPayrollEmployeePanel.setTextFieldJob(job);
    }

    public void setFieldNameSearchTeamShow(String name) {
        validationShowTeamPanel.setTextFieldName(name);
    }

    public void setFieldAreaSearchTeamShow(String area) {
        validationShowTeamPanel.setTextFieldJob(area);
    }

    public void setFieldNameEditTeamEdit(String name) {
        validationEditTeamPanel.setTextFieldName(name);
    }

    public void setFieldAreaEditTeamEdit(String area) {
        validationEditTeamPanel.setTextFieldJob(area);
    }

    public void setFieldNameDeleteTeam(String name) {
        deleteTeamPanel.setTextFieldName(name);
    }

    public void setFieldAreaDeleteTeam(String area) {
        deleteTeamPanel.setTextFieldJob(area);
    }

    public String getIdEditEmployee() {
        return editEmployeeValidationPanel.getIdField().getText();
    }

    public String getIdSearchEmployeeShow() {
        return validationShowEmployeePanel.getIdField().getText();
    }

    public String getIdDeleteEmployee() {
        return deleteEmployeeValidationPanel.getIdField().getText();
    }

    public String getIdPayrollEmployee() {
        return validationPayrollEmployeePanel.getIdField().getText();
    }

    public String getIdSearchTeamShow() {
        return validationShowTeamPanel.getIdField().getText();
    }

    public String getIdEditTeam() {
        return validationEditTeamPanel.getIdField().getText();
    }

    public String getIdDeleteTeam() {
        return deleteTeamPanel.getIdField().getText();
    }

    public ArrayList<String> getFieldsEditMyProfile() {
        return editMyProfilePanel.getFields();
    }

    public ArrayList<String> getFieldsEditEmployee() {
        return editEmployeePanel.getFields();
    }

    public ArrayList<String> getFieldsAddEmployee() {
        return addEmployeePanel.getFields();
    }

    public ArrayList<String> getFieldsAddTeam() {
        return addTeamPanel.getFields();
    }

    public ArrayList<String> getFieldsEditTeam() {
        return editTeamPanel.getFields();
    }

    public String getFieldId() {
        return validationDataPanel.getIdField().getText();
    }

    public String getFieldYearBirth() {
        return validationDataPanel.getYearBirthField().getText();
    }

    public void setMessageUpdateTeam(String message, boolean isCorrect) {
        if (isCorrect) {
            editTeamPanel.setMessageSuccess(message);
        } else {
            editTeamPanel.setMessageError(message);
        }
    }

    public void setMessageAddTeam(String message, boolean isCorrect) {
        if (isCorrect) {
            addTeamPanel.setMessageSuccess(message);
        } else {
            addTeamPanel.setMessageError(message);
        }
    }

    public void setMessageSearchEmployee(String message) {
        validationShowEmployeePanel.setMessage(message);
    }

    public void setMessageEditEmployee(String message) {
        editEmployeeValidationPanel.setMessage(message);
    }

    public void setMessageDeleteEmployee(String message) {
        deleteEmployeeValidationPanel.setMessage(message);
    }

    public void setMessagePayrollEmployee(String message) {
        validationPayrollEmployeePanel.setMessage(message);
    }

    public void setMessageSearchTeam(String message) {
        validationShowTeamPanel.setMessage(message);
    }

    public void setMessageEditTeam(String message) {
        validationEditTeamPanel.setMessage(message);
    }

    public void setMessageDeleteTeam(String message) {
        deleteTeamPanel.setMessage(message);
    }

    public ArrayList<String> getFieldsPayrollEmployee() {
        return payrollEmployeePanel.getFields();
    }

    public void setMessagePayrollEmployeeIndividual(String message) {
        payrollEmployeePanel.setMessage(message);
    }

    public void setFieldsNewPayrollEmployee(ArrayList<String> fields) {
        payrollEmployeePanel.setFieldsNewData(fields);
    }

    public void showPayrollDataEmployeeDialog(ActionListener listener, String[] dataPayment, String[] employee) {
        showPayrollDialog = new ShowPayrollDialog(listener, dataPayment, employee);
    }

}
