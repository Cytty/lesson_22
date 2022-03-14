public class Complex extends Easy {
    private float costs;

    public Complex(float income, float costs) {       //конструктор с защитой от ввода отриц.значений
        super(income);
        if (costs < 0) {
            this.costs = 0;
        } else {
            this.costs = costs;
        }
    }

    public void setCosts(float sale) {         // сеттер при новой расходной операции с защитой от ввода отриц.значений
        if (sale < 0) {
            this.costs = costs + 0;
        } else {
            this.costs = costs + sale;
        }
    }

    @Override
    public float calculationTax() {         //калькулятор размера уплаты налога
        int tax = 15;
        float payable;
        float profit = getIncome() - costs;
        if (profit > 0) {
            payable = profit * tax / 100;
        } else {
            payable = 0;
        }
        return payable;
    }

}
