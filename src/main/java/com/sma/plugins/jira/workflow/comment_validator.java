package com.sma.plugins.jira.workflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.issue.Issue;
import com.atlassian.jira.issue.CustomFieldManager;
import com.atlassian.jira.issue.IssueManager;
import com.atlassian.jira.issue.fields.CustomField;
import com.opensymphony.module.propertyset.PropertySet;
import com.opensymphony.workflow.Validator;
import com.opensymphony.workflow.InvalidInputException;

import java.util.Map;

public class comment_validator implements Validator {
	private static final Logger log = LoggerFactory
			.getLogger(comment_validator.class);

	// public static final String FIELD_WORD="word";
	
	public void validate(Map transientVars, Map args, PropertySet ps)
			throws InvalidInputException {
		// String word = (String) transientVars.get(FIELD_WORD);
		if (transientVars.get("comment") == null)
			throw new InvalidInputException("Необходимо добавить комментарий!");
	}
}
