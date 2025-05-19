package proyectoInventarioVenta.InventarioVenta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import proyectoInventarioVenta.InventarioVenta.model.registroVentas;
import proyectoInventarioVenta.InventarioVenta.repository.registroVentasRepository;

@Service
@Transactional
public class registroVentasService {
    
    @Autowired
    private registroVentasRepository rvRepository;

    //Metodo MostrarTodasLasVentas
    public List<registroVentas> findAll(){
        return rvRepository.findAll();
    }
    //Metodo RegistrarVenta
    public registroVentas save(registroVentas regven){
        return rvRepository.save(regven);
    }

    //Metodo BuscarVenta
    public registroVentas findById(long idVenta){
        return rvRepository.findById(idVenta).get();
    }
    //Metodo EliminarVenta
    public void delete(Long idVenta){
        rvRepository.deleteById(idVenta);
    }
}
