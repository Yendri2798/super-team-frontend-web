package cr.una.frontend.web.model.logic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
@author Yendri
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Servicios_Medicos {
    @JsonProperty("_id")
    private Id id;
    @JsonProperty("servicio")
    private String servicio;
    @JsonProperty("costo-porcentual")
    private String costo_porcentual;
    private double costoFinal;
    @JsonProperty("codigo-medico")
    private String codigo_medico;
    @JsonProperty("costo")
    private String costo;
    @JsonProperty("moneda")
    private String moneda;

    public Servicios_Medicos() {
        this.id = new Id("");
        this.servicio = "";
        this.costo_porcentual = "";
        this.costoFinal = 0.0;
        this.codigo_medico = "";
        this.costo = "";
        this.moneda = "";
    }

    public Servicios_Medicos(Id id, String servicio, String costo_porcentual, String codigo_medico, String costo, String moneda) {
        this.id = id;
        this.servicio = servicio;
        this.costo_porcentual = costo_porcentual;
        this.codigo_medico = codigo_medico;
        this.costo = costo;
        this.moneda = moneda;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCosto_porcentual() {
        return costo_porcentual;
    }

    public void setCosto_porcentual(String costo_porcentual) {
        this.costo_porcentual = costo_porcentual;
    }

    public String getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(String codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }

    @Override
    public String toString() {
        return "Servicios_Medicos{" +
                "_id=" + id +
                ", servicio='" + servicio + '\'' +
                ", costo_porcentual='" + costo_porcentual + '\'' +
                ", costoFinal=" + costoFinal +
                ", codigo_medico='" + codigo_medico + '\'' +
                ", costo='" + costo + '\'' +
                ", moneda='" + moneda + '\'' +
                '}';
    }
}