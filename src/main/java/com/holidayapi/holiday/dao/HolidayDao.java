package com.holidayapi.holiday.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HolidayDao {

    private String dateKind;
    private String dateName;
    private String isHoliday;
    private String locdate;
    private String remarks;
    private int seq;


}
