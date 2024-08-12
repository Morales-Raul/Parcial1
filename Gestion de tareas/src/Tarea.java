public class Tarea {
    private String titulo;
    private String descripcion;
    private String fechaLimite;
    private String prioridad;
    private String estado;

    public Tarea(String titulo, String descripcion, String fechaLimite, String prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.estado = "pendiente";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

