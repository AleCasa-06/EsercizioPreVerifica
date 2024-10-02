public class Automobile extends Veicolo {
    private int velocitàMassima;

    public Automobile(int vm){
        super("Ferrari", "F40", "sportiva e rossa");
        velocitàMassima = vm;
    }

    public int getVelocitàMassima() {
        return velocitàMassima;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "velocitàMassima=" + velocitàMassima +
                '}';
    }

}
