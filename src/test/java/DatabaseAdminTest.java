import employee.techStaff.DatabaseAdmin;
import employee.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin admin;

    @Before
    public void before(){
        admin = new DatabaseAdmin("Jim", "GB838525P", 50000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Jim", admin.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("GB838525P", admin.getNINumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(50000, admin.getSalary());
    }

}

