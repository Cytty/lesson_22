public class Agent {
    private int income;
    private int costs;

    public Agent(int income, int costs){
        this.income = Math.abs(income);
        this.costs = Math.abs(costs);
    }

    public int getIncome(){
        return income;
    }
    public int getCosts(){
        return costs;
    }

    public void setIncome(int newIncome){
        this.income = income + Math.abs(newIncome);
    }

    public void setCosts(int sale){
        this.costs = costs + Math.abs(sale);
    }
}
