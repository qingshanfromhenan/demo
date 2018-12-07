package com.qs.property.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.springframework.util.StringUtils;

public class ConfigPropUtil {
	protected static PtLog log = PtLog.getLogger(ConfigPropUtil.class);
	protected static String propFilePath = "Application.properties";
	protected static Properties config;

	public static String getPropFilePath() {
		return propFilePath;
	}
	public static Properties getConfigProperties() {
		if (config == null) {
			try {
				log.debug("加载系统配置文件 : {}", getPropFilePath());
				ClassLoader classLoader = ConfigPropUtil.class.getClassLoader();
				InputStream in = classLoader.getResourceAsStream(getPropFilePath());
				config = new Properties();
				config.load(in);
				in.close();
			} catch (IOException e) {
				log.error("配置文件找不到: " + getPropFilePath(), e);
			}
		}
		return config;
	}

	public static String getProperty(String key) {
		String value = getConfigProperties().getProperty(key);
		return value == null ? value : value.trim();
	}

	public static String getProperty(String key, String defaultValue) {
		String value = getConfigProperties().getProperty(key);
		if (value == null)
			return defaultValue;
		return value.trim();
	}

	public static boolean getBooleanProperty(String name) {
		return getBooleanProperty(name, false);
	}

	public static boolean getBooleanProperty(String name, boolean defaultValue) {
		String value = getProperty(name);
		if (StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return Boolean.valueOf(value);
	}

	public static Integer getIntProperty(String name) {
		return getIntProperty(name, null);
	}

	public static Integer getIntProperty(String name, Integer defaultValue) {
		String value = getProperty(name);
		if (value == null)
			return defaultValue;
		return Integer.valueOf(value);
	}

	public static Enumeration<Object> keys() {
		return getConfigProperties().keys();
	}

	public static Properties getPropertiesStartingWith(String startingWith) {
		Properties props = new Properties();
		for (Enumeration<Object> it = getConfigProperties().keys(); it.hasMoreElements();) {
			String key = (String) it.nextElement();
			props.put(key, getConfigProperties().get(key));
		}
		return props;
	}

}
