package io.macgyver.core.scheduler;

import java.io.File;
import java.io.IOException;

import org.quartz.JobKey;

import com.google.common.base.Objects;

public class ScheduledScript {
	File scriptFile;
	String cronExpression;

	public ScheduledScript(File f, String cron) {
		this.scriptFile = f!=null ? f.getAbsoluteFile() : f;
		this.cronExpression = cron;
	}

	public String toString() {
		return Objects.toStringHelper(this)
				.add("scriptFile", scriptFile)
				.add("cronExpression", cronExpression).toString();
	}

	JobKey getJobKey() {
		try {
			if (scriptFile==null) {
				return null;
			}
			return JobKey.jobKey(scriptFile.getCanonicalPath(),
					AutoScheduler.AUTO_SCHEDULER_GROUP);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}