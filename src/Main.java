/*
1. Написать компоратор по фамилии
2. Опишите класс руководителя (Manager), наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
3. Добавить возможность сотрудникам брать на себя задачу (реализовать либо как String, либо как объект класса Task) - например, метод assign(Task task).
У руководителя должна быть возможность ставить задачу сотруднику, используя перегрузку метода assign(...) и брать задачу себе.
*/

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Worker[] workers =  {
                new Worker("Anichenko", "Ivan", "Ivanovich",
                        "backend-developer", "+7-999-888-77-66", 100,
                        LocalDate.of(1940, 10, 17)),
                new Worker("Petrov", "Kiril", "Pavlovich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1969, 11, 17)),
                new Worker("Stasov", "Alexandr", "Yurievich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1980, 11, 17)),
                new Manager("Titov", "Oleg", "Aleksandrovich", "manager",
                        "+7-999-111-22-66", 2000,
                        LocalDate.of(1970, 11, 17)),
                new Director("Mikova", "Anna", "Vladislavovna", "Director",
                        "+7-999-000-00-34", 5000,
                        LocalDate.of(1987, 4, 12)),
                new Manager("Denisov", "Petr", "Sergeevich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1962, 11, 17))

        };


        /*
        System.out.println("Average age: " + getAverageAge(workers));
        System.out.println("Average salary: " + getAverageSalary(workers));

        Worker.addSalary(workers, 45, 50);

        System.out.println(Arrays.toString(workers));


        System.out.println("---".repeat(5));
        Collections.sort(workerList);
        System.out.println(workerList);
        System.out.println("---".repeat(5));


        System.out.println(workerList);

        System.out.println("---".repeat(5));

        workerList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(workerList);
        System.out.println("---".repeat(5));


        */


        List<Worker> workerList = Arrays.asList(workers);
        System.out.println(workerList);
        Worker.assignTask(workers,"Mikova", "Работа по заявке INC8786498324");
        Director.assignTaskDir(workers,"Mikova", "Работа по заявке INC8786498324");

        // повышаем все работникам зп на 77, через менеджера
        Manager.addSalaryM(workers, 77);
        System.out.println("---".repeat(5));
        System.out.println("После повышения ЗП " + workerList);



    }

    public static double getAverageAge(Worker[] array) {
        int sumAge = 0;
        for (Worker worker : array) {
            sumAge += worker.getAge();
        }
        return sumAge / (double) array.length;
    }

    public static double getAverageSalary(Worker[] array) {
        int sumSalary = 0;
        for (Worker worker : array) {
            sumSalary += worker.getSalary();
        }
        return sumSalary / (double) array.length;
    }

}
