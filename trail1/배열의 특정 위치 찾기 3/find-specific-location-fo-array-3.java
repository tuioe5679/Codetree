import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b[] = scanner.nextLine().split(" ");
        int[] array = new int[b.length];
        int max = array.length;
        int index = 0;
        boolean a = true;
        
        for(int i = 0; i < max; i++){
            array[i] = Integer.parseInt(b[i]);
        }
        for(int i = 0; i < max; i++) {
            if(array[i] == 0 && a){
                index = i;
                a = false;
            }
        }
        System.out.println(array[index-1] + array[index-2] + array[index-3]);
    }
}