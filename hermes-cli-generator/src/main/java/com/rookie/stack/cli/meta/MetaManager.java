package com.rookie.stack.cli.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */

public class MetaManager {

    private static volatile Meta meta;

    private MetaManager() {
        // 私有构造函数，防止外部实例化
    }

    public static Meta getMetaObject() {
        if (meta == null) {
            synchronized (MetaManager.class) {
                if (meta == null) {
                    meta = initMeta();
                }
            }
        }
        return meta;
    }

    private static Meta initMeta() {
        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
        // Meta.FileConfig fileConfig = newMeta.getFileConfig();
        MetaValidator.doValidAndFill(newMeta);
        // todo 校验和处理默认值
        return newMeta;
    }
}
