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
public class Candidato extends Persona{
    private int salario;
    private int votos;

    public Candidato() {
    }

    public Candidato(int salario, int votos, int id, int edad, String nombre) {
        super(id, edad, nombre);
        this.salario = salario;
        this.votos = votos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    
}
