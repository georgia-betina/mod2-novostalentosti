import introducao.bichos.Animal;
import introducao.bichos.Mamifero;

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

        Animal animal2 = mamifero; // "máscara"/"filtro"/interface de comunicação da superclasse -> apesar de animal2 ser um mamífero, ele é lido como animal antes
        // CAST - Conversão -> só pode existir quando há relação de herança
        System.out.println(((Mamifero)animal2).isGeraLeite());
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());
    }
}
