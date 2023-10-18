package com.minhamateria.StudySubjects.domain.Request;

import java.math.BigDecimal;
import java.util.List;

public record RequestStudent(String rgm, String firstName, String lastName, String email, String active) {
}
