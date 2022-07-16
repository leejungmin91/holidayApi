package com.holidayapi.holiday.rest;

import com.holidayapi.holiday.dto.HolidayDto;
import com.holidayapi.holiday.service.HolidayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/holidays")
public class HolidayRestController {

    private final HolidayService holidayService;

    @GetMapping("")
    public Object getHolidays(@RequestBody HolidayDto holidayDto){
        return holidayService.getHolidayList(holidayDto);
    }


}
