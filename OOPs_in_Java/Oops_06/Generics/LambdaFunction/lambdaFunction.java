package com.Kunal.Oops_06.Generics.LambdaFunction;

import org.w3c.dom.ls.LSOutput;

//import java.lang.invoke.LambdaForm$Holder;
import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdaFunction {
    public static void main(String[] args) {

        // Lambda functions are inLine functions means one line functions.
        // sometimes we do not requirement the giving the name in the Lambda function concept just give the working things

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);
        }

        // lambda function
     //   arr.forEach((item) -> System.out.println(item * 2));

        // OR

        Consumer<Integer> fun = (item) -> System.out.println(item * 2); // because forEach take parameter as Consumer
        arr.forEach(fun);
    }

//    int sum(int a , int b){
//        return a + b;
//    }
//    Operation sum = (a,b) -> a+b;
//    Operation sub = (a,b) -> a-b;
//    Operation mul = (a,b) -> a*b;
//
//    lambdaFunction myCalculator = new lambdaFunction();
//    System.out.println(myCalculator.operate(5,3,sum));


    private int operate(int a , int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}