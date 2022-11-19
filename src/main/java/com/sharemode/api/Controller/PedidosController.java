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
import com.sharemode.api.Entity.PedidosEntity;
import com.sharemode.api.Service.CategoriasService;
import com.sharemode.api.Service.PedidosService;

/**
 *
 * @author herofe
 */
@RestController
@RequestMapping("/Pedidos")
public class PedidosController {
    @Autowired
     private PedidosService pedidosservice;
    
     
      @GetMapping 
     public List<PagosEntity> findAll(){
         return pedidosservice.findAll();
     }
     @GetMapping("/Custom")
     public List<PedidosEntity> findAllCustom(){
         return pedidosservice.findAllCustom();
     }
//     @GetMapping("/(id)")
//     public Optional<PedidosEntity> findById(@PathVariable Long id){
//         return pedidosservice.findById(id);
//     }
     @PostMapping
     public PedidosEntity add( @RequestBody PedidosEntity c){
         return pedidosservice.add(c);
     }
     
//     @PutMapping("/(id)")
//     public PedidosEntity update(@PathVariable Long id,@RequestBody PedidosEntity c){
//         c.setCodigo(id);
//         return pedidosservice.update(c);
//     }
     
//     @DeleteMapping("/id")
//     public CategoriasEntity delete(@PathVariable Long id,@RequestBody CategoriasEntity c){
//         CategoriasEntity objCategorias = new CategoriasEntity();
//         objCategorias.setCodpro(0);
//         
//         return categoriasservice.delete(CategoriasEntity.builder().codpro(id).build());
//}
}
