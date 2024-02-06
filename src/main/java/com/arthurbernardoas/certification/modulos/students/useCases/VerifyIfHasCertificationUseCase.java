package com.arthurbernardoas.certification.modulos.students.useCases;

import com.arthurbernardoas.certification.modulos.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        return dto.getEmail().equals("arthur@gmail.com") && dto.getTechnology().equals("JAVA");
    }
}
