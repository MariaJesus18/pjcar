package Carros;

public class Carro {
    private String motor;
    private String cor;
    private String modelo;
    private String placa;
    private int qtdLugar;
    private int qtdPorta;
    private String tipoDeRoda;
    private boolean blidagem;
    private boolean computador;

    
// construtor privado
    private Carro(String motor, String cor, String modelo, String placa, int qtdLugar, int qtdPorta, String tipoDeRoda,
            boolean blidagem, boolean computador) {
        this.motor = motor;
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.qtdLugar = qtdLugar;
        this.qtdPorta = qtdPorta;
        this.tipoDeRoda = tipoDeRoda;
        this.blidagem = blidagem;
        this.computador = computador;
    }

    // metodo toString
    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", cor=" + cor + ", modelo=" + modelo + ", placa=" + placa + ", qtdLugar="
                + qtdLugar + ", qtdPorta=" + qtdPorta + ", tipoDeRoda=" + tipoDeRoda + ", blidagem=" + blidagem
                + ", computador=" + computador + "]";
    }

    // classe builder, onde eu vou ter os metodos que vai receber o valor de cada atributo do meu objeto

    public static class CarroBuilder {

        private String motor;
        private String cor;
        private String modelo;
        private String placa;
        private int qtdLugar;
        private int qtdPorta;
        private String tipoDeRoda;
        private boolean blidagem;
        private boolean computador;

        public CarroBuilder motor(String motor) {
            this.motor = motor;
            return this;
    
        }
    
        public CarroBuilder cor(String cor) {
            this.cor = cor;
            return this;
    
        }
    
        public CarroBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
    
        }
    
        public CarroBuilder placa(String placa) {
            this.placa = placa;
            return this;
    
        }
    
        public CarroBuilder qtdLugar(int qtdLugar) {
            this.qtdLugar = qtdLugar;
            return this;
    
        }
    
        public CarroBuilder qtdPorta(int qtdPorta) {
            this.qtdPorta = qtdPorta;
            return this;
    
        }
    
        public CarroBuilder tipoDeRoda(String tipoDeRoda) {
            this.tipoDeRoda = tipoDeRoda;
            return this;
    
        }
    
        public CarroBuilder blidagem(Boolean blidagem) {
            this.blidagem = blidagem;
            return this;
    
        }
        
        public CarroBuilder computador(Boolean computador) {
            this.computador = computador;
            return this;
    
        }
      //  metodo builder que vai retornar a instancia de um objeto do tipo Carro
        public Carro builder(){
            return new Carro(motor, cor, modelo, placa, qtdLugar, qtdPorta, tipoDeRoda, blidagem, computador);
        }
        
    }



}
