public class EstrategiaTerca implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa){
        return "Dia de avanço: " + usuario +
                ", avance nas tarefas pendentes, principalmente em \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade(){
        return Prioridade.ALTA;
    }

}