package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.PagosEntity;
import com.sharemode.api.Entity.RegistroUsuarioEntity;

public interface PagosRepository extends JpaRepository<PagosEntity, Long>{
    @Query("select c from PagosEntity c where c.estado=1")
    List<PagosEntity> findAllCustom();
}
