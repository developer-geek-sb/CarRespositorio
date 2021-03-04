/**
 * 
 */
package com.america.rest.service;

import java.util.List;

import com.america.rest.dto.CreateCocheDTO;
import com.america.rest.modelo.Coche;

/**
 * @author americasanchez
 *
 */
public interface CocheService {
			
	public List<Coche> listadoCoches ();
	
	public Coche crearCoche(CreateCocheDTO nuevo);
	
}
