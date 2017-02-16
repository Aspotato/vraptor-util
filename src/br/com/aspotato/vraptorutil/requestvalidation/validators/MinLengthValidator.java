package br.com.aspotato.vraptorutil.requestvalidation.validators;

import br.com.aspotato.vraptorutil.requestvalidation.interfaces.RequestValidator;

public class MinLengthValidator implements RequestValidator {
	
	private String name;
	private String value;
	private int size;
	

	public MinLengthValidator(String _name, String _value,  int _size) {
		name = _name;
		value = _value;
		size = _size;
	}
	
	@Override
    public boolean isValid() {
		if(value != null && value.length()>=size){
			return true;
		}
	    return false;
    }

	@Override
    public String error() {
		return "O campo "+name+" tem mais de "+size+" caracteres";
    }

}
