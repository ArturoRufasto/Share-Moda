package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.ProductosEntity;


public interface ProductosRepository extends JpaRepository<ProductosEntity, Long>{
    @Query("select c from CategoriasEntity c where c.estado=1")
    List<ProductosEntity> findAllCustom();
    
}
