package cn.kgc.xiangqin.mapper;

import cn.kgc.xiangqin.entity.HuoDong;
import cn.kgc.xiangqin.entity.HuoDongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuoDongMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    long countByExample(HuoDongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int deleteByExample(HuoDongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int insert(HuoDong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int insertSelective(HuoDong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    List<HuoDong> selectByExample(HuoDongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    HuoDong selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int updateByExampleSelective(@Param("record") HuoDong record, @Param("example") HuoDongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int updateByExample(@Param("record") HuoDong record, @Param("example") HuoDongExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int updateByPrimaryKeySelective(HuoDong record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huodong
     *
     * @mbg.generated Tue Aug 11 17:09:51 CST 2020
     */
    int updateByPrimaryKey(HuoDong record);
}