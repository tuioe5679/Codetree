import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        for(int i = 0;i <= input.length;i++){
            if(Integer.parseInt(input[i]) % 3 == 0){
                System.out.println(input[i-1]);
                break;
            }
        }
    }
}