package PooExercicioEncapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // metodo construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    // metodos getters e setters

    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    // sobresrevendo os metodos da interface
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando tv!");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando tv!");
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado?: "+this.getLigado());
        System.out.println("Volume: "+this.getVolume());
        System.out.println("Tocando? :"+this.getTocando());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
            System.out.println("Volume atual: "+ this.getVolume());
        }else{
            System.out.println("Ligue a tv!");
        }

    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
            System.out.println("Volume atual: "+this.getVolume());
        }else{
            System.out.println("Ligue a tv!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Volume atual: "+ this.getVolume());

        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Volume atual: "+this.getVolume());
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
            System.out.println("Despausando e Tocando!");
        }else {
            System.out.println("Ligue a tv!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Pausando tv!");
        }else{
            System.out.println("Ligue a tv!");
        }
    }
}
