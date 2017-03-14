/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repolab;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Partido {
    private String nombre;
    private ArrayList<Diputado>diputados = new ArrayList();
    private ArrayList<Alcalde>alcaldes = new ArrayList();
    private ArrayList<Presidente>presidentes = new ArrayList();

    public Partido() {
    }
    public Partido(ArrayList<Diputado> diputados,ArrayList<Alcalde> alcaldes,ArrayList<Presidente> presidentes, String nombre){
        this.diputados = diputados;
        this.alcaldes = alcaldes;
        this.presidentes = presidentes;
        this.nombre = nombre;
    }
    public Partido(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Diputado> getDiputados() {
        return diputados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiputados(ArrayList<Diputado> diputados) {
        this.diputados = diputados;
    }
    public void setDiputado(Diputado d){
        this.diputados.add(d);
    }
    public ArrayList<Alcalde> getAlcaldes() {
        return alcaldes;
    }

    public void setAlcaldes(ArrayList<Alcalde> alcaldes) {
        this.alcaldes = alcaldes;
    }
    public void setAlcalde(Alcalde a){
        this.alcaldes.add(a);
    }
    public ArrayList<Presidente> getPresidentes() {
        return presidentes;
    }

    public void setPresidentes(ArrayList<Presidente> presidentes) {
        this.presidentes = presidentes;
    }
    public void setPresidente(Presidente p){
        this.presidentes.add(p);
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
