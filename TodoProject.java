import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoProject {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<String>();
        String todo;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            todo = "";
            System.out.println("Enter your to do list (type exit to quit): ");
            todo = keyboard.nextLine();
            if (todo.toString().equalsIgnoreCase("exit")) {
                break;
            }
            todos.add(todo);
        }

        keyboard.close();
        System.out.println(todos);
    }
}