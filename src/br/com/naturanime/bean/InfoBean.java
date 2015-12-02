package br.com.naturanime.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named( value="infoBean" )
@ApplicationScoped
public class InfoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double versao;
	
	
	@PostConstruct
	public void inicalizar(){
		
		setVersao( 0.1 );
	}

	public Double getVersao() {
		return versao;
	}

	public void setVersao( Double versao ) {
		this.versao = versao;
	}

}
