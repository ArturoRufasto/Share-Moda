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
import com.sharemode.api.Entity.DetalleProductoEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.DetalleProductoService;

/**
 *
 * @author herofe
 */@RestController
@RequestMapping("/DetalleProducto")
public class DetalleProductoController {
     @Autowired
     private DetalleProductoService detalleProductoService;
    
     @GetMapping 
     public List<DetalleProductoEntity> findAll(){
         return detalleProductoService.findAll();
     }
     @GetMapping("/Custom")
     public List<DetalleProductoEntity> findAllCustom(){
         return detalleProductoService.findAllCustom();
     }
     /*@GetMapping("/(id)")
     public Optional<DetalleProductoEntity> findById(@PathVariable Long id){
         return detalleProductoService.findById(id);
     }*/
     @PostMapping
     public DetalleProductoEntity add( @RequestBody DetalleProductoEntity c){
         return detalleProductoService.add(c);
     }
     
//     @PutMapping("/(id)")
//     public DetalleProductoEntity update(@PathVariable Long id,@RequestBody DetalleProductoEntity c){
//         c.setCodigo(id);
//         return detalleProductoService.update(c);
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}
