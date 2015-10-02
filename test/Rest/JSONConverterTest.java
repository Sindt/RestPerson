/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Backend.Facade;
import Backend.Person;
import com.google.gson.Gson;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sindt
 */
public class JSONConverterTest {

    private static Gson gson = new Gson();
    private EntityManagerFactory emf;
    private Facade facade;

    public JSONConverterTest() {
        emf = Persistence.createEntityManagerFactory("RestPersonPU");
        facade = new Facade(emf);
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
     * Test of getPersonFromJson method, of class JSONConverter.
     */
    @Test
    public void testGetPersonFromJson() {
        System.out.println("getPersonFromJson");
        String js = "";
        Person expResult = null;
        Person result = JSONConverter.getPersonFromJson(js);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJSONFromPerson method, of class JSONConverter.
     */
    @Test
    public void testGetJSONFromPerson_Person() {

        System.out.println("getJSONFromPerson");
        Person p = facade.getPerson(1);
        String expResult = "";
        String result = JSONConverter.getJSONFromPerson(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of getJSONFromPerson method, of class JSONConverter.
     */
    @Test
    public void testGetJSONFromPerson_List() {
        System.out.println("getJSONFromPerson");
        List<Person> persons = null;
        String expResult = "";
        String result = JSONConverter.getJSONFromPerson(persons);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
