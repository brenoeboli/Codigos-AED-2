import java.util.Random;

public class TesteRandom{
    public static void main(String[] args) {
        Random gerador = new Random();
        gerador.setSeed(4);
        int numero_gerado = (Math.abs(gerador.nextInt()) + 97) % 122 ;
        char caractere = ((char)(numero_gerado));
        caractere = Character.toLowerCase(caractere);
        System.out.println("Caractere Gerado: "+caractere);
        System.out.println("Numero Gerado: "+numero_gerado);
    }

}
