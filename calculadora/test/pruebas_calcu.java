/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.operaciones;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Alumno
 */
public class pruebas_calcu {
        operaciones op = new operaciones();

    public pruebas_calcu() {

  
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Testsuma() {
    assertTrue(op.suma(2,2)==(2+2));
    }
    @Test
    public void Testresta() {
    assertTrue(op.resta(2,2)==(2-234));
    }
    @Test
    public void Testmultiplicacion() {
    assertTrue(op.multiplicacion(2,2)==(2*2));
    }
    @Test
    public void Testdivison() {
    assertTrue(op.division(2,2)==(2/2));
    }
}
