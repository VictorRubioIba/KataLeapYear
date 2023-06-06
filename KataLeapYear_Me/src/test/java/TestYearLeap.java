import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestYearLeap {

    Year year = new Year();
    @BeforeEach
    public void beforeEach(){
    }

    @ParameterizedTest
    @ValueSource(ints = {1997})
    public void TestIsNotLeapYearIsNotDivisibleByFour(int anios){

      boolean actual=  year.isNotLeapYearIsNotDivisibleByFour(anios);
      Assertions.assertEquals(actual,false);
    }
    @ParameterizedTest
    @ValueSource(ints = {1996})
    public void TestIsLeapYearIsDivisibleByFour(int anios){

        boolean actual=  year.isLeapYearIsDivisibleByFour(anios);
        Assertions.assertEquals(actual,true);
    }
    @ParameterizedTest
    @ValueSource(ints = {1600})
    public void TestIsLeapYearIsDivisibleByFourTeen(int anios){

        boolean actual=  year.isLeapYearIsDivisibleByFourTeen(anios);
        Assertions.assertEquals(actual,true);
    }
    @ParameterizedTest
    @ValueSource(ints = {1800})
    public void TestIsNotLeapYearIsNotDivisibleByFourTeenIsDivissibleByOneHundreed(int anios){

        boolean actual=  year.isNotLeapYearIsNotDivisibleByFourTeenIsDivissibleByOneHundreed(anios);
        Assertions.assertEquals(actual,false);
    }
}
