package com.itcrazy.alanmall.mscard.vo.card;

import com.itcrazy.alanmall.mscard.model.CreditSetting;

import java.util.List;

/**
 * 挂帐管理展示类
 *
 * @author luxf 2018-09-05
 */
public class CreditVo {
	// 卡号
	private String cardNo;

	// 卡类别
	private String name;

	// 母子卡类别
	private String motherCardNo;

	// 姓名
	private String userName;

	// 性别
	private String sex;

	// 手机号码
	private String telephone;

	// 身份证号码
	private String idNumber;

	// 充值余额总和
	private String rechargeBalance;

	// 卡充值奖励总和
	private String reward;

	// 挂账功能状态
	private String creditStatus;

	// 挂账最高额度
	private String creditMaxQuota;

	// 挂帐总额
	private String credit;

	// 卡状态
	private String status;

	// 卡类型(母/子卡)
	private String cardType;

	// 子卡挂账最高额度
	private String creditChildMaxQuota;

	// 卡类别id
	private Long categoryId;

	// 门店全参与品牌列表
	private String allJoinBrands;

	// 品牌门店挂帐额度表
	private List<CreditSetting> creditSettingList;

	// 是否可挂帐
	private String isCredit;

	// 最高额度
    private String creditQuota;

    // 母卡类型
    private Integer motherType;

    public Integer getMotherType() {
		return motherType;
	}

	public void setMotherType(Integer motherType) {
		this.motherType = motherType;
	}

	// 卡类别编号
 	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCreditQuota() {
		return creditQuota;
	}

	public void setCreditQuota(String creditQuota) {
		this.creditQuota = creditQuota;
	}

	public String getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(String isCredit) {
		this.isCredit = isCredit;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getAllJoinBrands() {
		return allJoinBrands;
	}

	public void setAllJoinBrands(String allJoinBrands) {
		this.allJoinBrands = allJoinBrands;
	}

	public List<CreditSetting> getCreditSettingList() {
		return creditSettingList;
	}

	public void setCreditSettingList(List<CreditSetting> creditSettingList) {
		this.creditSettingList = creditSettingList;
	}

	public String getCreditChildMaxQuota() {
		return creditChildMaxQuota;
	}

	public void setCreditChildMaxQuota(String creditChildMaxQuota) {
		this.creditChildMaxQuota = creditChildMaxQuota;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMotherCardNo() {
		return motherCardNo;
	}

	public void setMotherCardNo(String motherCardNo) {
		this.motherCardNo = motherCardNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getRechargeBalance() {
		return rechargeBalance;
	}

	public void setRechargeBalance(String rechargeBalance) {
		this.rechargeBalance = rechargeBalance;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getCreditStatus() {
		return creditStatus;
	}

	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}

	public String getCreditMaxQuota() {
		return creditMaxQuota;
	}

	public void setCreditMaxQuota(String creditMaxQuota) {
		this.creditMaxQuota = creditMaxQuota;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

}
