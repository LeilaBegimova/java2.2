package exception;

import exception.IlegalAgeException;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Введите имя :");
            String name =input.nextLine();
            try {
                user.setName(name);
                System.out.println(" Введите возраст");
                int age = input.nextInt();
                user.setAge(age);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (IlegalAgeException e){
                e.printStackTrace();

            }
        }





    }
}