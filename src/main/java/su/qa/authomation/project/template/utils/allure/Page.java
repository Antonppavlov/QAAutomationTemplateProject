package su.qa.authomation.project.template.utils.allure;


public enum Page {

    HOME(System.getProperty("url") + "/login"),;

    private final String url;

    Page(final String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
