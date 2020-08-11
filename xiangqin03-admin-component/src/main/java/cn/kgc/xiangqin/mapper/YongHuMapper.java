package cn.kgc.xiangqin.mapper;

import cn.kgc.xiangqin.entity.YongHu;
import cn.kgc.xiangqin.entity.YongHuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YongHuMapper {

    Integer delete(@Param("id") int id);

    List<YongHu> queryAll(@Param("id") int id);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    long countByExample(YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int deleteByExample(YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int insert(YongHu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int insertSelective(YongHu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    List<YongHu> selectByExampleWithBLOBs(YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    List<YongHu> selectByExample(YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    YongHu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByExampleSelective(@Param("record") YongHu record, @Param("example") YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") YongHu record, @Param("example") YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByExample(@Param("record") YongHu record, @Param("example") YongHuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByPrimaryKeySelective(YongHu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(YongHu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yonghu
     *
     * @mbg.generated Mon Aug 10 13:46:16 CST 2020
     */
    int updateByPrimaryKey(YongHu record);
}