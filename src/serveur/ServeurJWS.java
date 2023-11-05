package serveur;

import javax.xml.ws.Endpoint;
// javax.xml.ws.Endpoint is an API that creates a Web Service
// without deployement to server Instance

import service.CalculatriceWS;

public class ServeurJWS {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8084/", new CalculatriceWS());
		// Endpoint.publish start a small server http at the specified port
		// for the specified Web Service
		System.out.print("Web Service déployé sur http://localhost/8084/");
	}
}
