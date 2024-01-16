package co.edu.uptc.view.admin.employee;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.SearchPanel;

public class ValidationEditEmployeePanel extends SearchPanel {

    public ValidationEditEmployeePanel(ActionListener listener) {
        super(listener, "Editar empleado", "Por favor ingrese la identificación del empleado a editar",
                "SearchEditEmployee", "SendEditEmployee",
                "Nombre", "Cargo", "Editar", "src/co/edu/uptc/view/assets/img/editEmployee.jpg");
    }

}
