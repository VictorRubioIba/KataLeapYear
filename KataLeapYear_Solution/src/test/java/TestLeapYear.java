import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestLeapYear {
    Year year = new Year();
    @BeforeEach
    public void beforeEach(){
    }

    @ParameterizedTest
    @ValueSource(ints = {1997})
    public void TestIsNotLeapYearIsNotDivisibleByFour(int years){

        boolean actual=  year.leapYear(years);

        Assertions.assertEquals(actual,false);
    }
    @ParameterizedTest
    @ValueSource(ints = {1996})
    public void TestIsLeapYearIsDivisibleByFour(int years){

        boolean actual=  year.leapYear(years);
        Assertions.assertEquals(actual,true);
    }
    @ParameterizedTest
    @ValueSource(ints = {1600})
    public void TestIsLeapYearIsDivisibleByFourTeen(int years){

        boolean actual=  year.leapYear(years);
        Assertions.assertEquals(actual,true);
    }
    @ParameterizedTest
    @ValueSource(ints = {1800})
    public void TestIsNotLeapYearIsNotDivisibleByFourTeenIsDivissibleByOneHundreed(int years){

        boolean actual=  year.leapYear(years);
        Assertions.assertEquals(actual,false);
    }
}
