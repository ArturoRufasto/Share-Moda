/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import com.sharemode.api.Entity.EntregaEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.EntregaService;

/**
 *
 
 * @author herofe
 */@RestController
@RequestMapping("/Entrega")
public class EntregaController {
    
    @Autowired
     private EntregaService entregaservice;
    
     @GetMapping 
     public List<EntregaEntity> findAll(){
         return entregaservice.findAll();
     }
     @GetMapping("/Custom")
     public List<EntregaEntity> findAllCustom(){
         return entregaservice.findAllCustom();
     }
     /*@GetMapping("/(id)")
     public Optional<EntregaEntity> findById(@PathVariable Long id){
         return entregaservice.findById(id);
     }*/
     @PostMapping
     public EntregaEntity add( @RequestBody EntregaEntity c){
         return entregaservice.add(c);
     }
     
//     @PutMapping("/(id)")
//     public EntregaEntity update(@PathVariable Long id,@RequestBody EntregaEntity c){
//         c.setCodigo(id);
//         return entregaservice.update(c);
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}
