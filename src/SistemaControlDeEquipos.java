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
import java.util.Scanner;
public class SistemaControlDeEquipos {
    private Asignacion[] asignaciones; // Declaración del array de asignaciones
    private int numAsignaciones; // Contador del número de asignaciones registradas

    public SistemaControlDeEquipos() {
        this.asignaciones = new Asignacion[100]; // Tamaño inicial del array de asignaciones
        this.numAsignaciones = 0; // Inicializar el contador en 0
    }
    public static void main(String[] args) {
        // Crear una instancia de SistemaControlDeEquipos
        SistemaControlDeEquipos sistema = new SistemaControlDeEquipos();
        // Menú principal
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Registrar nueva asignación");
            System.out.println("2. Buscar asignación por número de serie del equipo");
            System.out.println("3. Buscar asignación por código del empleado");
            System.out.println("4. Actualizar estado de una asignación");
            System.out.println("5. Generar reporte de asignaciones");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sistema.registrarNuevaAsignacion();
                    break;
                case 2:
                    System.out.print("Ingrese el número de serie del equipo: ");
                    String serialEquipo = scanner.next();
                    Asignacion asignacionPorSerial = sistema.buscarAsignacionPorNotebook(serialEquipo);
                    if (asignacionPorSerial != null) {
                        System.out.println("Asignación encontrada:");
                        System.out.println("Empleado: " + asignacionPorSerial.getEmpleado().getNombres() + " " + asignacionPorSerial.getEmpleado().getApellidos());
                        System.out.println("Equipo: " + asignacionPorSerial.getEquipo().getModelo() + " (" + asignacionPorSerial.getEquipo().getSerial() + ")");
                        System.out.println("Fecha de asignación: " + asignacionPorSerial.getFechaAsignacion());
                        System.out.println("Ubicación: " + asignacionPorSerial.getUbicacion());
                    } else {
                        System.out.println("No se encontró ninguna asignación con el número de serie " + serialEquipo);
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.print("Ingrese el código del empleado: ");
                    String codigoEmpleado = scanner.next();
                    Asignacion asignacionPorEmpleado = sistema.buscarAsignacionPorEmpleado(codigoEmpleado);
                    if (asignacionPorEmpleado != null) {
                        System.out.println("Asignación encontrada:");
                        System.out.println("Empleado: " + asignacionPorEmpleado.getEmpleado().getNombres() + " " + asignacionPorEmpleado.getEmpleado().getApellidos());
                        System.out.println("Equipo: " + asignacionPorEmpleado.getEquipo().getModelo() + " (" + asignacionPorEmpleado.getEquipo().getSerial() + ")");
                        System.out.println("Fecha de asignación: " + asignacionPorEmpleado.getFechaAsignacion());
                        System.out.println("Ubicación: " + asignacionPorEmpleado.getUbicacion());
                    } else {
                        System.out.println("No se encontró ninguna asignación con el código de empleado " + codigoEmpleado);
                    }
                    break;
                case 4:
                    // Pedir los datos de la asignación y el nuevo estado
                    // Actualizar el estado de la asignación llamando al método actualizarEstadoAsignacion()
                    break;
                case 5:
                    sistema.generarReporteAsignaciones();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
    /**
     * Registra una nueva asignación de un equipo a un empleado.
     */
    public void registrarNuevaAsignacion() {
        // Pedir los datos necesarios para la nueva asignación
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos de la nueva asignación:");

        // Pedir los datos del empleado
        System.out.print("Código del empleado: ");
        String codigoEmpleado = scanner.nextLine();
        System.out.print("Nombres del empleado: ");
        String nombresEmpleado = scanner.nextLine();
        System.out.print("Apellidos del empleado: ");
        String apellidosEmpleado = scanner.nextLine();
        System.out.print("Cargo del empleado: ");
        String cargoEmpleado = scanner.nextLine();
        System.out.print("Correo del empleado: ");
        String correoEmpleado = scanner.nextLine();

        // Crear un objeto Empleado con los datos ingresados
        Empleado empleado = new Empleado(codigoEmpleado, nombresEmpleado, apellidosEmpleado, cargoEmpleado, correoEmpleado);

        // Pedir los datos del equipo
        System.out.print("Número de serie del equipo: ");
        String serialEquipo = scanner.nextLine();
        System.out.print("Modelo del equipo: ");
        String modeloEquipo = scanner.nextLine();
        System.out.print("Tipo de procesador del equipo: ");
        String tipoProcesadorEquipo = scanner.nextLine();
        System.out.print("Marca del equipo: ");
        String marcaEquipo = scanner.nextLine();
        System.out.print("Tipo de sistema operativo del equipo: ");
        String tipoSistemaOperativoEquipo = scanner.nextLine();

        // Crear un objeto Equipo con los datos ingresados
        Equipo equipo = new Equipo(serialEquipo, modeloEquipo, tipoProcesadorEquipo, marcaEquipo, tipoSistemaOperativoEquipo);

        // Pedir los datos de la asignación
        System.out.print("Fecha de asignación: ");
        String fechaAsignacion = scanner.nextLine();
        System.out.print("Ubicación del equipo: ");
        String ubicacionEquipo = scanner.nextLine();

        // Crear una nueva asignación con los objetos Empleado y Equipo, y los demás datos ingresados
        Asignacion asignacion = new Asignacion(empleado, equipo, fechaAsignacion, ubicacionEquipo);


        // Agregar la asignación al array de asignaciones
        asignaciones[numAsignaciones] = asignacion;
        numAsignaciones++;

        System.out.println("Nueva asignación registrada correctamente.");
        System.out.println();

        //scanner.close();
    }

    /**
     * Busca una asignación por el número de serie del equipo.
     *
     * @param serial Número de serie del equipo.
     * @return Asignación encontrada o null si no se encontró ninguna asignación.
     */
    public Asignacion buscarAsignacionPorNotebook(String serial) {
        // Recorrer el array de asignaciones para buscar la asignación por el número de serie del equipo
        for (int i = 0; i < numAsignaciones; i++) {
            if (asignaciones[i].getEquipo().getSerial().equals(serial)) {
                return asignaciones[i]; // Retornar la asignación encontrada
            }
        }
        return null; // No se encontró ninguna asignación con el número de serie dado
    }

    /**
     * Busca una asignación por el código del empleado.
     *
     * @param codigoEmpleado Código del empleado.
     * @return Asignación encontrada o null si no se encontró ninguna asignación.
     */
    public Asignacion buscarAsignacionPorEmpleado(String codigoEmpleado) {
        // Recorrer el array de asignaciones para buscar la asignación por el código del empleado
        for (int i = 0; i < numAsignaciones; i++) {
            if (asignaciones[i].getEmpleado().getCodigoEmpleado().equals(codigoEmpleado)) {
                return asignaciones[i]; // Retornar la asignación encontrada
            }
        }
        return null; // No se encontró ninguna asignación con el código de empleado dado
    }

    /**
     * Actualiza el estado de una asignación.
     *
     * @param asignacion Asignación a actualizar.
     * @param nuevoEstado Nuevo estado de la asignación.
     */
    public void actualizarEstadoAsignacion(Asignacion asignacion, String nuevoEstado) {
        // Lógica para actualizar el estado de una asignación
    }

    /**
     * Genera un reporte de todas las asignaciones realizadas.
     */
    public void generarReporteAsignaciones() {
        System.out.println("Reporte de Asignaciones:");
        System.out.println("-----------------------");

        if (numAsignaciones == 0) {
            System.out.println("No hay asignaciones registradas.");
        } else {
            for (int i = 0; i < numAsignaciones; i++) {
                Asignacion asignacion = asignaciones[i];
                System.out.println("Asignación " + (i + 1) + ":");
                System.out.println("Empleado: " + asignacion.getEmpleado().getNombres() + " " + asignacion.getEmpleado().getApellidos());
                System.out.println("Equipo: " + asignacion.getEquipo().getModelo() + " (" + asignacion.getEquipo().getSerial() + ")");
                System.out.println("Fecha de asignación: " + asignacion.getFechaAsignacion());
                System.out.println("Ubicación: " + asignacion.getUbicacion());
                System.out.println();
            }
        }
    }


}
