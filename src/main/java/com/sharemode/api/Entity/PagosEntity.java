
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

@Entity(name="PagosEntity")
@Table(name="Pagos")


public class PagosEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpro")
    private int codpro;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="pagos" ,nullable= false)
    private CategoriasEntity pagos;
    
    @Column(name="estado")
    private int estado;
    
//CREATE TABLE Pagos(
//codpro int ,
//cantidad double,
//descripcion double
//);
}
