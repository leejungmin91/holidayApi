package com.holidayapi.common.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDao {

    // 응답코드
    private String resultCode;
    // 응답메세지
    private String resultMsg;

}
