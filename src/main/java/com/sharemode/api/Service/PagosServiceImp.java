
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.PagosEntity;
import com.sharemode.api.Repository.CategoriasRepository;
import com.sharemode.api.Repository.PagosRepository;
import org.springframework.stereotype.Service;



@Service
public class PagosServiceImp implements PagosService {
    

    @Autowired
    private PagosRepository pagosrepository;
    public List<PagosEntity> findAll() {
        return pagosrepository.findAll();
    }

    public Optional<PagosEntity> findById(Long Id) {
        return pagosrepository.findById(Id);
    }
    public List<PagosEntity> findAllCustom() {
        return pagosrepository.findAllCustom();
    }

    public PagosEntity add(PagosEntity c) {
        return pagosrepository.save(c);
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
    public Optional<PagosEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PagosEntity update(PagosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PagosEntity delete(PagosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    



    
}
