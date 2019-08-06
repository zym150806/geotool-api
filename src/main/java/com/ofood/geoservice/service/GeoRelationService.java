package com.ofood.geoservice.service;

import com.ofood.geoservice.domain.GeoPoint;
import com.ofood.geoservice.domain.GeoRelationRequest;

import java.util.List;

public interface GeoRelationService {

    GeoRelationRequest handleOverlap(List<GeoPoint> polygon1, List<GeoPoint> polygon2);
}
