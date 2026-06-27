public class EstrategiaSegunda implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa){
        return "Dia de organização: " + usuario +
                ", organize suas prioridades para a tarefa \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade(){
        return Prioridade.ALTA;
    }

}