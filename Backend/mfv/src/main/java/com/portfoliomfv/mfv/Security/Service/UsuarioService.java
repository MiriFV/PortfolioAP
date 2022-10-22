/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliomfv.mfv.Security.Service;


import com.portfoliomfv.mfv.Security.Entity.Usuario;
import com.portfoliomfv.mfv.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
        @Autowired
        iUsuarioRepository iusuarioRepository;
        
        public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
            return iusuarioRepository.findByNombreUsuario(nombreUsuario);
        }
        
        public boolean existsByNombreUsuario(String nombreUsuario){
            return iusuarioRepository.existsByNombreUsuario(nombreUsuario); 
        }
        public boolean existsByEmail(String Email){
            return iusuarioRepository.existsByEmail(Email); 
        }
        public void save(Usuario usuario){
            iusuarioRepository.save(usuario);
        }    
}


