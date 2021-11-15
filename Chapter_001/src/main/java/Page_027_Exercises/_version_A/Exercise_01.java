package Page_027_Exercises._version_A;

import java.util.Scanner;

/**
 * Created on 15.11.2021 19:01.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 *
 * Приветствовать любого пользователя
 * при вводе его имени через команд-
 * ную строку.
 */
public class Exercise_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter name: ");
        String name = sc.nextLine();

        System.out.printf("Hello! %s.", name);
    }
}
