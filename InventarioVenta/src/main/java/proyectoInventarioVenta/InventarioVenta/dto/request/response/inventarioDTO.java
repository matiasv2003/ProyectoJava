package proyectoInventarioVenta.InventarioVenta.dto.request.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import proyectoInventarioVenta.InventarioVenta.model.inventario;

@Data
public class inventarioDTO {

    private int idInventario;
    private String nombre ;
    private String descripcion;
    private int precio;
    private String categoria;
    private int stock;
    List<registroVentasDTO> inventarioList = new ArrayList<>();

    public inventarioDTO(inventario inv){
        this.idInventario = inv.getIdinventario();
        this.nombre = inv.getNombre();
        this.descripcion = inv.getDescripcion();
        this.precio = inv.getPrecio();
        this.categoria = inv.getCategoria();
        this.stock = inv.getStock();
    }

    public inventarioDTO(int idInventario, String nombre, String descripcion){
        this.idInventario = idInventario;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

}
