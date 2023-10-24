package org.example;

public class Imaginary {
    private int number;
    private String i = "";

    Imaginary(String imaginary){
        String num = "";
        String txt[] = imaginary.split("");
        for(String t: txt){
            if(strToInt(t) || t.equals("-")){
                num += t;
            }else{
                this.i += t;
            }
        }
        this.number = Integer.parseInt(num);
    }

    private static boolean strToInt(String num){
        try{
            Integer.parseInt(num);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    public int getNumber(){
        return number;
    }
    public String getI(){
        return i;
    }
    @Override
    public String toString(){
        return number + i;
    }
}