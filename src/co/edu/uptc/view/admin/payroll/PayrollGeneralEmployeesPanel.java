package co.edu.uptc.view.admin.payroll;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public class PayrollGeneralEmployeesPanel extends JPanel {

    private JTable table;

    public PayrollGeneralEmployeesPanel(ActionListener listener,
            List<String> names, List<String> teams, List<String> ids, List<String> isLeaders,
            List<String> salaryGrosses,
            List<String> healthContributionsEmployees, List<String> pensionContributionsEmployees,
            List<String> healthContributionsEmployers, List<String> pensionContributionsEmployers,
            List<String> transportAids, List<String> productivityBonuses,
            List<String> quantityExtraHoursDays, List<String> valueExtraHoursDays,
            List<String> quantityExtraHoursNights, List<String> valueExtraHoursNights,
            List<String> quantityExtraHoursSundaysDays, List<String> valueExtraHoursSundaysDays,
            List<String> quantityExtraHoursSundaysNights, List<String> valueExtraHoursSundaysNights,
            List<String> total) {
        this.setLayout(new GridBagLayout());
        initializeComponents(names, teams, ids, isLeaders, salaryGrosses,
                healthContributionsEmployees, pensionContributionsEmployees,
                healthContributionsEmployers, pensionContributionsEmployers,
                transportAids, productivityBonuses,
                quantityExtraHoursDays, valueExtraHoursDays,
                quantityExtraHoursNights, valueExtraHoursNights,
                quantityExtraHoursSundaysDays, valueExtraHoursSundaysDays,
                quantityExtraHoursSundaysNights, valueExtraHoursSundaysNights, total);
    }

    private void initializeComponents(List<String> names, List<String> teams, List<String> ids, List<String> isLeaders,
            List<String> salaryGrosses,
            List<String> healthContributionsEmployees, List<String> pensionContributionsEmployees,
            List<String> healthContributionsEmployers, List<String> pensionContributionsEmployers,
            List<String> transportAids, List<String> productivityBonuses,
            List<String> quantityExtraHoursDays, List<String> valueExtraHoursDays,
            List<String> quantityExtraHoursNights, List<String> valueExtraHoursNights,
            List<String> quantityExtraHoursSundaysDays, List<String> valueExtraHoursSundaysDays,
            List<String> quantityExtraHoursSundaysNights, List<String> valueExtraHoursSundaysNights,
            List<String> total) {
        JScrollPane scrollPane = initializeTable(names, teams, ids, isLeaders, salaryGrosses,
                healthContributionsEmployees, pensionContributionsEmployees,
                healthContributionsEmployers, pensionContributionsEmployers,
                transportAids, productivityBonuses,
                quantityExtraHoursDays, valueExtraHoursDays,
                quantityExtraHoursNights, valueExtraHoursNights,
                quantityExtraHoursSundaysDays, valueExtraHoursSundaysDays,
                quantityExtraHoursSundaysNights, valueExtraHoursSundaysNights, total);
        setTableFeatures(names);
        setTableGridFeatures(scrollPane);
    }

    private JScrollPane initializeTable(List<String> names, List<String> teams, List<String> ids,
            List<String> isLeaders, List<String> salaryGrosses,
            List<String> healthContributionsEmployees, List<String> pensionContributionsEmployees,
            List<String> healthContributionsEmployers, List<String> pensionContributionsEmployers,
            List<String> transportAids, List<String> productivityBonuses,
            List<String> quantityExtraHoursDays, List<String> valueExtraHoursDays,
            List<String> quantityExtraHoursNights, List<String> valueExtraHoursNights,
            List<String> quantityExtraHoursSundaysDays, List<String> valueExtraHoursSundaysDays,
            List<String> quantityExtraHoursSundaysNights, List<String> valueExtraHoursSundaysNights,
            List<String> total) {

        DefaultTableModel tableModel = new DefaultTableModel(0, 20) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableModel.setColumnIdentifiers(new Object[] { "Nombre", "Equipo", "ID", "Líder", "Salario Bruto",
                "Contribución Salud Empleados", "Contribución Pensión Empleados",
                "Contribución Salud Empleadores", "Contribución Pensión Empleadores",
                "Ayudas de Transporte", "Bonos de Productividad",
                "Cantidad Horas Extra Días", "Valor Horas Extra Días",
                "Cantidad Horas Extra Nocturnas", "Valor Horas Extra Nocturnas",
                "Cantidad Horas Extra Domingos Días", "Valor Horas Extra Domingos Días",
                "Cantidad Horas Extra Domingos Nocturnas", "Valor Horas Extra Domingos Nocturnas", "Total" });
        for (int i = 0; i < names.size(); i++) {
            tableModel.addRow(
                    new Object[] { names.get(i), teams.get(i), ids.get(i), isLeaders.get(i), salaryGrosses.get(i),
                            healthContributionsEmployees.get(i), pensionContributionsEmployees.get(i),
                            healthContributionsEmployers.get(i), pensionContributionsEmployers.get(i),
                            transportAids.get(i), productivityBonuses.get(i),
                            quantityExtraHoursDays.get(i), valueExtraHoursDays.get(i),
                            quantityExtraHoursNights.get(i), valueExtraHoursNights.get(i),
                            quantityExtraHoursSundaysDays.get(i), valueExtraHoursSundaysDays.get(i),
                            quantityExtraHoursSundaysNights.get(i), valueExtraHoursSundaysNights.get(i),
                            total.get(i) });
        }

        tableModel.addRow(new Object[] { "<html><b>Suma</b></html>", "", "", "",
                "<html><b><font color='red'>" + sumColumn(salaryGrosses) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(healthContributionsEmployees) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(pensionContributionsEmployees) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(healthContributionsEmployers) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(pensionContributionsEmployers) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(transportAids) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(productivityBonuses) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(quantityExtraHoursDays) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(valueExtraHoursDays) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(quantityExtraHoursNights) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(valueExtraHoursNights) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(quantityExtraHoursSundaysDays) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(valueExtraHoursSundaysDays) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(quantityExtraHoursSundaysNights) + "</font></b></html>",
                "<html><b><font color='red'>" + sumColumn(valueExtraHoursSundaysNights) + "</font></b></html>",
                "<html><b><font color='green'>" + sumColumn(total) + "</font></b></html>" });

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JLabel titleLabel = new JLabel("Nomina de Empleados");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel suggestionLabel = new JLabel("Se recomienda ver la tabla en pantalla completa");
        suggestionLabel.setFont(new Font("Arial", Font.ITALIC, 20));
        suggestionLabel.setForeground(Color.RED);
        suggestionLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(suggestionLabel, BorderLayout.SOUTH);

        return new JScrollPane(panel);
    }

    private int sumColumn(List<String> column) {
        int sum = 0;
        for (String value : column) {
            try {
                sum += Integer.parseInt(value);
            } catch (NumberFormatException ignored) {
            }
        }
        return sum;
    }

    private void setTableFeatures(List<String> names) {
        if (table != null && names != null && !names.isEmpty()) {
            for (String name : names) {
                if (name != null) {
                    table.getColumnModel().getColumn(0).setPreferredWidth(Math.max(name.length() * 10, 100));
                }
            }
        }
    }

    private void setTableGridFeatures(JScrollPane scrollPane) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        add(scrollPane, constraints);
    }

    public void updateData(List<String> names, List<String> teams, List<String> ids, List<Boolean> isLeaders,
            List<String> salaryGrosses,
            List<String> healthContributionsEmployees, List<String> pensionContributionsEmployees,
            List<String> healthContributionsEmployers, List<String> pensionContributionsEmployers,
            List<String> transportAids, List<String> productivityBonuses,
            List<String> quantityExtraHoursDays, List<String> valueExtraHoursDays,
            List<String> quantityExtraHoursNights, List<String> valueExtraHoursNights,
            List<String> quantityExtraHoursSundaysDays, List<String> valueExtraHoursSundaysDays,
            List<String> quantityExtraHoursSundaysNights, List<String> valueExtraHoursSundaysNights) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);

        for (int i = 0; i < names.size(); i++) {
            tableModel.addRow(
                    new Object[] { names.get(i), teams.get(i), ids.get(i), isLeaders.get(i), salaryGrosses.get(i),
                            healthContributionsEmployees.get(i), pensionContributionsEmployees.get(i),
                            healthContributionsEmployers.get(i), pensionContributionsEmployers.get(i),
                            transportAids.get(i), productivityBonuses.get(i),
                            quantityExtraHoursDays.get(i), valueExtraHoursDays.get(i),
                            quantityExtraHoursNights.get(i), valueExtraHoursNights.get(i),
                            quantityExtraHoursSundaysDays.get(i), valueExtraHoursSundaysDays.get(i),
                            quantityExtraHoursSundaysNights.get(i), valueExtraHoursSundaysNights.get(i) });
        }
    }
}
