package co.edu.uptc.view.admin.employee;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.ShowEmployeeGeneralPanel;

public class EditEmployeePanel extends ShowEmployeeGeneralPanel {

    public EditEmployeePanel(ActionListener listener) {
        super(listener,
                new String[] { "Prepagada", "Bono de productividad", "Vacaciones", "Vacaciones tomadas",
                        "Salario bruto", "Identificación", "Es administrador", "Es líder",
                        "Auxilio de transporte" },
                "src/co/edu/uptc/view/assets/img/editEmployee.jpg", true, "Editar",
                "SaveEditEmployee", false);
        this.setTitle("Editar empleado");
    }
}
