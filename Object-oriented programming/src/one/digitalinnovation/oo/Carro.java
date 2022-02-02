package one.digitalinnovation.oo;

class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;
    Double valorCombustivel;

    //construtor
    Carro() {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    Double totalValorTanque(double valorCombustível) {
        return capacidadeTanque * valorCombustível;
    }

}
