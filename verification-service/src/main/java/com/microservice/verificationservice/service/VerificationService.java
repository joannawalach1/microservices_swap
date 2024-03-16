package com.microservice.verificationservice.service;


import com.microservice.verificationservice.repository.VerificationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VerificationService {
private VerificationRepository verificationRepository;

}
