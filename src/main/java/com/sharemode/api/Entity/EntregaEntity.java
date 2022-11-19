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
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder 
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="EntregaEntity")
@Table(name="Entrega")

public class EntregaEntity implements Serializable {
    private static final long serialVersionUID=1L;   
     
    @Id
    @Column(name="enviorapido")
    private int enviorapido;
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="contraentrega")
    private int contraentrega;
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @ManyToOne
    @JoinColumn(name="entrega" ,nullable= false)
    private CategoriasEntity entrega;
    
    @Column(name="estado")
    private int estado;
//    CREATE TABLE Entrega(
//enviorapido varchar(10),
//contraentrega varchar(45)

}
