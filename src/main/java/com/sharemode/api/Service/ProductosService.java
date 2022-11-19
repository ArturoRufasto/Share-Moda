
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.ProductosEntity;
 

public interface ProductosService {
    
    //Mostrar todos los registros
    public List<ProductosEntity>findAll();
    //buscaer registros
    public Optional<ProductosEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<ProductosEntity>findAllCustom();
    public ProductosEntity add(ProductosEntity c);
    public CategoriasEntity update(ProductosEntity c);
    public ProductosEntity delete (ProductosEntity c);
}
