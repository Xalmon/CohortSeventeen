package work;

public enum GeoPoliticalZone {
    NORTH_WEST("Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, and Zamfara States"),
    NORTH_EAST("Adamawa, Bauchi, Borno, Gombe, Taraba, and Yobe States"),
    NORTH_CENTRAL("Benue, Kogi, Kwara, Nasarawa, Niger, and Plateau States"),
    SOUTH_SOUTH("Akwa Ibom, Bayelsa, Cross River, Delta, Edo, and Rivers States"),
    SOUTH_EAST("Abia, Anambra, Ebonyi, Enugu, and Imo States"),
    SOUTH_WEST("Ekiti, Lagos, Ogun, Ondo, Osun, and Oyo States");

    private String state;

    private GeoPoliticalZone(String state){
        this.state = state;
    }
}
