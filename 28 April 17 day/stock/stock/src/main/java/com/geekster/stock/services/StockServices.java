package com.geekster.stock.services;

import com.geekster.stock.model.Stock;
import com.geekster.stock.repository.IStockRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StockServices {
    @Autowired
    IStockRepository stockReo;
    //custom finder
    public List<Stock> getStockByType(String stockType) {
        return stockReo.findByStockType(stockType);
    }
    //implicit methods in crudRepo
    public String addStocks(List<Stock> stockList) {
        Iterable<Stock> saveStatus = stockReo.saveAll(stockList);
        if(saveStatus != null){
            return "added list of Stocks!!";
        }else{
            return "could not added!!";
        }
    }

    public List<Stock> getStockAbovePriceAndLowerDate(Double price, String date) {
        LocalDateTime myDate = LocalDateTime.parse(date);
        return stockReo.findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(price , myDate);
    }

    public List<Stock> getAllStockAboveMarketCap(Double capPercentage) {
        return stockReo.getAllStockAboveMarketCap(capPercentage);
    }
    @Transactional
    public void updateMarketCap(Double marketCap, Integer id) {
        stockReo.updateMarketCapById(marketCap , id);
    }

    @Transactional
    public void deleteStockBasedOnCount(Integer count) {
        stockReo.deleteStockBasedOnCount(count);
    }
}
