package com.rookie.stack.cli;

import com.rookie.stack.cli.generator.StaticGenerator;

import java.io.File;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
public class Main {
    public static void main(String[] args) {
        // 获取整个项目的跟路径
        String projectPath = System.getProperty("user.dir");
        // System.out.println(projectPath);
        File parentFile = new File(projectPath).getParentFile();

        String inputPath = new File(parentFile, "acm-template").getAbsolutePath();
        String outputPath = projectPath;

        StaticGenerator.copyFilesByHutool(inputPath,outputPath);


    }
}
