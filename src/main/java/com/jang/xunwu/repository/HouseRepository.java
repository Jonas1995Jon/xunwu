package com.jang.xunwu.repository;

import com.jang.xunwu.entity.House;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * title HouseRepository
 * projectName xunwu
 * desc 房源接口
 *
 * @author Jang
 * @date 2020/1/4 18:17
 */
public interface HouseRepository extends PagingAndSortingRepository<House, Long>, JpaSpecificationExecutor<House> {

    /**
     * 根据房源编号修改房源封面
     *
     * @param id    房源编号
     * @param cover 房源封面
     */
    @Modifying
    @Query("update House as house set house.cover = :cover where house.id = :id")
    void updateCover(@Param(value = "id") Long id, @Param(value = "cover") String cover);

    /**
     * 根据房源编号修改房源状态
     *
     * @param id     房源编号
     * @param status 房源状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
     */
    @Modifying
    @Query("update House as house set house.status = :status where house.id = :id")
    void updateStatus(@Param(value = "id") Long id, @Param(value = "status") int status);

    /**
     * 根据房源编号修改看房次数
     *
     * @param houseId 房源编号
     */
    @Modifying
    @Query("update House as house set house.watchTimes = house.watchTimes + 1 where house.id = :id")
    void updateWatchTimes(@Param(value = "id") Long houseId);

}
