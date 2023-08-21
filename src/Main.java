public class Main {
    public static void main(String[] args){
        task1();
    task2();
        task3();}
    public static void task1(){
    int clientOS=0;
    int clientAndroid=1;
    if (clientOS ==0  ){
        System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientAndroid ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }


}} public static void task2() {
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

    }
}
