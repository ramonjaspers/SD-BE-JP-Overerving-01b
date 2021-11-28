package nl.novi.javaprogrammeren.overerving;

public class ApolloRocket extends Rocket {

    public int amountOfRocketEngines;

    // We roepen hier de constructor aan van Rocket
    public ApolloRocket(int maximumFuel, int rocketEngines) {
        super(maximumFuel);
        this.amountOfRocketEngines = rocketEngines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\r\n"); // Nieuwe regel

        sb.append("This rocket has " + this.amountOfRocketEngines + " rocket engines");

        return sb.toString();
    }
}
