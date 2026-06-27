public class EstrategiaDomingo implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa) {
        return "Dia de planejamento: planeje a próxima semana considerando \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade() {
        return Prioridade.BAIXA;
    }
}
