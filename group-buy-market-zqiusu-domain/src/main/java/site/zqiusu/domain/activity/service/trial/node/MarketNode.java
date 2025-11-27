package site.zqiusu.domain.activity.service.trial.node;

import site.zqiusu.domain.activity.model.entity.MarketProductEntity;
import site.zqiusu.domain.activity.model.entity.TrialBalanceEntity;
import site.zqiusu.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import site.zqiusu.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import site.zqiusu.types.design.framework.tree.StrategyHandler;

public class MarketNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {
    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }
}
