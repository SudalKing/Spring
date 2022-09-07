package com.example.springcalcaulator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Res {
    private int result;
    private Body response;

    @Data
    @RequiredArgsConstructor
    @AllArgsConstructor
    public static class Body{
        private String resultCode = "OK";
    }

}
