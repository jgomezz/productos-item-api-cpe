package pe.edu.tecsup.productoitemapi.webs;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.productoitemapi.dto.Item;
import pe.edu.tecsup.productoitemapi.services.ItemServiceFeign;

@Slf4j
@RestController
public class ItemController {

	private ItemServiceFeign itemServiceFeign;

	public ItemController(ItemServiceFeign itemServiceFeign) {
		this.itemServiceFeign = itemServiceFeign;
	}

	@GetMapping("/items")
	public List<Item> listar() {
			return itemServiceFeign.findAll();
	}
	
	@GetMapping("/items/{id}/cantidades/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemServiceFeign.findById(id, cantidad);
	}
	
}