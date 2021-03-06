package com.sjy.equipment_manager_system.dao;

import com.sjy.equipment_manager_system.entity.Repair;

import java.util.List;

public interface RepairMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String repairNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    int insert(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    int insertSelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    Repair selectByPrimaryKey(String repairNo);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Repair record);

    /**
     * 自己写的mapper
     */

    /**
     * 查询所有维修单
     * @return
     */
    List<Repair> selectAll();

    int updateRepairStatusAndRepairSubmitPeople();


}