package com.itcrazy.alanmall.office.manager;

import com.itcrazy.alanmall.office.dto.AppVersionDto;
import com.itcrazy.alanmall.office.model.AppVersion;
import java.util.List;

public interface AppVersionManager {
  AppVersion addAppVersion(AppVersion paramAppVersion);
  
  AppVersion getLastVersion(AppVersion paramAppVersion);
  
  List<AppVersion> getPageList(AppVersionDto paramAppVersionDto);
  
  Integer getPageTotal(AppVersionDto paramAppVersionDto);
  
  Integer deleteById(AppVersion paramAppVersion);
  
  int updateAppVersion(AppVersion paramAppVersion);
  
  AppVersion getById(Long paramLong);
}


/* Location:              C:\Users\xiaomi\Desktop\temp\office-api\office-api-1.180622.0-RELEASE.jar!\com\meishi\office\manager\AppVersionManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */