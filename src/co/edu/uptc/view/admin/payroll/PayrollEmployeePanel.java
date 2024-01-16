package co.edu.uptc.view.admin.payroll;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.view.resources.ButtonSearchUI;

public class PayrollEmployeePanel extends JPanel {

        private JLabel title, titlePersonalInformation, titleSalaryInformation, titlePaymentInformation,
                        titleBenefitsInformation;
        private JLabel labelName, labelLastName, labelId;
        private JLabel labelGrossSalary, labelEmployeeHealthContribution, labelEmployeePensionContribution,
                        labelCompanyHealthContribution, labelCompanyPensionContribution, labelNetSalary,
                        labelTransportAid;

        private JLabel labelAvailableDays, labelDaysTaken, totalDays;
        private JLabel labelProductivityBonusPercentage, laberProductivityBonus, labelMedicalAssistance, labelEPS;
        private JLabel labelExtraHoursDay, labelValueExtraHoursDay, labelExtraHoursNight, labelValueExtraHoursNight,
                        labelSundayExtraHoursDay, labelValueSundayExtraHoursDay, labelTotalExtraHours,
                        labelSundayExtraHoursNight, labelValueSundayExtraHoursNight;

        private JTextField textFieldName, textFieldLastName, textFieldId;
        private JTextField textFieldGrossSalary, textFieldEmployeeHealthContribution,
                        textFieldEmployeePensionContribution,
                        textFieldCompanyHealthContribution, textFieldCompanyPensionContribution, textFieldNetSalary,
                        textFieldTransportAid;
        private JTextField textFieldAvailableDays, textFieldDaysTaken, textFieldTotalDays;
        private JTextField textFieldProductivityBonusPercentage, textFieldProductivityBonus, textFieldMedicalAssistance,
                        textFieldEPS;
        private JTextField textFieldExtraHoursDay, textFieldValueExtraHoursDay, textFieldExtraHoursNight,
                        textFieldValueExtraHoursNight, textFieldSundayExtraHoursDay, textFieldValueSundayExtraHoursDay,
                        textFieldTotalExtraHours, textFieldSundayExtraHoursNight, textFieldValueSundayExtraHoursNight;
        private Image backgroundImage;
        private JButton loadButton;
        private ArrayList<String> lockedList;
        public JLabel message;

        public PayrollEmployeePanel(ActionListener listener) {
                initializeTextFields();
                lockedListFields();
                this.revalidate();
                this.repaint();
                firstColumn(listener);
        }

        public void lockedListFields() {
                lockedList = new ArrayList<>();
                lockedList.add("Nombre");
                lockedList.add("Apellido");
                lockedList.add("Identificación");
                lockedList.add("Aporte salud empleado");
                lockedList.add("Aporte pensión empleado");
                lockedList.add("Aporte salud empresa");
                lockedList.add("Aporte pensión empresa");
                lockedList.add("Salario neto");
                lockedList.add("Auxilio de transporte");
                lockedList.add("Valor del bono de productividad");
                lockedList.add("Días disponibles");
                lockedList.add("Total días");
                lockedList.add("Valor horas extra diurnas");
                lockedList.add("Valor horas extra nocturnas");
                lockedList.add("Valor horas extra diurnas dominicales");
                lockedList.add("Valor horas extra nocturnas dominicales");
                lockedList.add("Valor total horas extra");

        }

