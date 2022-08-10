package com.holidayapi.common.dao;

import com.holidayapi.holiday.dao.HolidayDao;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BodyDao {

    private List<HolidayDao> holidayDaoList;
    private int numOfRows;
    private int pageNo;
    private int totalCount;

}
