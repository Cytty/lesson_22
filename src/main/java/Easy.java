public class Easy {
    private float income;

    public Easy(float income) {                    // конструктор
        this.income = Math.abs(income);
    }
    public float getIncome() {                     // геттер
        return Math.abs(income);
    }

    public void setIncome(float newIncome) {       //сеттер
        this.income = Math.abs(income) + Math.abs(newIncome);
    }
    public float calculationTax() {                   // расчет размера уплаты налога
        int tax = 6;
        float payable = (Math.abs(income) * tax / 100);
        return payable;
    }
}
