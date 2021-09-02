package com.company;

public class YearRange {
    private int FirstYear;
    private int SecondYear;
    private int range;
    private int firstDivisor;
    private int secondDivisor;

    public YearRange(int f, int s){
        this.FirstYear= f;
        this.SecondYear= s;
    }

    public void setRangeType(int f){
        this.range = f;
    }
    public void setFirstDivisor(int f){
        this.firstDivisor =f;
    }
    public void setSecondDivisor(int s){
        this.secondDivisor =s;
    }
    public int getFirstDivisor(){
        return this.firstDivisor;
    }
    public int getSecondDivisor(){
        return this.secondDivisor;
    }
    public int getFirstYear(){
        return this.FirstYear;
    }
    public int getSecondYear(){
        return this.SecondYear;
    }
    public void printYears(){
        while (FirstYear <= SecondYear){
            FirstYear ++;
            if(FirstYear%firstDivisor == 0 && FirstYear%secondDivisor == 0)
                System.out.println(FirstYear);
        }
    }

}
