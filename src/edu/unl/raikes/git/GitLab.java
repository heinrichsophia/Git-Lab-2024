package edu.unl.raikes.git;

public class GitLab {
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper(new String[] { "Sophia", "Lena" });
        helper.PrintWelcomeMessage();
    }
}
