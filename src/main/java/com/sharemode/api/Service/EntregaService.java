
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.EntregaEntity;


public interface EntregaService {
    
    //Mostrar todos los registros
    public List<EntregaEntity>findAll();
    //buscaer registros
    public Optional<EntregaEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<EntregaEntity>findAllCustom();
    public EntregaEntity add(EntregaEntity c);
    public EntregaEntity update(EntregaEntity c);
    public EntregaEntity delete (EntregaEntity c);
}
