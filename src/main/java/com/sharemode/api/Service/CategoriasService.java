
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.CategoriasEntity;


public interface CategoriasService {
    //Mostrar todos los registros
    public List<CategoriasEntity>findAll();
    //buscaer registros
    public Optional<CategoriasEntity>findById(long Id);
    //mostrar registros hanilitados
    public List<CategoriasEntity>findAllCustom();
    //
    public CategoriasEntity add(CategoriasEntity c);
    //
    public CategoriasEntity update(CategoriasEntity c);
    //
    public CategoriasEntity delete (CategoriasEntity c);
}
