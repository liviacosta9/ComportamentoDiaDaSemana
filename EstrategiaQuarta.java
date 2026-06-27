public class EstrategiaQuarta implements EstrategiaDia {

    @Override
    public String executar(String usuario, String tarefa){
        return "Dia de revisão: verifique o andamento da atividade \"" + tarefa + "\".";
    }

    @Override
    public Prioridade getPrioridade(){
        return Prioridade.MEDIA;
    }

}