// 1.	Crie um programa que realize a média de duas notas decimais e exiba o resultado.
public class Main {

    public static void main(String[] args) {

        double grade1 = 9.5;
        double grade2 = 5.7;
        double averageGrade = (grade1 + grade2) / 2;

        System.out.println(String.format("A média de %.2f e %.2f é igual a %.2f", grade1, grade2, averageGrade));

    }

}