package com.company.Pract;
class Fibonacci{//2, 3, 5, 13, 89, 233, 1597, 28657, 514229, 433494437
    int res, count = 1;
    int f1 = 0, f2=1;
    void fibonacci() {
        while(count <= 10){
            res = f1 + f2;
            f1 = f2;
            f2 = res;
            String check = prime(res);
            if(check == "prime"){
                System.out.print(res+" ");
                count ++;
            }
        }
    }
    String prime(int res){
        int j=0, count=0;
        String finalCheck="Not Prime";
        for (j = 1; j <= res; j++) {
            if (res % j == 0) {
                count++;
            }
        }
        if (count == 2) {
            finalCheck = "prime";
        }
        return finalCheck;
    }
}
public class FibonacciWithPrime {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibonacci();
    }
}
