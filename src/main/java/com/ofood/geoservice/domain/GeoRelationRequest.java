package com.ofood.geoservice.domain;

import com.alibaba.fastjson.annotation.JSONField;
import org.locationtech.jts.geom.Coordinate;

import java.util.List;

public class GeoRelationRequest {
    @JSONField(name = "point1")
    private List<GeoPoint> polygon1;

    @JSONField(name = "point2")
    private List<GeoPoint> polygon2;

    public List<GeoPoint> getPolygon1() {
        return polygon1;
    }

    public void setPolygon1(List<GeoPoint> polygon1) {
        this.polygon1 = polygon1;
    }

    public List<GeoPoint> getPolygon2() {
        return polygon2;
    }

    public void setPolygon2(List<GeoPoint> polygon2) {
        this.polygon2 = polygon2;
    }
}
