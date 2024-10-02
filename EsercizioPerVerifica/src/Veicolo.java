public abstract class Veicolo {
    private String marca;
    private String modello;
    private String descrizione;

    public Veicolo(String m, String mo, String d){
        marca = m;
        modello = mo;
        descrizione = d;
    }
    public <T> int calcoloConsumo(){
        return 0;
    }
}
