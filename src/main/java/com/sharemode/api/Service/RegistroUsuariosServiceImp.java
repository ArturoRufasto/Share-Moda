
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;


import com.sharemode.api.Entity.CategoriasEntity;
import com.sharemode.api.Entity.RegistroUsuarioEntity;
import com.sharemode.api.Repository.CategoriasRepository;
import com.sharemode.api.Repository.RegistroUsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistroUsuariosServiceImp implements RegistroUsuariosService {
    
    @Autowired
    private RegistroUsuarioRepository registrousuariosrepository;
    
    @Override
    public List<RegistroUsuarioEntity> findAll() {
        return registrousuariosrepository.findAll();
    }

    public Optional<RegistroUsuarioEntity> findById(Long Id) {
        return registrousuariosrepository.findById(Id);
    }
    public List<RegistroUsuarioEntity> findAllCustom() {
        return registrousuariosrepository.findAllCustom();
    }

    public RegistroUsuarioEntity add(RegistroUsuarioEntity c) {
        return registrousuariosrepository.save(c);
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

    @Override
    public Optional<RegistroUsuarioEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RegistroUsuarioEntity update(RegistroUsuarioEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RegistroUsuarioEntity delete(RegistroUsuarioEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
