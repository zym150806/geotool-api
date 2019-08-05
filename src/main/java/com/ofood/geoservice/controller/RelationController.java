package com.ofood.geoservice.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ofood.geoservice.bean.JsonResult;
import com.ofood.geoservice.service.GeoRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationController {

//    @Autowired
//    private GeoRelationService geoRelationService;

    // 处理两个区域重叠
    @RequestMapping(value="/v1/overlap", method= RequestMethod.POST)
    public ResponseEntity<JsonResult> formatOverlap(@RequestBody String postPayload) {
        JSONArray result = JSONObject.parseArray(postPayload);

        JsonResult r = new JsonResult();
        r.setMsg("haha overlap");
        return ResponseEntity.ok(r);
    }

    // 处理两个区域超出
    @RequestMapping(value="/overflow", method= RequestMethod.POST)
    public ResponseEntity<JsonResult> formatOverflow() {
        return null;
    }
}
