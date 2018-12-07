package com.qs.property.util;

import java.io.Serializable;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;


public class PtLog implements Logger, Serializable {

	private static final long serialVersionUID = -2302157558975227421L;
	private static Locale configLanguage = null;
	private Logger log = null;

	public static void setConfigLanguage(Locale configLanguage) {
		PtLog.configLanguage = configLanguage;
	}

	public static PtLog getLogger(String clazz) {
		return new PtLog(clazz);
	}

	public static PtLog getLogger(Class<?> clazz) {
		return new PtLog(clazz);
	}

	private PtLog(String clazz) {
		log = LoggerFactory.getLogger(clazz);
	}

	private PtLog(Class<?> clazz) {
		log = LoggerFactory.getLogger(clazz);
	}

	/**
	 * 是否输出指定语言的日志
	 * 
	 * @param specifyLanguage
	 *            要输出的日志使用的语言
	 * @return 是或否
	 */
	private boolean shouldOutput(Locale specifyLanguage) {
		if (configLanguage == null) {
			return true;
		}
		return specifyLanguage.getLanguage().equals(configLanguage.getLanguage());
	}

	public String getName() {
		return log.getName();
	}

	public boolean isTraceEnabled() {
		return log.isTraceEnabled();
	}

	public void trace(String msg) {
		trace(msg, Locale.CHINA);
	}

