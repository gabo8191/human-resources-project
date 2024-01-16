package co.edu.uptc.view.admin;

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

public class ShowEmployeeGeneralPanel extends JPanel {

        private JLabel title, titlePersonalInformation, titleJobInformation, titleBankInformation,
                        titleBenefitsInformation, titleVacationsInformation, titleSalaryInformation,
                        titleEducationInformation;
        private JLabel labelName, labelLastName, labelAge, labelGender, labelId, labelEmail, labelPhone, labelAddress,
                        labelCity, labelCountry, labelYearBirth, labelMonthBirth, labelDayBirth;
        private JLabel labelArea, labelPosition, labelIsAdmin, labelIsLeader, labelIdTeam;
        private JLabel labelBank, labelAccountNumber, labelAccountType;
        private JLabel labelHealthPrepaid, labelProductivityBonus, labelEPS;
        private JLabel labelVacations, labelVacationsTaken;
        private JLabel labelEducationLevel, labelEducationTitle, labelEducationInstitution, labelEducationYear;
        private JLabel labelSalaryGross, labelAuxTransport;
        private JTextField textFieldName, textFieldLastName, textFieldAge, textFieldGender, textFieldId, textFieldEmail,
                        textFieldPhone, textFieldAddress, textFieldCity, textFieldCountry, textFieldYearBirth,
                        textFieldMonthBirth, textFieldDayBirth;
        private JTextField textFieldArea, textFieldPosition, textFieldIsAdmin, textFieldIsLeader, textFieldIdTeam;
        private JTextField textFieldBank, textFieldAccountNumber, textFieldAccountType;
        private JTextField textFieldHealthPrepaid, textFieldProductivityBonus, textFieldEPS;
        private JTextField textFieldVacations, textFieldVacationsTaken;
        private JTextField textFieldEducationLevel, textFieldEducationTitle, textFieldEducationInstitution,
                        textFieldEducationYear;
        private JTextField textFieldSalaryGross, textFieldAuxTransport;
        private Image backgroundImage;
        private JButton buttonEdit;
        private JLabel messageSuccess, messageError, message;

        public ShowEmployeeGeneralPanel(ActionListener listener, String[] lockedList, String urlImage, boolean isEdit,
                        String textLbl, String command, boolean isProfile) {
                ArrayList<String> lockedListArray = new ArrayList<String>();
                for (String string : lockedList) {
                        lockedListArray.add(string);
                }
                initializeTextFields();
                this.revalidate();
                this.repaint();
                firstColumn(listener, lockedListArray, urlImage, isEdit, textLbl, command, isProfile);
        }

        private void initializeTextFields() {
                textFieldName = new JTextField(20);
                textFieldLastName = new JTextField(20);
                textFieldAge = new JTextField(20);
                textFieldGender = new JTextField(20);
                textFieldId = new JTextField(20);
                textFieldEmail = new JTextField(20);
                textFieldPhone = new JTextField(20);
                textFieldAddress = new JTextField(20);
                textFieldCity = new JTextField(20);
                textFieldCountry = new JTextField(20);
                textFieldYearBirth = new JTextField(20);
                textFieldMonthBirth = new JTextField(20);
                textFieldDayBirth = new JTextField(20);
                textFieldArea = new JTextField(20);
                textFieldPosition = new JTextField(20);
                textFieldIsAdmin = new JTextField(20);
                textFieldIsLeader = new JTextField(20);
                textFieldBank = new JTextField(20);
                textFieldAccountNumber = new JTextField(20);
                textFieldAccountType = new JTextField(20);
                textFieldHealthPrepaid = new JTextField(20);
                textFieldProductivityBonus = new JTextField(20);
                textFieldVacations = new JTextField(20);
                textFieldVacationsTaken = new JTextField(20);
                textFieldEducationLevel = new JTextField(20);
                textFieldEducationTitle = new JTextField(20);
                textFieldEducationInstitution = new JTextField(20);
                textFieldEducationYear = new JTextField(20);
                textFieldSalaryGross = new JTextField(20);
                textFieldAuxTransport = new JTextField(20);
                textFieldEPS = new JTextField(20);
                textFieldIdTeam = new JTextField(20);
        }

