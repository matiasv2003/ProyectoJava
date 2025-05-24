package proyectoInventarioVenta.InventarioVenta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import proyectoInventarioVenta.InventarioVenta.dto.request.response.registroVentasDTO;
import proyectoInventarioVenta.InventarioVenta.model.registroVentas;

@Repository
public interface registroVentasRepository extends JpaRepository<registroVentas,Long>{

    @Query("select new proyectoInventarioVenta.InventarioVenta.dto.request.response.registroVentasDTO(r)" +
            " from registroVentas r  ")
    List<registroVentasDTO> findByIdVenta(@Param("idVenta") int idVenta);
    
}
