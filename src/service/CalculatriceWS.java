package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
// Annotation defined by javax.jws.WebService
// It is placed on a class that is intended
// to be used as service
public class CalculatriceWS {
	@WebMethod
	// Annotation defined by javax.jws.WebMethod
	// It provides information about the method
	public double somme(@WebParam double a, @WebParam double b) {
		// Annotation defined by javax.jws.WebParam
		// It is placed on the parameters of the method
		return a+b;
	}
}
