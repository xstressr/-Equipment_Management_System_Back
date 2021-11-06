package com.sjy.equipment_manager_system.controller;

import com.sjy.equipment_manager_system.entity.Maintain;
import com.sjy.equipment_manager_system.entity.Repair;
import com.sjy.equipment_manager_system.service.MaintainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@Api(tags = "保养")
public class MaintainRestController {

    @Autowired
    private MaintainService maintainService;

    @ApiOperation("保养单提交")
    @PostMapping("/api/maintain/submit")
    public String submitMaintain(@RequestBody Maintain maintain) {
        maintain.setMaintainTime(new Date());
        int result = maintainService.insert(maintain);
        return result > 0 ? "成功" : "失败";
    }

    @ApiOperation("保养单全量查询")
    @GetMapping("/api/maintain/searchList")
    public List<Maintain> selectAllMaintain() {
        List<Maintain> maintainList = maintainService.selectAllMaintain();
        return maintainList;
    }

    @ApiOperation("单个保养单查询")
    @GetMapping("/api/maintain/search/{maintainId}")
    public Maintain selectSingleMaintainPlan(@RequestParam String maintainId) {
        Maintain maintain = maintainService.selectByMaintainId(maintainId);
        return maintain;
    }

    @ApiOperation("通过id删除保养单")
    @DeleteMapping("/api/maintain/del/{maintainId}")
    public String deleteMaintainPlan(@RequestParam String maintainId) {
        int result = maintainService.deleteMaintainBill(maintainId);
        return result > 0 ? "成功" : "失败";
    }

    @ApiOperation("通过id更新状态")
    @PutMapping("/api/maintain/updateStatus")
    public String updateStatus(@RequestBody Maintain maintain) {
        maintain.setMaintainFinishDate(new Date());
        maintain.setVerifyPasstime(new Date());
        int result = maintainService.updateMaintainStatus(maintain);
        return result > 0 ? "成功" : "失败";

    }


}
