package ru.solarlab.celebrator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.solarlab.celebrator.entity.Birthday;
import ru.solarlab.celebrator.entity.model.out.BirthdayModel;

import java.util.List;
import java.util.UUID;

public interface BirthdayRepo extends JpaRepository<Birthday, UUID> {

    @Query("SELECT bday FROM Birthday bday WHERE bday.date IS NOT NULL ORDER BY bday.date DESC")
    List<BirthdayModel> findAllModels();

    @Query("SELECT bday FROM Birthday bday WHERE bday.date IS NOT NULL ORDER BY bday.date DESC")
    List<Birthday> getAll();

}
