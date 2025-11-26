package site.zqiusu.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import site.zqiusu.infrastructure.dao.po.GroupBuyDiscount;

import java.util.List;

@Mapper
public interface IGroupBuyDiscountDao {
    List<GroupBuyDiscount> queryGroupBuyDiscountList();
}
