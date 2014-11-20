package org.mockito.release.notes;

import org.gradle.api.Project;
import org.mockito.release.notes.versions.PreviousVersion;
import org.mockito.release.notes.versions.Versions;

/**
 * Release notes services
 */
public class Notes {

    /**
     * Release notes build based on git and GitHub.
     *
     * @param project the Gradle project
     * @param authTokenEnvVar env variable name that holds the GitHub auth token
     */
    public static NotesBuilder gitHubNotesBuilder(Project project, String authTokenEnvVar) {
        return new GitNotesBuilder(project, authTokenEnvVar);
    }

    /**
     * Provides previous version information based on the release notes content file
     */
    public static PreviousVersion previousVersion(String releaseNotesContent) {
        return Versions.previousFromNotesContent(releaseNotesContent);
    }
}