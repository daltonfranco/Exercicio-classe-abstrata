public class App{

    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Papagaio p = new Papagaio();

        c.setNome("Pudim");
        c.setTamanho("0.3");
        c.setRaca("Pinscher");
        c.amamentar();
        c.emitirSom();
        
        
        g.setNome("Wilian");
        g.setRaca("Vira-Lata");
        g.amamentar();
        g.emitirSom();

        p.emitirSom();
        p.voar();

    }
    
}
