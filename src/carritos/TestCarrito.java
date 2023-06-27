package carritos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import carritos.Carrito.EstadoCarrito;

class TestCarrito {

	@Test
	void alCrearElCarrritoQuedaAbierto() {
		Carrito carrito = new Carrito();
		assertEquals(EstadoCarrito.ABIERTO, carrito.estado);
	}

	@Test()
	void elNombreDebeTenerMinimo2Caracteres() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Producto("a");
		});
	}

	@Test()
	void elNombreDebeTenerMaximo256() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {

			new Producto(
					"02134567890213456789021345678902134567890213456789021345678902134567890213456789021345678902134567890213456789");
		});
	}

	@Test
	void leAgreamosUnProductoMideSize() {

		Carrito c = new Carrito();
		Producto pepsi = new Producto("Pepsi");
		c.agregarProducto(pepsi, 1);
		assertEquals(1, c.productos.size());

	}

	@Test
	void leAgreamosUnProductoNombreCorrecto() {

		Carrito c = new Carrito();
		Producto pepsi = new Producto("Pepsi");
		c.agregarProducto(pepsi, 1);
		assertEquals(pepsi, c.productos.get(0).producto);

	}

	@Test
	void guardaLaCantidadAgregada() {

		Carrito c = new Carrito();
		Producto pepsi = new Producto("Pepsi");
		c.agregarProducto(pepsi, 2);
		assertEquals(2, c.productos.get(0).cantidad);

	}

	@Test
	void noPuedeAgregarCero() {

		Carrito c = new Carrito();
		Producto pepsi = new Producto("Pepsi");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			c.agregarProducto(pepsi, 0);
		});

	}
//	@Test
//	void elCatalogoDeProductosEstaVacioAlPrincipioa() {
//		Catalogo catalogo= new Catalogo();
//		assertEquals(0, catalogo.productos.size());
//	}

}