        public void initializeTextFields() {
                textFieldName = new JTextField(10);
                textFieldLastName = new JTextField(10);
                textFieldId = new JTextField(10);
                textFieldGrossSalary = new JTextField(10);
                textFieldEmployeeHealthContribution = new JTextField(10);
                textFieldEmployeePensionContribution = new JTextField(10);
                textFieldCompanyHealthContribution = new JTextField(10);
                textFieldCompanyPensionContribution = new JTextField(10);
                textFieldNetSalary = new JTextField(10);
                textFieldTransportAid = new JTextField(10);
                textFieldAvailableDays = new JTextField(10);
                textFieldDaysTaken = new JTextField(10);
                textFieldProductivityBonusPercentage = new JTextField(10);
                textFieldProductivityBonus = new JTextField(10);
                textFieldMedicalAssistance = new JTextField(10);
                textFieldEPS = new JTextField(10);
                textFieldExtraHoursDay = new JTextField(10);
                textFieldValueExtraHoursDay = new JTextField(10);
                textFieldExtraHoursNight = new JTextField(10);
                textFieldValueExtraHoursNight = new JTextField(10);
                textFieldSundayExtraHoursDay = new JTextField(10);
                textFieldValueSundayExtraHoursDay = new JTextField(10);
                textFieldTotalExtraHours = new JTextField(10);
                textFieldSundayExtraHoursNight = new JTextField(10);
                textFieldValueSundayExtraHoursNight = new JTextField(10);
                textFieldTotalDays = new JTextField(10);
        }

        private void firstColumn(ActionListener listener) {
                this.setLayout(new GridBagLayout());
                backgroundImage = new ImageIcon("src/co/edu/uptc/view/assets/img/addEmployee.jpg").getImage();
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(5, 5, 5, 5);

                title = new JLabel("Nómina del empleado");
                title.setFont(new Font("Segoe UI", Font.BOLD, 35));
                title.setForeground(Color.WHITE);
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.gridwidth = 6;
                gbc.anchor = GridBagConstraints.CENTER;
                add(title, gbc);

                titlePersonalInformation = new JLabel("Información Personal");
                titlePersonalInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titlePersonalInformation.setForeground(Color.WHITE);
                gbc.gridy = 1;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titlePersonalInformation, gbc);

                gbc.gridy = 2;
                addLabelAndTextFieldFirstColumn(labelName, textFieldName, "Nombre:", gbc);
                gbc.gridy = 3;
                addLabelAndTextFieldFirstColumn(labelLastName, textFieldLastName, "Apellido:", gbc);
                gbc.gridy = 4;
                addLabelAndTextFieldFirstColumn(labelId, textFieldId, "Identificación:", gbc);

