package br.com.aspotato.vraptorutil.requestvalidation;

import java.util.ArrayList;
import br.com.aspotato.vraptorutil.requestvalidation.error.Error;
import br.com.aspotato.vraptorutil.requestvalidation.interfaces.RequestValidator;

public class Validator {

	private ArrayList<RequestValidator> collection = new ArrayList<>();

	public Validator add(RequestValidator item){
		collection.add(item);
		return this;
	}
	
	public boolean isValid(){
		if(errors().isEmpty()){
			return true;
		}
		return false;
	}

	public ArrayList<Error> errors(){

		ArrayList<Error> list = new ArrayList<>();

		for (RequestValidator validator : collection) {
			if(validator.isValid() == false){
				list.add(new Error(validator.error()));

			}
		}
		return list;

	}

}
