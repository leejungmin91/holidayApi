package com.holidayapi.holiday.service;

import com.holidayapi.holiday.dto.HolidayDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HolidayService {

    public List<HolidayDto> getHolidayList(HolidayDto holidayDto){

        List<HolidayDto> holidayList = new ArrayList<>();
        
        return holidayList;
    }
}
