package org.campus02.thaler;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    private int sumVariables(){
       int c = a + b;
       return c;
    }

    public String result(){
        int sum_AB = sumVariables();
        if (sum_AB < 0){
            return "unter Null";
        } else if (sum_AB < 10) {
            return "zwischen 0 und 10";
        }
        else {
            return "ueber 10";
        }
    }
}
