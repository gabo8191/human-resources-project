package co.edu.uptc.view.admin.payroll;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.SearchPanel;

public class ValidationPayrollEmployeePanel extends SearchPanel {

    public ValidationPayrollEmployeePanel(ActionListener listener) {
        super(listener, "Validar nómina del empleado", "Por favor ingrese el número de identificación del empleado",
                "SearchPayrollEmployee", "SendPayrollEmployee", "Nombre", "Cargo", "Buscar",
                "src/co/edu/uptc/view/assets/img/payrollEmployee.jpg");
    }
}
