import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                    int[] arr = new int[10];

                            int evenSum = 0;
                                    int multipleOfThreeSum = 0;
                                            int count = 0;

                                                    for (int i = 0; i < 10; i++) {
                                                                arr[i] = sc.nextInt();

                                                                            // 짝수 번째로 입력된 값
                                                                                        if ((i + 1) % 2 == 0) {
                                                                                                        evenSum += arr[i];
                                                                                                                    }

                                                                                                                                // 3의 배수 번째로 입력된 값
                                                                                                                                            if ((i + 1) % 3 == 0) {
                                                                                                                                                            multipleOfThreeSum += arr[i];
                                                                                                                                                                            count++;
                                                                                                                                                                                        }
                                                                                                                                                                                                }

                                                                                                                                                                                                        double average = (double) multipleOfThreeSum / count;

                                                                                                                                                                                                                System.out.printf("%d %.1f", evenSum, average);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    }