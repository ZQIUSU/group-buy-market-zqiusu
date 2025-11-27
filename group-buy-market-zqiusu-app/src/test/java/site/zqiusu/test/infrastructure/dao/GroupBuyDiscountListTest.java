package site.zqiusu.test.infrastructure.dao;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.zqiusu.infrastructure.dao.IGroupBuyDiscountDao;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupBuyDiscountListTest {

    @Resource
    private IGroupBuyDiscountDao groupBuyDiscountDao;

    @Test
    public void test_queryGroupBuyDiscountList(){
        log.info("查询结果:{}", groupBuyDiscountDao.queryGroupBuyDiscountList());
    }
}
