package com.rookie.stack.cli.generator;

import cn.hutool.core.io.FileUtil;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
public class StaticGenerator {

    public static void copyFilesByHutool(String inputPath, String outputPath){
        FileUtil.copy(inputPath, outputPath, false);
    }



}
