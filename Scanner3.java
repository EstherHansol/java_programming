import java.util.Scanner;
    public class Scanner3 {
        public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("화씨:");

            float fahrenheit = sc.nextFloat();
            float celsius =((float)5/9)*(fahrenheit -32);
            System.out.println("화씨 " +  fahrenheit + "도는 섭씨 " + celsius +" 도 입니다");

        }
    }
