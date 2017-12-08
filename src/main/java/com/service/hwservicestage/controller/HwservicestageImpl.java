package com.service.hwservicestage.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-08T07:10:11.202Z")

@RestSchema(schemaId = "hwservicestage")
@RequestMapping(path = "/hwservicestage", produces = MediaType.APPLICATION_JSON)
public class HwservicestageImpl {

    @Autowired
    private HwservicestageDelegate userHwservicestageDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHwservicestageDelegate.helloworld(name);
    }

}
