import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaBuzzTest {
    private JavaBuzz javaBuzz;

    @BeforeEach
    public void initJavaBuzz() {
        javaBuzz = new JavaBuzz();
    }

    @Test
    public void expectsJava() {
        String output = javaBuzz.evaluate(3);
        assertEquals("Java", output);
    }

    @Test
    public void expectsBuzz() {
        String output = javaBuzz.evaluate(5);
        assertEquals("Buzz", output);
    }

    @Test
    public void expectsJavaBuzz() {
        String output = javaBuzz.evaluate(15);
        assertEquals("JavaBuzz", output);
    }

    @Test
    public void expectsNumber() {
        String output = javaBuzz.evaluate(1);
        assertEquals("1", output);
    }
}
