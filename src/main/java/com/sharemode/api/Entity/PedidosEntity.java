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

@Entity(name="PedidosEntity")
@Table(name="Pedidos")
public class PedidosEntity  implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    
    @Column(name="codpro")
    private int codpro;
    @Column(name="usuario")
    private String usuario;
    @Column(name="reclamo")
    private String reclamo;
    
     @ManyToOne
    @JoinColumn(name="pedidos" ,nullable= false)
    private CategoriasEntity pedidos;
     
     @Column(name="estado")
    private int estado;
    
//    CREATE TABLE Pedidos(
//codpro int ,
//usuario varchar(10),
//reclamo varchar(9)
//
//);
}
