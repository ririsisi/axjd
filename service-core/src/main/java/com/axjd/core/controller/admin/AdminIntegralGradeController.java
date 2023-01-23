package com.axjd.core.controller.admin;

import com.axjd.core.pojo.entity.IntegralGrade;
import com.axjd.core.service.IntegralGradeService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
@ApiModel("积分等级管理")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    @ApiOperation("积分等级列表")
    public List<IntegralGrade> listAll() {
        return integralGradeService.list();
    }

}
