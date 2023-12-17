package pe.edu.tecsup.productoitemapi.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pe.edu.tecsup.productoitemapi.dto.Producto;

@FeignClient(name = "productos-api", url = "localhost:8080")
public interface ProductoClienteRest {

	@GetMapping("/productos")
	public List<Producto> listar();

	@GetMapping("/productos/id/{id}")
	public Producto detalle(@PathVariable Long id);

}
