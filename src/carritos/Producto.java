package carritos;

public class Producto {

	public String nombre;

	public Producto(String nombre) {
		super();
		if (nombre.length() < 2)
			throw new IllegalArgumentException("Nombre de producto mínimo largo 1");

		if (nombre.length() > 64)
			throw new IllegalArgumentException("Nombre de producto muy largo, mayor 64");

		this.nombre = nombre;
	}

}
