import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private List<Tarea> tareas;

    public Proyecto(String nombre, String descripcion, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public boolean todasTareasCompletadas() {
        for (Tarea tarea : tareas) {
            if (!tarea.getEstado().equals("completada")) {
                return false;
            }
        }
        return true;
    }
}
