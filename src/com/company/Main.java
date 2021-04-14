package com.company;

/*Definiţi o clasă care să implementeze operaţii pe numere double. Operaţiile vor
arunca excepţii. Clasa va trebui să implementeze interfața Calculator, ce conţine trei
metode:
- add: primeşte două numere şi întoarce un double
- divide: primeşte două numere şi întoarce un double
- average: primeşte o colecţie ce conţine obiecte double, şi întoarce media
acestora ca un numar de tip double. Pentru calculul mediei, sunt folosite
metodele add şi divide.
o Metodele pot arunca următoarele excepții (definite în interfața Calculator):
▪ NullParameterException: este aruncată dacă vreunul din parametrii
primiți este null
▪ OverflowException: este aruncată dacă suma a două numere e egală
cu Double.POSITIVE_INFINITY
▪ UnderflowException: este aruncată dacă suma a două numere e egală
cu Double.NEGATIVE_INFINITY
o Completați metoda main din clasa MainEx2, evidențiind prin teste toate
cazurile posibile care generează excepţii.*/

public class Main implements ICalculator{

    public static void main(String[] args) {

        Main program = new Main();

        try{
            double s1 = program.add(1.5,1.5);
            double d1 = program.divide(6,0);

            double a1 = program.average(new double[]{s1,d1});

            System.out.println(s1);
            System.out.println(d1);
            System.out.println(a1);

        }
        catch (Exception e) {
            /* This block will only execute if any Arithmetic exception
             * occurs in try block
             */
            System.out.println("You should not divide a number by zero");
        }

        System.out.println("The End");

    }

//    public static double aduna(double a, double b){
//
//        return a+b;
//    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double divide(double a, double b) {
        return a/b;
    }

    @Override
    public double average(double[] arr) {
        double s=0;
        for(int i=0;i<arr.length;i++){
            {
                s=add(s,arr[i]);
            }

        }

        return divide(s,arr.length);
    }
}
