package com.drajnoha.BullySheet.dao.repositories;

import com.drajnoha.BullySheet.dao.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author David Rajnoha
 */
public interface RecordRepository extends JpaRepository<Record, Long> {
}
