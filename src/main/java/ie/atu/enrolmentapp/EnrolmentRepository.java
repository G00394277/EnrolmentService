package ie.atu.enrolmentapp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnrolmentRepository extends MongoRepository <Enrolment, String> {
}
