package com.rookie.stack.cli.generator;

import java.io.*;
import java.util.Map;

/**
 * @author eumenides
 * @description
 * @date 2024/4/30
 */

public class JarGenerator {

    public static void doGenerate(String projectDir) throws IOException, InterruptedException {
        // 清理之前的构建并打包
        // 注意不同操作系统，执行的命令不同
        String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
        String otherMavenCommand = "/Users/eumenides/Desktop/software/apache-maven-3.9.6/bin/mvn clean package -DskipTests=true";
        String mavenCommand = otherMavenCommand;

        // 这里一定要拆分！
        ProcessBuilder processBuilder = new ProcessBuilder(mavenCommand.split(" "));
        processBuilder.directory(new File(projectDir));
        Map<String, String> environment = processBuilder.environment();
        System.out.println(environment);
        Process process = processBuilder.start();

        // 读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 等待命令执行完成
        int exitCode = process.waitFor();
        System.out.println("命令执行结束，退出码：" + exitCode);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        doGenerate("/Users/eumenides/Desktop/core/HermesCLI/hermes-cli-generator/generated/acm-template-pro-generator");
    }
}
