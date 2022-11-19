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
import com.sharemode.api.Entity.ProductosEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.ProductosService;

/**
 *
 * @author herofe
 */
@RestController
@RequestMapping("/productos")
public class ProductosController {
      @Autowired
     private ProductosService productosservice;
    
     @GetMapping 
     public List<ProductosEntity> findAll(){
         return productosservice.findAll();
     }
     @GetMapping("/Custom")
     public List<ProductosEntity> findAllCustom(){
         return productosservice.findAllCustom();
     }
//     @GetMapping("/(id)")
//     public Optional<ProductosEntity> findById(@PathVariable Long id){
//         return productosservice.findById(id);
//     }
     @PostMapping
     public ProductosEntity add( @RequestBody ProductosEntity c){
         return productosservice.add(c);
     }
     
//     @PutMapping("/(id)")
//     public CategoriasEntity update(@PathVariable Long id,@RequestBody ProductosEntity c){
//         c.setCodigo(id);
//         return productosservice.update( c );
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}
