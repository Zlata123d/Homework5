public class Main {
    public static void main(String[] args){
        task1();
    task2();
        task3();}
    public static void task1(){
        System.out.println("Задача 1");
    int clientOS=0;
    int clientAndroid=1;
    if (clientOS ==0  ){
        System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientAndroid ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }


}} public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int yearOfRelease = 2016;
        if (clientOS ==0 ) {
            if (yearOfRelease < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else if (clientOS ==1 ){
            if ( yearOfRelease <2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else{ System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }public static void task3() {
        System.out.println("Задача 3");
 int leapYear=2021;
 switch (leapYear){
        case 2010:
        case 2011:
        case 2012:
System.out.println("Невисокосный год");
break;
     case 2013:
         System.out.println("Високосный год");
         break;
     case 2014:
     case 2015:
     case 2016:
         System.out.println("Невисокосный год");
         break;
     case 2017:
         System.out.println("Високосный год");
         break;
     case 2018:
     case 2019:
     case 2020:
         System.out.println("Невисокосный год");
         break;
     case 2021:
         System.out.println("Високосный год");
         break;
     default: System.out.println("Такого года не сущетсвует");


    }
}}
