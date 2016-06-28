package consola;

import entidad.Memorando;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memorando m = new Memorando(4);
		m.setArticulo(1, "Los perros comen galletas para humanos y perros.");
		m.setArticulo(2, "El gato se comio mi pate y se relamia.");
		m.setArticulo(3, "Los perros roncan mucho");
		
		System.out.println("Posicion1: " + m.getArticulo(1) + "\n" +
							"Posicion2: " + m.getArticulo(2) + "\n" +
							"Posicion3: " + m.getArticulo(3) + "\n" 
							);
		
		System.out.println(m.articulosCon("perro"));
	}

}
