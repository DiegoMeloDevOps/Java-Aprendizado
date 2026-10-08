package PooExercicioRelacionamentoClasses;

public class Main {
    static void main() {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pedro", "França", 31, 11,2, 1, 68.9, 1.75);
        l[1] = new Lutador("João", "Canada", 28, 15,3, 0, 60.5, 1.65);
        l[2] = new Lutador("Pietro", "China", 29, 18,5, 1, 80.8, 1.95);
        l[3] = new Lutador("Douglas", "Inglaterra", 28, 22,7, 1, 90.9, 1.90);
        l[4] = new Lutador("Paulo", "Holanda", 27, 10,9, 0, 120.0, 1.90);
        l[5] = new Lutador("Gael", "Brasil", 26, 15,11, 1, 68.9, 1.70);

        l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();

        // chamando os getters do do l[0]
        l[0].apresentar();
        // atribuindo +1 ao getVitorias
        l[0].ganharLuta();
        // mostrando valor alterado
        l[0].status();
    }
}
