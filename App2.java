package intro_POO;

import intro_POO.introducao.bichos.Animal;

public class App2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setSexo("feminino");

        //SUPERCLASSE
        animal.setSexo("feminino");
        mamifero.setSexo("masculino");
        mamifero.setGeraLeite(false);
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        //SUBCLASSE
        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("masculino");
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        Animal animal2 = mamifero;
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());
    }
}
