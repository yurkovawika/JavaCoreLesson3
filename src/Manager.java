import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Worker {


    private Manager(String surname, String name, String middleName, String position) {
        super(surname, name, middleName, position);
        setPosition(position);
    }

    public Manager(String surname, String name, String middleName, String position,
                   String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
        setPosition(position);
    }


    public void setPosition(String position) {
        if (!position.equalsIgnoreCase("Manager")) {
            System.out.println("Неверно заданная позиция работника");

        }
    }

    public static void addSalaryM(Worker[] workers, int addAmount) {
        for (Worker worker : workers) {
            if (!worker.getPosition().equalsIgnoreCase("Director")) {
                worker.setSalary(worker.getSalary() + addAmount);
            }
        }
    }

    @Override
    public String toString() {
        return  super.toString();
    }

}
