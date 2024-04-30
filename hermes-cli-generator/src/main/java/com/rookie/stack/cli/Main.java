package com.rookie.stack.cli;

import com.rookie.stack.cli.command.CommandExecutor;
import com.rookie.stack.cli.generator.StaticGenerator;

import java.io.File;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */
public class Main {
    public static void main(String[] args) {
        // args = new String[]{"generate", "-l", "-a", "-o"};
        // args = new String[]{"config"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
