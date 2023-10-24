package org.example;
class Calculate{
    private Complex a;
    private Complex b;
    private int num;
    private int imag;
    private  double numD;
    private  double imagD;
    private String op;
    Calculate(Complex a, Complex b, String op){
        this.a = a;
        this.b = b;
        this.op = op;

    }
    public String result(){
        if(op.equals("+")) return complexSum();
        else if (op.equals("-")) return difference();
        else if (op.equals("*")) return multiplication();
        else if (op.equals("/")) return division();
        else return "ошибка операции.";
    }
    public String complexSum(){
        num = a.getNumber()+ b.getNumber();
        imag = a.getImaginary().getNumber()+ b.getImaginary().getNumber();
        if(imag < 0) return num + "" + imag + "i";
        else return num + "+" + imag + "i";
    }
    public String difference(){
        num = a.getNumber()-b.getNumber();
        imag = a.getImaginary().getNumber()-b.getImaginary().getNumber();
        if(imag < 0) return num + "" + imag + "i";
        else return num + "-" + imag + "i";
    }
    public String multiplication(){
        num = (a.getNumber()* b.getNumber())-(a.getImaginary().getNumber()*b.getImaginary().getNumber());
        imag = (a.getImaginary().getNumber()*b.getNumber())+(a.getNumber()*b.getImaginary().getNumber());
        if(imag < 0) return num + "" + imag + "i";
        else return num + "+" + imag + "i";
    }
    public String division(){
        double denominator = (Math.pow(a.getImaginary().getNumber(), 2)+(Math.pow(b.getImaginary().getNumber(), 2)));
        numD = ((a.getNumber()*b.getNumber())+(a.getImaginary().getNumber()*b.getImaginary().getNumber()))/denominator;
        imagD = ((a.getImaginary().getNumber()*b.getNumber())-(a.getNumber()*b.getImaginary().getNumber()))/denominator;
        if(imag < 0) return String.format("%.2f",numD) + "" + String.format("%.2f",imagD) + "i";
        else return String.format("%.2f",numD) + "+" + String.format("%.2f",imagD) + "i";
    }
}