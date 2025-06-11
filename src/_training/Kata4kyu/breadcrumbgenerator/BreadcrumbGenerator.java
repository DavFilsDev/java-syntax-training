package _training.Kata4kyu.breadcrumbgenerator;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BreadcrumbGenerator {

    private static final String HREF = "<a href=\"";
    private static final String AMSG = "\">";
    private static final String FOOT = "</a>";
    private static final String SPANH = "<span class=\"active\">";
    private static final String SPANE = "</span>";
    private static final String[] IGNORE = new String[]{
            "the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a"
    };

    public static String generateBc(String url, String separator) {
        // Extract the path from the URL
        url = url.substring(url.indexOf("."));
        url = url.substring(url.indexOf("/") + 1).split("\\?|#|index\\.")[0];
        if (url.trim().equals("") || !url.contains("/"))
            return String.format("%s%s%s", SPANH, "HOME", SPANE);

        // Remove trailing slash if present
        if (url.endsWith("/"))
            url = url.substring(0, url.length() - 1);

        String[] block = url.split("/");

        // Generate the "HOME" link
        String home = HREF + "/" + AMSG + "HOME" + FOOT + separator;

        // Generate the last segment as the active one (non-clickable)
        String span = String.format("%s%s%s", SPANH, parse(block[block.length - 1].split("\\.")[0]), SPANE);

        // Generate intermediate links for all segments except the last
        StringBuilder href = new StringBuilder();
        block = Arrays.copyOf(block, block.length - 1);
        for (int i = 0; i < block.length; i++) {
            StringBuilder dir = new StringBuilder();
            for (int j = 0; j <= i; j++)
                dir.append(block[j]).append("/");
            String folder = parse(block[i]);
            href.append(HREF + "/")
                    .append(dir)
                    .append(AMSG)
                    .append(folder)
                    .append(FOOT)
                    .append(separator);
        }

        return home + href + span;
    }

    private static String parse(String local) {
        return (local.length() >= 30 ?
                Arrays.stream(local.replace("/", "").split("-"))
                        .filter(s -> Arrays.stream(IGNORE).noneMatch(s::equals))
                        .map(s -> "" + s.charAt(0))
                        .collect(Collectors.joining())
                : local.replace("-", " ")).toUpperCase();
    }
}
