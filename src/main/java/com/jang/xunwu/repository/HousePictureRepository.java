package com.jang.xunwu.repository;

import com.jang.xunwu.entity.HousePicture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * title HousePictureRepository
 * projectName xunwu
 * desc 房源图片接口
 *
 * @author Jang
 * @date 2020/1/4 18:16
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {

    /**
     * 根据房源编号获取对应的所用图片信息
     *
     * @param id 房源编号
     * @return List<HousePicture>
     */
    List<HousePicture> findAllByHouseId(Long id);

}
