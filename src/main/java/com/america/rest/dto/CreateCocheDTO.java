/**
 * 
 */
package com.america.rest.dto;


import lombok.Getter;
import lombok.Setter;

/**
 * @author americasanchez
 *
 */
@Getter @Setter 
public class CreateCocheDTO {
	
	private String modelo;
	
	private String cv;
	
	private float precio;
	
	private long marcaId;
	
}
