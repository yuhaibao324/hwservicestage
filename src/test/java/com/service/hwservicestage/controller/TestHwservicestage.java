package com.service.hwservicestage.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHwservicestage {

        HwservicestageDelegate hwservicestageDelegate = new HwservicestageDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = hwservicestageDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}