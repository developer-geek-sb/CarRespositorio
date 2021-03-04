/**
 * 
 */
package com.america.rest.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author americasanchez
 *
 */
public interface MarcaRepositorio extends JpaRepository<Marca, Long> {

	@Query(value="SELECT DISTINCT  modelo FROM coche WHERE marca_id= ?1",nativeQuery=true)
	List<String> listaModelosPorMarca(Long id);
	
	
}
