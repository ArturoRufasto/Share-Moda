
package com.sharemode.api.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sharemode.api.Entity.DetalleProductoEntity;
import com.sharemode.api.Entity.ProductosEntity;


    public interface DetalleProductoRepository extends JpaRepository<DetalleProductoEntity, Long> {
    @Query("select c from DetalleProductoEntity c where c.estado=1")
    List<DetalleProductoEntity> findAllCustom();
}
