import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "JR123456B", 35000, "HR");
    }

    @Test
    public void managerHasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("JR123456B", manager.getNINumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void managerHasDepartmentName(){
        assertEquals("HR", manager.getDepartmentName());
    }

    @Test
    public void managerCanHaveSalaryRaised(){
        manager.raiseSalary(2000);
        assertEquals(37000, manager.getSalary());
    }

    @Test
    public void managerCanReturnPayBonus(){
        assertEquals(350, manager.payBonus(), 0.0);
    }
}