                titleSalaryInformation = new JLabel("Información Salarial");
                titleSalaryInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleSalaryInformation.setForeground(Color.WHITE);
                gbc.gridy = 5;
                gbc.gridx = 0;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleSalaryInformation, gbc);

                gbc.gridy = 6;
                addLabelAndTextFieldFirstColumn(labelGrossSalary, textFieldGrossSalary, "Salario bruto:", gbc);
                gbc.gridy = 7;
                addLabelAndTextFieldFirstColumn(labelEmployeeHealthContribution, textFieldEmployeeHealthContribution,
                                "Aporte salud empleado:", gbc);
                gbc.gridy = 8;
                addLabelAndTextFieldFirstColumn(labelEmployeePensionContribution, textFieldEmployeePensionContribution,
                                "Aporte pensión empleado:", gbc);
                gbc.gridy = 9;
                addLabelAndTextFieldFirstColumn(labelCompanyHealthContribution, textFieldCompanyHealthContribution,
                                "Aporte salud empresa:", gbc);
                gbc.gridy = 10;
                addLabelAndTextFieldFirstColumn(labelCompanyPensionContribution, textFieldCompanyPensionContribution,
                                "Aporte pensión empresa:", gbc);
                gbc.gridy = 11;
                addLabelAndTextFieldFirstColumn(labelTransportAid, textFieldTransportAid, "Auxilio de transporte:",
                                gbc);

                gbc.gridy = 12;
                addLabelAndTextFieldFirstColumn(labelNetSalary, textFieldNetSalary, "Salario neto:", gbc);

                titleBenefitsInformation = new JLabel("Información de Beneficios");
                titleBenefitsInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleBenefitsInformation.setForeground(Color.WHITE);
                gbc.gridy = 13;
                gbc.gridx = 0;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleBenefitsInformation, gbc);

                gbc.gridy = 14;
                addLabelAndTextFieldFirstColumn(labelProductivityBonusPercentage, textFieldProductivityBonusPercentage,
                                "Porcentaje bono productividad:", gbc);
                gbc.gridy = 15;
                addLabelAndTextFieldFirstColumn(laberProductivityBonus, textFieldProductivityBonus,
                                "Valor del bono de productividad:", gbc);

                gbc.gridy = 16;
                addLabelAndTextFieldFirstColumn(labelMedicalAssistance, textFieldMedicalAssistance,
                                "Medicina prepagada:", gbc);
                gbc.gridy = 17;
                addLabelAndTextFieldFirstColumn(labelEPS, textFieldEPS, "EPS:", gbc);

                secondColumn(listener, gbc);
        }

        private void addLabelAndTextFieldFirstColumn(JLabel label, JTextField textField, String labelText,
                        GridBagConstraints gbc) {

                label = new JLabel(labelText);
                label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                label.setForeground(Color.WHITE);
                gbc.gridx = 0;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.EAST;
                add(label, gbc);

                String fieldName = label.getText().replace(":", "").trim();
                textField.setEditable(!lockedList.contains(fieldName));

                if (lockedList.contains(fieldName)) {
                        textField.setBackground(Color.LIGHT_GRAY);
                }

                textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                textField.setForeground(Color.BLACK);
                gbc.gridx = 1;
                gbc.gridwidth = 2;
                gbc.anchor = GridBagConstraints.WEST;
                add(textField, gbc);
        }

        private void secondColumn(ActionListener listener, GridBagConstraints gbc) {
                gbc = new GridBagConstraints();
                gbc.insets = new Insets(5, 5, 5, 5);
                titlePaymentInformation = new JLabel("Información vacacional");
                titlePaymentInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titlePaymentInformation.setForeground(Color.WHITE);
                gbc.gridx = 3;
                gbc.gridy = 1;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titlePaymentInformation, gbc);

                gbc.gridy = 2;
                addLabelAndTextFieldSecondColumn(labelAvailableDays, textFieldAvailableDays, "Días disponibles:", gbc);
                gbc.gridy = 3;
                addLabelAndTextFieldSecondColumn(labelDaysTaken, textFieldDaysTaken, "Días tomados:", gbc);
                gbc.gridy = 4;
                addLabelAndTextFieldSecondColumn(totalDays, textFieldTotalDays, "Total días:", gbc);

                titleBenefitsInformation = new JLabel("Información de horas extra");
                titleBenefitsInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleBenefitsInformation.setForeground(Color.WHITE);
                gbc.gridy = 5;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleBenefitsInformation, gbc);

                gbc.gridy = 6;
                addLabelAndTextFieldSecondColumn(labelExtraHoursDay, textFieldExtraHoursDay, "Horas extra diurnas:",
                                gbc);
                gbc.gridy = 7;
                addLabelAndTextFieldSecondColumn(labelValueExtraHoursDay, textFieldValueExtraHoursDay,
                                "Valor horas extra diurnas:", gbc);
                gbc.gridy = 8;
                addLabelAndTextFieldSecondColumn(labelExtraHoursNight, textFieldExtraHoursNight,
                                "Horas extra nocturnas:",
                                gbc);
                gbc.gridy = 9;
                addLabelAndTextFieldSecondColumn(labelValueExtraHoursNight, textFieldValueExtraHoursNight,
                                "Valor horas extra nocturnas:", gbc);
                gbc.gridy = 10;
                addLabelAndTextFieldSecondColumn(labelSundayExtraHoursDay, textFieldSundayExtraHoursDay,
                                "Horas extra diurnas dominicales:", gbc);
                gbc.gridy = 11;
                addLabelAndTextFieldSecondColumn(labelValueSundayExtraHoursDay, textFieldValueSundayExtraHoursDay,
                                "Valor horas extra diurnas dominicales:", gbc);
                gbc.gridy = 12;
                addLabelAndTextFieldSecondColumn(labelSundayExtraHoursNight, textFieldSundayExtraHoursNight,
                                "Horas extra nocturnas dominicales:",
                                gbc);
                gbc.gridy = 13;
                addLabelAndTextFieldSecondColumn(labelValueSundayExtraHoursNight, textFieldValueSundayExtraHoursNight,
                                "Valor horas extra nocturnas dominicales:", gbc);
                gbc.gridy = 14;
                addLabelAndTextFieldSecondColumn(labelTotalExtraHours, textFieldTotalExtraHours,
                                "Valor total horas extra:",
                                gbc);

                loadButton = new JButton("Cargar");
                loadButton.setUI(new ButtonSearchUI());
                loadButton.addActionListener(listener);
                loadButton.setActionCommand("loadEmployeePayroll");
                gbc.gridy = 15;
                gbc.gridx = 3;
                gbc.gridwidth = 3;
                gbc.anchor = GridBagConstraints.EAST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.ipady = 10;
                gbc.ipadx = 10;
                add(loadButton, gbc);

                message = new JLabel();
                message.setFont(new Font("Segoe UI", Font.BOLD, 10));
                message.setForeground(Color.RED);
                message.setHorizontalAlignment(JLabel.CENTER);
                message.setVerticalAlignment(JLabel.CENTER);
                gbc.gridy = 16;
                gbc.gridx = 3;
                gbc.gridwidth = 3;
                gbc.anchor = GridBagConstraints.CENTER;
                add(message, gbc);

        }

        private void addLabelAndTextFieldSecondColumn(JLabel label, JTextField textField, String labelText,
                        GridBagConstraints gbc) {
                label = new JLabel(labelText);
                label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                label.setForeground(Color.WHITE);
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.EAST;
                add(label, gbc);

                String fieldName = label.getText().replace(":", "").trim();
                textField.setEditable(!lockedList.contains(fieldName));

                if (lockedList.contains(fieldName)) {
                        textField.setBackground(Color.LIGHT_GRAY);
                }

                textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                textField.setForeground(Color.BLACK);
                gbc.gridx = 4;
                gbc.gridwidth = 2;
                gbc.anchor = GridBagConstraints.WEST;
                add(textField, gbc);
        }

        public void setTitle(String title) {
                this.title.setText(title);
        }

        public void setFieldsEmployee(String[] employee, String[] payroll) {
                setTextFieldName(employee[0]);
                setTextFieldLastName(employee[1]);
                setTextFieldId(employee[4]);
                setTextFieldGrossSalary(employee[24]);
                setTextFieldAvailableDays(employee[22]);
                setTextFieldDaysTaken(employee[23]);
                setTextFieldProductivityBonusPercentage(employee[21]);
                setTextFieldExtraHoursDay(employee[28]);
                setTextFieldExtraHoursNight(employee[29]);
                setTextFieldSundayExtraHoursDay(employee[30]);
                setTextFieldSundayExtraHoursNight(employee[31]);
                setTextFieldMedicalAssistance(employee[20]);
                setTextFieldEPS(employee[39]);

                setTextFieldValueSundayExtraHoursDay(payroll[0]);
                setTextFieldValueExtraHoursDay(payroll[1]);
                setTextFieldValueExtraHoursNight(payroll[2]);
                setTextFieldValueSundayExtraHoursNight(payroll[7]);

                setTextFieldTotalExtraHours(payroll[3]);
                setTextFieldCompanyHealthContribution(payroll[4]);
                setTextFieldCompanyPensionContribution(payroll[5]);
                setTextFieldProductivityBonus(payroll[6]);
                setTextFieldTotalDays(payroll[8]);

                setTextFieldTransportAid(payroll[9]);
                setTextFieldEmployeeHealthContribution(payroll[10]);
                setTextFieldEmployeePensionContribution(payroll[11]);
                setTextFieldNetSalary(payroll[12]);

        }

        public void setMessage(String message) {
                this.message.setText(message);
        }

        public void setTextFieldTotalDays(String value) {
                textFieldTotalDays.setText(value);
        }

        public void setTextFieldSundayExtraHoursNight(String value) {
                textFieldSundayExtraHoursNight.setText(value);
        }

        public void setTextFieldValueSundayExtraHoursNight(String value) {
                textFieldValueSundayExtraHoursNight.setText(value);
        }

        public void setTextFieldName(String value) {
                textFieldName.setText(value);
        }

        public void setTextFieldLastName(String value) {
                textFieldLastName.setText(value);
        }

        public void setTextFieldId(String value) {
                textFieldId.setText(value);
        }

        public void setTextFieldGrossSalary(String value) {
                textFieldGrossSalary.setText(value);
        }

        public void setTextFieldEmployeeHealthContribution(String value) {
                textFieldEmployeeHealthContribution.setText(value);
        }

        public void setTextFieldEmployeePensionContribution(String value) {
                textFieldEmployeePensionContribution.setText(value);
        }

        public void setTextFieldCompanyHealthContribution(String value) {
                textFieldCompanyHealthContribution.setText(value);
        }

        public void setTextFieldCompanyPensionContribution(String value) {
                textFieldCompanyPensionContribution.setText(value);
        }

        public void setTextFieldNetSalary(String value) {
                textFieldNetSalary.setText(value);
        }

        public void setTextFieldTransportAid(String value) {
                textFieldTransportAid.setText(value);
        }

        public void setTextFieldAvailableDays(String value) {
                textFieldAvailableDays.setText(value);
        }

        public void setTextFieldDaysTaken(String value) {
                textFieldDaysTaken.setText(value);
        }

        public void setTextFieldProductivityBonusPercentage(String value) {
                textFieldProductivityBonusPercentage.setText(value);
        }

        public void setTextFieldProductivityBonus(String value) {
                textFieldProductivityBonus.setText(value);
        }

        public void setTextFieldMedicalAssistance(String value) {
                textFieldMedicalAssistance.setText(value);
        }

        public void setTextFieldEPS(String value) {
                textFieldEPS.setText(value);
        }

        public void setTextFieldExtraHoursDay(String value) {
                textFieldExtraHoursDay.setText(value);
        }

        public void setTextFieldValueExtraHoursDay(String value) {
                textFieldValueExtraHoursDay.setText(value);
        }

        public void setTextFieldExtraHoursNight(String value) {
                textFieldExtraHoursNight.setText(value);
        }

        public void setTextFieldValueExtraHoursNight(String value) {
                textFieldValueExtraHoursNight.setText(value);
        }

        public void setTextFieldSundayExtraHoursDay(String value) {
                textFieldSundayExtraHoursDay.setText(value);
        }

        public void setTextFieldValueSundayExtraHoursDay(String value) {
                textFieldValueSundayExtraHoursDay.setText(value);
        }

        public void setTextFieldTotalExtraHours(String value) {
                textFieldTotalExtraHours.setText(value);
        }

        public JTextField getTextFieldName() {
                return textFieldName;
        }

        public JTextField getTextFieldLastName() {
                return textFieldLastName;
        }

        public JTextField getTextFieldId() {
                return textFieldId;
        }

        public JTextField getTextFieldGrossSalary() {
                return textFieldGrossSalary;
        }

        public JTextField getTextFieldEmployeeHealthContribution() {
                return textFieldEmployeeHealthContribution;
        }

        public JTextField getTextFieldEmployeePensionContribution() {
                return textFieldEmployeePensionContribution;
        }

        public JTextField getTextFieldCompanyHealthContribution() {
                return textFieldCompanyHealthContribution;
        }

        public JTextField getTextFieldCompanyPensionContribution() {
                return textFieldCompanyPensionContribution;
        }

        public JTextField getTextFieldNetSalary() {
                return textFieldNetSalary;
        }

        public JTextField getTextFieldTransportAid() {
                return textFieldTransportAid;
        }

        public JTextField getTextFieldAvailableDays() {
                return textFieldAvailableDays;
        }

        public JTextField getTextFieldDaysTaken() {
                return textFieldDaysTaken;
        }

        public JTextField getTextFieldProductivityBonusPercentage() {
                return textFieldProductivityBonusPercentage;
        }

        public JTextField getTextFieldProductivityBonus() {
                return textFieldProductivityBonus;
        }

        public JTextField getTextFieldMedicalAssistance() {
                return textFieldMedicalAssistance;
        }

        public JTextField getTextFieldEPS() {
                return textFieldEPS;
        }

        public JTextField getTextFieldExtraHoursDay() {
                return textFieldExtraHoursDay;
        }

        public JTextField getTextFieldValueExtraHoursDay() {
                return textFieldValueExtraHoursDay;
        }

        public JTextField getTextFieldExtraHoursNight() {
                return textFieldExtraHoursNight;
        }

        public JTextField getTextFieldValueExtraHoursNight() {
                return textFieldValueExtraHoursNight;
        }

        public JTextField getTextFieldSundayExtraHoursDay() {
                return textFieldSundayExtraHoursDay;
        }

        public JTextField getTextFieldValueSundayExtraHoursDay() {
                return textFieldValueSundayExtraHoursDay;
        }

        public JTextField getTextFieldTotalExtraHours() {
                return textFieldTotalExtraHours;
        }

        public JTextField getTextFieldSundayExtraHoursNight() {
                return textFieldSundayExtraHoursNight;
        }

        public JTextField getTextFieldValueSundayExtraHoursNight() {
                return textFieldValueSundayExtraHoursNight;
        }

        public JTextField getTextFieldTotalDays() {
                return textFieldTotalDays;
        }

        public ArrayList<String> getFields() {
                ArrayList<String> fields = new ArrayList<>();
                fields.add(textFieldName.getText());
                fields.add(textFieldLastName.getText());
                fields.add(textFieldId.getText());
                fields.add(textFieldGrossSalary.getText());
                fields.add(textFieldEmployeeHealthContribution.getText());
                fields.add(textFieldEmployeePensionContribution.getText());
                fields.add(textFieldCompanyHealthContribution.getText());
                fields.add(textFieldCompanyPensionContribution.getText());
                fields.add(textFieldNetSalary.getText());
                fields.add(textFieldTransportAid.getText());
                fields.add(textFieldAvailableDays.getText());
                fields.add(textFieldDaysTaken.getText());
                fields.add(textFieldProductivityBonusPercentage.getText());
                fields.add(textFieldProductivityBonus.getText());
                fields.add(textFieldMedicalAssistance.getText());
                fields.add(textFieldEPS.getText());
                fields.add(textFieldExtraHoursDay.getText());
                fields.add(textFieldValueExtraHoursDay.getText());
                fields.add(textFieldExtraHoursNight.getText());
                fields.add(textFieldValueExtraHoursNight.getText());
                fields.add(textFieldSundayExtraHoursDay.getText());
                fields.add(textFieldValueSundayExtraHoursDay.getText());
                fields.add(textFieldSundayExtraHoursNight.getText());
                fields.add(textFieldValueSundayExtraHoursNight.getText());
                fields.add(textFieldTotalExtraHours.getText());
                fields.add(textFieldTotalDays.getText());
                return fields;
        }

        @Override
        protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);

                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
                g2d.setColor(new Color(0, 0, 0));
                g2d.fillRect(0, 0, getWidth(), getHeight());
                g2d.dispose();
        }

        public void setFieldsNewData(ArrayList<String> calculePayroll) {
                setTextFieldProductivityBonus(calculePayroll.get(0));
                setTextFieldTotalDays(calculePayroll.get(1));
                setTextFieldCompanyHealthContribution(calculePayroll.get(2));
                setTextFieldCompanyPensionContribution(calculePayroll.get(3));
                setTextFieldEmployeeHealthContribution(calculePayroll.get(4));
                setTextFieldEmployeePensionContribution(calculePayroll.get(5));
                setTextFieldGrossSalary(calculePayroll.get(6));
                setTextFieldTotalExtraHours(calculePayroll.get(7));
                setTextFieldNetSalary(calculePayroll.get(9));
                this.revalidate();
                this.repaint();
        }

}
