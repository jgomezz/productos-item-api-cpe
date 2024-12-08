package pe.edu.tecsup.productoitemapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	
	private Producto producto;
	
	private Integer cantidad;

	public Double getTotal() {
		if(this.producto != null && this.producto.getPrecio() != null && this.cantidad != null) {
			return this.producto.getPrecio() * this.cantidad.doubleValue();
		}
		return null;
	}

}
