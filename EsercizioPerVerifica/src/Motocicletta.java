public class Motocicletta extends Veicolo {
    private String modello;

    public Motocicletta(String m){

        super("Harley", "Chopper", "Moto con manubrio alto");
        modello = m;
    }

    public String getModello() {
        return modello;
    }

    @Override
    public String toString() {
        return "Motocicletta{" +
                "modello='" + modello + '\'' +
                '}';
    }
}
