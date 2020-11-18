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
public class Direccion {
    
    
    private String calle;
	    private String numero_puerta_piso;
	    private String ciudad;
	    private int cod_postal;
	    private String provincia;
		

		public Direccion(String calle, String numero_puerta_piso, String ciudad, int cod_postal, String provincia) {
			this.calle = calle;
			this.numero_puerta_piso = numero_puerta_piso;
			this.ciudad = ciudad;
			this.cod_postal = cod_postal;
			this.provincia = provincia;
		}


		@Override
		public String toString() {
			return "\ncalle: " + calle + ", numero_puerta_piso: " + numero_puerta_piso + ", ciudad: " + ciudad
					+ ", cod_postal: " + cod_postal + ", provincia: " + provincia;
		}
	    
    
}
