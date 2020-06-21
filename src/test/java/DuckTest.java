import static org.junit.Assert.*;

public class DuckTest {

    @org.junit.Test
    public void swim() {
       Duck d = new MallardDuck();
       d.swim();
    }
}