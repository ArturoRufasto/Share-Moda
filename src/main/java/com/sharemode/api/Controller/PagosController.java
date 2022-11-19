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
import com.sharemode.api.Entity.PagosEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.PagosService;

/**
 *
 * @author herofe
 */
@RestController
@RequestMapping("/Pagos")
public class PagosController {
        @Autowired
     private PagosService pagosservice;
    
     @GetMapping 
     public List<PagosEntity> findAll(){
         return pagosservice.findAll();
     }
     @GetMapping("/Custom")
     public List<PagosEntity> findAllCustom(){
         return pagosservice.findAllCustom();
     }
//     @GetMapping("/(id)")
//     public Optional<PagosEntity> findById(@PathVariable Long id){
//         return pagosservice.findById(id);
//     }
     @PostMapping
     public PagosEntity add( @RequestBody PagosEntity c){
         return pagosservice.add(c);
     }
     
//     @PutMapping("/(id)")
//     public PagosEntity update(@PathVariable Long id,@RequestBody PagosEntity c){
//         c.setCodigo(id);
//         return pagosservices.update(c);
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}

