/**
 * La clase Persona representa a una persona en general.
 * Contiene los atributos comunes a todas las personas, como nombres y apellidos.
 *
 * @author Jorge Peñaloza
 * @version 1.0
 * @since 13/05/2023
 */
public class Persona {
    private String nombres;
    private String apellidos;

    /**
     * Constructor de la clase Persona.
     *
     * @param nombres   Los nombres de la persona.
     * @param apellidos Los apellidos de la persona.
     */
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    /**
     * Obtiene los nombres de la persona.
     *
     * @return Los nombres de la persona.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Establece los nombres de la persona.
     *
     * @param nombres Los nombres de la persona.
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Obtiene los apellidos de la persona.
     *
     * @return Los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos de la persona.
     *
     * @param apellidos Los apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
