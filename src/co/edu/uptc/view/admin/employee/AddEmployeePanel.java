package co.edu.uptc.view.admin.employee;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.ShowEmployeeGeneralPanel;

public class AddEmployeePanel extends ShowEmployeeGeneralPanel {

    public AddEmployeePanel(ActionListener listener) {
        super(listener, new String[] {}, "src/co/edu/uptc/view/assets/img/addEmployee.jpg", true, "Agregar",
                "SaveAddEmployee", false);
        this.setTitle("Agregar empleado");
    }

}
