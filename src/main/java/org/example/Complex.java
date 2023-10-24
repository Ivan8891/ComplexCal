package org.example;

public class Complex {
    private String z;
    private int number;
    private Imaginary imaginary;
    Complex(String complex){
        String txt[] = complex.split("");
        String a = "";
        String b = "";
        int i = 0;
        for(; i<txt.length; i++) {
            a += txt[i];
            if (txt[i + 1].equals("+") || txt[i + 1].equals("-")) {
                i++;
                break;
            }
        }
        for(; i<txt.length; i++){
            b += txt[i];
        }
        if(a.contains("i")){
            this.imaginary = new Imaginary(a);
            this.number = Integer.parseInt(b);
        }else{
            this.imaginary = new Imaginary(b);
            this.number = Integer.parseInt(a);
        }
    }
    public void setZ(String z){
        this.z = z;
    }

    public int getNumber() {
        return number;
    }

    public Imaginary getImaginary() {
        return imaginary;
    }

    @Override
    public String toString(){
        return number +" "+ imaginary;
    }
}