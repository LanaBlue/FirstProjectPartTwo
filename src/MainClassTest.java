import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        if (getClassNumber() > 45) {
            System.out.println("Метод возвращает число больше 45");
        } else System.out.println("Метод возвращает число меньше или равно 45");
    }
}
