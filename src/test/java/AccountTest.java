import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private boolean expected;

    public AccountTest(String name, boolean expected){
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][] {
                {"ab cd", true},
                {"ab", false},
                {"abcdeabcdeabcdeab d", true},
                {"abcdeabcdeabcdeabcde", false},
                {"abc def", true},
                {" abcde", false},
                {"abcde ", false},
                {"a b c", false},
                {"ab  cde", false}
        };
    }

    @Test
    public void checkName(){
        Account acc = new Account(name);

        boolean actual = acc.checkNameToEmboss();

        assertEquals(expected, actual);
    }
}
