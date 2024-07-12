import java.util.Scanner;

/**
 * @author danil
 */

public class MediaAluno {

    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public MediaAluno(int nota1, int nota2, int nota3, int nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
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
        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        return media;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do/a aluno/a: ");
        String nome = sc.nextLine();

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota do/a aluno/a: ");
        int nota1 = s.nextInt();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a segunda nota do/a aluno/a: ");
        int nota2 = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Digite a terceira nota do/a aluno/a: ");
        int nota3 = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite a quarta nota/a do aluno/a: ");
        int nota4 = s3.nextInt();

        MediaAluno mediaAluno = new MediaAluno(nota1, nota2, nota3, nota4);
        double media = mediaAluno.calcularMedia();

        String alunoMedia = getMedia (media);
        System.out.println("A média do/a "+ nome + " é: " + media);
        System.out.println(alunoMedia);

        sc.close();
    }

    public static String getMedia(double media) {
        if (media >= 7 && media <= 10) {
            return "Está aprovado";
        } else if (media >= 5 && media < 7) {
            return "Está em recuperação";
        } else if (media >= 0 && media < 5) {
            return "Está reprovado";
        } else {
            return "Nota inválida";
        }
    }


}
