package pe.edu.tecsup.productoitemapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private Long id;
	private String nombre;
	private Double precio;
	private String imagen;
	private String detalles;
	private String estado;

}
