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

import proyectoInventarioVenta.InventarioVenta.model.inventario;
import proyectoInventarioVenta.InventarioVenta.service.inventarioService;

@RestController
@RequestMapping("/api/v1/inventario")
public class inventarioController {
    
        @Autowired
        private inventarioService invService;

        @GetMapping
        public ResponseEntity<List<inventario>> listar() {
            List<inventario> rgList = invService.findAll();
            if(rgList.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(rgList);
        }
        
        @PostMapping
        public ResponseEntity<inventario> guardar(@RequestBody inventario rgsave) {
            inventario newVenta = invService.save(rgsave);
            return ResponseEntity.status(HttpStatus.CREATED).body(newVenta);
        }
        
        @DeleteMapping("/{idInventario}")
        public ResponseEntity<?> eliminar(@PathVariable Long idInventario) {
            try {
                invService.delete(idInventario);
                return ResponseEntity.noContent().build();
            } catch( Exception e ) {
                return ResponseEntity.notFound().build();
            }
        }

        @PutMapping("/{idInventario}")
        public ResponseEntity<inventario> actualizar(@PathVariable Integer idInventario,@RequestBody inventario inventario) {
            try {
                inventario inven = invService.findById(idInventario);
                inven.setIdinventario(idInventario);
                inven.setNombre(inventario.getNombre());
                inven.setDescripcion(inventario.getDescripcion());
                inven.setPrecio(inventario.getPrecio());
                inven.setCategoria(inventario.getCategoria());
                inven.setStock(inventario.getStock());

                invService.save(inven);
                return ResponseEntity.ok(inventario);
                
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }




}
