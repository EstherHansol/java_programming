package java_programming;


import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요?:");
        int cnt = sc.nextInt();
        int[] n = new int[cnt];
        for (int i = 0; i < n.length; i++) {
            System.out.print("수를 입력하세요: ");
            n[i] = sc.nextInt();

        }
        int max = n[0];
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        for (int j=0; j < n.length; j++){
            if (min>n[j]){
                min=n[j];
            }
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
    }
}