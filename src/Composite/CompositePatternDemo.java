package Composite;

import java.util.Iterator;
import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Fra", "CEO", 10000);
        Employee cto = new Employee("sere", "CTO", 2000);
        Employee cfo = new Employee("Ale", "CFO", 800);

        Employee dev1 = new Employee("Marco", "Development", 1000);
        Employee dev2 = new Employee("Marta", "Development", 1000);

        Employee clerk1 = new Employee("Giovanni", "Altro", 1000);
        Employee clerk2 = new Employee("Luisa", "Altro", 1000);


        ceo.addSubordinate(cto);
        ceo.addSubordinate(cfo);

        cto.addSubordinate(dev1);
        cto.addSubordinate(dev2);

        cfo.addSubordinate(clerk1);
        cfo.addSubordinate(clerk2);

        System.out.println(ceo);

        List<Employee> ceoSubordinates = ceo.getSubordinates();
        Iterator<Employee> employeeIterator = ceoSubordinates.listIterator();

        while (employeeIterator.hasNext()){
            Employee e = employeeIterator.next();
            System.out.println(e);

            List<Employee> subordinates = e.getSubordinates();

            Iterator<Employee> subordinatesIterator = subordinates.listIterator();
            while (subordinatesIterator.hasNext()){
                Employee i = subordinatesIterator.next();
                System.out.println(i);
            }
        }
    }
}

/*Utilizzare nella composizione dei prodotti*/