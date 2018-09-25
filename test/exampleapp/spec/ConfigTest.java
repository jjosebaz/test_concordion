package exampleapp.spec;

import exampleapp.Password;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ConfigTest {
    public int getTestResult(int a, int b) {

        Password pass = new Password();

        return pass.addTwoIntegers(a,b);

    }
}


