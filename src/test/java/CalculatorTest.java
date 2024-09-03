import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Calculator;  


public class CalculatorTest {


@Test
public void shouldReturnSum() {
    assertEquals(2, Calculator.sum(1, 1));

}

@Test
public void shouldReturnSquareRoot(){
    assertEquals(8, Calculator.squaredRoot(64));

}
@Test
public void shouldReturnTripleRoot(){
    assertEquals(8, Calculator.squaredRoot(64));
}
@Test
public void shouldReturnPow(){
    assertEquals(8, Calculator.exponential(2,3));
}
@Test
public void shouldReturnPolynialmsImage(){

    assertEquals(-3, Calculator.polynomialsImage(0,2,-3));
    assertEquals(3, Calculator.polynomialsImage(0,2,3));
}

}
