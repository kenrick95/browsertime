package com.soulgalore.web.browsertime.run;

import com.soulgalore.web.browsertime.BrowserConfig;

import java.io.Writer;
import java.util.Map;

/**
 *
 */
public class TimingConfig {
    public int numIterations = 1;
    public Browser browser;
    public Map<BrowserConfig, String> browserOptions;

    // output config
    public Format format;
    public Writer outputWriter;
    public boolean shouldPrettyPrint;
}
