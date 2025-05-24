package proyectoInventarioVenta.InventarioVenta.dto.request.response;

import lombok.Data;
import proyectoInventarioVenta.InventarioVenta.model.registroVentas;

@Data
public class registroVentasDTO {
    private int idVenta;
    private int cantidad;
    private int precio;
   
    public registroVentasDTO(registroVentas regventas){
        this.idVenta = regventas.getIdVenta();
        this.cantidad = regventas.getCantidad();
        this.precio = regventas.getPrecio();
    }
}
