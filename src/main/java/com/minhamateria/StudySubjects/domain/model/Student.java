package com.minhamateria.StudySubjects.domain.model;


import com.minhamateria.StudySubjects.domain.Request.RequestStudent;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "student")
@Entity
@Getter
@Setter
@AllArgsConstructor //cria um construtor que recebe todos os parâmetros e seta todos os parâmetros
@NoArgsConstructor //cria um construtor que não recebe e não seta nada
@EqualsAndHashCode(of = "rgm")
public class Student {

        @Id @GeneratedValue(strategy = GenerationType.UUID) //JPA gera automaticamente esses UUIDs
        private String rgm;
        private String first_name;
        private String last_name;
        private String email;
        private boolean active;

        @ManyToMany
        @JoinColumn (name = "id_subject")
        private List<ElectiveSubject> electiveSubjects;
        public Student (RequestStudent requestStudent){
                this.first_name = requestStudent.firstName();
                this.last_name = requestStudent.lastName();
                this.email = requestStudent.email();
                this.active = true;
        }
}
