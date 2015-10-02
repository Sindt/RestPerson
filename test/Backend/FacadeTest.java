/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Sindt
 */
public class FacadeTest {

    EntityManagerFactory emf;

    public FacadeTest() {
        emf = Persistence.createEntityManagerFactory("RestPersonPU");

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
     * Test of getEntityManager method, of class Facade.
     */
    @Ignore
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        Facade instance = null;
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPerson method, of class Facade.
     */
      @Ignore
    public void testAddPerson() {
        System.out.println("addPerson");
        Person p = null;
        Facade instance = new Facade(emf);
        Long expResult = 1L;
        Person result = instance.addPerson(p);
        assertEquals(expResult, result.getId());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class Facade.
     */
      @Ignore
    public void testDeletePerson() {
        System.out.println("deletePerson");
        int id = 0;
        Facade instance = null;
        Person expResult = null;
        Person result = instance.deletePerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class Facade.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        int id = 1;
        Facade instance = new Facade(emf);
        String expResult = "Jens";
        Person result = instance.getPerson(id);
        assertEquals(expResult, result.getFname());
    }

    /**
     * Test of getPersons method, of class Facade.
     */
      @Ignore
    public void testGetPersons() {
        System.out.println("getPersons");
        Facade instance = null;
        List<Person> expResult = null;
        List<Person> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPerson method, of class Facade.
     */
      @Ignore
    public void testEditPerson() {
        System.out.println("editPerson");
        Person p = null;
        Facade instance = null;
        Person expResult = null;
        Person result = instance.editPerson(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
