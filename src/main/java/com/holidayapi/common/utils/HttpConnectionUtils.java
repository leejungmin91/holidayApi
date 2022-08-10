package com.holidayapi.common.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class HttpConnectionUtils {
    /** HttpURLConnection GET 방식 */
    public static String getRequest(String targetUrl) {

        String response = "";

        try {

            URL url = new URL(targetUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET"); // 전송 방식
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            conn.setConnectTimeout(5000); // 연결 타임아웃 설정(5초)
            conn.setReadTimeout(5000); // 읽기 타임아웃 설정(5초)
            conn.setDoOutput(true);

            System.out.println("getContentType():" + conn.getContentType()); // 응답 콘텐츠 유형 구하기
            System.out.println("getResponseCode():"    + conn.getResponseCode()); // 응답 코드 구하기
            System.out.println("getResponseMessage():" + conn.getResponseMessage()); // 응답 메시지 구하기

            Charset charset = Charset.forName("UTF-8");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));

            String inputLine;
            StringBuffer sb = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();

            response = sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

}
