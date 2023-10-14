/**
* La clase Empleado representa a un empleado en la empresa.
* Hereda los atributos y métodos de la clase Persona y agrega atributos específicos para los empleados, como código de empleado, cargo y correo.
*
* @author Jorge Peñaloza
* @version 1.0
* @since 13/05/2023
*/
public class Empleado extends Persona {
    private String codigoEmpleado;
    private String cargo;
    private String correo;

    /**
     * Constructor de la clase Empleado.
     *
     * @param nombres        Los nombres del empleado.
     * @param apellidos      Los apellidos del empleado.
     * @param codigoEmpleado El código del empleado.
     * @param cargo          El cargo del empleado.
     * @param correo         El correo del empleado.
     */
    public Empleado(String nombres, String apellidos, String codigoEmpleado, String cargo, String correo) {
        super(nombres, apellidos);
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.correo = correo;
    }

    /**
     * Obtiene el código del empleado.
     *
     * @return El código del empleado.
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Establece el código del empleado.
     *
     * @param codigoEmpleado El código del empleado.
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return El cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del empleado.
     *
     * @param cargo El cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el correo del empleado.
     *
     * @return El correo del empleado.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del empleado.
     *
     * @param correo El correo del empleado.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

