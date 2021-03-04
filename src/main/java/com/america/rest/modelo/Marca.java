/**
 * 
 */
package com.america.rest.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author americasanchez
 *
 */
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name="marca")
public class Marca {
	
	@Id @GeneratedValue
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="nombre", nullable = false, columnDefinition = "varchar")
	private String nombre;
	
}
