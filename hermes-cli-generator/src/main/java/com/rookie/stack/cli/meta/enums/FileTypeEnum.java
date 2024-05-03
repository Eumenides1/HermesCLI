package com.rookie.stack.cli.meta.enums;

/**
 * @author eumenides
 * @description
 * @date 2024/5/3
 */
public enum FileTypeEnum {

    DIR("目录", "dir"),
    FILE("文件", "file");

    private final String text;

    private final String value;

    FileTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }
}
