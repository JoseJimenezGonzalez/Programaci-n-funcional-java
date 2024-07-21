package org.formacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AgrupadorConList implements Agrupador {

	private List<Object> contenido = new ArrayList<>();

	@Override
	public void add(Object elemento) {
		this.contenido.add(elemento);
	}

	@Override
	public int numeroElementos() {
		return this.contenido.size();
	}
	
	// todo implementad los metodos de la interface usando la lista contenido

}
