
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetWordsCountTest extends BaseTest{
/**получает количество символов в строке цифра или число не считаются за слово
 * **/

    @Test
    public void  checkLenString(){
        Assertions.assertEquals(4,stringHelper.getWordsCount(),"длина строки равна 4");
        Assertions.assertEquals(7,stringHelperMediumText.getWordsCount(),"длина строки равна 7");
        Assertions.assertEquals(5,textStartWithNum.getWordsCount(),"длина строеи равна 5");
    }
}
