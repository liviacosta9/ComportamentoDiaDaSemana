public class EstrategiaQuinta implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa) {
        return "Dia de colaboração: " + usuario +
                ", converse com alguém da equipe sobre \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade() {
        return Prioridade.MEDIA;
    }
}