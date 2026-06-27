public class EstrategiaAusente implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa) {
        return "Não há estratégia associada para o dia informado.";
    }

    @Override
    public Prioridade getPrioridade() {
        return Prioridade.BAIXA;
    }
}