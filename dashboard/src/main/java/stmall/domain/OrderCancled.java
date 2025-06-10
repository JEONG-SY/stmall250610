package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String custormerId;
    private String itemId;
    private Integer qty;
}
