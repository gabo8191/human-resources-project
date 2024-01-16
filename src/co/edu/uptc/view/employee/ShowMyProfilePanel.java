package co.edu.uptc.view.employee;

import java.awt.event.ActionListener;

import co.edu.uptc.view.admin.ShowEmployeeGeneralPanel;

public class ShowMyProfilePanel extends ShowEmployeeGeneralPanel {

    public ShowMyProfilePanel(ActionListener listener) {

        super(listener,
                new String[] { "Nombre", "Apellido", "Edad", "Género", "Identificación", "Correo electrónico",
                        "Teléfono", "EPS",
                        "Dirección", "Ciudad", "País", "Año de nacimiento", "Mes de nacimiento", "Día de nacimiento",
                        "Área", "Cargo", "Es administrador", "Es líder", "Banco", "Número de cuenta", "Tipo de cuenta",
                        "Prepagada", "Bono de productividad", "Vacaciones", "Vacaciones tomadas", "Salario bruto",
                        "Auxilio de transporte", "Aporte a salud", "Aporte a pensión", "Horas extra diurnas",
                        "Horas extra nocturnas", "Horas extra festivas diurnas", "Horas extra festivas nocturnas",
                        "Valor total horas extra", "Salario neto", "Nivel de educación", "Título", "Institución",
                        "Año de graduación",
                }, "src/co/edu/uptc/view/assets/img/showMyProfile.jpg", false, null, null, true);
        this.setTitle("Mi perfil");
    }

}
