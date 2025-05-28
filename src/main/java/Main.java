
// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ile liczb chcesz wprowadzić?");
    int n = scanner.nextInt();
    int[] liczby = new int[n];

    System.out.println("Wprowadź " + n + " liczby:");
    for (int i = 0; i < n; i++) {
      liczby[i] = scanner.nextInt();
    }
    int max = liczby[0];
    int min = liczby[0];

    for (int i = 1; i < liczby.length; i++) {
      if (liczby[i] > max) {
        max = liczby[i];
      }
      if (liczby[i] < min) {
        min = liczby[i];
      }
    }
    int roznica = max - min;
    System.out.println("Różnica między największą i najmniejszą liczbą to: " + roznica);

  }

}