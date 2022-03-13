public interface Tax {

    default float calculateTax(Agent agent) {
        return 0;
    }
}
