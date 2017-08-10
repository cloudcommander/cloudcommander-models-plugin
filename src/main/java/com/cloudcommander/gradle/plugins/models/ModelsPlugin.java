package com.cloudcommander.gradle.plugins.models;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaBasePlugin;

public class ModelsPlugin implements Plugin<Project> {
    private boolean wasApplied = false;

    @Override
    public void apply(Project project) {
        if(wasApplied){
            project.getLogger().warn("The com.cloudcommander.models was already applied to the project: " + project.getPath());
        }else{
            doApply(project);
        }
    }

    private void doApply(Project project) {
        project.getPluginManager().apply(JavaBasePlugin.class);
    }
}
