package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private Integer qty;

    public ShippingReturned(Delivery aggregate) {
        super(aggregate);
    }

    public ShippingReturned() {
        super();
    }
}
//>>> DDD / Domain Event
