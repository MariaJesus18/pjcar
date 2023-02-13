import Carros.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        // se eu nao estivesse utilizando o padrao builder, eu iria precisar dar um valor para todos as minha variaveis, mesmo se eu
        // nao precisasse usa-la, e como sao muitas ficaria dificil de saber quando eu to setando uma determinada variavel.
        // com o builder isso fica mais facil, pois eu preciso apenas chamar apenas a  contante que eu preciso e da o seu determinado valor

       Carro carro = new Carro.CarroBuilder() // crio um objeto carro apenas com as caracteristica que ele precisa
                .cor("Vermelho")
                .blidagem(true)
                .modelo("esportivo")
                .computador(true)
                .motor("h2v")
                .qtdPorta(4)
                .builder(); // chamo o metodo que vai retornar meu objeto
                System.out.println(carro);

        Carro carro2 = new Carro.CarroBuilder() // crio um objeto carro apenas com as caracteristica que ele precisa
                .cor("Amarelo")
                .modelo("camaro")
                .motor("13c")
                .placa("23la21")
                .qtdLugar(2)
                .builder(); // chamo o metodo que vai retornar meu objeto
                System.out.println(carro2);
       
    }
}
