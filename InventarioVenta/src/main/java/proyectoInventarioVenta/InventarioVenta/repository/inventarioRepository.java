package proyectoInventarioVenta.InventarioVenta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proyectoInventarioVenta.InventarioVenta.model.inventario;

@Repository
public interface inventarioRepository extends JpaRepository<inventario,Long>{
}

