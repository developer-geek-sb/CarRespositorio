/**
 * 
 */
package com.america.rest.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.america.rest.modelo.Marca;
import com.america.rest.modelo.MarcaRepositorio;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;



/**
 * @author americasanchez
 *
 */
@RestController
@RequiredArgsConstructor
@Api(value="servicio end-points de marca")
public class MarcaController {
	
	private final MarcaRepositorio marcaRepositorio;
	
	/**
	 * Obtener listado modelos por marca
	 * 
	 * @return 404 si no hay modelos, 200 lista de modelos
	 * 
	 */
	@ApiOperation(value = "Lista todos los modelos", notes = "Devuelve listado de modelos" )
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "Ok"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	
	})
	@GetMapping("/api/brand/{id}/models")
	public ResponseEntity<?> obtenerModelos(@PathVariable Long id) {
		List<String> result = marcaRepositorio.listaModelosPorMarca(id);
		if (result.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(result);			
		}		
	}
	
	/**
	 * Obtener listado marcas
	 * 
	 * @return 404 si no hay marcas, 200 lista de marcas
	 */	
	@ApiOperation(value = "Lista todos las marcas", notes = "Devuelve listado de marcas" )
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "Ok"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	
	})
	@GetMapping("/api/brand")
	public ResponseEntity<?> obtenerListadoMarcas() {
		List<Marca> result = marcaRepositorio.findAll();		
		if (result.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay marcas registradas");
		} else {					
			return ResponseEntity.ok(result);			
		}		
	}
	
}
