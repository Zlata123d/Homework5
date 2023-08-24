public class Main {
    public static void main(String[] args){
        task1();
    task2();
        task3();
    task4();
    task5();}
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
}
  public static void task4() {
    System.out.println("Задача 4");
    int deliveryDistance = 95;
    if (deliveryDistance == 20){
        System.out.println("Потребуется дней: 1");
            if (deliveryDistance >=20 || deliveryDistance <=60){
                System.out.println("Потребуется дней: 2");
            }
        }

}
 public static void task5(){
        System.out.println("Задача 5");
     int monthNumber=12;
     switch (monthNumber){
         case 1:
             System.out.println("Январь");
             break;
         case 2:
             System.out.println("Февраль");
             break;
         case 3:
             System.out.println("Март");
             break;
         case 4:
             System.out.println("Апрель");
             break;
         case 5:
             System.out.println("Май");
             break;
         case 6:
             System.out.println("Июнь");
             break;
         case 7:
             System.out.println("Июль");
             break;
         case 8:
             System.out.println("Август");
             break;
         case 9:
             System.out.println("Сентябрь");
             break;
         case 10:
             System.out.println("Октябрь");
             break;
         case 11:
             System.out.println("Ноябр");
             break;
         case 12:
             System.out.println("Декабрь");
             break;

         default: System.out.println("Такого месяца не сущетсвует");


     }
 }
 }

