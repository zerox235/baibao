/*
 * Copyright (c) 2019. the original author or authors.
 * BaiBao is licensed under the "LICENSE" file in the project's root directory.
 */

package baibao.extension.ip.support.ipapi;

import baibao.common.constant.Actions;
import kunlun.action.ActionUtil;
import kunlun.cache.CacheUtil;
import kunlun.cache.support.SimpleCache;
import kunlun.cache.support.SimpleCacheConfig;
import kunlun.data.ReferenceType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Network physical address auto configuration.
 * @author Kahle
 */
@Configuration
public class IpApiAutoConfiguration implements InitializingBean, DisposableBean {
    private static final Logger log = LoggerFactory.getLogger(IpApiAutoConfiguration.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        SimpleCacheConfig config = new SimpleCacheConfig(ReferenceType.SOFT, 3L, TimeUnit.DAYS);
        CacheUtil.registerCache(Actions.IP_QUERY_01, new SimpleCache(config));
        IpApiIpLocationAction action = new IpApiIpLocationAction();
        action.setCache(CacheUtil.getCache(Actions.IP_QUERY_01));
        ActionUtil.registerAction(Actions.IP_QUERY_01, action);
    }

    @Override
    public void destroy() throws Exception {

    }

}
