import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNumberTest extends BaseTest {
    /**возвращает первое число, встретившееся в строке как отдельное слово,
     * т.е. отделенное пробелами и/или знаками препинания.
     * При отсутствии числа в строке выбрасывается исключение RuntimeException с текстом "Невозможно найти число в строке"
     **/
    @Test
    public void checkFirstNumFunc(){
        Assertions.assertEquals(4,textStartWithNum.getFirstNumber(),"первое число из строки не равно 4");
    }
    @Test
    public void checkFirstNumEndsWithNum(){
        Assertions.assertEquals(5,textEndsWithNum.getFirstNumber(),"последнее число не равно 5");
    }
     @Test
    public void checkFirstNumException(){
        Throwable exception = Assertions.assertThrows(RuntimeException.class,
                ()-> stringHelper.getFirstNumber(),"Невозможно найти число в строке");
    }
}
