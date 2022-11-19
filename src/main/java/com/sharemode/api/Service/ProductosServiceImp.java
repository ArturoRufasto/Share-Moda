
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.ProductosEntity;
import com.sharemode.api.Repository.CategoriasRepository;
import com.sharemode.api.Repository.ProductosRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImp implements ProductosService {
    
    @Autowired
    private ProductosRepository productosrepository;
    public List<ProductosEntity> findAll() {
        return productosrepository.findAll();
    }

    public Optional<ProductosEntity> findById(Long Id) {
        return productosrepository.findById(Id);
    }
    public List<ProductosEntity> findAllCustom() {
        return productosrepository.findAllCustom();
    }

    public ProductosEntity add(ProductosEntity c) {
        return productosrepository.save(c);
    }

//    public CategoriasEntity update(CategoriasEntity c) {
//        CategoriasEntity objCodpro = CategoriasRepository.getById(c.getCodpro());
//        BeanUtils.copyProperties(c,objCategorias);
//        return categoriasrepository.save(c);
//    }
//    public CategoriasEntity delete(CategoriasEntity c) {
//        CategoriasEntity objcodpro = CategoriasRepositorio.getById(c.getCodpro());
//        objcodpro.setnompro(false);
//        return categoriasrepository.save(c);
//    }
    public Optional<CategoriasEntity> findbyId(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<ProductosEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoriasEntity update(ProductosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductosEntity delete(ProductosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
