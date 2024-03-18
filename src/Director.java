import java.time.LocalDate;
public class Director extends Worker {


    private Director(String surname, String name, String middleName, String position) {
        super(surname, name, middleName, position);
        setPosition(position);
    }

    public Director(String surname, String name, String middleName, String position,
                   String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
        setPosition(position);
    }


    public void setPosition(String position) {
        if (!position.equalsIgnoreCase("Director")) {
            System.out.println("Неверно заданная позиция работника");

        }
    }

    public static void assignTaskDir(Worker[] workers, String surname, String task) {
        for (Worker worker : workers) {
            if (worker.getSureName().equals(surname)) {
                worker.setTasks(task);
                System.out.println("Задача '" + task + "' назначена сотруднику " + worker.getSureName());
            }
        }

    }

    public static void addSalaryD(Worker[] workers, int addAmount) {
        for (Worker worker : workers) {
                worker.setSalary(worker.getSalary() + addAmount);

        }
    }

    @Override
    public String toString() {
        return  super.toString();
    }

}
