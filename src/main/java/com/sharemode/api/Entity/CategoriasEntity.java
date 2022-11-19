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

//--Librerio lombook

@Builder 
@AllArgsConstructor
@NoArgsConstructor 
//--get and set
@Data

@Entity(name="CategoriasEntity")
@Table(name="categorias")
public class CategoriasEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @Column(name="nomcat")
    private String nombre_categoria;
     
    @Column(name="ropav")
    private String descripcion;
    
    /*@Column(name="pantalones")
    private String pantalones;
    
    @Column(name="perfumes")
    private String perfumes;
    
    @Column(name="cuidadofacial")
    private String cuidadofacial;
    
    @Column(name="calzado")
    private int calzado;*/
    
    /*@ManyToOne
    @JoinColumn(name="categoria_codigo" ,nullable= false)
    private CategoriasEntity categoria_codigo;*/
    
    @Column(name="estado")
    private int estado;
//    codpro int,
//nomCat varchar(45),
//ropaV  varchar(45),
//pantalones varchar(45),
//perfumes varchar(45),
//cuidadofacial varchar(45),
//calzado varchar(45)

//    public void setCodigo(Long id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @java.lang.SuppressWarnings(value = "all")
//    public static class CategoriasEntityBuilder {
//
//        public Object codigo(Long id) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        public Object codpro(Long id) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }
}
