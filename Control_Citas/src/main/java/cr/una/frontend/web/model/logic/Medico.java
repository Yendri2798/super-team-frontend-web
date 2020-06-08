package cr.una.frontend.web.model.logic;

/*
@author Yendri
 */

import com.fasterxml.jackson.annotation.JsonProperty;

public class Medico {
    @JsonProperty("_id")
    private Id id;
    private String name;
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("salario")
    private int salario;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("codigo-medico")
    private String codigo_medico;
    private boolean premium;

    public Medico() {
        this.id = new Id("");
        this.name = "";
        this.tipo = "";
        this.premium = false;
        this.salario = 0;
        this.moneda = "";
        this.codigo_medico = "";
    }

    public Medico(Id id, String name, String tipo, boolean premium, int salario, String moneda, String codigo_medico) {
        this.id = id;
        this.name = name;
        this.tipo = tipo;
        this.premium = premium;
        this.salario = salario;
        this.moneda = moneda;
        this.codigo_medico = codigo_medico;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getPremium() {
        return premium;
    }

    public void setPremium(Boolean premium) {
        this.premium = premium;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCodigo_medico() {
        return codigo_medico;
    }

    public void setCodigo_medico(String codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", premium=" + premium +
                ", salario=" + salario +
                ", moneda='" + moneda + '\'' +
                ", codigo_medico='" + codigo_medico + '\'' +
                '}';
    }
}