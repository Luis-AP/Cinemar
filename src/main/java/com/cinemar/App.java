package com.cinemar;

import static spark.Spark.*;

import com.cinemar.models.Usuario;
import com.cinemar.service.CRUDUsuario;
import com.google.gson.Gson;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		port(8080);
//		Gson mapper = new Gson();
//		ArrayList<Persona> personas = new ArrayList<Persona>();
//		personas.add(new Persona("Luis","Parada","lap18958@gmail",24));
//		personas.add(new Persona("Ana","Juarez","anita@gmail.com",21));
//		personas.add(new Persona("Sonia","Lopez","sonilop@gmail.com",30));
//		
//		get("/users",(request,response)->personas,mapper::toJson);
		post("/registrar",(request,response)->{
			response.type("application/json");
			Gson mapper = new Gson();
			Usuario user = mapper.fromJson(request.body(),Usuario.class);
			
			if(user.getContrasenia().length()<8) {
				return mapper
						.toJson(new StandardResponse(StatusResponse.ERROR,"Contraseña insegura"));
			}else {
				//Ejecutar un servicio
				CRUDUsuario cu = new CRUDUsuario();
				cu.registrar(user);
				
				return mapper
						.toJson(new StandardResponse(StatusResponse.SUCCESS,"Usuario Registrado con Exito"));
			}
		});
		
		post("/logear",(request,response)->{
			response.type("application/json");
			Gson mapper = new Gson();
			Usuario user = mapper.fromJson(request.body(),Usuario.class);
			
			//Ejecutar un servicio
			CRUDUsuario cu = new CRUDUsuario();
			boolean resultado = cu.iniciarSesion(user);
			
			if(resultado==true) {
				return mapper
						.toJson(new StandardResponse(StatusResponse.SUCCESS,"Logeado con exito"));
			}else {
				return mapper
						.toJson(new StandardResponse(StatusResponse.ERROR,"Contraseña incorrecta"));
			}
		});
	}

}
