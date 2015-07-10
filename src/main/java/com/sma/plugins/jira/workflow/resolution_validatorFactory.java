package com.sma.plugins.jira.workflow;

import com.atlassian.core.util.map.EasyMap;
import com.opensymphony.workflow.loader.AbstractDescriptor;
import com.opensymphony.workflow.loader.ValidatorDescriptor;
import com.atlassian.jira.plugin.workflow.WorkflowPluginValidatorFactory;
import com.atlassian.jira.plugin.workflow.AbstractWorkflowPluginFactory;
import java.util.Map;

public class resolution_validatorFactory extends AbstractWorkflowPluginFactory implements WorkflowPluginValidatorFactory
{
    //public static final String FIELD_WORD="word";

    protected void getVelocityParamsForInput(Map velocityParams)
    {
        //the default message
        //velocityParams.put(FIELD_WORD,"test");
    }

    protected void getVelocityParamsForEdit(Map velocityParams, AbstractDescriptor descriptor)
    {
        getVelocityParamsForInput(velocityParams);
        getVelocityParamsForView(velocityParams, descriptor);
    }

    protected void getVelocityParamsForView(Map velocityParams, AbstractDescriptor descriptor)
    {
        if (!(descriptor instanceof ValidatorDescriptor))
        {
            throw new IllegalArgumentException("Descriptor must be a ValidatorDescriptor.");
        }

        ValidatorDescriptor validatorDescriptor = (ValidatorDescriptor) descriptor;

        //velocityParams.put(FIELD_WORD, validatorDescriptor.getArgs().get(FIELD_WORD));
    }

    public Map getDescriptorParams(Map validatorParams)
    {
        // Process The map
       // String value = extractSingleParam(validatorParams, FIELD_WORD);
        //return EasyMap.build(FIELD_WORD, value);
    	return validatorParams;
    }
}
