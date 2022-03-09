import fibonacci.fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private fibonacci fib;

    @BeforeEach
    public void setup(){
        fib= new fibonacci();
    }

    @Test
    public void testWithNumber1(){
        int expectedValue = 1;
        long obtainedValue = fib.funcion(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testWithNumber0(){
        fibonacci fib = new fibonacci();
        int expectedValue = 0;
        long obtainedValue = fib.funcion(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testWithNumber25(){
        long expectedValue = 75025;
        long obtainedValue = fib.funcion(25);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void testError(){
        assertThrows(RuntimeException.class, ()->fib.funcion(-1));
    }



}
