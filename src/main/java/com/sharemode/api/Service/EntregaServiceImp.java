/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import com.sharemode.api.Entity.EntregaEntity;
import com.sharemode.api.Repository.EntregaRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author herofe
 */
@Service
public class EntregaServiceImp implements EntregaService {
    

private EntregaRepository entregaRepository;
    public List<EntregaEntity> findAll() {
        return entregaRepository.findAll();
    }

    public Optional<EntregaEntity> findById(Long Id) {
        return entregaRepository.findById(Id);
    }
    public List<EntregaEntity> findAllCustom() {
        return entregaRepository.findAllCustom();
    }

    public EntregaEntity add(EntregaEntity c) {
        return entregaRepository.save(c);
    }

//    @Override
//    public EntregaEntity update(EntregaEntity c) {
//        EntregaEntity objcodpro = entregaRepository.getById(c.getCodpro());
//        BeanUtils.copyProperties(c,objEntrega);
//        return entregaRepository.save(c);
//    }
//@Override
//    public EntregaEntity delete(EntregaEntity c) {
//        EntregaEntity objDistrito = entregaRepository.getById(c.getCodpro());
//        objcodpro.setnompro(false);
//        return Entregarepository.save(c);
//    }
    public Optional<EntregaEntity> findbyId(Long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<EntregaEntity> findbyId(long Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EntregaEntity update(EntregaEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EntregaEntity delete(EntregaEntity c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
