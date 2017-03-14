/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repolab;

/**
 *
 * @author David
 */
public class Civil extends Persona{
    private String partido;
    private String pais;
    private String departamento;
    private String municipio;

    public Civil() {
    }

    public Civil(String partido, String pais, String departamento, String municipio, int id, int edad, String nombre) {
        super(id, edad, nombre);
        this.partido = partido;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
