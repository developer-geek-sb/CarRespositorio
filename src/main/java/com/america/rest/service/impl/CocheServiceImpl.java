/**
 * 
 */
package com.america.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.america.rest.dto.CreateCocheDTO;
import com.america.rest.modelo.Coche;
import com.america.rest.modelo.CocheRepositorio;
import com.america.rest.service.CocheService;

/**
 * @author americasanchez
 *
 */
@Service
public class CocheServiceImpl implements CocheService {
	
	@Autowired
	private CocheRepositorio repositorioCoche;
	
	@Override
	public List<Coche> listadoCoches() {
		List<Coche> listado = repositorioCoche.findAll();		
		return listado;
	}

	@Override
	public Coche crearCoche(CreateCocheDTO cocheDTO) {
		Coche nuevoCoche = null;
		if(cocheDTO != null) {
			nuevoCoche = new Coche();
			nuevoCoche.setModelo(cocheDTO.getModelo());
			nuevoCoche.setCv(cocheDTO.getCv());
			nuevoCoche.setPrecio(cocheDTO.getPrecio());
		}
		return nuevoCoche;
	}
	
}
