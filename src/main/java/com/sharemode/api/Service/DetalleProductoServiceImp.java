
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.sharemode.api.Entity.DetalleProductoEntity;
import com.sharemode.api.Repository.DetalleProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleProductoServiceImp implements DetalleProductoService {
    @Autowired
    private DetalleProductoRepository detalleproductorepository;
    public List<DetalleProductoEntity> findAll() {
        return detalleproductorepository.findAll();
    }
    
    public Optional<DetalleProductoEntity> findById(Long Id) {
        return detalleproductorepository.findById(Id);
    }
    public List<DetalleProductoEntity> findAllCustom() {
        return detalleproductorepository.findAllCustom();
    }

    public DetalleProductoEntity add(DetalleProductoEntity c) {
        return detalleproductorepository.save(c);
    }

//    public DetalleProductoEntity update(DetalleProductoEntity c) {
//        DetalleProductoEntity objCodpro = DetalleProductoRepository.getById(c.getCodpro());
//        BeanUtils.copyProperties(c,objDetalleProducto);
//        return detalleproductorepository.save(c);
//    }
//    public DetalleProductoEntity delete(DetalleProductoEntity c) {
//        DetalleProductoEntity objcodpro = detalleproductorepository.getById(c.getCodpro());
//        objcodpro.setnompro(false);
//        return detalleproductorepository.save(c);
//    }
    public Optional<DetalleProductoEntity> findbyId(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<DetalleProductoEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DetalleProductoEntity update(DetalleProductoEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DetalleProductoEntity delete(DetalleProductoEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


