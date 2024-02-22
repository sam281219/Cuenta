/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud5.cuenta;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samus
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @Test
    public void testGetSaldo() {
        Cuenta cuenta = new Cuenta("123456789", 100.0f);
        assertEquals(100.0f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testSetSaldo() {
        Cuenta cuenta = new Cuenta("987654321", 100.0f);
        cuenta.setSaldo(200.0f);
        assertEquals(200.0f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testIngresarDinero() {
        Cuenta cuenta = new Cuenta("1111222233", 100.0f);
        cuenta.ingresarDinero(300.0f);
        assertEquals(400.0f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testExtraerDinero() {
        Cuenta cuenta = new Cuenta("4444555566", 100.0f);
        cuenta.extraerDinero(40.0f);
        assertEquals(60.0f, cuenta.getSaldo(), 0.01f);
    }
}


