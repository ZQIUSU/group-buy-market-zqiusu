package site.zqiusu.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import site.zqiusu.infrastructure.dao.po.GroupBuyActivity;

import java.util.List;

@Mapper
public interface IGroupBuyActivityDao {
    List<GroupBuyActivity> queryGroupBuyActivityList();
}
