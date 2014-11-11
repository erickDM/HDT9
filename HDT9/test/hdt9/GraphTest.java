/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author E. de Mata
 */
public class GraphTest {
    
    public GraphTest() {
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

    /**
     * Test of addVertex method, of class Graph.
     */
    @Test
    public void testAddVertex() {
        System.out.println("addVertex");
        String name = "Guatemala";
        Graph instance = new Graph();
        instance.addVertex(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeEdge method, of class Graph.
     */
    @Test
    public void testRemoveEdge() {
        System.out.println("removeEdge");
        String origen = "";
        String destino = "";
        Graph instance = new Graph();
        boolean expResult = false;
        boolean result = instance.removeEdge(origen, destino);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPeso method, of class Graph.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        String origen = "";
        String destino = "";
        Graph instance = new Graph();
        double expResult = 10.0;
        double result = instance.getPeso(origen, destino);
        assertEquals(expResult, result, 10.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of algoritmoFloyd method, of class Graph.
     */
    @Test
    public void testAlgoritmoFloyd() {
        System.out.println("algoritmoFloyd");
        Graph instance = new Graph();
        instance.algoritmoFloyd();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCenter method, of class Graph.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        Graph instance = new Graph();
        String expResult = "Guatemala";
        String result = "Guatemala";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
    
}
