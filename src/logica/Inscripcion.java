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
public class Inscripcion {
    
    
    Corredor corredor;
	int dorsal;
	int tiempo;
	public Inscripcion(Corredor corredor, int dorsal) {
		super();
		this.corredor = corredor;
		this.dorsal = dorsal;
		tiempo=-1;
	}
	public Corredor getCorredor() {
		// TODO Auto-generated method stub
		return corredor;
	}

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
	
	
	
	@Override
	public String toString() {
		return "Inscripcion:\n corredor: " + corredor + ", dorsal: " + dorsal + ", tiempo: " + tiempo;
	}

	
    
}
