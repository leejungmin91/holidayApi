package com.holidayapi.holiday.rest;

import com.holidayapi.holiday.dto.HolidayDto;
import com.holidayapi.holiday.service.HolidayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/holidays")
public class HolidayRestController {

    private final HolidayService holidayService;

    @GetMapping("")
    public Object getHolidays(HttpServletRequest request, HolidayDto holidayDto){
        log.info("HolidayRestController ::: getHolidays :: {}", holidayDto);
        return holidayService.getHolidayList(holidayDto);
    }


}
