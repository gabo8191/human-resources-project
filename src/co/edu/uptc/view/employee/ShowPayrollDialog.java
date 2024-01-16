package co.edu.uptc.view.employee;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class ShowPayrollDialog extends JDialog {

    private JLabel title, titleGrossSalary, titleProductivityBonus, titleHealthContribution, titlePensionContribution,
            titleTotalValueExtraHours, titleSalaryNet, titleAuxTransport;
    private JLabel valueGrossSalary, valueProductivityBonus, valueHealthContribution, valuePensionContribution,
            valueTotalValueExtraHours, valueSalaryNet, valueAuxTransport;

    public ShowPayrollDialog(ActionListener listener, String[] payrollData, String[] employeeData) {
        initComponents(payrollData, employeeData);
    }

    private void initComponents(String[] payrollData, String[] employeeData) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        setTitle("Desprendible");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        title = new JLabel("DESPRENDIBLE DE PAGO");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        add(title);

        titleGrossSalary = new JLabel("Salario bruto: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleGrossSalary, gbc);

        valueGrossSalary = new JLabel(employeeData[24]);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueGrossSalary, gbc);

        titleProductivityBonus = new JLabel("(+)Bonificación por productividad: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleProductivityBonus, gbc);

        valueProductivityBonus = new JLabel(payrollData[6]);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueProductivityBonus, gbc);

        titleHealthContribution = new JLabel("(-)Aporte a salud: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleHealthContribution, gbc);

        valueHealthContribution = new JLabel(payrollData[10]);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueHealthContribution, gbc);

        titlePensionContribution = new JLabel("(-)Aporte a pensión: ");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        add(titlePensionContribution, gbc);

        valuePensionContribution = new JLabel(payrollData[11]);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        add(valuePensionContribution, gbc);

        titleTotalValueExtraHours = new JLabel("(+)Valor total horas extras: ");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleTotalValueExtraHours, gbc);

        valueTotalValueExtraHours = new JLabel(payrollData[3]);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueTotalValueExtraHours, gbc);

        titleAuxTransport = new JLabel("(+)Auxilio de transporte: ");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleAuxTransport, gbc);

        valueAuxTransport = new JLabel(payrollData[9]);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueAuxTransport, gbc);

        titleSalaryNet = new JLabel("Salario neto: ");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        add(titleSalaryNet, gbc);

        valueSalaryNet = new JLabel(payrollData[12]);
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        add(valueSalaryNet, gbc);

    }

}
