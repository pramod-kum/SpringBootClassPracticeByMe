package com.geekster.stock.repository;

import com.geekster.stock.model.Stock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IStockRepository extends CrudRepository <Stock , Integer> {
    //Custom finder
    public List<Stock> findByStockType(String stockType);

    public List<Stock> findByStockPriceGreaterThanAndStockBirthTimeStampLessThanOrderByStockName(Double price , LocalDateTime date);

    //ccccustom queries : native
    //basic select
    @Query(value = "select * from STOCK where STOCK_MARKET_CAP > :capPercentage" , nativeQuery = true)
    public List<Stock> getAllStockAboveMarketCap(Double capPercentage);

    //update using custom query
    @Modifying
    @Query(value = "update STOCK set STOCK_MARKET_CAP = :capPercentage where STOCK_id = :id" , nativeQuery = true)
    public void updateMarketCapById(Double capPercentage , Integer id);

    //delete
    @Modifying
    @Query(value = "delete from STOCK where stock_owner_count <= :clientCount" , nativeQuery = true)
    public void deleteStockBasedOnCount(Integer clientCount);



}
