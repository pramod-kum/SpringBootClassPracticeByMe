package com.geekster.stock.controller;

import com.geekster.stock.model.Stock;
import com.geekster.stock.services.StockServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
    @Autowired
    StockServices stockServices;

    //get stocks by type
    @GetMapping("/type/{stockType}")
    public List<Stock> getStockBasedOnType(@PathVariable String stockType){
        return stockServices.getStockByType(stockType);
    }
    //get using custom finder
    @GetMapping(value = "abovePrige/{price}/lowerData/date/{date}")
    public List<Stock> getStockAbovePriceAndLowerDate(@PathVariable Double price , @PathVariable String date){
        return stockServices.getStockAbovePriceAndLowerDate(price , date);
    }
    //custom query native :
    @GetMapping("/cap/{capPercentage}")
    public List<Stock> getAllStockAboveMarketCap(@PathVariable Double capPercentage){
        return stockServices.getAllStockAboveMarketCap(capPercentage);
    }
    //put
    @PutMapping(value = "/marketCap/{marketCap}/id/{id}")
    public void getAllStockAboveMarketCap(@PathVariable Double marketCap , @PathVariable Integer id){
         stockServices.updateMarketCap(marketCap , id);
    }

    //delete
    @DeleteMapping(value = "/ownerCount/{count}")
    public void deleteStocksByOwnerCount(@PathVariable Integer count){
        stockServices.deleteStockBasedOnCount(count);
    }

    //post
    @PostMapping(value = "/")
    public String insertStocks(@RequestBody List<Stock> stockList){
        return stockServices.addStocks(stockList);
    }
}
