
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.PagosEntity;
import com.sharemode.api.Entity.PedidosEntity;
import com.sharemode.api.Repository.CategoriasRepository;
import com.sharemode.api.Repository.PedidosRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidosServiceImp implements PedidosService {
    
    @Autowired
    private PedidosRepository pedidosrepository;
    
    /*public List<PedidosEntity> findAll() {
        return pedidosrepository.findAll();
    }/*/

    public Optional<PedidosEntity> findById(Long Id) {
        return pedidosrepository.findById(Id);
    }
    public List<PedidosEntity> findAllCustom() {
        return pedidosrepository.findAllCustom();
    }

    public PedidosEntity add(PedidosEntity c) {
        return pedidosrepository.save(c);
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
    public Optional<PedidosEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidosEntity update(PedidosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PedidosEntity delete(PedidosEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PagosEntity> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
