package com.rookie.stack.cli;

import com.rookie.stack.cli.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        // args = new String[]{"generate", "-l", "-a", "-o"};
        // args = new String[]{"config"};
        MainGenerator mainGenerator = new MainGenerator();
        mainGenerator.
                doGenerate();
    }
}
