package carritos;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	enum EstadoCarrito {
		ABIERTO, PAGADO
	}

	public EstadoCarrito estado = EstadoCarrito.ABIERTO;
	public List<ProductoCarrito> productos = new ArrayList<>();

	public void agregarProducto(Producto producto, int cantidad) {
		if (cantidad == 0)
			throw new IllegalArgumentException("Cantidad no puede ser cero");

		productos.add(new ProductoCarrito(producto, cantidad));

	}

}
