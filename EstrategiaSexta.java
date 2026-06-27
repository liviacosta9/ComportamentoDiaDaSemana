public class EstrategiaSexta implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa) {
        return "Dia de registro: registre o que foi concluído na tarefa \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade() {
        return Prioridade.MEDIA;
    }
}