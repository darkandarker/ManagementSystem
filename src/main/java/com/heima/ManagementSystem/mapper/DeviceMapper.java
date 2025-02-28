package com.heima.ManagementSystem.mapper;

import com.heima.ManagementSystem.pojo.Device;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeviceMapper {
    @Insert("insert into device (device_id,status,create_time,update_time) values (#{device.deviceId},#{device.status},#{device.createTime},#{device.updateTime})")
    void insert(@Param("device") Device device);
    @Delete("delete from device where device_id = #{deviceId}")
    void deleteByDeviceId(@Param("deviceId") String deviceId);
    @Update("update device set status = #{device.status} , update_time = #{device.updateTime} where device_id = #{device.deviceId}")
    void update(@Param("device") Device device);
    @Select("select count(*) from device")
    public Long count();

    List<Device> page(@Param("start") Integer start, @Param("pageSize") Integer pageSize,@Param("deviceId") String deviceId,@Param("status") Short status);
}
