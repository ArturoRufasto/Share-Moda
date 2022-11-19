
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.DetalleProductoEntity;

public interface DetalleProductoService {
    
    //Mostrar todos los registros
    public List<DetalleProductoEntity>findAll();
    //buscaer registros
    public Optional<DetalleProductoEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<DetalleProductoEntity>findAllCustom();
    public DetalleProductoEntity add(DetalleProductoEntity c);
    public DetalleProductoEntity update(DetalleProductoEntity c);
    public DetalleProductoEntity delete (DetalleProductoEntity c);

}
