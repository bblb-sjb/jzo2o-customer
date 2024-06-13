package com.jzo2o.customer.controller.open;

import com.jzo2o.customer.model.dto.request.InstitutionRegisterReqDTO;
import com.jzo2o.customer.service.IServeProviderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author SJB
 * @author 1.0
 * @description 机构人员注册控制器
 * @date 2024/6/9 22:49
 */
@RestController("institutionRegisterController")
@RequestMapping("/open/serve-provider/institution")
@Api(tags = "白名单接口 - 机构人员注册相关接口")
public class InstitutionRegisterController {
    @Resource
    private IServeProviderService iServeProviderService;
    @PostMapping("/register")
    @ApiOperation("机构人员注册")
    public void register(@RequestBody InstitutionRegisterReqDTO institutionRegisterReqDTO) {
        iServeProviderService.registerInstitution(institutionRegisterReqDTO);
    }
}
