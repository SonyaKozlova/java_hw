import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Table> tables = new ArrayList<Table>();// всего 10 столиков. Все изначально свободны.
         for(int i = 0; i < 10; i++){
             tables.add(new Table(i+1, true));
         } // Добавляем 10 классов Стола в список всех столиков
        System.out.println("Выберите команду: \n 1 - выбрать свободный столик" + " \n 2 - добавить заказ" + " \n 3 - рассчитать столик");
         String command = sc.nextLine();
         if(command.equals(1)){

         }
    }
    public static void printAvailableTables(ArrayList<Table> tables){ // Выводим все столики, у которых статус свободен
        for(Table t: tables){
            if(t.isFree()){
                System.out.println(t.getId());
            }
        }
    }

}


