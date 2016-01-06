package br.com.aspotato.vraptorutil.requestvalidation.error;

import java.io.Serializable;

public class Error implements Serializable {

	private static final long serialVersionUID = -4023057589360414600L;

	private String name;
	private String description;

	public Error(){

	}

	public Error(String _description){
		setDescription(_description);
	}

	public Error(String _name, String _description){
		setName(_name);
		setDescription(_description);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
