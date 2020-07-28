package com.drajnoha.BullySheet.dao.accessors;

import com.drajnoha.BullySheet.dao.entities.Habit;
import com.drajnoha.BullySheet.dao.entities.User;

import java.util.Set;

/**
 * @author David Rajnoha
 */
public interface HabitAccessor {

    /**
     * Gets the habits belonging to a particular user
     * @param user that owns the habits
     * @return the habits belonging to the given user
     */
    Set<Habit> getHabitsOfUser(User user);

    /**
     * Creates a new habit
     * @param user user that owns the habit
     * @param name the name of the habit
     * @param goal the initial goal of the habit
     */
    void createHabit(User user, String name, String goal);

    /**
     * Updates the habit with the information given in the new habit
     * @param habit habit containing the information to update
     */
    void updateHabit(Habit habit);

}
