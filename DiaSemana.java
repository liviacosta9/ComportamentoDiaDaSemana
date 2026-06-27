import java.time.DayOfWeek;

public enum DiaSemana {

    SEGUNDA("segunda-feira"),
    TERCA("terça-feira"),
    QUARTA("quarta-feira"),
    QUINTA("quinta-feira"),
    SEXTA("sexta-feira"),
    SABADO("sábado"),
    DOMINGO("domingo"),
    INVALIDO("inválido");

    private final String nome;

    DiaSemana(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public static DiaSemana deDayOfWeek(DayOfWeek dayOfWeek){

        switch (dayOfWeek){
            case MONDAY:
                return SEGUNDA;

            case TUESDAY:
                return TERCA;

            case WEDNESDAY:
                return QUARTA;

            case THURSDAY:
                return QUINTA;

            case FRIDAY:
                return SEXTA;

            case SATURDAY:
                return SABADO;

            case SUNDAY:
                return DOMINGO;

            default:
                return INVALIDO;
        }
    }

    public static DiaSemana deTexto(String texto){

        if(texto == null || texto.trim().isEmpty()){
            return INVALIDO;
        }

        String valor = texto.trim().toLowerCase();

        switch (valor){

            case "segunda":
            case "segunda-feira":
                return SEGUNDA;

            case "terca":
            case "terça":
            case "terca-feira":
            case "terça-feira":
                return TERCA;

            case "quarta":
            case "quarta-feira":
                return QUARTA;

            case "quinta":
            case "quinta-feira":
                return QUINTA;

            case "sexta":
            case "sexta-feira":
                return SEXTA;

            case "sabado":
            case "sábado":
                return SABADO;

            case "domingo":
                return DOMINGO;

            default:
                return INVALIDO;
        }
    }

}