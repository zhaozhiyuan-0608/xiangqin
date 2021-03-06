package cn.kgc.xiangqin.mapper;

import cn.kgc.xiangqin.entity.Marriage;
import cn.kgc.xiangqin.entity.MarriageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarriageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    long countByExample(MarriageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    int deleteByExample(MarriageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    int insert(Marriage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    int insertSelective(Marriage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    List<Marriage> selectByExample(MarriageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    int updateByExampleSelective(@Param("record") Marriage record, @Param("example") MarriageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marriage
     *
     * @mbg.generated Tue Aug 11 17:06:47 CST 2020
     */
    int updateByExample(@Param("record") Marriage record, @Param("example") MarriageExample example);
}