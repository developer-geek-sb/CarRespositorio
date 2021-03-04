/**
 * 
 */
package com.america.rest.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.america.rest.dto.CocheDTO;
import com.america.rest.modelo.Coche;

import lombok.RequiredArgsConstructor;

/**
 * @author americasanchez
 *
 */
@Component
@RequiredArgsConstructor
public class CocheDTOConverter {
	
	private final ModelMapper modelMapper;
	
	public CocheDTO convertToDto(Coche coche) {
		return modelMapper.map(coche, CocheDTO.class);
		
	}
	
}
