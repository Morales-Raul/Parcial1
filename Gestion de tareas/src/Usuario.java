import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Tarea> tareasAsignadas;

    public Usuario(String nombre, String id) {
        super(nombre, id);
        this.tareasAsignadas = new ArrayList<>();
    }

    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void asignarTarea(Tarea tarea) {
        tareasAsignadas.add(tarea);
    }
}

