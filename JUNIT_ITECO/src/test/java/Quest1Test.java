import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestSumNum{
    SumNum sumNum = new SumNum();

    private final String text;
    private final int result;

    public TestSumNum(String text, int result) {
        this.text = text;
        this.result = result;
    }

    @Parameterized.Parameters(name = "text with nums:{0}={1}")
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][] {{"we got 2 pencil and 2 pen",4},
                {"my lucky nums 15 and 5 ",20},
                {"My favorite time is 00 pm",0}});
    }

    @Test
    public void checkAnswer(){
        Assert.assertEquals(result,sumNum.extractDigits(text));
    }
}
