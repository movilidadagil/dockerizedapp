import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DockerizedAppTest {

    @Test
    public void testInputIsEven(){
        assertTrue(DockerizedApp.checkIfInputIsAnEvenNumber(32)); // Assertion
    }
}
