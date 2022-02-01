import StringHelper.StringHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FindTest {
/**ищет подстроку str, начиная с индекса index.
 *Если str найдена после индекса index, то возвращает подстроку исходной строки,
 начиная от позиции вхождения str. Если нет, то возвращается исходная строка
 */

    StringHelper stringHelper;
    @BeforeEach
    public void setUp(){
        stringHelper = new StringHelper("test this class please");
    }

    @ParameterizedTest
    @CsvSource(value = {"is class please,5,is", "class please,5 ,cla", "please, 6,pl"})
    public void  checkFindFunc(String resultl ,int x ,String str){
        Assertions.assertEquals(resultl,stringHelper.find(x,str),String.format("должен вернуть начиная с строки %s",resultl));
    }

    @ParameterizedTest
    @CsvSource(value =  {"8, is","4, kmls", "10,cl"})
    public void checkFindFuncReturnFullText(int x , String str ){
        Assertions.assertEquals("test this class please",stringHelper.find(x ,str),String.format("должен вернуть полный текст %s",stringHelper.getString()));
    }
}
