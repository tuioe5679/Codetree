import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int odd = 0;
        int even = 0;
        for(int i = 0; i < array.length;i++) {
            if(i % 2 == 0){
                even += Integer.parseInt(array[i]);
            }else {
                odd += Integer.parseInt(array[i]);
            }
        }
        if(even > odd){
            System.out.println(even - odd);
        }else {
            System.out.println(odd - even);
        }
    }
}