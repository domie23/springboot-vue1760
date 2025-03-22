package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品
 *
 * @author 
 * @email
 */
@TableName("changpian")
public class ChangpianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChangpianEntity() {

	}

	public ChangpianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 商家
     */
    @TableField(value = "shangjia_id")

    private Integer shangjiaId;


    /**
     * 商品名称
     */
    @TableField(value = "changpian_name")

    private String changpianName;


    /**
     * 商品照片
     */
    @TableField(value = "changpian_photo")

    private String changpianPhoto;


    /**
     * 商品类型
     */
    @TableField(value = "changpian_types")

    private Integer changpianTypes;


    /**
     * 商品库存
     */
    @TableField(value = "changpian_kucun_number")

    private Integer changpianKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "changpian_old_money")

    private Double changpianOldMoney;


    /**
     * 购买获得积分
     */
    @TableField(value = "changpian_price")

    private Integer changpianPrice;


    /**
     * 现价
     */
    @TableField(value = "changpian_new_money")

    private Double changpianNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "changpian_clicknum")

    private Integer changpianClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "changpian_delete")

    private Integer changpianDelete;


    /**
     * 商品简介
     */
    @TableField(value = "changpian_content")

    private String changpianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：商品名称
	 */
    public String getChangpianName() {
        return changpianName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setChangpianName(String changpianName) {
        this.changpianName = changpianName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getChangpianPhoto() {
        return changpianPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setChangpianPhoto(String changpianPhoto) {
        this.changpianPhoto = changpianPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getChangpianTypes() {
        return changpianTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setChangpianTypes(Integer changpianTypes) {
        this.changpianTypes = changpianTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getChangpianKucunNumber() {
        return changpianKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setChangpianKucunNumber(Integer changpianKucunNumber) {
        this.changpianKucunNumber = changpianKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getChangpianOldMoney() {
        return changpianOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setChangpianOldMoney(Double changpianOldMoney) {
        this.changpianOldMoney = changpianOldMoney;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getChangpianPrice() {
        return changpianPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setChangpianPrice(Integer changpianPrice) {
        this.changpianPrice = changpianPrice;
    }
    /**
	 * 设置：现价
	 */
    public Double getChangpianNewMoney() {
        return changpianNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setChangpianNewMoney(Double changpianNewMoney) {
        this.changpianNewMoney = changpianNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getChangpianClicknum() {
        return changpianClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setChangpianClicknum(Integer changpianClicknum) {
        this.changpianClicknum = changpianClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getChangpianDelete() {
        return changpianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChangpianDelete(Integer changpianDelete) {
        this.changpianDelete = changpianDelete;
    }
    /**
	 * 设置：商品简介
	 */
    public String getChangpianContent() {
        return changpianContent;
    }


    /**
	 * 获取：商品简介
	 */

    public void setChangpianContent(String changpianContent) {
        this.changpianContent = changpianContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Changpian{" +
            "id=" + id +
            ", shangjiaId=" + shangjiaId +
            ", changpianName=" + changpianName +
            ", changpianPhoto=" + changpianPhoto +
            ", changpianTypes=" + changpianTypes +
            ", changpianKucunNumber=" + changpianKucunNumber +
            ", changpianOldMoney=" + changpianOldMoney +
            ", changpianPrice=" + changpianPrice +
            ", changpianNewMoney=" + changpianNewMoney +
            ", changpianClicknum=" + changpianClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", changpianDelete=" + changpianDelete +
            ", changpianContent=" + changpianContent +
            ", createTime=" + createTime +
        "}";
    }
}
