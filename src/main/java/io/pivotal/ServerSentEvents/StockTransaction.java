package io.pivotal.ServerSentEvents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class StockTransaction {
    String user;
    Stock stock;
    Date when;
}
