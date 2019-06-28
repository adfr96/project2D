package it.uniroma3.asw.cservice.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CService {
	
	@Value("${spring.application.name}")
	private String cServiceName;
	
	private List<String> parametri;
	
	public CService() {
		this.parametri = new ArrayList<String>();
	}
	
	public String getParametriRichiesta() {
		
		StringBuilder toReturn = new StringBuilder();
		toReturn.append(this.cServiceName);
		toReturn.append(": [");
		for(String parametro : this.parametri) {
			toReturn.append(parametro);
			toReturn.append(" ");
		}
		toReturn.append("]");
		
		return toReturn.toString();
	}
	
	public void saveParametri(String parametri) {
		this.parametri.add(parametri);
	}
	
}
