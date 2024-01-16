package co.edu.uptc.view.admin.employee;

import java.awt.event.ActionListener;
import co.edu.uptc.view.admin.ShowEmployeeGeneralPanel;

public class ShowEmployee extends ShowEmployeeGeneralPanel {

    public ShowEmployee(ActionListener listener) {
        super(listener, new String[] { "Nombre", "Apellido", "Edad", "Género", "Identificación", "Correo electrónico",
                "Teléfono",
                "Dirección", "Ciudad", "País", "Año de nacimiento", "Mes de nacimiento", "Día de nacimiento",
                "Área", "Cargo", "Es administrador", "Es líder", "Banco", "Número de cuenta", "Tipo de cuenta",
                "Prepagada", "Bono de productividad", "Vacaciones", "Vacaciones tomadas", "Salario bruto",
                "Auxilio de transporte", "EPS", "Nivel de educación", "Título", "Institución",
                "Año de graduación" }, "src/co/edu/uptc/view/assets/img/showMyProfile.jpg", false, null, null, false);
        this.setTitle("Perfil del empleado");
    }

}
