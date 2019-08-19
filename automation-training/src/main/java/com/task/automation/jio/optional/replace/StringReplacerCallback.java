package com.task.automation.jio.optional.replace;

import java.util.regex.Matcher;

public interface StringReplacerCallback {
    public String replace(Matcher match);
}
