package br.com.aspotato.vraptorutil.requestvalidation.validators;

import br.com.aspotato.vraptorutil.requestvalidation.interfaces.RequestValidator;

public class IntegerValidator implements RequestValidator {

	private String name;
	private String value;

	@Override
	public boolean isValid() {
		try {
			Integer.parseInt(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String error() {
		return "O campo "+name+" deve ser um número inteiro";    
	}

}
