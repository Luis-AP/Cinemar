package com.cinemar;

import static spark.Spark.*;

import java.util.ArrayList;

//import com.cinemar.models.Persona;
import com.cinemar.models.Usuario;
import com.cinemar.service.CRUDUsuario;
import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
//		get("/saludar",(request, response) -> "Hola mundo");
		//port(8080);
		post("/register", (request, response) -> {
			response.type("application/json");
			//response.header("Access-Control-Allow-Origin", "*");
			Gson mapper = new Gson();
			Usuario user = mapper.fromJson(request.body(), Usuario.class);
		    if(user.getContrasenia().length()<8) {
		    	System.out.print("Contrasenia muy corta");
		    	return mapper
		    			.toJson(new StandardResponse(StatusResponse.ERROR,"Contrasenia muy corta"));
		    }else {
		    	//Ejecutar Servicio
				CRUDUsuario cu = new CRUDUsuario();
				boolean resultado = cu.insertar(user);

			    if(resultado==true) {
			    	return mapper
			    			.toJson(new StandardResponse(StatusResponse.SUCCESS));
			    }else {
			    	return mapper
			    			.toJson(new StandardResponse(StatusResponse.ERROR));
			    }
		    }
			
		});
		
		post("/login", (request, response) -> {
			response.type("application/json");
			Gson mapper = new Gson();
			Usuario user = mapper.fromJson(request.body(), Usuario.class);
			//System.out.print(user);
			//Ejecutar Servicio
			CRUDUsuario cu = new CRUDUsuario();
			boolean resultado = cu.iniciarSesion(user);

		    if(resultado==true) {
		    	return mapper
		    			.toJson(new StandardResponse(StatusResponse.SUCCESS,"Sesion Iniciada"));
		    }else {
		    	return mapper
		    			.toJson(new StandardResponse(StatusResponse.ERROR,"Datos incorrectos"));
		    }
			
		});
		
		get("/users", (request, response) -> {
			response.type("application/json");
			response.header("Access-Control-Allow-Origin", "*");
			Gson mapper = new Gson();
			
			//Ejecutar Servicio
			CRUDUsuario cu = new CRUDUsuario();
			ArrayList<Usuario> users = cu.consultarUsuarios();
			return mapper.toJson(users);
//		    if(resultado==true) {
//		    	return mapper
//		    			.toJson(new StandardResponse(StatusResponse.SUCCESS,"Sesion Iniciada"));
//		    }else {
//		    	return mapper
//		    			.toJson(new StandardResponse(StatusResponse.ERROR,"Datos incorrectos"));
//		    }
			
		});
	}

}
