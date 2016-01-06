package br.com.aspotato.vraptorutil.requestvalidation.validators;

import br.com.aspotato.vraptorutil.requestvalidation.interfaces.RequestValidator;

public class NullableValidator implements RequestValidator {

	private String name;
	private String value;

	public NullableValidator(String _name, String _value) {
		name = _name;
		value = _value;
	}

	public boolean isValid(){
		if(value != null)	
			return true;
		else
			return false;
	}

	public String error(){
		return "O campo "+name+" não pode ser nullo";
	}

}
