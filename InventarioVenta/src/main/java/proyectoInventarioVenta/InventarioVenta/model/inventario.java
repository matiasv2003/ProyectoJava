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
@Table(name= "inventario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class inventario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idinventario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable=false)
    private Integer precio;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable=false)
    private Integer stock;

}
