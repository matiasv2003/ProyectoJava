package proyectoInventarioVenta.InventarioVenta.dto.request;

import lombok.Data;

@Data
public class inventarioRequestDTO {

    private int idInventario;
    private String nombre ;
    private String descripcion;
    private int precio;
    private String categoria;
    private int stock;

}
