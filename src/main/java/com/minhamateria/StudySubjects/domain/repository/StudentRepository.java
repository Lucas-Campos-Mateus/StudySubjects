package com.minhamateria.StudySubjects.domain.repository;

import com.minhamateria.StudySubjects.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository <Student, String> {
    List<Student> findAllByActiveTrue(); //Portanto, esse método busca todos os produtos ativos em um banco de dados.
}
