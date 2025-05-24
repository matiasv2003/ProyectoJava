package proyectoInventarioVenta.InventarioVenta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "registroVentas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class registroVentas {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idVenta;

    @Column(nullable=false)
    private Integer cantidad;

    @Column(nullable=false)
    private Integer precio;
    
}
