/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfoliomfv.mfv.Interfaz;

import com.portfoliomfv.mfv.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto de la lista persona buscando por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id); 
 
            
}
