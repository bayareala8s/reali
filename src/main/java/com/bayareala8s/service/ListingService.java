package com.bayareala8s.service;

import com.bayareala8s.dto.ListingResponse;
import com.bayareala8s.entity.Listing;

import java.util.List;

public interface ListingService {

    ListingResponse getCustomListingsAll(Long min_price, Long max_price,Integer min_bed, Integer max_bed,Integer min_bath, Integer max_bath);
    ListingResponse getCustomListingsByPrice(Long min_price, Long max_price);
    ListingResponse getCustomListingsByBed(Integer min_bed, Integer max_bed);
    ListingResponse getCustomListingsByBath(Integer min_bath, Integer max_bath);
}
