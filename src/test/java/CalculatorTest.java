import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.Calculator;  


public class CalculatorTest {


@Test
public void testSum() {
    assertEquals(2, Calculator.sum(1, 1));

}
@Test
public void testSubtract() {
    assertEquals(9, Calculator.subtract(10, 1));

}
@Test
public void testDivide() {
    assertEquals(1, Calculator.divide(1, 1));

}
@Test
public void testMultiply() {
    assertEquals(2, Calculator.multiply(2, 1));

}

@Test
public void testSquareRoot(){
    assertEquals(8, Calculator.squaredRoot(64));

}
@Test
public void testTripleRoot(){
    assertEquals(8, Calculator.squaredRoot(64));
}
@Test
public void testExponetial(){
    assertEquals(8, Calculator.exponential(2,3));
}
@Test
public void testPolynialmsImage(){

    assertEquals(-3, Calculator.polynomialsImage(0,2,-3));
    assertEquals(3, Calculator.polynomialsImage(0,2,3));
}

}
