package com.minhamateria.StudySubjects.domain.model;

import com.minhamateria.StudySubjects.domain.Request.RequestElectiveSubject;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "elective_subject")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_subject")
public class ElectiveSubject {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id_subject;
    private String name;
    private boolean active;

    public ElectiveSubject(RequestElectiveSubject requestElectiveSubject){
        this.name = requestElectiveSubject.name();
        this.active = requestElectiveSubject.active();
    }
}
