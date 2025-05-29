package proyectoInventarioVenta.InventarioVenta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyectoInventarioVenta.InventarioVenta.model.registroVentas;
import proyectoInventarioVenta.InventarioVenta.service.registroVentasService;

@RestController
@RequestMapping("/api/v1/registroVentas")
public class registroVentasController {
    
        @Autowired
        private registroVentasService rvService;

        @GetMapping
        public ResponseEntity<List<registroVentas>> listar() {
            List<registroVentas> rgList = rvService.findAll();
            if(rgList.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(rgList);
        }
        
        @PostMapping
        public ResponseEntity<registroVentas> guardar(@RequestBody registroVentas rgsave) {
            registroVentas newVenta = rvService.save(rgsave);
            return ResponseEntity.status(HttpStatus.CREATED).body(newVenta);
        }
        
        @GetMapping("/{idVenta}")
        public ResponseEntity<registroVentas> buscar(@PathVariable Integer idVenta) {
            try{
                registroVentas rgFind = rvService.findById(idVenta);
                return ResponseEntity.ok(rgFind);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }

        @DeleteMapping("/{idVenta}")
        public ResponseEntity<?> eliminar(@PathVariable Long idVenta) {
            try {
                rvService.delete(idVenta);
                return ResponseEntity.noContent().build();
            } catch( Exception e ) {
                return ResponseEntity.notFound().build();
            }
        }
                @PutMapping("/{idVenta}")
        public ResponseEntity<registroVentas> actualizar(@PathVariable Integer idVenta,@RequestBody registroVentas ven) {
            try {
                registroVentas venre = rvService.findById(idVenta);
                venre.setIdVenta(idVenta);
                venre.setCantidad(ven.getCantidad());
                venre.setPrecio(ven.getPrecio());
                rvService.save(venre);
                return ResponseEntity.ok(ven);
                
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
}
