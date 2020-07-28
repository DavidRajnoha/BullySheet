package com.drajnoha.BullySheet.dao.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author David Rajnoha
 */
@Entity
public class User {
    
    @OneToMany
    private Set<Record> recordSet;
    @OneToMany
    private Set<Habit> habits;

    @Id
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<Habit> getHabits() {
        return habits;
    }

    public void setHabits(Set<Habit> habits) {
        this.habits = habits;
    }

    public Set<Record> getRecordSet() {
        return recordSet;
    }

    public void setRecordSet(Set<Record> recordSet) {
        this.recordSet = recordSet;
    }
}
