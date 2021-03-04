/**
 * 
 */
package com.america.rest.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="coche")
public class Coche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="modelo", nullable = false, columnDefinition = "varchar")
	private String modelo;
	
	@Column(name="cv", nullable = false, columnDefinition = "varchar")
	private String cv;
	
	@Column(name="precio", nullable = false, columnDefinition = "real")
	private float precio;
	
	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;
	
}
