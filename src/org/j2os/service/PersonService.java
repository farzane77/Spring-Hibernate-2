package org.j2os.service;

import org.j2os.common.JPA;
import org.j2os.entity.Car;
import org.j2os.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static void main(String[] args) {
        update();
    }

    public static void update() {
        EntityManager entityManager = JPA.getEntityManager();
        EntityTransaction entityTransaction =  entityManager.getTransaction();
        entityTransaction.begin();
        Car car = entityManager.find(Car.class,2L);
        Person person = new Person();
        person.setName("ALIREZA");
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        person.setCars(cars);
        entityManager.persist(person);
        entityTransaction.commit();
        entityManager.close();

    }

    public static void save() {
        EntityManager entityManager = JPA.getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Person person = new Person();
        person.setName("Amirsam");

        Car car2 = new Car();
        car2.setModel("KIA");

        Car car1 = new Car();
        car1.setModel("BENZ");

        List<Car> hamedParking = new ArrayList<>();
        hamedParking.add(car1);
        hamedParking.add(car2);

        person.setCars(hamedParking);

        entityManager.persist(person);

        entityTransaction.commit();
        entityManager.close();
    }
}
