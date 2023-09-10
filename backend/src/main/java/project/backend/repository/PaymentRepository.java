package project.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.backend.domain.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
