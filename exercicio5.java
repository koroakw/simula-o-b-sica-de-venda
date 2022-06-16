package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
public static void main (String[] args) {
int cod1, n1, cod2, n2;
double v1, v2,vu1, vu2, vt;
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
System.out.print("digite o codigo do item 1: " );
cod1 = sc.nextInt();
System.out.print("digite o número de itens: ");
n1 = sc.nextInt();
System.out.print("digite o valor do item 1: ");
v1 = sc.nextDouble();
System.out.println(".");
System.out.println(".");
System.out.println(".");
System.out.print("digite o codigo do item 2: " );
cod2 = sc.nextInt();
System.out.print("digite o número de itens: ");
n2 = sc.nextInt();
System.out.print("digite o valor do item 2: ");
v2 = sc.nextDouble();
vu1 = n1*v1;
vu2 = n2*v2;
vt = vu1+vu2;
System.out.printf("o valor do item %d e do item %d é de: %.2f", cod1, cod2, vt);

}
}
