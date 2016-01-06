package br.com.aspotato.vraptorutil.requestvalidation.interfaces;

public interface RequestValidator {

	boolean isValid();
	
	String error();

}
