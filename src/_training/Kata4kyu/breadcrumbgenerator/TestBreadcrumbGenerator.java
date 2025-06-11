package _training.Kata4kyu.breadcrumbgenerator;

public class TestBreadcrumbGenerator {
    public static void main(String[] args) {
        // Separator to be used in the breadcrumb
        String separator = " / ";

        // Array of example URLs to test
        String[] testUrls = {
                "https://www.example.com/",
                "https://www.example.com/index.html",
                "https://www.example.com/articles/technology/",
                "https://www.example.com/articles/technology/web-development",
                "https://www.example.com/articles/technology/web-development/index.html",
                "https://www.example.com/a-very-long-page-name-that-should-be-acronymized",
                "https://www.example.com/articles/of-the-world/by-the-sea"
        };

        // Print the breadcrumb result for each test URL
        for (String url : testUrls) {
            String breadcrumb = BreadcrumbGenerator.generateBc(url, separator);
            System.out.println("URL: " + url);
            System.out.println("Breadcrumb: " + breadcrumb);
            System.out.println("---------------------------------------");
        }
    }
}
