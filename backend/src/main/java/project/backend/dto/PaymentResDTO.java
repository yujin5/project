package project.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResDTO {

    private String paymentType;
    private Long amount;
    private String orderId;
    private String orderName;
    private String customName;
    private String customerEmail;
    private String successUrl;
    private String failUrl;
}
