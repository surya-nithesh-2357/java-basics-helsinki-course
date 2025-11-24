import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExerciseManagementTest {


    @Test
    public void exerciseEmptyListatBeginning(){
        ExerciseManagement exerciseManagement = new ExerciseManagement();
        assertEquals(0, exerciseManagement.exerciseList().size());
    }

    @Test 
    public void addingExerciseGrowsListByOne() {   
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test 
    public void addedExerciseIsInList() {   
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void testMarkasCompleted(){
        ExerciseManagement management = new ExerciseManagement();
        management.add("something");
        management.markAsCompleted("something");
        assertEquals(true,management.isCompleted("something"));
    }
}
