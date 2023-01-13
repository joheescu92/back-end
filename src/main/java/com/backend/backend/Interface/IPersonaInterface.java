/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.backend.Interface;

import com.backend.backend.Entity.Persona;
import java.util.List;



public interface IPersonaInterface {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por Id
    
    public void deletePersona(Long id );
    
    //Buscar una persona por Id
    
    public Persona findPersona(Long id);
}
