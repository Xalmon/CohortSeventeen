package otherTrys;

public enum Geopoliticalzone {
    NORTH_WEST("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, and Zamfara States"),
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, and Yobe States"),
    NORTH_CENTRAL("Benue, Fct, Kogi, Kwara, Nasarawa, Niger, and Plateau States"),
    SOUTH_SOUTH("Akwa Ibom, Bayelsa, Cross River, Delta, Edo, and Rivers States"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, and Imo States"),
    SOUTH_WEST("Ekiti, Lagos, Osun, Ogun, Ondo, and Oyo States");

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;

    private Geopoliticalzone(String state){
        this.state = state;
    }
}
