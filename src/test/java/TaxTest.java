import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TaxTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"testComplexAgent.csv"})
    public void complexTests(int income, int costs, int newIncome, int sale, int expected) {
        Complex agent = new Complex(income, costs);
        agent.setIncome(newIncome);
        agent.setCosts(sale);

        double actual = agent.calculationTax();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"testEasyAgent.csv"})
    public void easyTests(int income, int newIncome, int expected) {
        Easy agent = new Easy(income);
        agent.setIncome(newIncome);

        float actual = agent.calculationTax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void complexTestsFloatIncome() {
        Complex agent = new Complex(4000.5F, 2050);
        agent.setIncome(9050);
        agent.setCosts(1000);

        float expected = 1500.075F;

        float actual = agent.calculationTax();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void complexTestsEasyIncome() {
        Easy agent = new Easy(4000.5F);
        agent.setIncome(6000);

        float expected = 600.03F;

        float actual = agent.calculationTax();

        Assertions.assertEquals(expected, actual);
    }
}
