package com.minhamateria.StudySubjects.domain.repository;

import com.minhamateria.StudySubjects.domain.model.ElectiveSubject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElectiveSubjectRepository extends JpaRepository <ElectiveSubject, String> {

    List<ElectiveSubject> findAllByActiveTrue();
}
