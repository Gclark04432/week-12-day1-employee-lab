import employee.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim", "GB838525P", 50000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Jim", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("GB838525P", developer.getNINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(50000, developer.getSalary());
    }

}
