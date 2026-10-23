package Poo.ExercicioHeranca;

public interface AnimalEstimacao {

    // interface serve para implementarmos as classe metodos especificos que queremos
    // que a classe possua sem que ela herde todos os metodos que seriam inuteis a ela
    // nem toda ave voa por exemplo o pinguim ent poderia existir a interface voar somente a aves que voam
    // e para atributos comum que fazem ser aves atribuir a classe aves seus atributos e fazer outras especies de aves herdarem

    // nota: interfaces "não" possuem atributos somentes variaveis constantes
    // declaração de variaveis constantes é atraves de letras maiusculas e underscore para separar
    // exemplo : Boolean ESTADO_VIVO = true;

    void brincar();
    void  passear();


}
