package com.sharemode.api.Controller;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Service.CategoriasService;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {
     @Autowired
     private CategoriasService categoriasservice;
    
     @GetMapping 
     public List<CategoriasEntity> findAll(){
         return categoriasservice.findAll();
     }
     @GetMapping("/Custom")
     public List<CategoriasEntity> findAllCustom(){
         return categoriasservice.findAllCustom();
     }
     /*@GetMapping("/{id}")
     public Optional<CategoriasEntity> findById(@PathVariable Long id){
         return categoriasservice.findById(id);
     }*/
     @PostMapping
     public CategoriasEntity add( @RequestBody CategoriasEntity c){
         return categoriasservice.add(c);
     }
     
//     @PutMapping("/(id)")
//     public CategoriasEntity update(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         c.setCodigo(id);
//         return categoriasservice.update(c);
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}

