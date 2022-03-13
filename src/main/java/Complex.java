public class Complex extends Easy {
    private float costs;

    public Complex(float income, float costs) {       //калькулятор
        super(income);
        this.costs = Math.abs(costs);
    }

    public void setCosts(float sale) {         // сеттер при новой расходной операции
        this.costs = Math.abs(costs) + Math.abs(sale);
    }

    @Override
    public float calculationTax() {         //расчет рахмера уплаты налога
        int tax = 15;
        float payable;
        float profit = getIncome() - costs;
        if (profit > 0) {
            payable = (profit * tax / 100);
        } else {
            payable = 0;
        }
        return payable;
    }

}
