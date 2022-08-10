package com.holidayapi.holiday.service;

import com.holidayapi.common.dao.ResponseDao;
import com.holidayapi.holiday.dao.HolidayDao;
import com.holidayapi.holiday.dto.HolidayDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Slf4j
@Service
public class HolidayService {

    public List<HolidayDao> getHolidayList(HolidayDto holidayDto){

        log.info("HolidayService ::: getHolidayList :: {} ", holidayDto);

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders header = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(header);

        String url = "http://apis.data.go.kr/B090041/openapi/service/SpcdeInfoService/getHoliDeInfo";

        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).build();

        ResponseEntity<ResponseDao> resultEntity = restTemplate.exchange(uri.toString(), HttpMethod.GET, entity, ResponseDao.class);

        ResponseDao responseDao = resultEntity.getBody();

        if(ObjectUtils.isEmpty(responseDao)) return null;

        return responseDao.getBody().getHolidayDaoList();

    }
}
