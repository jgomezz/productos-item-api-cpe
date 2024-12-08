package pe.edu.tecsup.productoitemapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.productoitemapi.clientes.ProductoClienteRest;
import pe.edu.tecsup.productoitemapi.dto.Item;
import pe.edu.tecsup.productoitemapi.dto.Producto;

@Service
public interface ItemServiceFeign {

	List<Item> findAll() ;

	Item findById(Long id, Integer cantidad);

	
}
