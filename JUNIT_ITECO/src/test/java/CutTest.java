import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CutTest extends BaseTest{
    /**обрезает строку до 100 символов с добавлением в конце ...
     * обрезание строки происходит по краю **/

    @Test
    public void checkCutMethodEndsWithDots(){
        String cutString = stringHelperLongText.cut();
        Assertions.assertTrue(cutString.endsWith("..."), "текст должен заканчиваться на '...'");
    }

    @Test
    public void chekCutMethodLenlessOneHundred(){
        String cutString = stringHelperLongText.cut();
        Assertions.assertTrue( cutString.length() <= 100, "длина текста не должна быть больше 100 символов");
    }

}
