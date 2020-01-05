package com.jang.xunwu.repository;

import com.jang.xunwu.entity.HouseSubscribe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * title HouseSubscribeRespository
 * projectName xunwu
 * desc 预约看房接口
 *
 * @author Jang
 * @date 2020/1/4 18:24
 */
public interface HouseSubscribeRepository extends PagingAndSortingRepository<HouseSubscribe, Long> {

    /**
     * 根据房源编号和用户编号获取预约看房信息
     * @param houseId 房源编号
     * @param loginUserId 用户编号
     * @return HouseSubscribe
     */
    HouseSubscribe findByHouseIdAndUserId(Long houseId, Long loginUserId);

    /**
     *根据用户编号和预约看房状态获取所有预约看房信息
     * @param userId 用户编号
     * @param status 预约看房状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     * @param pageable 分页信息
     * @return Page<HouseSubscribe>
     */
    Page<HouseSubscribe> findAllByUserIdAndStatus(Long userId, int status, Pageable pageable);

    /**
     *根据管理员编号和预约看房状态获取所有预约看房信息
     * @param adminId 管理员编号
     * @param status 预约看房状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     * @param pageable 分页信息
     * @return Page<HouseSubscribe>
     */
    Page<HouseSubscribe> findAllByAdminIdAndStatus(Long adminId, int status, Pageable pageable);

    /**
     *根据房源编号和管理员编号取预约看房信息
     * @param houseId 房源编号
     * @param adminId 管理员编号
     * @return HouseSubscribe
     */
    HouseSubscribe findByHouseIdAndAdminId(Long houseId, Long adminId);

    /**
     *根据预约看房信息编号修改预约看房状态
     * @param id 预约看房信息编号
     * @param status 预约看房状态 1-加入待看清单 2-已预约看房时间 3-看房完成
     */
    @Modifying
    @Query("update HouseSubscribe as subscribe set subscribe.status = :status where subscribe.id = :id")
    void updateStatus(@Param(value = "id") Long id, @Param(value = "status") int status);

}
