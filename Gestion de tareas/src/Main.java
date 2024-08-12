import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gestion sistema = new Gestion();

        Usuario usuario1 = new Usuario("Raúl Morales", "9941-23-5977");
        sistema.registrarUsuario(usuario1);

        Usuario usuario2 = new Usuario("Elian Morales", "01122023");
        sistema.registrarUsuario(usuario2);

        Proyecto proyecto1 = new Proyecto("Proyecto Parcial 1", "Aqui describimos el proyecto", "05 de Agosto 2024", "11 de Agosto 2024");
        sistema.registrarProyecto(proyecto1);

        Proyecto proyecto2 = new Proyecto("Proyecto Parcial 2", "Aqui describimos el proyecto 2", "05 de Agosto 2024", "11 de Agosto 2024");
        sistema.registrarProyecto(proyecto2);

        Tarea tarea1 = new Tarea("Tarea 1", "Describimos tarea 1", "11 de Agosto 2024", "Alta");
        sistema.asignarTareaAProyecto(proyecto1.getNombre(), tarea1);
        sistema.asignarTareaAUsuario(usuario1.getId(), tarea1);
        Tarea tarea2 = new Tarea("Tarea 2" ,  "Describimos tarea 2", "11 de Agosto 2024", "Baja");
        sistema.asignarTareaAProyecto(proyecto2.getNombre(), tarea2);
        sistema.asignarTareaAUsuario(usuario2.getId(), tarea2);

        List<Tarea> tareasUsuario = sistema.consultarTareasDeUsuario(usuario1.getId());
        System.out.println("Tarea asignada " + usuario1.getNombre() + ":");

        List<Tarea> tareasUsuario2 = sistema.consultarTareasDeUsuario(usuario2.getId());
        System.out.println("Tarea asignada " + usuario2.getNombre() + ":");
        for (Tarea tarea : tareasUsuario2) {
            System.out.println("- " + tarea.getTitulo() + " (" + tarea.getEstado() + ")");
        }
        for (Tarea tarea : tareasUsuario) {
            System.out.println("- " + tarea.getTitulo() + " (" + tarea.getEstado() + ")");
        }
    }
}