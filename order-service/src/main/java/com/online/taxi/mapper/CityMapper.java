package com.online.taxi.mapper;

import com.online.taxi.entity.City;
import org.springframework.stereotype.Service;

/**
 * 城市mapper
 *
 * @author dongjb
 * @date 2021/04/16
 */
@Service
public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    City selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_city
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(City record);
}
