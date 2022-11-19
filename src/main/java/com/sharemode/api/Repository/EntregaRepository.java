
package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.DetalleProductoEntity;
import com.sharemode.api.Entity.EntregaEntity;


public interface EntregaRepository extends JpaRepository<EntregaEntity, Long>{
    @Query("select c from EntregaEntity c where c.estado=1")
    List<EntregaEntity> findAllCustom();
}
