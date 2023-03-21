package com.fizzbuzz;

public class FizzBuzz{

    public String CheckFizzBuzz(int numb){
        if(numb % 3 == 0 && numb % 5 == 0){
            return "FizzBuzz";
        }else if(numb % 5 == 0){
            return "Buzz";
        }else if(numb % 3 == 0){
            return "Fizz";
        }
        return Integer.toString(numb);
    }
}