/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cajas
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    
    //probar con currency diferentes de USD, con cada tipo de empleado, porcentaje (mayor a 100, 0 y negativo)
    
    /**
     * Test of cs method, of class Employee.
     */
    
    
    
    
    @Test
    public void testCs1() {
        
        //Prueba con currency distintos de USD, clase worker
  
        System.out.println("cs");
        Employee instance = new Employee(300.0F,"EU",100.0F,EmployeeType.Worker);
        float expResult = 349.33F;
        
        float result = instance.cs();
        assertEquals(expResult, result, 0.1); 
    }
   @Test
    public void testCs2() {
        
        //Prueba con clase Manager para analizar el
        //correcto funcionamiento de dicha funcionalidad.
  
        System.out.println("cs");
        Employee instance = new Employee(300.0F,"USD",100.0F,EmployeeType.Manager);
        float expResult = 434.33F;
        
        float result = instance.cs();
        assertEquals(expResult, result, 0.1); 
    } 
    
    @Test
    public void testCs3() {
        
        //Prueba con clase supervisor para analizar el
        //correcto funcionamiento de dicha funcionalidad.
  
        System.out.println("cs");
        Employee instance = new Employee(300.0F,"USD",100.0F,EmployeeType.Supervisor);
        float expResult = 399.33F;
        
        float result = instance.cs();
        
        assertEquals(expResult, result, 0.1); 
        
    } 
    @Test
    public void testCs4() {
        
        //Prueba con Porcentaje negativo, puesto que el metodo no restringe ni valida
        //valores no negativos
  
        System.out.println("cs");
        Employee instance = new Employee(300.0F,"USD",-100.0F,EmployeeType.Supervisor);
        float expResult = 329.33F;
        
        float result = instance.cs();
        
        assertEquals(expResult, result, 0.1); 
        
    }
    
    
    

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
   /* @Test
    public void testCalculateYearBonus() {
        System.out.println("CalculateYearBonus");
        Employee instance = null;
        float expResult = 0.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    */
}
