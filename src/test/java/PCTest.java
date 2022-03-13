import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PCTest {
    @ParameterizedTest
    @CsvFileSource(resources = { "testDataTaxComplex.csv" })
    public void taxComplex (int income, int costs, int newIncome,  int sale, int expected) {
        Agent agent = new Agent(income, costs);
        Tax tax = new TComplex();

        agent.setIncome(newIncome);
        agent.setCosts(sale);

        double actual = tax.calculateTax(agent);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = { "testDataTaxEasy.csv" })
    public void taxEasy (int income, int costs, int newIncome,  int sale, int expected) {
        Agent agent = new Agent(income, costs);
        Tax tax = new TEasy();

        agent.setIncome(newIncome);
        agent.setCosts(sale);

        double actual = tax.calculateTax(agent);

        Assertions.assertEquals(expected, actual);
    }
}
