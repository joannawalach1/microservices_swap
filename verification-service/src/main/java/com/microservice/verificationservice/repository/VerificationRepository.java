package com.microservice.verificationservice.repository;

import com.microservice.verificationservice.model.Verification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationRepository extends MongoRepository<Verification, String> {
}
