package com.github.dudiao.solon.nativex.example.config;

import lombok.Data;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

import java.io.File;

/**
 * @author songyinyin
 * @since 2023/4/5 11:03
 */
@Data
@Inject("${json}")
@Configuration
public class JsonTestConfig {

  private File inputFilePath;

  private String inputFileCharset;

  private File outputDir;
}
