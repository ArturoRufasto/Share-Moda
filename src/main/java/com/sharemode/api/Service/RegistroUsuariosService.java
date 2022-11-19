
package com.sharemode.api.Service;

import java.util.List;
import java.util.Optional;
import com.sharemode.api.Entity.RegistroUsuarioEntity;

public interface RegistroUsuariosService {
    
    public List<RegistroUsuarioEntity>findAll();
    //buscaer registros
    public Optional<RegistroUsuarioEntity>findbyId(long Id);
    //mostrar registros hanilitados
    public List<RegistroUsuarioEntity>findAllCustom();
    public RegistroUsuarioEntity add(RegistroUsuarioEntity c);
    public RegistroUsuarioEntity update(RegistroUsuarioEntity c);
    public RegistroUsuarioEntity delete (RegistroUsuarioEntity c);

}
