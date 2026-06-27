import java.time.LocalDate;
import java.util.Scanner;

import servico.SeletorEstrategia;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SeletorEstrategia seletor = new SeletorEstrategia();

        System.out.print("Informe seu nome: ");
        String usuario = scanner.nextLine();

        System.out.print("Informe a tarefa: ");
        String tarefa = scanner.nextLine();

        System.out.print("Deseja usar o dia atual? (s/n): ");
        String opcao = scanner.nextLine();

        DiaSemana diaConsultado;

        if(opcao.equalsIgnoreCase("s")){
            diaConsultado = DiaSemana.deDayOfWeek(LocalDate.now().getDayOfWeek());
        } else{
            System.out.print("Informe o dia da semana: ");
            String diaDigitado = scanner.nextLine();
            diaConsultado = DiaSemana.deTexto(diaDigitado);
        }

        EstrategiaDia estrategia = seletor.buscar(diaConsultado);

        System.out.println();
        System.out.println("Usuário: " + usuario);
        System.out.println("Dia consultado: " + diaConsultado.getNome());
        System.out.println("Prioridade: " + estrategia.getPrioridade());
        System.out.println("Mensagem: " + estrategia.executar(usuario, tarefa));

        scanner.close();
    }

}