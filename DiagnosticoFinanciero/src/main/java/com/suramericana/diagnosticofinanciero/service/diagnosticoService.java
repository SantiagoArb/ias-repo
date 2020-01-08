package com.suramericana.diagnosticofinanciero.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.suramericana.diagnosticofinanciero.dto.diagnostico;

public class diagnosticoService {
	
	public diagnostico crearDiagnostico(diagnostico diag) {
		
		return diag;
	}
	
	public List<diagnostico> obtenerDiagnosticos(String cdempresa){
		
		ArrayList<diagnostico> diagnosticos = new ArrayList<diagnostico>();
		
		diagnosticos.add(new diagnostico(1,"2313","diagnostico 1","", new Date(),new Date()));
		diagnosticos.add(new diagnostico(2,"2313","diagnostico 2","", new Date(),new Date()));
		diagnosticos.add(new diagnostico(3,"2314","diagnostico 3","", new Date(),new Date()));
		diagnosticos.add(new diagnostico(4,"2314","diagnostico 4","", new Date(),new Date()));
		
		List<diagnostico> respuesta = diagnosticos.stream()
										.filter(diagno -> cdempresa.equalsIgnoreCase(diagno.getDniempresa()))
										.collect(Collectors.toList());
		
		return respuesta;
		
	}

}
