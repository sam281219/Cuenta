/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud5.cuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samus
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Cuenta.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuenta instance = new Cuenta("1",30);
        assertEquals("1", instance.getNumero());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = new Cuenta("1",30);
        float expResult = 30;
        float result = instance.getSaldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of setNumero method, of class Cuenta.
//     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numCta = "2";
        Cuenta instance = new Cuenta("1",30);
        instance.setNumero(numCta);
        assertEquals(numCta,instance.getNumero());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of setSaldo method, of class Cuenta.
//     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldoCta = 10;
        Cuenta instance = new Cuenta("1",30);
        instance.setSaldo(saldoCta);
        assertEquals(saldoCta,instance.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of ingresarDinero method, of class Cuenta.
//     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        float importe = 100;
        Cuenta instance = new Cuenta("1",30);
        instance.ingresarDinero(importe);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of extraerDinero method, of class Cuenta.
//     */
    @Test
    public void testExtraerDinero() {
        System.out.println("extraerDinero");
        float importe = 40;
        Cuenta instance = new Cuenta("1",110);
        instance.extraerDinero(importe);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of monstrarCuenta method, of class Cuenta.
//     */
    @Test
    public void testMonstrarCuenta() {
        System.out.println("monstrarCuenta");
        Cuenta instance = new Cuenta("1",30);
        instance.monstrarCuenta();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
