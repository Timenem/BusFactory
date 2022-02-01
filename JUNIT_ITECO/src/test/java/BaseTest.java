import StringHelper.StringHelper;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    StringHelper stringHelper;
    StringHelper stringHelperMediumText;
    StringHelper stringHelperLongText;
    StringHelper textStartWithNum;
    StringHelper textEndsWithNum;

    @BeforeEach
    public void setUp() {
        /**выполняется каждый раз при запускe теста*/
//        len = 185
        String longText = "Мы вынуждены отталкиваться от того, что убеждённость некоторых оппонентов, а также свежий взгляд на привычные вещи " +
                "- безусловно открывает новые горизонты для глубокомысленных рассуждений!";
//        len = 4
        stringHelper = new StringHelper("test this class please");
//        len = 7
        stringHelperMediumText = new StringHelper("i like very fast car from italy");
//        len = 24
        stringHelperLongText = new StringHelper(longText);
        textStartWithNum = new StringHelper("4 pm said older man");
        textEndsWithNum = new StringHelper("i said already and i change my mind so current price is 5");
    }

}
