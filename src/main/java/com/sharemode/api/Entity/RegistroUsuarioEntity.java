
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

@Entity(name="RegistroUsuarioEntity")
@Table(name="registrousuario")
public class RegistroUsuarioEntity implements Serializable {
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codpro;
    
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="productos")
    private String productos;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="pagos")
    private String pagos;

    @Column(name="estado")
    private int estado;
            
}
