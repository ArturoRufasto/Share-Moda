
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.PagosEntity;

public interface PagosService {
    
    //Mostrar todos los registros
    public List<PagosEntity>findAll();
    //buscaer registros
    public Optional<PagosEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<PagosEntity>findAllCustom();
    public PagosEntity add(PagosEntity c);
    public PagosEntity update(PagosEntity c);
    public PagosEntity delete (PagosEntity c);
}
