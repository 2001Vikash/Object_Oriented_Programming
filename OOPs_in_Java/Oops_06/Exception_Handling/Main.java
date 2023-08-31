package com.Kunal.Oops_06.Exception_Handling;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        try {
            // int c = a / b;
          //  divide(a, b);

            // mimicking
            // throw new Exception("Haaaa.....");

            String name = "Vikku";
            if(name.equals("Vikku")){
                throw new MyException("Name is Vikku");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {// it is more strict then we need to add first it.
            // like that we add more than one catch().
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        }finally {
            System.out.println("This will always execute");
            // we can't create finally block more than one it will optional and can be one block
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
