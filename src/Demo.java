public class Demo {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chromedriver", "C:\\Users\\sjeya\\IdeaProjects\\DemoProj\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}
