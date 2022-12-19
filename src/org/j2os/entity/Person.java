package org.j2os.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "person")
@Table(name = "person")
public class Person {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "person_car", joinColumns = {@JoinColumn(name = "PERSON_ID") }, inverseJoinColumns = { @JoinColumn(name = "CAR_ID") })
    private List<Car> cars;

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
