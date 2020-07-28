package com.drajnoha.BullySheet.dao.entities;

import com.drajnoha.BullySheet.exceptions.DaysNotAdjecentException;
import com.drajnoha.BullySheet.exceptions.InvalidStateException;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.Set;

/**
 * @author David Rajnoha
 */
@Entity
public class Record {

    @Id
    private Long id;

    private LocalDate date;

    @OneToOne
    private Record nextRecord;

    @OneToOne
    private Record prevRecord;

    private String atTimeGoal;
    private String value;
    private State state;

    @ManyToOne
    private Habit habit;

    @ManyToOne
    private User user;


    public void setDate(LocalDate date) throws InvalidStateException {
        if (nextRecord != null || prevRecord != null) {
            throw new InvalidStateException("The next and prev record must be empty when setting the date");
        }
        this.date = date;
    }


    public void setNextRecord(Record nextRecord) throws DaysNotAdjecentException, InvalidStateException {
        if (date == null) {
            throw new InvalidStateException("The date of the issue can not be null when setting a next record");
        }

        if (! nextRecord.date.minusDays(1).equals(this.date)) {
            throw new DaysNotAdjecentException();
        }
        this.nextRecord = nextRecord;
    }

    public void setPrevRecord(Record prevRecord) throws DaysNotAdjecentException, InvalidStateException {
        if (date == null) {
            throw new InvalidStateException("The date of the issue can not be null when setting a prev record");
        }
        if (! prevRecord.date.plusDays(1).equals(this.date)) {
            throw new DaysNotAdjecentException();
        }
        this.prevRecord = prevRecord;
    }

    public Record getNextRecord() {
        return nextRecord;
    }

    public Record getPrevRecord() {
        return prevRecord;
    }

    public LocalDate getDate() {
        return date;
    }

    public Habit getHabit() {
        return habit;
    }

    public void setHabit(Habit habit) {
        this.habit = habit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getAtTimeGoal() {
        return atTimeGoal;
    }

    public void setAtTimeGoal(String atTimeGoal) {
        this.atTimeGoal = atTimeGoal;
    }
}