        private void firstColumn(ActionListener listener, ArrayList<String> lockedList, String urlImage,
                        boolean isEdit, String textLbl, String command, boolean isProfile) {
                this.setLayout(new GridBagLayout());
                backgroundImage = new ImageIcon(urlImage).getImage();
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(5, 5, 5, 5);

                title = new JLabel("Mostrar mi perfil");
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
                addLabelAndTextFieldFirstColumn(labelName, textFieldName, "Nombre:", gbc, lockedList);
                gbc.gridy = 3;
                addLabelAndTextFieldFirstColumn(labelLastName, textFieldLastName, "Apellido:", gbc, lockedList);
                gbc.gridy = 4;
                addLabelAndTextFieldFirstColumn(labelAge, textFieldAge, "Edad:", gbc, lockedList);
                gbc.gridy = 5;
                addLabelAndTextFieldFirstColumn(labelGender, textFieldGender, "Género:", gbc, lockedList);
                gbc.gridy = 6;
                addLabelAndTextFieldFirstColumn(labelId, textFieldId, "Identificación:", gbc, lockedList);
                gbc.gridy = 7;
                addLabelAndTextFieldFirstColumn(labelEmail, textFieldEmail, "Correo electrónico:", gbc, lockedList);
                gbc.gridy = 8;
                addLabelAndTextFieldFirstColumn(labelPhone, textFieldPhone, "Teléfono:", gbc, lockedList);
                gbc.gridy = 9;
                addLabelAndTextFieldFirstColumn(labelAddress, textFieldAddress, "Dirección:", gbc, lockedList);
                gbc.gridy = 10;
                addLabelAndTextFieldFirstColumn(labelCity, textFieldCity, "Ciudad:", gbc, lockedList);
                gbc.gridy = 11;
                addLabelAndTextFieldFirstColumn(labelCountry, textFieldCountry, "País:", gbc, lockedList);
                gbc.gridy = 12;
                addLabelAndTextFieldFirstColumn(labelYearBirth, textFieldYearBirth, "Año de nacimiento:", gbc,
                                lockedList);
                gbc.gridy = 13;
                addLabelAndTextFieldFirstColumn(labelMonthBirth, textFieldMonthBirth, "Mes de nacimiento:", gbc,
                                lockedList);
                gbc.gridy = 14;
                addLabelAndTextFieldFirstColumn(labelDayBirth, textFieldDayBirth, "Día de nacimiento:", gbc,
                                lockedList);

                titleJobInformation = new JLabel("Información Laboral");
                titleJobInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleJobInformation.setForeground(Color.WHITE);
                gbc.gridy = 15;
                gbc.gridx = 0;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleJobInformation, gbc);

