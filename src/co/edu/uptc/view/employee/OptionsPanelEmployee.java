package co.edu.uptc.view.employee;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.view.resources.ButtonOptionsAdminUI;

public class OptionsPanelEmployee extends JPanel {
    private JButton showEmployee;
    private JButton editEmployee;
    private JButton payrollData;

    public OptionsPanelEmployee(ActionListener listener) {
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.ipadx = 30;
        gbc.ipady = 30;

        showEmployee = new JButton("Mi perfil");
        showEmployee.addActionListener(listener);
        showEmployee.setActionCommand("ShowMyProfile");
        showEmployee.setUI(new ButtonOptionsAdminUI());
        this.add(showEmployee, gbc);

        gbc.gridy = 1;
        editEmployee = new JButton("Editar mi perfil");
        editEmployee.addActionListener(listener);
        editEmployee.setActionCommand("EditMyProfile");
        editEmployee.setUI(new ButtonOptionsAdminUI());
        this.add(editEmployee, gbc);

        gbc.gridy = 2;
        payrollData = new JButton("Desprendible");
        payrollData.addActionListener(listener);
        payrollData.setActionCommand("PayrollDataEmployee");
        payrollData.setUI(new ButtonOptionsAdminUI());
        this.add(payrollData, gbc);

    }

}
