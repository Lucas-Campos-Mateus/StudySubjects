package com.minhamateria.StudySubjects.domain.Request;

import java.math.BigDecimal;
import java.util.List;

public record RequestStudent(Integer rgm, String firstName, String lastName, String email, String active) {
}
