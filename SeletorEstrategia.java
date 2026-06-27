import java.util.HashMap;
import java.util.Map;

public class SeletorEstrategia {

    private final Map<DiaSemana, EstrategiaDia> estrategias = new HashMap<>();
    private final EstrategiaDia estrategiaAusente = new EstrategiaAusente();

    public SeletorEstrategia() {
        estrategias.put(DiaSemana.SEGUNDA, new EstrategiaSegunda());
        estrategias.put(DiaSemana.TERCA, new EstrategiaTerca());
        estrategias.put(DiaSemana.QUARTA, new EstrategiaQuarta());
        estrategias.put(DiaSemana.QUINTA, new EstrategiaQuinta());
        estrategias.put(DiaSemana.SEXTA, new EstrategiaSexta());
        estrategias.put(DiaSemana.SABADO, new EstrategiaSabado());
        estrategias.put(DiaSemana.DOMINGO, new EstrategiaDomingo());
    }

    public EstrategiaDia buscar(DiaSemana diaSemana) {
        return estrategias.getOrDefault(diaSemana, estrategiaAusente);
    }
}
