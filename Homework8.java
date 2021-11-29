package java_programming.java_programming;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*
class TestCountChars {
    String str;
    TestCountChars(String s) {str = s; }

    Map<Character, Integer> countChars(){ //character 가 key, integer가 value
        Map<Character, Integer> wc = new HashMap <Character, Integer> ();
        char[] letters = str.toCharArray();
        for (char c: letters) { //c가 문자니까 '' //문자열 아님
            if (wc.containsKey(c)) {
                wc.put(c, wc.get(c) + 1);

            } else if (c != ' ') //" " 문자열, 공백문자 하나는 ' ' //공백 없게 만들기 //교재와 차이
                wc.put(c, 1);
        }

        return wc;

    }
    public static void main(String[]args){
        TestCountChars tcc = new TestCountChars("Sanymyung university");
        Map<Character, Integer> map = tcc.countChars();
        System.out.println(map);
    }
}


 */ class Homework8{
    public static void main(String[] args) {
        Map<String, String> wc = new HashMap<String, String>();
        String str;
        wc.put("myId", "myPass");
        wc.put("myId2", "myPass2");
        wc.put("myId3", "myPass3");
        while(true){ //c는1 ,java는 true java는 1을 true로 인식하지 않는다.
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: "); //여기까지 하면 프롬프트창에 입력이 안됨
            Scanner sc = new Scanner(System.in);
            String id = sc.next(); //이게 되야 입력이 됨

            if (wc.containsKey(id)) {
                System.out.print("password: ");
                //scanner 또 쓸필요 없다
                String password= sc.next();

                if (wc.get(id).equals (password)) {//key 에 해당하는 value를 가져올때는 get을 씀 /변수명이니까password괄화안해됨 /key:Id
                    //equals가 함수라서 ()안에 password넣어야함
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
                else
                {
                    System.out.println("id와 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                }
            }
        }
        }


}