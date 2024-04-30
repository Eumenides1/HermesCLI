package com.rookie.stack.cli.generator.file;

import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author eumenides
 * @description 核心生成器
 * @date 2024/4/30
 */
public class MainGenerator {

    public static void doGenerate(Object model) throws TemplateException, IOException {
        // 获取整个项目的跟路径
        String projectPath = System.getProperty("user.dir");
        // System.out.println(projectPath);
        File parentFile = new File(projectPath).getParentFile();

        String inputPath = new File(parentFile, "acm-template").getAbsolutePath();
        String outputPath = projectPath;

        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        // 生成动态文件
        String inputDynamicFilePath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/rookie/demo/acm/MainTemplate.java";
        DynamicGenerator.doGenerate(inputDynamicFilePath, outputDynamicFilePath, model);
    }


}
