package intro_POO;

import intro_POO.introducao.bichos.Animal;

public class App2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setSexo("feminino");

        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("feminino");
    }
}
