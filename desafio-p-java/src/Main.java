// Interface Veiculo
interface Veiculo {
    void acelerar();
    void frear();
}

// Classe Carro que implementa Veiculo
class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}

// Classe Moto que implementa Veiculo
class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
}

// Interface VeiculoFactory com o método factoryMethod
interface VeiculoFactory {
    Veiculo factoryMethod();
}

// Classe CarroFactory que implementa VeiculoFactory para criar Carros
class CarroFactory implements VeiculoFactory {
    @Override
    public Veiculo factoryMethod() {
        return new Carro();
    }
}

// Classe MotoFactory que implementa VeiculoFactory para criar Motos
class MotoFactory implements VeiculoFactory {
    @Override
    public Veiculo factoryMethod() {
        return new Moto();
    }
}

// Classe Main para testar o padrão Factory Method
public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros
        VeiculoFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.factoryMethod();

        // Usando o carro criado
        carro.acelerar();
        carro.frear();

        // Criando uma fábrica de motos
        VeiculoFactory motoFactory = new MotoFactory();
        Veiculo moto = motoFactory.factoryMethod();

        // Usando a moto criada
        moto.acelerar();
        moto.frear();
    }
}
