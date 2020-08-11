package cn.kgc.xiangqin.entity;

import java.util.List;

public class YongHu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.id
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.name
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.marry
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer marry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.heighet
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer heighet;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.qq
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.phone
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.school
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.work
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer work;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.sex
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.age
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.house
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String house;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.add
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String add;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.vip
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer vip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.img
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.uid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.sid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.hid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private Integer hid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yonghu.jieshao
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    private String jieshao;
    private List<Marriage> marriage;
    private  List<Work> w;
    private List<UserPass> userPass;
    private List<ShengHuo> shengHuos;
    private  List<HuoDong> huoDongs;
    private Marriage marriage1;
    private  Work w1;
    private UserPass userPass1;
    private ShengHuo shengHuos1;
    private  HuoDong huoDongs1;

    public Marriage getMarriage1() {
        return marriage1;
    }

    public void setMarriage1(Marriage marriage1) {
        this.marriage1 = marriage1;
    }

    public Work getW1() {
        return w1;
    }

    public void setW1(Work w1) {
        this.w1 = w1;
    }

    public UserPass getUserPass1() {
        return userPass1;
    }

    public void setUserPass1(UserPass userPass1) {
        this.userPass1 = userPass1;
    }

    public ShengHuo getShengHuos1() {
        return shengHuos1;
    }

    public void setShengHuos1(ShengHuo shengHuos1) {
        this.shengHuos1 = shengHuos1;
    }

    public HuoDong getHuoDongs1() {
        return huoDongs1;
    }

    public void setHuoDongs1(HuoDong huoDongs1) {
        this.huoDongs1 = huoDongs1;
    }

    @Override
    public String toString() {
        return "YongHu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marry=" + marry +
                ", heighet=" + heighet +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", school='" + school + '\'' +
                ", work=" + work +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                ", add='" + add + '\'' +
                ", vip=" + vip +
                ", img='" + img + '\'' +
                ", uid=" + uid +
                ", sid=" + sid +
                ", hid=" + hid +
                ", jieshao='" + jieshao + '\'' +
                ", marriage=" + marriage +
                ", w=" + w +
                ", userPass=" + userPass +
                ", shengHuos=" + shengHuos +
                ", huoDongs=" + huoDongs +
                ", marriage1=" + marriage1 +
                ", w1=" + w1 +
                ", userPass1=" + userPass1 +
                ", shengHuos1=" + shengHuos1 +
                ", huoDongs1=" + huoDongs1 +
                '}';
    }

    public YongHu() {
    }

    public YongHu(Integer id, String name, Integer marry, Integer heighet, String qq, String phone, String school, Integer work, String sex, Integer age, String house, String add, Integer vip, String img, Integer uid, Integer sid, Integer hid, String jieshao, List<Marriage> marriage, List<Work> w, List<UserPass> userPass, List<ShengHuo> shengHuos, List<HuoDong> huoDongs, Marriage marriage1, Work w1, UserPass userPass1, ShengHuo shengHuos1, HuoDong huoDongs1) {
        this.id = id;
        this.name = name;
        this.marry = marry;
        this.heighet = heighet;
        this.qq = qq;
        this.phone = phone;
        this.school = school;
        this.work = work;
        this.sex = sex;
        this.age = age;
        this.house = house;
        this.add = add;
        this.vip = vip;
        this.img = img;
        this.uid = uid;
        this.sid = sid;
        this.hid = hid;
        this.jieshao = jieshao;
        this.marriage = marriage;
        this.w = w;
        this.userPass = userPass;
        this.shengHuos = shengHuos;
        this.huoDongs = huoDongs;
        this.marriage1 = marriage1;
        this.w1 = w1;
        this.userPass1 = userPass1;
        this.shengHuos1 = shengHuos1;
        this.huoDongs1 = huoDongs1;
    }

    public List<Marriage> getMarriage() {
        return marriage;
    }

    public void setMarriage(List<Marriage> marriage) {
        this.marriage = marriage;
    }

    public List<Work> getW() {
        return w;
    }

    public void setW(List<Work> w) {
        this.w = w;
    }

    public List<UserPass> getUserPass() {
        return userPass;
    }

    public void setUserPass(List<UserPass> userPass) {
        this.userPass = userPass;
    }

    public List<ShengHuo> getShengHuos() {
        return shengHuos;
    }

    public void setShengHuos(List<ShengHuo> shengHuos) {
        this.shengHuos = shengHuos;
    }

    public List<HuoDong> getHuoDongs() {
        return huoDongs;
    }

    public void setHuoDongs(List<HuoDong> huoDongs) {
        this.huoDongs = huoDongs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.id
     *
     * @return the value of yonghu.id
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.id
     *
     * @param id the value for yonghu.id
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.name
     *
     * @return the value of yonghu.name
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.name
     *
     * @param name the value for yonghu.name
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.marry
     *
     * @return the value of yonghu.marry
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getMarry() {
        return marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.marry
     *
     * @param marry the value for yonghu.marry
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setMarry(Integer marry) {
        this.marry = marry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.heighet
     *
     * @return the value of yonghu.heighet
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getHeighet() {
        return heighet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.heighet
     *
     * @param heighet the value for yonghu.heighet
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setHeighet(Integer heighet) {
        this.heighet = heighet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.qq
     *
     * @return the value of yonghu.qq
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.qq
     *
     * @param qq the value for yonghu.qq
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.phone
     *
     * @return the value of yonghu.phone
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.phone
     *
     * @param phone the value for yonghu.phone
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.school
     *
     * @return the value of yonghu.school
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.school
     *
     * @param school the value for yonghu.school
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.work
     *
     * @return the value of yonghu.work
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getWork() {
        return work;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.work
     *
     * @param work the value for yonghu.work
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setWork(Integer work) {
        this.work = work;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.sex
     *
     * @return the value of yonghu.sex
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.sex
     *
     * @param sex the value for yonghu.sex
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.age
     *
     * @return the value of yonghu.age
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.age
     *
     * @param age the value for yonghu.age
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.house
     *
     * @return the value of yonghu.house
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getHouse() {
        return house;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.house
     *
     * @param house the value for yonghu.house
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setHouse(String house) {
        this.house = house == null ? null : house.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.add
     *
     * @return the value of yonghu.add
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getAdd() {
        return add;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.add
     *
     * @param add the value for yonghu.add
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setAdd(String add) {
        this.add = add == null ? null : add.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.vip
     *
     * @return the value of yonghu.vip
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getVip() {
        return vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.vip
     *
     * @param vip the value for yonghu.vip
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setVip(Integer vip) {
        this.vip = vip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.img
     *
     * @return the value of yonghu.img
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.img
     *
     * @param img the value for yonghu.img
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.uid
     *
     * @return the value of yonghu.uid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.uid
     *
     * @param uid the value for yonghu.uid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.sid
     *
     * @return the value of yonghu.sid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.sid
     *
     * @param sid the value for yonghu.sid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.hid
     *
     * @return the value of yonghu.hid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.hid
     *
     * @param hid the value for yonghu.hid
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yonghu.jieshao
     *
     * @return the value of yonghu.jieshao
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public String getJieshao() {
        return jieshao;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yonghu.jieshao
     *
     * @param jieshao the value for yonghu.jieshao
     *
     * @mbg.generated Tue Aug 11 17:12:05 CST 2020
     */
    public void setJieshao(String jieshao) {
        this.jieshao = jieshao == null ? null : jieshao.trim();
    }
}