/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package h.mavenproject1;

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
public class Mavenproject1Test {
    
    public Mavenproject1Test() {
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
     * Test of main method, of class Mavenproject1.
     */
    @Test
    public void sumar() {
        System.out.println("Sumar");
        int a = 5, b = 3,f = 8;
         Mavenproject1 m = new  Mavenproject1();
         int d = m.sumar(a, b);
         assertEquals(f,d);
    }
     @Test
     public void con(){
          Mavenproject1 m = new  Mavenproject1();
          String a ="",b="",c="",d="";
          d = m.concatenar(a, b);
          assertEquals(c,d);
     }
     @Test
     public void array(){
          Mavenproject1 m = new  Mavenproject1();
          int []a = {1,2,3,4,5};
          int []b = m.getArray();
          assertArrayEquals(a,b);
     }
     @Test 
     public void b (){
          Mavenproject1 m = new  Mavenproject1();
          int a = 5;
          boolean v = m.esMayorQueCero(a);
          assertTrue(v);
     }
     @Test
     public void o(){
          Mavenproject1 m = new  Mavenproject1();
          assertNull(m.obtenerNulo());
     }
     
     @Test 
     public void a(){
          Mavenproject1 m = new  Mavenproject1();
          assertNull(m.obtenerNulo());
     }
}
