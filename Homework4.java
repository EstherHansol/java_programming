package java_programming.java_programming;

public class Homework4 {
    public int[] solution( int n, int m){
        int[] answer = new int[2];

        int big = 0,small =0 ;

        if(n>m){
            big=n;
            small =m;

        }
        else{
            big =m;
            small=n;
        }

        answer[0]= gcd(big,small);

        return answer;
    }

    public int gcd(int big, int small){
        if(big % small ==0 ){
            return small;
        }
        return gcd(small, big %small);
    }
}
