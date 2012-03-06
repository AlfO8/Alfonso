import java.io.*;

public class triangle{
private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

public static void main (String args[]) trhows IOException{
float i;
String entrada;

System.out.println("Escriu el primer nombre real: ");
entrada= stdin.readLine();
i= Float.parseFloat(entrada);

float a;
System.out.println("Escriu el segon nombre real: ");
entrada= stdin.readLine();
a= Float.parseFloat(entrada);

System.out.println("La suma total es: " + (i+a));
}
