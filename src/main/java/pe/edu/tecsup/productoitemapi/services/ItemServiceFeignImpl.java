package pe.edu.tecsup.productoitemapi.services;

import org.springframework.stereotype.Service;
import pe.edu.tecsup.productoitemapi.clientes.ProductoClienteRest;
import pe.edu.tecsup.productoitemapi.dto.Item;
import pe.edu.tecsup.productoitemapi.dto.Producto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceFeignImpl implements  ItemServiceFeign{

	private ProductoClienteRest productoClienteRest;

	public ItemServiceFeignImpl(ProductoClienteRest productoClienteRest) {
		this.productoClienteRest = productoClienteRest;
	}

	public List<Item> findAll() {
		List<Producto> productos = productoClienteRest.listar();
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	public Item findById(Long id, Integer cantidad) {
		Producto producto = productoClienteRest.detalle(id);
		return new Item(producto, cantidad);
	}
}
