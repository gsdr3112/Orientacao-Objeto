public class Carro {

    String proprietario;
    String cor;
    String modelo;
    int capacidadeTanque;

//    Construtor aqui

    Carro(){

    }

    Carro(String proprietario, String cor, String modelo, int capacidadeTanque){
        this.proprietario = proprietario;
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    //    Getters and Setters
    void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }

    String getProprietario(){
        return proprietario;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    double TotalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }


}
