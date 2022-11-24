// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            Integer res = i;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                res = null;
                break;
                }
            }
        if (res != null) {
            System.out.println(res);
                }
            

        }
    }
}
