import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

    static class Task {
        private String description;
        private boolean isCompleted;

        public Task(String description) {
            this.description = description;
            this.isCompleted = false;
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void completeTask() {
            this.isCompleted = true;
        }

        @Override
        public String toString() {
            return (isCompleted ? "[x] " : "[ ] ") + description;
        }
    }

    static class ToDoList {
        private List<Task> tasks;

        public ToDoList() {
            tasks = new ArrayList<>();
        }

        public void addTask(String description) {
            tasks.add(new Task(description));
            System.out.println("Задача добавлена: " + description);
        }

        public void removeTask(int index) {
            if (index >= 0 && index < tasks.size()) {
                System.out.println("Задача удалена: " + tasks.get(index).getDescription());
                tasks.remove(index);
            } else {
                System.out.println("Неверный индекс задачи.");
            }
        }

        public void completeTask(int index) {
            if (index >= 0 && index < tasks.size()) {
                tasks.get(index).completeTask();
                System.out.println("Задача выполнена: " + tasks.get(index).getDescription());
            } else {
                System.out.println("Неверный индекс задачи.");
            }
        }
        public void showTasks() {
            if (tasks.isEmpty()) {
                System.out.println("Ваш список задач пуст.");
            } else {
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.println(i + ". " + tasks.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Завершить задачу");
            System.out.println("4. Показать все задачи");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Введите индекс задачи для удаления: ");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.print("Введите индекс задачи для завершения: ");
                    int completeIndex = scanner.nextInt();
                    toDoList.completeTask(completeIndex);
                    break;
                case 4:
                    toDoList.showTasks();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}
