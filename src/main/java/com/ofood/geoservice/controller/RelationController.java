package com.ofood.geoservice.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ofood.geoservice.bean.JsonResult;
import com.ofood.geoservice.domain.GeoRelationRequest;
import com.ofood.geoservice.service.GeoRelationService;
import org.locationtech.jts.geom.Geometry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationController {

    @Autowired
    private GeoRelationService geoRelationService;

    // 处理两个区域重叠
    @RequestMapping(value="/v1/overlap", method= RequestMethod.POST)
    public ResponseEntity<JsonResult> formatOverlap(@RequestBody String postPayload) {
        GeoRelationRequest params = JSONObject.parseObject(postPayload, GeoRelationRequest.class);
        GeoRelationRequest result = geoRelationService.handleOverlap(params.getPolygon1(), params.getPolygon2());

        JsonResult r = new JsonResult();
        r.setMsg("haha overlap");
        r.setData(result);
        return ResponseEntity.ok(r);
    }

    // 处理两个区域超出
    @RequestMapping(value="/overflow", method= RequestMethod.POST)
    public ResponseEntity<JsonResult> formatOverflow(@RequestBody String postPayload) {
        GeoRelationRequest params = JSONObject.parseObject(postPayload, GeoRelationRequest.class);
        GeoRelationRequest result = geoRelationService.handleOverflow(params.getPolygon1(), params.getPolygon2());

        JsonResult r = new JsonResult();
        r.setMsg("haha overlap");
        r.setData(result);
        return ResponseEntity.ok(r);
    }
}
