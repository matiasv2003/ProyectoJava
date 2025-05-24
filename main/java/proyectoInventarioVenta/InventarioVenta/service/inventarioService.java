package proyectoInventarioVenta.InventarioVenta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import proyectoInventarioVenta.InventarioVenta.model.inventario;
import proyectoInventarioVenta.InventarioVenta.repository.inventarioRepository;

@Service
@Transactional
public class inventarioService {
    
    @Autowired
    private inventarioRepository invRepository;

    //Metodo MostrarTodoElInventario
    public List<inventario> findAll(){
        return invRepository.findAll();
    }
    //Metodo AgregarInventario
    public inventario save(inventario inv){
        return invRepository.save(inv);
    }

    //Metodo Eliminar
    public void delete(Long inventario){
        invRepository.deleteById(inventario);
    }

    //Metodo Actualizar
    public inventario findById(long idInventario) {
        return invRepository.findById(idInventario).get();
    }
    


}
