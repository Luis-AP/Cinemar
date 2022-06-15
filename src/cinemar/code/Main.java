package cinemar.code;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<String> formatos1 = new ArrayList<String>();
		formatos1.add("2d");
		formatos1.add("3d");
		ArrayList<String> formatos2 = new ArrayList<String>();
		formatos1.add("2d");
		
		Sala sala1= new Sala(1,formatos1);
		Sala sala2= new Sala(2,formatos2);
		
		ArrayList<Sala> misSalas= new ArrayList<Sala>();
		misSalas.add(sala1);
		misSalas.add(sala2);
	}
}
