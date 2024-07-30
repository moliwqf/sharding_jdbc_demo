package com.moli.sharding.tenant.algorithm;

import org.apache.shardingsphere.sharding.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.hint.HintShardingValue;

import java.util.Collection;
import java.util.Properties;
import java.util.stream.Collectors;

/**
 * @author moli
 * @time 2024-07-28 15:13:10
 * @description 自定义Hint分片算法
 */
public class MyHintShardingAlgorithm implements HintShardingAlgorithm<String> {

    private Properties properties;

    @Override
    public Collection<String> doSharding(Collection<String> avails,
                                         HintShardingValue<String> hintShardingValue) {
        return hintShardingValue.getValues().stream().filter(avails::contains).collect(Collectors.toList());
    }

    @Override
    public Properties getProps() {
        return properties;
    }

    @Override
    public void init(Properties properties) {
        this.properties = properties;
    }
}
