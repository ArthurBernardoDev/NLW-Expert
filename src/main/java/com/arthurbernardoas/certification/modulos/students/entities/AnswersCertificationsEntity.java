package com.arthurbernardoas.certification.modulos.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswersCertificationsEntity {

    private UUID id;
    private UUID certificationId;
    private UUID studentId;
    private UUID questionId;
    private UUID answerId;
    private boolean isCorrect;
}
