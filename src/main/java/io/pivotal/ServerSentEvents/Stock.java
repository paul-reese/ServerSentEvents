package io.pivotal.ServerSentEvents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Stock {
    private String name;
    private float price;
}
