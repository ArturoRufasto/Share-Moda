package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.PedidosEntity;
import com.sharemode.api.Entity.RegistroUsuarioEntity;


public interface PedidosRepository extends JpaRepository<PedidosEntity, Long>{
    @Query("select c from PedidosEntity c where c.estado=1")
    List<PedidosEntity> findAllCustom();
}
