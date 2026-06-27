package estrategia;

import Prioridade;

public interface EstrategiaDia {

    String executar(String usuario, String tarefa);
    Prioridade getPrioridade();
    
}