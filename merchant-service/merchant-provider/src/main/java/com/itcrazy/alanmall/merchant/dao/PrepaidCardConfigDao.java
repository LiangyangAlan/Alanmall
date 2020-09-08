package com.itcrazy.alanmall.merchant.dao;

import com.itcrazy.alanmall.common.framework.dao.BaseDao;
import com.itcrazy.alanmall.merchant.dto.PrepaidCardConfigDto;
import com.itcrazy.alanmall.merchant.model.PrepaidCardConfig;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface PrepaidCardConfigDao extends BaseDao<PrepaidCardConfig, Long> {
  List<PrepaidCardConfig> getPageList(PrepaidCardConfigDto paramPrepaidCardConfigDto);
  
  int getPageTotal(PrepaidCardConfigDto paramPrepaidCardConfigDto);
}


/* Location:              C:\Users\xiaomi\Desktop\temp\merchant-service\BOOT-INF\classes\!\com\meishi\merchant\dao\PrepaidCardConfigDao.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */