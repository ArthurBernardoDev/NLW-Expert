package com.arthurbernardoas.certification.modulos.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntity;
}
