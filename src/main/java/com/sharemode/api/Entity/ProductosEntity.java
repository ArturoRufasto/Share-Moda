package com.sharemode.api.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
//import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data


@Entity(name="ProductosEntity")
@Table(name="Productos")


public class ProductosEntity implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="codpro")
    private int codpro;
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="nompro")
    
    private String nompro;
    @Column(name="caracpro")
    private String caracpro;
    @Column(name="stock")
    private int stock;
    @Column(name="cpmbos")
    
    private double combos;
    @Column(name="ofertas")
    private double ofertas;
    
    @ManyToOne
    @JoinColumn(name="productos" ,nullable= false)
    private CategoriasEntity productos;
    
    @Column(name="estado")
    private int estado;
    
}
//    
//    CREATE TABLE Productos(
//codpro int,
//nompro varchar(10),
//caracpro varchar(10),
//stockpro double,
//combos varchar(45),
//ofertas varchar(45)
//
//);


