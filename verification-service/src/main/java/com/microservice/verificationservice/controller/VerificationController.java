package com.microservice.verificationservice.controller;

import com.microservice.verificationservice.model.Verification;
import com.microservice.verificationservice.model.dto.VerificationRequest;
import com.microservice.verificationservice.repository.VerificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/verification")
@RequiredArgsConstructor
public class VerificationController {

    private VerificationRepository verificationRepository;
    @PostMapping("/verifyProduct")
    public void verifyProduct(@RequestBody VerificationRequest verificationRequest) {
    }
}
