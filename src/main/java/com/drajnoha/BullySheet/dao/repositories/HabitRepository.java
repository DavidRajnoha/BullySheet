package com.drajnoha.BullySheet.dao.repositories;

import com.drajnoha.BullySheet.dao.entities.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author David Rajnoha
 */
public interface HabitRepository extends JpaRepository<Habit, Long> {

}
