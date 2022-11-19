package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.CategoriasEntity;


public interface CategoriasRepository extends JpaRepository<CategoriasEntity, Long> {
//    selector * from Categorias where estCur=1;
    @Query("select c from CategoriasEntity c where c.estado=1")
    List<CategoriasEntity> findAllCustom();
}
