import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b[] = scanner.nextLine().split(" ");
        int[] array = new int[b.length];
        int max = array.length;
        
        for(int i = 0; i < max; i++){
            array[i] = Integer.parseInt(b[i]);
        }
        for(int i = 0; i < max; i++) {
            if(array[i] == 0){
                System.out.println(array[i-1] + array[i-2] + array[i-3]);
                break;
            }
        }
    }
}