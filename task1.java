// Вычислить n-ое треугольного числа(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)


public class task1 {
  static int sum(int n) {        // метод для вычисления n-ого треугольного числа 
    if(n == 1) return 1;
    int result = n + sum(n - 1);
    return result; 
  }

  static int factor(int n) {     // метод для вычисления факториала n
    if(n == 1) return 1;
    int result = n * factor(n-1);
    return result;
  }
  public static void main(String[] args) {
    System.out.println(sum(4));  // треугольное число для n = 4;
    System.out.println(factor(5)); // факториал для n = 5;
  }
}
