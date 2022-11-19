
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.PagosEntity;
import com.sharemode.api.Entity.PedidosEntity;

public interface PedidosService {
    public List<PagosEntity>findAll();
    //buscaer registros
    public Optional<PedidosEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<PedidosEntity>findAllCustom();
    public PedidosEntity add(PedidosEntity c);
    public PedidosEntity update(PedidosEntity c);
    public PedidosEntity delete (PedidosEntity c);
}
