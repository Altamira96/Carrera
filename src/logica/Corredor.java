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

public class Corredor {
    
    
     private String nombre;
	    private String dni;//id del corredor 
	    private Date fecha_nacimiento;
	    private String telefono;
	    private Direccion direccion;
	    
	   
	 
	    public Corredor(String nombre, String dni, Date fecha_nacimiento,String telefono,Direccion direccion) {
	        if(nombre!=null)
	        	this.nombre = nombre;
	        
	        //dni valido

	    //    if(validarDNI(dni)) {
	        	this.dni = dni;
	     //   }
	        //fecha de nacimiento en la interfaz sera mediante un calendario 
	        this.fecha_nacimiento = fecha_nacimiento;

	        //el numero de telefono tiene que tener 9 digitos para ser valido
	       if (validarTelefono(telefono)) {
	    		   this.telefono=telefono;
	       }
	        this.direccion=direccion;
	        
	    }
	    
	 
	    
	    // INICIO VALIDAR DNI

	    public boolean validarDNI(String dni) {
	    	if (dni.length()!=9) return false;
	    	String numeros=dni.substring(0,dni.length()-1);
	    	char letra=dni.charAt(dni.length()-1);
	    	int total=0;
	    	char[]aux=numeros.toCharArray();
	       	for (char numero:aux) {
	       		//si no es un numero, falso;
	       		if (!(numero>='0' && numero<='9')) return false;
	       		total+=(int)numero;	
	    	}
	       	if (!(letra>='A' && letra<='Z')) return false;
	       	int resto=total%23;
	       	char[]letras= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	       	if (letras[resto]==letra) return true;
	       	else return false;
	    }
	    
	    // FIN VALIDAR DNI
		
		
	  public boolean validarTelefono(String telefono) {
		   if (telefono.length()==9)
		    	return true;
		   return false;
	  }



	@Override
	public String toString() {
		return  nombre + ", dni: " + dni + ", fecha_nacimiento: " + fecha_nacimiento + ", telefono: "
				+ telefono + ", direccion: " + direccion;
	}
    
}
