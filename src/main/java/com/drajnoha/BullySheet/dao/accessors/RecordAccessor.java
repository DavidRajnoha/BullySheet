package com.drajnoha.BullySheet.dao.accessors;

import com.drajnoha.BullySheet.dao.entities.Habit;
import com.drajnoha.BullySheet.dao.entities.Record;
import com.drajnoha.BullySheet.dao.entities.User;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author David Rajnoha
 */
public interface RecordAccessor {
    /**
     * Gets the records belonging to a particular user
     *
     * @param user user that is the owner of the records
     * @return records belonging to that user
     */
    Set<Record> getRecordsOfUser(User user);

    /**
     * Gets the records belonging to a particular user of a particular habit
     *
     * @param user user that is the owner of the records
     * @param habit habit that the records belong to
     * @return records belonging to the given user and to the given habit
     */
    Set<Record> getRecordsOfUserByHabit(User user, Habit habit);


    /**
     * Updates the record with the information given in the record passed as a param
     *
     * @param record containing the updated information
     */
    void updateRecord(Record record);

    /**
     * Creates a record belonging to a particular user and a particular habit
     *
     * @param user user owning the record
     * @param habit habit that the record belongs to
     * @param value the recorded value
     */
    void createRecord(User user, Habit habit, String value);

}
