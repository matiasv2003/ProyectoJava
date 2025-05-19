package proyectoInventarioVenta.InventarioVenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectoInventarioVenta.InventarioVenta.model.registroVentas;

@Repository
public interface registroVentasRepository extends JpaRepository<registroVentas,Long>{

    
}
