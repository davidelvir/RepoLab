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
public class Alcalde extends Candidato{
    private String municipio;

    public Alcalde() {
        super();
    }

    public Alcalde(String municipio, int salario, int votos, int id, int edad, String nombre) {
        super(salario, votos, id, edad, nombre);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
