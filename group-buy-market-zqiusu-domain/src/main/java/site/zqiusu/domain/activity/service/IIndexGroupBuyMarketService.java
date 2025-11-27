package site.zqiusu.domain.activity.service;

import site.zqiusu.domain.activity.model.entity.MarketProductEntity;
import site.zqiusu.domain.activity.model.entity.TrialBalanceEntity;

public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception;
}
