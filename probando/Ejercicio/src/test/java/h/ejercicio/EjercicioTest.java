/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package h.ejercicio;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samus
 */
public class EjercicioTest {
    
    public EjercicioTest() {
    }
    
    @Test
    public void cadena(){
        Ejercicio ins = new Ejercicio();
        String cadena = "holaa";
        String resul = ins.getMessage();
        assertEquals(cadena,resul);
    }

    
    
    
}
