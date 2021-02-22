package com.achang.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/******
 @author 阿昌
 @create 2021-02-17 12:37
 *******
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @GetMapping("find")
    @CrossOrigin
    public Map<String,String> findWeatherByCity(String name){
        Map<String,String> map = new HashMap<>();
        String weather = getWeather(name);

        map.put("msg",weather);

        return map;

    }

    //返回对应城市天气
    public String getWeather(String name){
        Map<String,String> weather = new HashMap<>();
        weather.put("北京","晴转多云");
        weather.put("温州","多云转晴");
        weather.put("重庆","大雨转小雨");
        weather.put("杭州","小到暴雨");
        weather.put("天津","晴转多云");
        weather.put("深圳","雾天");
        return weather.get(name);
    }

}
