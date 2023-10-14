
/**
 * <h1>Sistema de Control de Equipos</h1>
 *
 * <p>Este programa administra los equipos, y sus asignaciones a los empleados
 * de la empresa Qstar.CA. Permite registrar y actualizar la información de los
 * equipos y empleados, así como asignar un equipo a un empleado.</p>
 *
 * <p><b>Nota:</b> Este programa es un ejemplo y puede ser mejorado y adaptado
 * según las necesidades específicas de la empresa.</p>
 *
 * @author Jorge Peñaloza
 * @version 1.0
 * @since 2023-05-13
 * @lastModified 2023-05-15
 * @return vacio
 */

public class mainTemporal {
    public static void main(String[] args) {
        // Crear dos nuevos objetos Empleado
        Empleado empleado1 = new Empleado("E123", "Juan", "Pérez", "Administrativo", "juan.perez@qstar.ca");
        Empleado empleado2 = new Empleado("E124", "Ana", "Gomez", "Técnico", "ana.gomez@qstar.ca");

        // Crear dos nuevos objetos Equipo
        Equipo equipo1 = new Equipo("12345", "Modelo 2023", "Intel Core i7", "Dell", "Windows 10");
        Equipo equipo2 = new Equipo("12346", "Modelo 2024", "Intel Core i5", "Lenovo", "Windows 11");

        // Crear dos nuevas Asignaciones
        Asignacion asignacion1 = new Asignacion(empleado1, equipo1, "13/05/2023", "Oficina 101");
        Asignacion asignacion2 = new Asignacion(empleado2, equipo2, "14/05/2023", "Oficina 102");

        // Imprimir la información de las asignaciones
        System.out.println("Asignacion 1:");
        System.out.println("Empleado: " + asignacion1.getEmpleado().getNombres() + " " + asignacion1.getEmpleado().getApellidos());
        System.out.println("Equipo: " + asignacion1.getEquipo().getMarca() + " " + asignacion1.getEquipo().getModelo());
        System.out.println("Fecha de asignacion: " + asignacion1.getFechaAsignacion());
        System.out.println("Ubicacion: " + asignacion1.getUbicacion());

        System.out.println("\nAsignacion 2:");
        System.out.println("Empleado: " + asignacion2.getEmpleado().getNombres() + " " + asignacion2.getEmpleado().getApellidos());
        System.out.println("Equipo: " + asignacion2.getEquipo().getMarca() + " " + asignacion2.getEquipo().getModelo());
        System.out.println("Fecha de asignacion: " + asignacion2.getFechaAsignacion());
        System.out.println("Ubicacion: " + asignacion2.getUbicacion());


    }
}
