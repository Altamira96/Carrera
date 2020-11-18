/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Carlos
 */
import java.util.*;

public class Carrera {
    
    
     private String nombre_carrera;
    private Date fecha_carrera;
    private String lugar_carrera;
    
    private int max_participantes;//maximo de participantes
    
    

    public ArrayList<Inscripcion> inscripciones;

  
    
    public Carrera(String nombre_carrera, Date fecha_carrera, String lugar_carrera, int max_participantes) {
		this.nombre_carrera = nombre_carrera;
		this.fecha_carrera = fecha_carrera;
		this.lugar_carrera = lugar_carrera;
		this.max_participantes = max_participantes;
		inscripciones=new ArrayList<Inscripcion>();
		
	}


    
    
    @Override
	public String toString() {
		return "carrera [nombre_carrera=" + nombre_carrera + ", fecha_carrera=" + fecha_carrera + ", lugar_carrera="
				+ lugar_carrera + ", max_participantes=" + max_participantes ;
	}

    
    
    public boolean esta(Corredor c) {
    	for (Inscripcion i:inscripciones) {
    		if (i.getCorredor().equals(c))
    			return true;
    	}
    	return false;
    }
    
    public void inscribirCorredor(Corredor c){
    	//comprobar que hay sitio
    	if (inscripciones.size()<max_participantes) {
    	//comprobar que no esta..
    		
    		if (!inscripciones.contains(c)) {
    		//si no esta, inscribirlo
    			inscripciones.add(new Inscripcion(c,inscripciones.size()+1));
    		}
    	}
    }
    
    
    //********************************

    public void imprimir(){
    	for (Inscripcion i:inscripciones) 
    		System.out.println(i);
    }    
    //*********************************
    
    
}
