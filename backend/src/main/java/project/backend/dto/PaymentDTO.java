package project.backend.dto;

import lombok.*;
import project.backend.domain.PaymentEntity;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {

    @NonNull
    private String paymentType;

    @NonNull
    private Long amount;

    @NonNull
    private String orderName;

    private String customerSuccessUrl;

    private String customerFailUrl;

    public PaymentEntity toEntity() {
        return PaymentEntity.builder()
                .paymentType((paymentType))
                .amount(amount)
                .orderName(orderName)
                .orderId(UUID.randomUUID().toString())
                .paySuccessYN(false)
                .build();
    }
}
