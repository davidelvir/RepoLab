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
public class Presidente extends Candidato{
    private String movimiento;

    public Presidente() {
    }

    public Presidente(String movimiento, int salario, int votos, int id, int edad, String nombre) {
        super(salario, votos, id, edad, nombre);
        this.movimiento = movimiento;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    
    
}
