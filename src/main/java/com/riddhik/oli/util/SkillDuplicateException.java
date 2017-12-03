package com.riddhik.oli.util;

public class SkillDuplicateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SkillDuplicateException(String message, Throwable cause) {
		super(message, cause);
	}

	public SkillDuplicateException(Throwable cause) {
		super(cause);
	}

	public SkillDuplicateException() {
		super();
	}

	public SkillDuplicateException(String msg) {
		super(msg);
	}
}
