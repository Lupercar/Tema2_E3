package entidad;

import java.util.ArrayList;
import java.util.List;

public class Memorando {
	private String titulo;
	private int numeroArticulos;
	private String[] articulo;

	public Memorando(int numeroArticulos) {
		super();
		if (numeroArticulos > 1) // la posicion cero no se contemppla en el
									// ejercicio
			articulo = new String[numeroArticulos + 1]; // le sumo uno para que
														// haya de 1 a n
														// articulos ya que el
														// cero no se usa
	}

	public Memorando(int numeroArticulos, String titulo) {
		this(numeroArticulos);
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroArticulos() {
		return articulo.length;
	}

	public String getArticulo(int posicion) {
		String retorno = "";
		if (posicion > 0 && posicion < getNumeroArticulos()) // comienza por 1
																// porque
			// segun ejercicio el
			// cero se desecha
			retorno = articulo[posicion];
		else
			throw new ArrayIndexOutOfBoundsException("Posición fuera del rango.");
		return retorno;
	}

	public void setArticulo(int posicion, String contenido) {
		if (posicion > 0 && posicion < getNumeroArticulos())
			articulo[posicion] = contenido;
		else
			throw new ArrayIndexOutOfBoundsException("Posición fuera del rango.");
	}

	// creo la interfaz
	public interface IProcesa {
		boolean valida(String art);
	}

	public String[] articulosQueCumplenCon(IProcesa validacion) {
		List<String> retornoList = new ArrayList<>();
		for (String a : articulo) {
			if (validacion.valida(a) == true)
				retornoList.add(a);
		}

		String[] retornado = new String[retornoList.size()]; // creo un array de
																// String con el
																// tamaño del
																// arrayList
		retornado = retornoList.toArray(retornado); // relleno el Strin[] con el
													// contenido del arrayList
		return retornado;
	}

	public String[] articulosCon(String texto) {
		return articulosQueCumplenCon(s -> s.contains(texto));
	}

}// fin class Memorando
