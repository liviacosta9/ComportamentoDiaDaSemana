public class EstrategiaSabado implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa) {
        return "Dia de estudo livre ou descanso: revise \"" + tarefa + "\" sem pressão.";
    }

    @Override
    public Prioridade getPrioridade() {
        return Prioridade.BAIXA;
    }
}