	public void trace(String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.trace(msg);
		}
	}

	public void trace(String format, Object arg) {
		log.trace(format, arg);
	}

	public void trace(String format, Object arg1, Object arg2) {
		log.trace(format, arg1, arg2);
	}

	public void trace(String format, Object... argArray) {
		log.trace(format, argArray);
	}

	public void trace(String msg, Throwable t) {
		trace(msg, t, Locale.CHINA);
	}

	public void trace(String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.trace(msg, t);
		}
	}

	public boolean isTraceEnabled(Marker marker) {
		return log.isTraceEnabled(marker);
	}

	public void trace(Marker marker, String msg) {
		trace(marker, msg, Locale.CHINA);
	}

	public void trace(Marker marker, String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.trace(marker, msg);
		}
	}

	public void trace(Marker marker, String format, Object arg) {
		log.trace(marker, format, arg);
	}

	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		log.trace(marker, format, arg1, arg2);
	}

	public void trace(Marker marker, String format, Object... argArray) {
		log.trace(marker, format, argArray);
	}

	public void trace(Marker marker, String msg, Throwable t) {
		trace(marker, msg, t, Locale.CHINA);
	}

	public void trace(Marker marker, String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.trace(marker, msg, t);
		}
	}

	
	public boolean isDebugEnabled() {
		return log.isDebugEnabled();
	}

	
	public void debug(String msg) {
		debug(msg, Locale.CHINA);
	}

	public void debug(String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.debug(msg);
		}
	}

	
	public void debug(String format, Object arg) {
		log.debug(format, arg);
	}

	
	public void debug(String format, Object arg1, Object arg2) {
		log.debug(format, arg1, arg2);
	}

	
	public void debug(String format, Object... argArray) {
		log.debug(format, argArray);
	}

	
	public void debug(String msg, Throwable t) {
		debug(msg, t, Locale.CHINA);
	}

	public void debug(String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.debug(msg, t);
		}
	}

	
	public boolean isDebugEnabled(Marker marker) {
		return log.isDebugEnabled(marker);
	}

	
	public void debug(Marker marker, String msg) {
		debug(marker, msg, Locale.CHINA);
	}

	public void debug(Marker marker, String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.debug(marker, msg);
		}
	}

	
	public void debug(Marker marker, String format, Object arg) {
		log.debug(marker, format, arg);
	}

	
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		log.debug(marker, format, arg1, arg2);
	}

	
	public void debug(Marker marker, String format, Object... argArray) {
		log.debug(marker, format, argArray);
	}

	
	public void debug(Marker marker, String msg, Throwable t) {
		debug(marker, msg, t, Locale.CHINA);
	}

	public void debug(Marker marker, String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.debug(marker, msg, t);
		}
	}

	
	public boolean isInfoEnabled() {
		return log.isInfoEnabled();
	}

	
	public void info(String msg) {
		info(msg, Locale.CHINA);
	}

	public void info(String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.info(msg);
		}
	}

	
	public void info(String format, Object arg) {
		log.info(format, arg);
	}

	
	public void info(String format, Object arg1, Object arg2) {
		log.info(format, arg1, arg2);
	}

	
	public void info(String format, Object... argArray) {
		log.info(format, argArray);
	}

	
	public void info(String msg, Throwable t) {
		info(msg, t, Locale.CHINA);
	}

	public void info(String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.info(msg, t);
		}
	}

	
	public boolean isInfoEnabled(Marker marker) {
		return log.isInfoEnabled(marker);
	}

	
	public void info(Marker marker, String msg) {
		info(marker, msg, Locale.CHINA);
	}

	public void info(Marker marker, String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.info(marker, msg);
		}
	}

	
	public void info(Marker marker, String format, Object arg) {
		log.info(marker, format, arg);
	}

	
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		log.info(marker, format, arg1, arg2);
	}

	
	public void info(Marker marker, String format, Object... argArray) {
		log.info(marker, format, argArray);
	}

	
	public void info(Marker marker, String msg, Throwable t) {
		info(marker, msg, t, Locale.CHINA);
	}

	public void info(Marker marker, String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.info(marker, msg, t);
		}
	}

	
	public boolean isWarnEnabled() {
		return log.isWarnEnabled();
	}

	
	public void warn(String msg) {
		warn(msg, Locale.CHINA);
	}

	public void warn(String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.warn(msg);
		}
	}

	
	public void warn(String format, Object arg) {
		log.warn(format, arg);
	}

	
	public void warn(String format, Object... argArray) {
		log.warn(format, argArray);
	}

	
	public void warn(String format, Object arg1, Object arg2) {
		log.warn(format, arg1, arg2);
	}

	
	public void warn(String msg, Throwable t) {
		warn(msg, t, Locale.CHINA);
	}

	public void warn(String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.warn(msg, t);
		}
	}

	
	public boolean isWarnEnabled(Marker marker) {
		return log.isWarnEnabled(marker);
	}

	
	public void warn(Marker marker, String msg) {
		warn(marker, msg, Locale.CHINA);
	}

	public void warn(Marker marker, String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.warn(marker, msg);
		}
	}

	
	public void warn(Marker marker, String format, Object arg) {
		log.warn(marker, format, arg);
	}

	
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		log.warn(marker, format, arg1, arg2);
	}

	
	public void warn(Marker marker, String format, Object... argArray) {
		log.warn(marker, format, argArray);
	}

	
	public void warn(Marker marker, String msg, Throwable t) {
		warn(marker, msg, t, Locale.CHINA);
	}

	public void warn(Marker marker, String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.warn(marker, msg, t);
		}
	}

	
	public boolean isErrorEnabled() {
		return log.isErrorEnabled();
	}

	
	public void error(String msg) {
		error(msg, Locale.CHINA);
	}

	public void error(String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.error(msg);
		}
	}

	
	public void error(String format, Object arg) {
		log.error(format, arg);
	}

	
	public void error(String format, Object arg1, Object arg2) {
		log.error(format, arg1, arg2);
	}

	
	public void error(String format, Object... argArray) {
		log.error(format, argArray);
	}

	
	public void error(String msg, Throwable t) {
		error(msg, t, Locale.CHINA);
	}

	public void error(String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.error(msg, t);
		}
	}

	
	public boolean isErrorEnabled(Marker marker) {
		return log.isErrorEnabled(marker);
	}

	
	public void error(Marker marker, String msg) {
		error(marker, msg, Locale.CHINA);
	}

	public void error(Marker marker, String msg, Locale locale) {
		if (shouldOutput(locale)) {
			log.error(marker, msg);
		}
	}

	
	public void error(Marker marker, String format, Object arg) {
		log.error(marker, format, arg);
	}

	
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		log.error(marker, format, arg1, arg2);
	}

	
	public void error(Marker marker, String format, Object... argArray) {
		log.error(marker, format, argArray);
	}

	
	public void error(Marker marker, String msg, Throwable t) {
		error(marker, msg, t, Locale.CHINA);
	}

	public void error(Marker marker, String msg, Throwable t, Locale locale) {
		if (shouldOutput(locale)) {
			log.error(marker, msg, t);
		}
	}

}
