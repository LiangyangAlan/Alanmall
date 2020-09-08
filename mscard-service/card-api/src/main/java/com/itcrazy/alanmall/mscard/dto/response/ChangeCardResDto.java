package com.itcrazy.alanmall.mscard.dto.response;

import com.itcrazy.alanmall.common.framework.dto.BaseDto;
import com.itcrazy.alanmall.common.framework.dto.CardBaseResponseDto;
import lombok.Data;

@Data
public class ChangeCardResDto extends CardBaseResponseDto {
	// 新卡卡号
	private String newCardNo;

	// 老卡卡号
	private String oldCardNo;

	// 商家id
	private Long companyId;

	// 门店id
	private Long store;

	// 删除标志
	private int isDeleted;

	// 创建人
	private Long createId;

	// 更新人
	private Long updateId;

	// 卡状态
	private int status;

}
