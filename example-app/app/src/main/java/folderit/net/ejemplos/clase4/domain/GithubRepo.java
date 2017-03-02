package folderit.net.ejemplos.clase4.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GithubRepo implements Serializable {

    private final static long serialVersionUID = 4840237669886696446L;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private Boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("deployments_url")
    @Expose
    private String deploymentsUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("homepage")
    @Expose
    private Object homepage;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("stargazers_count")
    @Expose
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private Integer watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private Boolean hasIssues;
    @SerializedName("has_downloads")
    @Expose
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private Boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private Boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private Integer forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("open_issues_count")
    @Expose
    private Integer openIssuesCount;
    @SerializedName("forks")
    @Expose
    private Integer forks;
    @SerializedName("open_issues")
    @Expose
    private Integer openIssues;
    @SerializedName("watchers")
    @Expose
    private Integer watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GithubRepo withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GithubRepo withName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GithubRepo withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public GithubRepo withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public GithubRepo withPrivate(Boolean _private) {
        this._private = _private;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GithubRepo withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GithubRepo withDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public GithubRepo withFork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GithubRepo withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public GithubRepo withForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public GithubRepo withKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public GithubRepo withCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public GithubRepo withTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public GithubRepo withHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public GithubRepo withIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public GithubRepo withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public GithubRepo withAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public GithubRepo withBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public GithubRepo withTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public GithubRepo withBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public GithubRepo withGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public GithubRepo withGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public GithubRepo withTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public GithubRepo withStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public GithubRepo withLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public GithubRepo withStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public GithubRepo withContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public GithubRepo withSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public GithubRepo withSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public GithubRepo withCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public GithubRepo withGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public GithubRepo withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public GithubRepo withIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public GithubRepo withContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public GithubRepo withCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public GithubRepo withMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public GithubRepo withArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public GithubRepo withDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public GithubRepo withIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public GithubRepo withPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public GithubRepo withMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public GithubRepo withNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public GithubRepo withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public GithubRepo withReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public GithubRepo withDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GithubRepo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GithubRepo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public GithubRepo withPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public GithubRepo withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public GithubRepo withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public GithubRepo withCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public GithubRepo withSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public GithubRepo withHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public GithubRepo withSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public GithubRepo withStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public GithubRepo withWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public GithubRepo withLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public GithubRepo withHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public GithubRepo withHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public GithubRepo withHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public GithubRepo withHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public GithubRepo withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public GithubRepo withMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public GithubRepo withOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public GithubRepo withForks(Integer forks) {
        this.forks = forks;
        return this;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public GithubRepo withOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public GithubRepo withWatchers(Integer watchers) {
        this.watchers = watchers;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public GithubRepo withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

}