                gbc.gridy = 16;
                addLabelAndTextFieldFirstColumn(labelArea, textFieldArea, "Área:", gbc, lockedList);
                gbc.gridy = 17;
                addLabelAndTextFieldFirstColumn(labelPosition, textFieldPosition, "Cargo:", gbc, lockedList);
                if (isEdit) {
                        gbc.gridy = 18;
                        message = new JLabel("Digite true si es líder o administrador y false si no lo es");
                        message.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 10));
                        message.setForeground(Color.WHITE);
                        add(message, gbc);
                }
                gbc.gridy++;
                addLabelAndTextFieldFirstColumn(labelIsAdmin, textFieldIsAdmin, "Es administrador:", gbc, lockedList);
                gbc.gridy++;
                addLabelAndTextFieldFirstColumn(labelIsLeader, textFieldIsLeader, "Es líder:", gbc, lockedList);

                if (isEdit && !isProfile) {
                        gbc.gridy++;
                        addLabelAndTextFieldFirstColumn(labelIdTeam, textFieldIdTeam, "Id del equipo:", gbc,
                                        lockedList);
                }

                secondColumn(listener, gbc, lockedList, isEdit, textLbl, command);
        }

        private void addLabelAndTextFieldFirstColumn(JLabel label, JTextField textField, String labelText,
                        GridBagConstraints gbc, ArrayList<String> lockedList) {
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

        private void secondColumn(ActionListener listener, GridBagConstraints gbc, ArrayList<String> lockedList,
                        boolean isEdit, String textLbl, String command) {
                gbc = new GridBagConstraints();
                gbc.insets = new Insets(5, 5, 5, 5);

                titleBenefitsInformation = new JLabel("Información de Beneficios");
                titleBenefitsInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleBenefitsInformation.setForeground(Color.WHITE);
                gbc.gridy = 1;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleBenefitsInformation, gbc);

                gbc.gridy = 2;
                addLabelAndTextFieldSecondColumn(labelHealthPrepaid, textFieldHealthPrepaid, "Prepagada:", gbc,
                                lockedList);
                gbc.gridy = 3;
                addLabelAndTextFieldSecondColumn(labelProductivityBonus, textFieldProductivityBonus,
                                "Bono de productividad:", gbc, lockedList);

                gbc.gridy = 4;
                addLabelAndTextFieldSecondColumn(labelEPS, textFieldEPS, "EPS:", gbc, lockedList);

                titleVacationsInformation = new JLabel("Información de Vacaciones");
                titleVacationsInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleVacationsInformation.setForeground(Color.WHITE);
                gbc.gridy = 5;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleVacationsInformation, gbc);

                gbc.gridy = 6;
                addLabelAndTextFieldSecondColumn(labelVacations, textFieldVacations, "Vacaciones:", gbc, lockedList);
                gbc.gridy = 7;
                addLabelAndTextFieldSecondColumn(labelVacationsTaken, textFieldVacationsTaken,
                                "Vacaciones tomadas:", gbc, lockedList);

                titleSalaryInformation = new JLabel("Información de Salario");
                titleSalaryInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleSalaryInformation.setForeground(Color.WHITE);
                gbc.gridy = 8;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleSalaryInformation, gbc);

                gbc.gridy = 9;
                addLabelAndTextFieldSecondColumn(labelSalaryGross, textFieldSalaryGross, "Salario bruto:", gbc,
                                lockedList);
                gbc.gridy = 10;
                addLabelAndTextFieldSecondColumn(labelAuxTransport, textFieldAuxTransport, "Auxilio de transporte:",
                                gbc, lockedList);

                titleEducationInformation = new JLabel("Información de Educación");
                titleEducationInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleEducationInformation.setForeground(Color.WHITE);
                gbc.gridy = 11;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleEducationInformation, gbc);

                gbc.gridy = 12;
                addLabelAndTextFieldSecondColumn(labelEducationLevel, textFieldEducationLevel, "Nivel de educación:",
                                gbc, lockedList);
                gbc.gridy = 13;
                addLabelAndTextFieldSecondColumn(labelEducationTitle, textFieldEducationTitle, "Título:", gbc,
                                lockedList);
                gbc.gridy = 14;
                addLabelAndTextFieldSecondColumn(labelEducationInstitution, textFieldEducationInstitution,
                                "Institución:", gbc, lockedList);
                gbc.gridy = 15;
                addLabelAndTextFieldSecondColumn(labelEducationYear, textFieldEducationYear, "Año de graduación:",
                                gbc, lockedList);

                titleBankInformation = new JLabel("Información Bancaria");
                titleBankInformation.setFont(new Font("Segoe UI", Font.BOLD, 15));
                titleBankInformation.setForeground(Color.WHITE);
                gbc.gridy = 16;
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.WEST;
                add(titleBankInformation, gbc);

                gbc.gridy = 17;
                addLabelAndTextFieldSecondColumn(labelBank, textFieldBank, "Banco:", gbc, lockedList);
                gbc.gridy = 18;
                addLabelAndTextFieldSecondColumn(labelAccountNumber, textFieldAccountNumber, "Número de cuenta:", gbc,
                                lockedList);
                gbc.gridy = 19;
                addLabelAndTextFieldSecondColumn(labelAccountType, textFieldAccountType, "Tipo de cuenta:", gbc,
                                lockedList);

                if (isEdit) {
                        buttonEdit = new JButton(textLbl);
                        buttonEdit.setUI(new ButtonSearchUI());
                        buttonEdit.addActionListener(listener);
                        buttonEdit.setActionCommand(command);
                        gbc.gridy = 20;
                        gbc.gridx = 3;
                        gbc.gridwidth = 3;
                        gbc.anchor = GridBagConstraints.EAST;
                        gbc.fill = GridBagConstraints.HORIZONTAL;
                        gbc.ipady = 10;
                        gbc.ipadx = 10;
                        add(buttonEdit, gbc);

                        messageSuccess = new JLabel();
                        messageSuccess.setFont(new Font("Segoe UI", Font.BOLD, 12));
                        messageSuccess.setForeground(Color.GREEN);
                        messageSuccess.setHorizontalAlignment(JLabel.CENTER);
                        messageSuccess.setVerticalAlignment(JLabel.CENTER);
                        gbc.gridy = 21;
                        add(messageSuccess, gbc);

                        messageError = new JLabel();
                        messageError.setFont(new Font("Segoe UI", Font.BOLD, 12));
                        messageError.setForeground(Color.RED);
                        messageError.setHorizontalAlignment(JLabel.CENTER);
                        messageError.setVerticalAlignment(JLabel.CENTER);
                        add(messageError, gbc);

                }
        }

        private void addLabelAndTextFieldSecondColumn(JLabel label, JTextField textField, String labelText,
                        GridBagConstraints gbc, ArrayList<String> lockedList) {
                label = new JLabel(labelText);
                label.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                label.setForeground(Color.WHITE);
                String fieldName = label.getText().replace(":", "").trim();
                gbc.gridx = 3;
                gbc.gridwidth = 1;
                gbc.anchor = GridBagConstraints.EAST;
                add(label, gbc);

                textField.setEditable(!lockedList.contains(fieldName));
                textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                if (lockedList.contains(fieldName)) {
                        textField.setBackground(Color.LIGHT_GRAY);
                }
                textField.setForeground(Color.BLACK);
                gbc.gridx = 4;
                gbc.gridwidth = 2;
                gbc.anchor = GridBagConstraints.WEST;
                add(textField, gbc);
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

        public void setTitle(String title) {
                this.title.setText(title);
        }

        public void setTextFieldName(String value) {
                textFieldName.setText(value);
        }

        public void setTextFieldEPS(String value) {
                textFieldEPS.setText(value);
        }

        public void setTextFieldLastName(String value) {
                textFieldLastName.setText(value);
        }

        public void setTextFieldAge(String value) {
                textFieldAge.setText(value);
        }

        public void setTextFieldGender(String value) {
                textFieldGender.setText(value);
        }

        public void setTextFieldId(String value) {
                textFieldId.setText(value);
        }

        public void setTextFieldEmail(String value) {
                textFieldEmail.setText(value);
        }

        public void setTextFieldPhone(String value) {
                textFieldPhone.setText(value);
        }

        public void setTextFieldAddress(String value) {
                textFieldAddress.setText(value);
        }

        public void setTextFieldCity(String value) {
                textFieldCity.setText(value);
        }

        public void setTextFieldCountry(String value) {
                textFieldCountry.setText(value);
        }

        public void setTextFieldYearBirth(String value) {
                textFieldYearBirth.setText(value);
        }

        public void setTextFieldMonthBirth(String value) {
                textFieldMonthBirth.setText(value);
        }

        public void setTextFieldDayBirth(String value) {
                textFieldDayBirth.setText(value);
        }

        public void setTextFieldArea(String value) {
                textFieldArea.setText(value);
        }

        public void setTextFieldPosition(String value) {
                textFieldPosition.setText(value);
        }

        public void setTextFieldIsAdmin(String value) {
                textFieldIsAdmin.setText(value);
        }

        public void setTextFieldIsLeader(String value) {
                textFieldIsLeader.setText(value);
        }

        public void setTextFieldBank(String value) {
                textFieldBank.setText(value);
        }

        public void setTextFieldAccountNumber(String value) {
                textFieldAccountNumber.setText(value);
        }

        public void setTextFieldAccountType(String value) {
                textFieldAccountType.setText(value);
        }

        public void setTextFieldHealthPrepaid(String value) {
                textFieldHealthPrepaid.setText(value);
        }

        public void setTextFieldProductivityBonus(String value) {
                textFieldProductivityBonus.setText(value);
        }

        public void setTextFieldVacations(String value) {
                textFieldVacations.setText(value);
        }

        public void setTextFieldVacationsTaken(String value) {
                textFieldVacationsTaken.setText(value);
        }

        public void setTextFieldEducationLevel(String value) {
                textFieldEducationLevel.setText(value);
        }

        public void setTextFieldEducationTitle(String value) {
                textFieldEducationTitle.setText(value);
        }

        public void setTextFieldEducationInstitution(String value) {
                textFieldEducationInstitution.setText(value);
        }

        public void setTextFieldEducationYear(String value) {
                textFieldEducationYear.setText(value);
        }

        public void setTextFieldSalaryGross(String value) {
                textFieldSalaryGross.setText(value);
        }

        public void setTextFieldAuxTransport(String value) {
                textFieldAuxTransport.setText(value);
        }

        public void setTextFieldIdTeam(String value) {
                textFieldIdTeam.setText(value);
        }

        public void setIdTeamEditable(boolean value) {
                textFieldIdTeam.setEditable(value);
                textFieldIdTeam.setBackground(Color.LIGHT_GRAY);
        }

        public void setIsLeaderEditable(boolean value) {
                textFieldIsLeader.setEditable(value);
                textFieldIsLeader.setBackground(Color.LIGHT_GRAY);
        }

        public void setFieldsEmployee(String[] employee) {
                setTextFieldName(employee[0]);
                setTextFieldLastName(employee[1]);
                setTextFieldAge(employee[2]);
                setTextFieldGender(employee[3]);
                setTextFieldId(employee[4]);
                setTextFieldEmail(employee[5]);
                setTextFieldPhone(employee[6]);
                setTextFieldAddress(employee[7]);
                setTextFieldCity(employee[8]);
                setTextFieldCountry(employee[9]);
                setTextFieldYearBirth(employee[10]);
                setTextFieldMonthBirth(employee[11]);
                setTextFieldDayBirth(employee[12]);
                setTextFieldArea(employee[13]);
                setTextFieldPosition(employee[14]);
                setTextFieldIsAdmin(employee[16]);
                setTextFieldIsLeader(employee[15]);
                setTextFieldBank(employee[17]);
                setTextFieldAccountNumber(employee[19]);
                setTextFieldAccountType(employee[18]);
                setTextFieldHealthPrepaid(employee[20]);
                setTextFieldProductivityBonus(employee[21]);
                setTextFieldVacations(employee[22]);
                setTextFieldVacationsTaken(employee[23]);
                setTextFieldSalaryGross(employee[24]);
                setTextFieldAuxTransport(employee[25]);
                setTextFieldEducationLevel(employee[34]);
                setTextFieldEducationTitle(employee[35]);
                setTextFieldEducationInstitution(employee[36]);
                setTextFieldEducationYear(employee[37]);
                setTextFieldIdTeam(employee[38]);
                setTextFieldEPS(employee[39]);
        }

        public JTextField getTextFieldIdTeam() {
                return textFieldIdTeam;
        }

        public JTextField getTextFieldName() {
                return textFieldName;
        }

        public JTextField getTextFieldLastName() {
                return textFieldLastName;
        }

        public JTextField getTextFieldAge() {
                return textFieldAge;
        }

        public JTextField getTextFieldGender() {
                return textFieldGender;
        }

        public JTextField getTextFieldId() {
                return textFieldId;
        }

        public JTextField getTextFieldEmail() {
                return textFieldEmail;
        }

        public JTextField getTextFieldPhone() {
                return textFieldPhone;
        }

        public JTextField getTextFieldAddress() {
                return textFieldAddress;
        }

        public JTextField getTextFieldCity() {
                return textFieldCity;
        }

        public JTextField getTextFieldCountry() {
                return textFieldCountry;
        }

        public JTextField getTextFieldYearBirth() {
                return textFieldYearBirth;
        }

        public JTextField getTextFieldMonthBirth() {
                return textFieldMonthBirth;
        }

        public JTextField getTextFieldDayBirth() {
                return textFieldDayBirth;
        }

        public JTextField getTextFieldArea() {
                return textFieldArea;
        }

        public JTextField getTextFieldPosition() {
                return textFieldPosition;
        }

        public JTextField getTextFieldIsAdmin() {
                return textFieldIsAdmin;
        }

        public JTextField getTextFieldIsLeader() {
                return textFieldIsLeader;
        }

        public JTextField getTextFieldBank() {
                return textFieldBank;
        }

        public JTextField getTextFieldAccountNumber() {
                return textFieldAccountNumber;
        }

        public JTextField getTextFieldAccountType() {
                return textFieldAccountType;
        }

        public JTextField getTextFieldHealthPrepaid() {
                return textFieldHealthPrepaid;
        }

        public JTextField getTextFieldProductivityBonus() {
                return textFieldProductivityBonus;
        }

        public JTextField getTextFieldVacations() {
                return textFieldVacations;
        }

        public JTextField getTextFieldVacationsTaken() {
                return textFieldVacationsTaken;
        }

        public JTextField getTextFieldEducationLevel() {
                return textFieldEducationLevel;
        }

        public JTextField getTextFieldEducationTitle() {
                return textFieldEducationTitle;
        }

        public JTextField getTextFieldEducationInstitution() {
                return textFieldEducationInstitution;
        }

        public JTextField getTextFieldEducationYear() {
                return textFieldEducationYear;
        }

        public JTextField getTextFieldSalaryGross() {
                return textFieldSalaryGross;
        }

        public JTextField getTextFieldAuxTransport() {
                return textFieldAuxTransport;
        }

        public ArrayList<String> getFields() {
                ArrayList<String> fields = new ArrayList<String>();
                fields.add(getTextFieldName().getText());
                fields.add(getTextFieldLastName().getText());
                fields.add(getTextFieldAge().getText());
                fields.add(getTextFieldGender().getText());
                fields.add(getTextFieldId().getText());
                fields.add(getTextFieldEmail().getText());
                fields.add(getTextFieldPhone().getText());
                fields.add(getTextFieldAddress().getText());
                fields.add(getTextFieldCity().getText());
                fields.add(getTextFieldCountry().getText());
                fields.add(getTextFieldYearBirth().getText());
                fields.add(getTextFieldMonthBirth().getText());
                fields.add(getTextFieldDayBirth().getText());
                fields.add(getTextFieldArea().getText());
                fields.add(getTextFieldPosition().getText());
                fields.add(getTextFieldIsAdmin().getText());
                fields.add(getTextFieldIsLeader().getText());
                fields.add(getTextFieldBank().getText());
                fields.add(getTextFieldAccountNumber().getText());
                fields.add(getTextFieldAccountType().getText());
                fields.add(getTextFieldHealthPrepaid().getText());
                fields.add(getTextFieldProductivityBonus().getText());
                fields.add(getTextFieldVacations().getText());
                fields.add(getTextFieldVacationsTaken().getText());
                fields.add(getTextFieldSalaryGross().getText());
                fields.add(getTextFieldAuxTransport().getText());
                fields.add(getTextFieldEducationLevel().getText());
                fields.add(getTextFieldEducationTitle().getText());
                fields.add(getTextFieldEducationInstitution().getText());
                fields.add(getTextFieldEducationYear().getText());
                fields.add(getTextFieldIdTeam().getText());
                return fields;
        }

        public void setMessageSuccess(String message) {
                this.messageSuccess.setText(message);
                this.messageError.setText("");
        }

        public void setMessageError(String message) {
                this.messageError.setText(message);
                this.messageSuccess.setText("");
        }

}
