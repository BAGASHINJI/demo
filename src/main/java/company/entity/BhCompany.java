package company.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 企业表(BhCompany)实体类
 *
 * @author makejava
 * @since 2022-04-12 15:05:18
 */
public class BhCompany implements Serializable {
    private static final long serialVersionUID = -43847726166711932L;
    /**
    * 自增主键
    */
    private Long companyId;
    /**
    * 公司名称
    */
    private String companyName;
    /**
    * 企业组织结构代码
    */
    private String companyNo;
    /**
    * 所属行业
    */
    private String industry;
    /**
    * 纳税类型（1一般人纳税 2小规模纳税人）
    */
    private String taxType;
    /**
    * 共享数据
    */
    private String shareData;
    /**
    * 联系人
    */
    private String contactName;
    /**
    * 联系方式
    */
    private String phoneNumber;
    /**
    * 状态 （1正常 2禁止;）
    */
    private String status;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 创建部门id
    */
    private Long createDeptId;
    /**
    * 创建部门
    */
    private String createDept;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 修改人
    */
    private String updateBy;
    /**
    * 删除标志（0代表存在 2代表删除）
    */
    private String delFlag;
    /**
    * 企业密钥
    */
    private String secretKey;
    /**
    * 备注
    */
    private String remark;
    /**
    * 公司地址
    */
    private String companyAddress;
    /**
    * 审核状态1待审批2审核中，3审核通过，4审核驳回 
    */
    private String auditStatus;


    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getShareData() {
        return shareData;
    }

    public void setShareData(String shareData) {
        this.shareData = shareData;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Long getCreateDeptId() {
        return createDeptId;
    }

    public void setCreateDeptId(Long createDeptId) {
        this.createDeptId = createDeptId;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

}