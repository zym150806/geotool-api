package com.ofood.geoservice.service.impl;

import com.ofood.geoservice.domain.GeoPoint;
import com.ofood.geoservice.domain.GeoRelationRequest;
import com.ofood.geoservice.service.GeoRelationService;
import org.geotools.geometry.jts.JTSFactoryFinder;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeoRelationServiceImpl implements GeoRelationService {

    public GeoRelationRequest handleOverlap(List<GeoPoint> polygon1, List<GeoPoint> polygon2) {
        Geometry g1 = convertPolygonToCoordinate(polygon1);
        Geometry g2 = convertPolygonToCoordinate(polygon2);

        GeoRelationRequest result = new GeoRelationRequest();

        Geometry intersection = g1.intersection(g2);  // 两个区域的交集
        Geometry overlap1 = g1.symDifference(g2);  // 获取两个区域没有交集的部分

        g1 = overlap1.getGeometryN(0);
        g1 = g1.union(intersection);
        result.setPolygon1(convertGeometryToPolygon(g1));
        result.setPolygon2(convertGeometryToPolygon(overlap1.getGeometryN(1)));

        return result;
    }

    public GeoRelationRequest handleOverflow(List<GeoPoint> bigPolygon, List<GeoPoint> smallPolygon) {
        Geometry bigGeo = convertPolygonToCoordinate(bigPolygon);
        Geometry smallGeo = convertPolygonToCoordinate(smallPolygon);

        GeoRelationRequest result = new GeoRelationRequest();

        Geometry contain = bigGeo.intersection(smallGeo);  // 获取两个区域相交的部分

//        smallGeo = smallGeo.union(intersection);
//        result.setPolygon1(convertGeometryToPolygon(g1));
//        result.setPolygon2(convertGeometryToPolygon(overlap1.getGeometryN(1)));

        return result;
    }





    private Geometry convertPolygonToCoordinate(List<GeoPoint> points) {
        int size = points.size();

        // 判断首尾点不一致
        if (points.get(0).getLat() != points.get(size-1).getLat()
                || points.get(0).getLng() != points.get(size-1).getLng()) {
            GeoPoint startPoint = points.get(0);
            points.add(startPoint);

            size = points.size();
        }

        GeometryFactory gf = JTSFactoryFinder.getGeometryFactory(null);
        Coordinate[] polygon = new Coordinate[size];
        for (int i = 0; i < size; i++) {
            polygon[i] = new Coordinate(points.get(i).getLat(), points.get(i).getLng());
        }
        Geometry g1 = gf.createPolygon(polygon);

        return g1;
    }

    private List<GeoPoint> convertGeometryToPolygon(Geometry geometry) {
        List<GeoPoint> points = new ArrayList();
        int size = geometry.getNumPoints();
        Coordinate[] co = geometry.getCoordinates();
        for (int i=0; i < size-1; i++) {  // 不要最后一个点（与第一个点重合）
            GeoPoint point = new GeoPoint();
            point.setLat(co[i].getX());
            point.setLng(co[i].getY());

            points.add(point);
        }

        return points;
    }

}
