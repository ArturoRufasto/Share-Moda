package com.sharemode.api.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.RegistroUsuarioEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.RegistroUsuariosService;

/**
 *
 * @author herofe
 */
@RestController
@RequestMapping("/registrousuarios")
public class RegistroUsuariosController {
      @Autowired
     private RegistroUsuariosService registrousuariosservice;
    
     @GetMapping 
     public List<RegistroUsuarioEntity> findAll(){
         return registrousuariosservice.findAll();
     }
     @GetMapping("/Custom")
     public List<RegistroUsuarioEntity> findAllCustom(){
         return registrousuariosservice.findAllCustom();
     }
//     @GetMapping("/(id)")
//     public Optional<RegistroUsuarioEntity> findById(@PathVariable Long id){
//         return registrousuariosservice.findById(id);
//     }
     @PostMapping
     public RegistroUsuarioEntity add( @RequestBody RegistroUsuarioEntity c){
         return registrousuariosservice.add(c);
     }
     
     /*@PutMapping("/(id)")
     public RegistroUsuarioEntity update(@PathVariable Long id,@RequestBody RegistroUsuarioEntity c){
         c.setCodigo(id);
         return registrousuariosservice.update(c);
     }*/
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}
