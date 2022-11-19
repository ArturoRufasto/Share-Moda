package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Repository.CategoriasRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriasServiceImp implements CategoriasService{
    @Autowired
    private CategoriasRepository categoriasrepository;
    
    @Override
    public List<CategoriasEntity> findAll() {
        return categoriasrepository.findAll();
    }
    
    
    @Override
    public List<CategoriasEntity> findAllCustom() {
        return categoriasrepository.findAllCustom();
    }
    
    @Override
    public CategoriasEntity add(CategoriasEntity c) {
        return categoriasrepository.save(c);
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
    public Optional<CategoriasEntity> findById(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoriasEntity update(CategoriasEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public CategoriasEntity delete(CategoriasEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
