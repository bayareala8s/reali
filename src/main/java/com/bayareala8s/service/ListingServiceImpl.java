package com.bayareala8s.service;

import com.bayareala8s.dao.ListingRepository;
import com.bayareala8s.dto.Feature;
import com.bayareala8s.dto.Geometry;
import com.bayareala8s.dto.ListingResponse;
import com.bayareala8s.dto.Properties;
import com.bayareala8s.entity.Listing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListingServiceImpl implements ListingService{

    private ListingRepository listingRepository;

    public ListingServiceImpl(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    @Override
    public ListingResponse getCustomListingsByPrice(Long min_price, Long max_price) {

        ListingResponse listingResponse = new ListingResponse();
        List<Feature> featureList = new ArrayList<>();

        for(Listing listing: listingRepository.findByPrice(min_price,max_price)) {

            Feature feature = new Feature();
            feature.setType("Feature");

            Geometry geometry = new Geometry();
            geometry.setType("Point");

            double[] cordinates = new double[2];
            cordinates[0] = listing.getLat();
            cordinates[1] = listing.getLng();

            geometry.setCoordinates(cordinates);
            feature.setGeometry(geometry);

            Properties properties = new Properties();
            properties.setId(listing.getId());
            properties.setPrice(listing.getPrice());
            properties.setStreet(listing.getStreet());
            properties.setBedrooms(listing.getBedrooms());
            properties.setBathrooms(listing.getBathrooms());
            properties.setSqft(listing.getSqft());
            feature.setProperties(properties);

            featureList.add(feature);

        }
        listingResponse.setType("FeatureCollection");
        listingResponse.setFeatures(featureList);
        return listingResponse;
    }

    @Override
    public ListingResponse getCustomListingsByBed(Integer min_bed, Integer max_bed) {

        ListingResponse listingResponse = new ListingResponse();
        List<Feature> featureList = new ArrayList<>();

        for(Listing listing: listingRepository.findByBed(min_bed,max_bed)) {

            Feature feature = new Feature();
            feature.setType("Feature");

            Geometry geometry = new Geometry();
            geometry.setType("Point");

            double[] cordinates = new double[2];
            cordinates[0] = listing.getLat();
            cordinates[1] = listing.getLng();

            geometry.setCoordinates(cordinates);
            feature.setGeometry(geometry);

            Properties properties = new Properties();
            properties.setId(listing.getId());
            properties.setPrice(listing.getPrice());
            properties.setStreet(listing.getStreet());
            properties.setBedrooms(listing.getBedrooms());
            properties.setBathrooms(listing.getBathrooms());
            properties.setSqft(listing.getSqft());
            feature.setProperties(properties);

            featureList.add(feature);

        }
        listingResponse.setType("FeatureCollection");
        listingResponse.setFeatures(featureList);
        return listingResponse;
    }

    @Override
    public ListingResponse getCustomListingsByBath(Integer min_bath, Integer max_bath) {

        ListingResponse listingResponse = new ListingResponse();
        List<Feature> featureList = new ArrayList<>();

        for(Listing listing: listingRepository.findByBath(min_bath,max_bath)) {

            Feature feature = new Feature();
            feature.setType("Feature");

            Geometry geometry = new Geometry();
            geometry.setType("Point");

            double[] cordinates = new double[2];
            cordinates[0] = listing.getLat();
            cordinates[1] = listing.getLng();

            geometry.setCoordinates(cordinates);
            feature.setGeometry(geometry);

            Properties properties = new Properties();
            properties.setId(listing.getId());
            properties.setPrice(listing.getPrice());
            properties.setStreet(listing.getStreet());
            properties.setBedrooms(listing.getBedrooms());
            properties.setBathrooms(listing.getBathrooms());
            properties.setSqft(listing.getSqft());
            feature.setProperties(properties);

            featureList.add(feature);

        }
        listingResponse.setType("FeatureCollection");
        listingResponse.setFeatures(featureList);
        return listingResponse;
    }

    @Override
    public ListingResponse getCustomListingsAll(Long min_price, Long max_price,Integer min_bed, Integer max_bed,Integer min_bath, Integer max_bath) {

        ListingResponse listingResponse = new ListingResponse();
        List<Feature> featureList = new ArrayList<>();

        for(Listing listing: listingRepository.findAll(min_price, max_price,min_bed, max_bed,min_bath, max_bath)) {

            Feature feature = new Feature();
            feature.setType("Feature");

            Geometry geometry = new Geometry();
            geometry.setType("Point");

            double[] cordinates = new double[2];
            cordinates[0] = listing.getLat();
            cordinates[1] = listing.getLng();

            geometry.setCoordinates(cordinates);
            feature.setGeometry(geometry);

            Properties properties = new Properties();
            properties.setId(listing.getId());
            properties.setPrice(listing.getPrice());
            properties.setStreet(listing.getStreet());
            properties.setBedrooms(listing.getBedrooms());
            properties.setBathrooms(listing.getBathrooms());
            properties.setSqft(listing.getSqft());
            feature.setProperties(properties);

            featureList.add(feature);

        }
        listingResponse.setType("FeatureCollection");
        listingResponse.setFeatures(featureList);
        return listingResponse;
    }
}
