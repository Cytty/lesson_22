public class TEasy implements Tax{
    private int tax = 6;

    @Override
    public float calculateTax(Agent agent) {
        int payable = agent.getIncome() * tax / 100;
        return payable;
    }

}
