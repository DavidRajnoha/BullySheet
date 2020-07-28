package com.drajnoha.BullySheet.dao.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author David Rajnoha
 */
@Entity
public class Habit {

    @Id
    private Long id;

    private Boolean active;
    private String name;
    private String currentGoal;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Record> recordSet;

    public String getCurrentGoal() {
        return currentGoal;
    }

    public void setCurrentGoal(String currentGoal) {
        this.currentGoal = currentGoal;
    }
}
