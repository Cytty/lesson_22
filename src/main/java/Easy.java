public class Easy {
    private float income;

    public Easy(float income) {                  //конструктор с защитой от ввода отриц.значений
        if (income < 0) {
            this.income = 0;
        } else {
            this.income = income;
        }
    }

    public float getIncome() {                     // геттер 
        return income;
    }

    public void setIncome(float newIncome) {       // сеттер при новой продаже с защитой от ввода отриц.значений
        if (newIncome < 0) {
            this.income = income + 0;
        } else {
            this.income = income + newIncome;
        }
    }

    public float calculationTax() {                   ///калькулятор размера уплаты налога
        int tax = 6;
        float payable = income * tax / 100;
        return payable;
    }
}
