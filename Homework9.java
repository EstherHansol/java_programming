package java_programming.java_programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

/*public class Homework9{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(new File("hello.txt"));
            while (sc.hasNext()){
                String line= sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (Exception e) { e.printStackTrace();}
    }
}*/

/*class Homework9 {
    public static void main(String[] args) {
        String fileName = "travel.txt";


        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter(fileName));
            bf.write("I love to travel. \r\n");
            bf.write("The cities I have visited  \r\n");
            bf.write("\t- Seoul \r\n");
            bf.write("\t- New York \r\n");
            bf.write("\t- Sydney \r\n");
            bf.close();

            FileReader fr = new FileReader(fileName);
            BufferedReader br =new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/

/*import java.util.ArrayList;

public class Homework9{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = -1; i<4; i++){
            try{
                int n= list.get(i);

                System.out.printf("list[%d] = %d\n" , i, n);
            }
            catch (IndexOutOfBoundsException e){
                System.out.printf("인덱스 %d 범위를 벗어났습니다. \n", i);
            }
        }
    }
}*/

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> wc = new HashMap<String, String>();
        String str;

        try {
            Scanner sc = new Scanner(new File("db.txt"));
            while (sc.hasNext()) {
                String Id = sc.next();
                String Password = sc.next();
                wc.put(Id, Password);// 어떤게 키고 벨륜지 알려주는거



            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            while (true) { //c는1 ,java는 true java는 1을 true로 인식하지 않는다.
                System.out.println("id와 password를 입력해주세요.");
                System.out.print("id: "); //여기까지 하면 프롬프트창에 입력이 안됨
                Scanner sc = new Scanner(System.in);
                String id = sc.next(); //이게 되야 입력이 됨

                if (wc.containsKey(id)) {
                    System.out.print("password: ");
                    //scanner 또 쓸필요 없다
                    String password = sc.next();

                    if (wc.get(id).equals(password)) {//key 에 해당하는 value를 가져올때는 get을 씀 /변수명이니까password괄화안해됨 /key:Id
                        //equals가 함수라서 ()안에 password넣어야함
                        System.out.println("id와 비밀번호가 일치합니다.");
                        break;
                    } else {
                        System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                    }

                }

        }
    }
    }
