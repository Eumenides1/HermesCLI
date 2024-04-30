package com.rookie.stack.cli.command.command;

import cn.hutool.core.bean.BeanUtil;
import com.rookie.stack.cli.generator.MainGenerator;
import com.rookie.stack.cli.model.MainTemplateConfig;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * @author eumenides
 * @description 代码生成命令
 * @date 2024/4/30
 */
@CommandLine.Command(name = "generate", description = "生成代码", mixinStandardHelpOptions = true)
public class GenerateCommand implements Callable<Integer> {

    @CommandLine.Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否循环",interactive = true, echo = true)
    private boolean loop;

    @CommandLine.Option(names = {"-a", "--author"}, arity = "0..1", description = "作者",interactive = true, echo = true)
    private String author = "jaguarliu";

    @CommandLine.Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出文本",interactive = true, echo = true)
    private String outputText = "sum = ";

    @Override
    public Integer call() throws Exception {
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateConfig);
        System.out.println("配置信息：" + mainTemplateConfig);
        MainGenerator.doGenerate(mainTemplateConfig);
        return 0;
    }
}
