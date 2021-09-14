package com.bayareala8s.controller;

import com.bayareala8s.dto.ListingResponse;
import com.bayareala8s.entity.Listing;
import com.bayareala8s.service.ListingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ListingController {

    private ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    @RequestMapping("/listings")
    public ListingResponse getListings(@RequestParam(required = false) Long min_price,
                                       @RequestParam(required = false) Long max_price,
                                       @RequestParam(required = false) Integer min_bed,
                                       @RequestParam(required = false) Integer max_bed,
                                       @RequestParam(required = false) Integer min_bath,
                                       @RequestParam(required = false) Integer max_bath) {

        if(((min_price != null) && (max_price != null)) &&
                ((min_bed != null) && (max_bed != null)) &&
                ((min_bath != null) && (max_bath != null))) {

            return listingService.getCustomListingsAll(min_price, max_price,min_bed,max_bed,min_bath,max_bath);
        }


        if((min_price != null) && (max_price != null)) {

            return listingService.getCustomListingsByPrice(min_price, max_price);
        }

        if((min_bed != null) && (max_bed != null)) {

            return listingService.getCustomListingsByBed(min_bed,max_bed);
        }

        if((min_bath != null) && (max_bath != null)) {

            return listingService.getCustomListingsByBath(min_bath,max_bath);
        }


        return listingService.getCustomListingsByPrice(min_price, max_price);
    }
}
