/**
 * @author danil
 */

public class CalculoMedia {

    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public CalculoMedia(int nota1, int nota2, int nota3, int nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        int soma = nota1 + nota2 + nota3 + nota4;
        return soma / 4;
    }

    public static void main(String[] args) {
        CalculoMedia minhaMedia = new CalculoMedia(5, 6, 8, 9);
        double media = minhaMedia.calcularMedia();
        System.out.println("A média é: " + media);
    }

}
