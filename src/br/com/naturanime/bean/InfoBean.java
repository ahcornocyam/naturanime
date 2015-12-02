package br.com.naturanime.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named( value="infoBean" )
@ApplicationScoped
public class InfoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String versao;
	
	
	@PostConstruct
	public void inicalizar(){
		
		setVersao( "0.0.1" );
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao( String versao ) {
		this.versao = versao;
	}

}
