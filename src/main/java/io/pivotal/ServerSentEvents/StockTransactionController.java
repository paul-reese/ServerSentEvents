package io.pivotal.ServerSentEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

public @RestController
@RequestMapping("/stock/transaction")
class StockTransactionController {
    @Autowired
    StockTransactionService stockTransactionService;

    @GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<StockTransaction> stockTransactionEvents(){
        return stockTransactionService.getStockTransactions();
    }
}
