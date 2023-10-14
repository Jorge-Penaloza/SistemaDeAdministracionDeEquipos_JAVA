/**
 * La clase Asignacion representa una asignación de un Equipo a un Empleado en la empresa Qstar.CA.
 * Cada asignación tiene un empleado, un equipo, una fecha de asignación y una ubicación.
 *
 * @author Jorge Peñaloza
 * @version 1.0
 * @since 13/05/2023
 */
public class Asignacion {

    /**
     * El empleado al que se le asigna el equipo.
     */
    private Empleado empleado;

    /**
     * El equipo que se asigna al empleado.
     */
    private Equipo equipo;

    /**
     * Fecha en la que se realiza la asignación del equipo.
     */
    private String fechaAsignacion;

    /**
     * Ubicación del equipo dentro de la empresa.
     */
    private String ubicacion;

    /**
     * Constructor de la clase Asignacion.
     *
     * @param empleado        El empleado al que se le asigna el equipo.
     * @param equipo          El equipo que se asigna al empleado.
     * @param fechaAsignacion Fecha de asignación del equipo.
     * @param ubicacion       Ubicación del equipo dentro de la empresa.
     */
    public Asignacion(Empleado empleado, Equipo equipo, String fechaAsignacion, String ubicacion) {
        this.empleado = empleado;
        this.equipo = equipo;
        this.fechaAsignacion = fechaAsignacion;
        this.ubicacion = ubicacion;
    }

    /**
     * Retorna el empleado al que se le asignó el equipo.
     *
     * @return Empleado al que se le asignó el equipo.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado al que se le asigna el equipo.
     *
     * @param empleado Empleado al que se le asigna el equipo.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Retorna el equipo que se asignó al empleado.
     *
     * @return Equipo que se asignó al empleado.
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * Establece el equipo que se asigna al empleado.
     *
     * @param equipo Equipo que se asigna al empleado.
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Retorna la fecha en que se realizó la asignación.
     *
     * @return Fecha en que se realizó la asignación.
     */
    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Establece la fecha en que se realiza la asignación.
     *
     * @param fechaAsignacion Fecha en que se realiza la asignación.
     */
    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    /**
     * Retorna la ubicación del equipo dentro de la empresa.
     *
     * @return Ubicación del equipo dentro de la empresa.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del equipo dentro de la empresa.
     *
     * @param ubicacion Ubicación del equipo dentro de la empresa.
     */

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
