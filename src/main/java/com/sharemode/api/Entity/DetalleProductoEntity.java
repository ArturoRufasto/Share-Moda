package com.sharemode.api.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="DetalleProductoEntity")
@Table(name="DetalleProducto")

public class DetalleProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;   
     
    @Id
    @Column(name="codpro")
    private int codpro;
    @Column(name="cantpro")
    private int cantpro;
    @Column(name="preciopro")
    private double preciopro;
    
     @ManyToOne
    @JoinColumn(name="detalleProducto" ,nullable= false)
    private CategoriasEntity detalleProducto;
     
    @Column(name="estado")
    private int estado;
    
//    CREATE TABLE DetalleProducto (
//codpro int ,
//cantpro varchar(10),
//preciopro varchar(10)
//);
}