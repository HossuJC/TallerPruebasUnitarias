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
        //valores negativos
  
        System.out.println("cs");
        Employee instance = new Employee(300.0F,"USD",-100.0F,EmployeeType.Supervisor);
        float expResult = 329.33F;
        
        float result = instance.cs();
        
        assertEquals(expResult, result, 0.1); 
        
    }
    @Test
    public void testCs5() {
        
        //Prueba con Sueldo negativo, puesto que el metodo no restringe ni valida
        //valores  negativos
  
        System.out.println("cs");
        Employee instance = new Employee(-300.0F,"USD",-100.0F,EmployeeType.Supervisor);
        float expResult = -270.67F;
        
        float result = instance.cs();
        
        assertEquals(expResult, result, 0.1); 
        
    }
    @Test
    public void testCs6() {
        
        //Prueba con Sueldo 0, puesto que el metodo no restringe ni valida dicho valor
        //observaremos que a pesar de que el sueldo es cero, el empleado aun recibe bonus y decimo
  
        System.out.println("cs");
        Employee instance = new Employee(0.0F,"USD",100.0F,EmployeeType.Supervisor);
        float expResult = 99.33F;
        
        float result = instance.cs();
        
        assertEquals(expResult, result, 0.1); 
        
    }
    
    
    
    

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonus1() {//Con el metodo calculateYearBonus aplicamos pruebas similares
        System.out.println("CalculateYearBonus");
        Employee empleado1 = new Employee(10f, "al", 10f, EmployeeType.Manager);
        float salario1 = 395.5F;
        float resultado = empleado1.CalculateYearBonus();
        assertEquals(salario1, resultado,0.0f );
        
       
    }
    @Test
    public void testCalculateYearBonus2() {
        
        
        System.out.println("CalculateYearBonus2");
        Employee empleado2 = new Employee(570.50F,"EURO",0.50F,EmployeeType.Supervisor);
        float salario2 = 734.975F;
        float resultado2 = empleado2.CalculateYearBonus();
        assertEquals(salario2, resultado2, 1);
        
    }
    @Test
    public void testCalculateYearBonus3() {
        
        
        System.out.println("CalculateYearBonus3");
        Employee empleado3 = new Employee(10f, "USD", 10f, EmployeeType.Worker);
        float salario3 = 386.0F;
        float resultado3 = empleado3.CalculateYearBonus();
        assertEquals(salario3, resultado3,0.0f );
        
    }
    
    
}   
    
