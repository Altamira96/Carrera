/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutar;

import java.util.Date;
import logica.Carrera;
import logica.Corredor;
import logica.Direccion;


/**
 *
 * @author Carlos
 */
public class principalPruebas {
 
    public principalPruebas(){
     Corredor corredor = new Corredor("jose","71728886M",new Date(1,1,200),"555222111",new Direccion("calle1", "1","Oviedo",3301, "Asturias"));
 
    Corredor corredor2 = new Corredor("Manuel","71728886M",new Date(1,1,200),"555222111",new Direccion("calle1", "1","Oviedo",3301, "Asturias"));

		//System.out.println(corredor);
	
		Carrera carrera = new Carrera("Carrera", new Date(1,1,200), "Oviedo",10);
		carrera.inscribirCorredor(corredor);
		carrera.inscribirCorredor(corredor2);
		
		carrera.imprimir();
    }
    
    
    public static void main(String[] args) {
            principalPruebas p = new principalPruebas();
    }
    
    
    
}
