package com.rookie.stack.cli.generator.main;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.util.StrUtil;
import com.rookie.stack.cli.generator.JarGenerator;
import com.rookie.stack.cli.generator.ScriptGenerator;
import com.rookie.stack.cli.generator.file.DynamicGenerator;
import com.rookie.stack.cli.meta.Meta;
import com.rookie.stack.cli.meta.MetaManager;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
public class MainGenerator extends GenerateTemplate {

    @Override
    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        System.out.println("不要给我输出 dist 啦！");
    }
}
