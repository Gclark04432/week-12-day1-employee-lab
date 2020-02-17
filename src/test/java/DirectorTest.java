import employee.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Jill", "HG79797", 65000, "Operations", 100000);
    }

    @Test
    public void director_has_name(){
        assertEquals("Jill", director.getName());
    }

    @Test
    public void director_has_NiNumber(){
        assertEquals("HG79797", director.getNINumber());
    }

    @Test
    public void director_has_salary(){
        assertEquals(65000, director.getSalary());
    }

    @Test
    public void director_has_department(){
        assertEquals("Operations", director.getDepartmentName());
    }

    @Test
    public void director_has_budget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }
}
