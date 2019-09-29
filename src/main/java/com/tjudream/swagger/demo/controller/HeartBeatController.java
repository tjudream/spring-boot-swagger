package com.tjudream.swagger.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/heart")
public class HeartBeatController {

    @ApiOperation(value = "心跳检查", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses({
            @ApiResponse(code = 200, message = "error: 0 正确, 1 mq出错, 2 redis出错, 4 db出错")
    })
    @GetMapping("/app")
    public Map isAlive() {
        Map<String,Integer> map = new HashMap<>();
        map.put("status", 0);
        return map;
    }
}
