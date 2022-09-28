import org.example.CalculationUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatinUntilsTest {
    int x;
    int y;
    //Before - метод будет выполняться перед каждым тестируемым методом
    @Before
    public void setUp(){
        x=5;
        y=7;
    }
    //@Test, которая определяет, что метод является тестовым
    @Test
    public void testAdd(){
        int result = 13;
        Assert.assertEquals("Ожидается 12 но ввели 13",result, CalculationUtils.add(x,y));
      //  assertEquals, который в нашем случае может принимать сообщение, которое будет показываться при несоответствии фактического и ожидаемого результата, затем второй параметр – фактический результат и третий ожидаемый результат.
    }
    @Test
    public void testSub(){
        int result = -2;
        Assert.assertEquals("Ожидается -2 и ввели -2",result, CalculationUtils.sub(x,y));
    }

}
