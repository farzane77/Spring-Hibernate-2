package org.j2os.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "car")
@Table(name = "car")
public class Car {
    @Id@GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    @Column(columnDefinition = "VARCHAR2(20)")
    private String model;
    @ManyToMany(cascade = CascadeType.PERSIST,mappedBy = "cars")
    private List<Person> persons;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
