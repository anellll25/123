package IntegartiontestingPart2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class NoInjectionTest {

    @DataProvider(name = "provider")
    public Object[][] provide() throws Exception {
        return new Object[][] { { CC.class.getMethod("AyaAnelya") } };
    }

    @Test(dataProvider = "provider")
    public void withoutInjection(@NoInjection Method m) {
        System.out.println("2222 Method name without injection: " + m.getName() + " 2001");
        Assert.assertEquals(m.getName(), "AyaAnelya");
    }

    @Test(dataProvider = "provider")
    public void withInjection(Method m) {
        System.out.println("2222 Method name with injection: " + m.getName() + " 22222");
        Assert.assertEquals(m.getName(), "withInjection");
    }
}
