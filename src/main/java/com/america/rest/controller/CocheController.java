/**
 * 
 */
package com.america.rest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.america.rest.dto.CocheDTO;
import com.america.rest.dto.CreateCocheDTO;
import com.america.rest.dto.converter.CocheDTOConverter;
import com.america.rest.modelo.Coche;
import com.america.rest.modelo.CocheRepositorio;
import com.america.rest.modelo.Marca;
import com.america.rest.modelo.MarcaRepositorio;
import com.america.rest.service.CocheService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;

import io.swagger.annotations.ApiResponse;

/**
 * @author americasanchez
 *
 */

@RestController
@RequiredArgsConstructor
public class CocheController {

	private final CocheRepositorio cocheRepositorio;
	private final CocheDTOConverter cocheDTOConverter;
	private final MarcaRepositorio marcaRepositorio;
	
	private final CocheService cocheService;
	
	
	
	/**
	 * Obtener listado coches
	 * 
	 * @return 404 si no hay coches, 200 lista de coches
	 */	
	@ApiOperation(value = "Lista todos los coches registrados", notes = "Devuelve listado de coches" )
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "Ok"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	
	})
	@GetMapping("/api/car")
	public ResponseEntity<?> obtenerTodos() {
		List<Coche> result = cocheService.listadoCoches();
		
		if (result.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No hay coches en stock");
		} else {
			
			List<CocheDTO> dtoListaCoches = result.stream().map(cocheDTOConverter::convertToDto)
					.collect(Collectors.toList());
			
			return ResponseEntity.ok(dtoListaCoches);			
		}		
	}

	/**
	 * Obtener coche por su identificador ID
	 * 
	 * @param id
	 * @return 404 si no encuentra el coche, 200  si lo encuentra
	 */	
	@ApiOperation(value = "Obtiene un coche por ID", notes = "Devuelve vista detalle de un coche por su ID" )
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "OK"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	 
	})
	@GetMapping("/api/car/{id}")
	public ResponseEntity<?> obtenerPorIdentificador(@PathVariable Long id) {
		Coche result = cocheRepositorio.findById(id).orElse(null);
		if (result == null){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se ha podido encontrar un coche con ese ID");
		} else {
			return ResponseEntity.ok(result);
		}
	}

	/**
	 * Insertar nuevo coche
	 * 
	 * @param nuevo
	 * @return 201  coche insertado
	 */
	@ApiOperation(value = "Crea nuevo coche", notes = "Devuelve coche registrado" )
	@ApiResponses(value = { 
		@ApiResponse(code = 201, message = "Created"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	 
	})
	@PostMapping("/api/car")
	public ResponseEntity<?> nuevoCoche(@RequestBody CreateCocheDTO nuevo) {
		Coche nuevoCoche = cocheService.crearCoche(nuevo);
		if(nuevoCoche !=null) {
			Marca marca = marcaRepositorio.findById(nuevo.getMarcaId()).orElse(null);
			nuevoCoche.setMarca(marca);									
		}		
		return ResponseEntity.status(HttpStatus.CREATED).body(cocheRepositorio.save(nuevoCoche));				
	}
	

	/**
	 * Editar datos del coche
	 * 
	 * @param editar
	 * @param id
	 * @return 200 Ok si la edición tiene éxito, 404 si no se encuentra el coche
	 */
	@ApiOperation(value = "Edita coche", notes = "Devuelve coche editado" )
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "Ok"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	 
	})
	@PutMapping("/api/car/{id}")
	public ResponseEntity<?> editarCoche(@RequestBody Coche editar, @PathVariable Long id) {
				
		return cocheRepositorio.findById(id).map(p -> {
			p.setModelo(editar.getModelo());
			p.setCv(editar.getCv());
			p.setPrecio(editar.getPrecio());
			return ResponseEntity.ok(cocheRepositorio.save(p));			
		}).orElseGet(() -> {
			return ResponseEntity.notFound().build();
		});
	}

	/**
	 * Borrar coche por identificador ID
	 * 
	 * @param id
	 * @return Código 204 sin contenido
	 */	
	@ApiOperation(value = "Elimina coche solicitado por ID")
	@ApiResponses(value = { 
		@ApiResponse(code = 204, message = "No content"),
		@ApiResponse(code = 404, message = "Not Found"),
		@ApiResponse(code = 500, message = "Internal Server Error")	 
	})
	@DeleteMapping("/api/car/{id}")
	public ResponseEntity<?> borrarCoche(@PathVariable Long id) {		
		cocheRepositorio.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
