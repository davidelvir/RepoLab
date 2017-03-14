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
public class Diputado extends Candidato{
    private String departamento;

    public Diputado() {
    }

    public Diputado(String departamento, int salario, int votos, int id, int edad, String nombre) {
        super(salario, votos, id, edad, nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString() {
        return super.getNombre();
    }
}
