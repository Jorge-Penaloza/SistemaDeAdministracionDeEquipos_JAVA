/**
 * La clase Equipo representa un notebook en la empresa Qstar.CA.
 * Cada equipo tiene un número de serie, modelo, tipo de procesador, marca, tipo de sistema operativo, fecha de asignación y ubicación.
 *
 * @author Jorge Peñaloza
 * @version 1.0
 * @since 13/05/2023
 */
public class Equipo {

    // Atributos de la clase Equipo
    private String serial;
    private String modelo;
    private String tipoProcesador;
    private String marca;
    private String tipoSistemaOperativo;
    private String fechaAsignacion;
    private String ubicacion;

    /**
     * Constructor de la clase Equipo.
     *
     * @param serial               Número de serie del equipo.
     * @param modelo               Modelo del equipo.
     * @param tipoProcesador       Tipo de procesador del equipo.
     * @param marca                Marca del equipo.
     * @param tipoSistemaOperativo Tipo de sistema operativo del equipo.
     */
    //Equipo equipo1 = new Equipo("12345", "Modelo 2023", "Intel Core i7", "Dell", "Windows 10");
    public Equipo(String serial, String modelo, String tipoProcesador, String marca, String tipoSistemaOperativo) {
        this.serial = serial;
        this.modelo = modelo;
        this.tipoProcesador = tipoProcesador;
        this.marca = marca;
        this.tipoSistemaOperativo = tipoSistemaOperativo;

    }

    // Métodos get y set para cada atributo

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoSistemaOperativo() {
        return tipoSistemaOperativo;
    }

    public void setTipoSistemaOperativo(String tipoSistemaOperativo) {
        this.tipoSistemaOperativo = tipoSistemaOperativo;
    }


}
