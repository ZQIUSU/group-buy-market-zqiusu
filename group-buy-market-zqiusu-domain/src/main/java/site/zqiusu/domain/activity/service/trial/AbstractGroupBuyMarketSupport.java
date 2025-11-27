package site.zqiusu.domain.activity.service.trial;

import site.zqiusu.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import site.zqiusu.types.design.framework.tree.AbstractStrategyRouter;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractStrategyRouter<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {
}
