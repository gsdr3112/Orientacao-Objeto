public class Classe {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setProprietario("Guilherme");
        carro1.setCor("Prata");
        carro1.setModelo("Ford Ka");
        carro1.setCapacidadeTanque(45);


        System.out.println("\nProprietário: "+carro1.getProprietario());
        System.out.println("Modelo: "+carro1.getModelo());
        System.out.println("Cor: "+carro1.getCor());
        System.out.println("Capacidade do tanque: "+carro1.getCapacidadeTanque());
        System.out.println("Custo abastecimento: "+carro1.TotalValorTanque(6.5));


        Carro carro2 = new Carro("Joao","Branco","Onyx",40 );

        System.out.println("\nProprietário: "+carro2.getProprietario());
        System.out.println("Modelo: "+carro2.getModelo());
        System.out.println("Cor: "+carro2.getCor());
        System.out.println("Capacidade do tanque: "+carro2.getCapacidadeTanque());
        System.out.println("Custo abastecimento: "+carro2.TotalValorTanque(6.5));
    }
}
