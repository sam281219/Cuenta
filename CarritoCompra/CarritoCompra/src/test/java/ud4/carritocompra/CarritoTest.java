/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud4.carritocompra;

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
public class CarritoTest {
    
    public CarritoTest() {
    }
   
    private Carrito c;
    @BeforeEach
    public void setUp() {
         c = new Carrito(3);
        Producto p1 = new Producto("1","tv","Television",30);
        c.insertar(p1);
        Producto p2 = new Producto("2","pc","Television",60);
        c.insertar(p2);
    }
    
    @AfterEach
    public void tearDown() {
        c = new Carrito(3);
    }

    /**
     * Test of obtenerPrecio method, of class Carrito.
     */
    @Test
    public void testObtenerPrecio() {
        System.out.println("obtenerPrecio");
//        Carrito i = c;
        double result = c.obtenerPrecio();
        assertEquals(90, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class Carrito.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Producto producto = new Producto("3","pony","pollo",20);
        
        c.insertar(producto);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of borrar method, of class Carrito.
//     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        Producto p = new Producto("4","grgr","gfgr",100);
        c.insertar(p);
        c.borrar(p);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of getProductos method, of class Carrito.
//     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
         Producto producto1 = new Producto("1", "tv", "Television", 30);
    Producto producto2 = new Producto("2", "pc", "Computadora", 60);
    c.insertar(producto1);
    c.insertar(producto2);

        
        Producto[] result = c.getProductos();
        assertNotNull(result);
        assertTrue(result.length>0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of getContProductos method, of class Carrito.
//     */
    @Test
    public void testGetContProductos() {
        System.out.println("getContProductos");
        assertEquals(0,c.getContProductos());
        Producto producto1 = new Producto("1", "tv", "Television", 30);
        c.insertar(producto1);
        assertEquals(1,c.getContProductos());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
