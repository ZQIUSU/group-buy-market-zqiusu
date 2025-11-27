package site.zqiusu.domain.activity.service;

import site.zqiusu.domain.activity.model.entity.MarketProductEntity;
import site.zqiusu.domain.activity.model.entity.TrialBalanceEntity;
import site.zqiusu.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import site.zqiusu.types.design.framework.tree.StrategyHandler;

import javax.annotation.Resource;

public class IIndexGroupBuyMarketServiceImpl implements IIndexGroupBuyMarketService{

    @Resource
    private DefaultActivityStrategyFactory defaultActivityStrategyFactory;

    @Override
    public TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception {
        StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler = defaultActivityStrategyFactory.strategyHandler();

        return strategyHandler.apply(marketProductEntity, new DefaultActivityStrategyFactory.DynamicContext());
    }
}
