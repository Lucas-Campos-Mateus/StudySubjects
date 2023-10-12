package com.minhamateria.StudySubjects.domain.model;


import com.minhamateria.StudySubjects.domain.Request.RequestStudent;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "student")
@Entity(name = "student")
@Getter
@Setter
@AllArgsConstructor //cria um construtor que recebe todos os parâmetros e seta todos os parâmetros
@NoArgsConstructor //cria um construtor que não recebe e não seta nada
@EqualsAndHashCode(of = "id")
public class Student {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //JPA gera automaticamente esses UUIDs
        private Integer rgm;
        private String firstName;
        private String lastName;
        private String email;
        private boolean active;

        public Student (RequestStudent requestStudent){
                this.firstName = requestStudent.firstName();
                this.lastName = requestStudent.lastName();
                this.email = requestStudent.email();
                this.active = true;
        }
}
