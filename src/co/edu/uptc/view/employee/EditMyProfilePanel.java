package co.edu.uptc.view.employee;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.ShowEmployeeGeneralPanel;

public class EditMyProfilePanel extends ShowEmployeeGeneralPanel {

    public EditMyProfilePanel(ActionListener listener) {
        super(listener,
                new String[] { "Nombre", "Apellido", "Edad", "Genero", "Identificación", "Año de nacimiento",
                        "Mes de nacimiento", "Día de nacimiento",
                        "Área", "Cargo", "Es administrador", "Es líder", "Es administrador",
                        "Prepagada", "Bono de productividad", "Vacaciones", "Vacaciones tomadas", "Salario bruto",
                        "Auxilio de transporte", "EPS" },
                "src/co/edu/uptc/view/assets/img/editMyProfile.jpg", true, "Editar", "SaveEditMyProfile", true);
        this.setTitle("Editar mi perfil");
    }
}
