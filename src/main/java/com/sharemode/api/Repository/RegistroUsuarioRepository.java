package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.DetalleProductoEntity;
import com.sharemode.api.Entity.RegistroUsuarioEntity;


public interface RegistroUsuarioRepository extends JpaRepository<RegistroUsuarioEntity, Long>{
    @Query("select c from RegistroUsuarioEntity c where c.estado=1")
    List<RegistroUsuarioEntity> findAllCustom();
}
