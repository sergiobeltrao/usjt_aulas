package psc.Zoeiras;

public class Cachaça {
    public static void main(String[] args) {
        String texto = "Açúcar é doce, cachaça é amarga.";

        // Substituir "ç" por "c"
        String textoSemCedilha = texto.replace("ç", "c");

        System.out.println(textoSemCedilha);
    }
}