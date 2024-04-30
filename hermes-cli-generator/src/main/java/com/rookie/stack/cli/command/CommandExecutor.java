package com.rookie.stack.cli.command;

import com.rookie.stack.cli.command.command.ConfigCommand;
import com.rookie.stack.cli.command.command.GenerateCommand;
import com.rookie.stack.cli.command.command.ListCommand;
import picocli.CommandLine;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
@CommandLine.Command(name = "hermes", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable{

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ListCommand())
                .addSubcommand(new ConfigCommand());
    }

    @Override
    public void run() {
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}
