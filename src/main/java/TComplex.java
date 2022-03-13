public class TComplex implements Tax {


    @Override
    public float calculateTax(Agent agent) {
        int tax = 15;
        int payable;
        int profit = agent.getIncome() - agent.getCosts();
        if (profit > 0) {
            payable = (profit * tax / 100);
        } else {
            payable = 0;
        }
        return payable;
    }
}


