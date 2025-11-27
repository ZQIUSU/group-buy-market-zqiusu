package site.zqiusu.domain.activity.service.trial.factory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import site.zqiusu.domain.activity.model.entity.MarketProductEntity;
import site.zqiusu.domain.activity.model.entity.TrialBalanceEntity;
import site.zqiusu.domain.activity.service.trial.node.RootNode;
import site.zqiusu.types.design.framework.tree.StrategyHandler;

@Service
public class DefaultActivityStrategyFactory {

    private final RootNode rootNode;

    public DefaultActivityStrategyFactory(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DynamicContext, TrialBalanceEntity> strategyHandler() {
        return rootNode;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DynamicContext{

    }
}
