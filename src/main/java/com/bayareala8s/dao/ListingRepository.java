package com.bayareala8s.dao;

import com.bayareala8s.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RepositoryRestResource
public interface ListingRepository extends JpaRepository<Listing, Long> {

    Listing findById(long id);

    @Query("FROM Listing WHERE price >= ?1 and price <= ?2 and bedrooms >= ?3 and bedrooms <= ?4 and bathrooms >= ?5 and bathrooms <= ?6")
    List<Listing> findAll(Long min_price, Long max_price,int min_bed, int max_bed,int min_bath, int max_bath);

    @Query("FROM Listing WHERE price >= ?1 and price <= ?2")
    List<Listing> findByPrice(Long min_price, Long max_price);

    @Query("FROM Listing WHERE bedrooms >= ?1 and bedrooms <= ?2")
    List<Listing> findByBed(int min_bed, int max_bed);

    @Query("FROM Listing WHERE bathrooms >= ?1 and bathrooms <= ?2")
    List<Listing> findByBath(int min_bath, int max_bath);
}
