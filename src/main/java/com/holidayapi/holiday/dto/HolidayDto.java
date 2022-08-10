package com.holidayapi.holiday.dto;

import lombok.*;


/**
 *  @description : 휴일 정보 요청 DTO
 */

@Getter
@Setter
@ToString
public class HolidayDto {

    // 연도
    private String solYear;
    // 월
    private String solMonth;
    // 서비스키
    private String ServiceKey;
    // 타입
    private String _type;
    //한페이지 결과 수
    private String numOfRows;

}
