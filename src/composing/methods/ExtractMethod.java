package composing.methods;

public class ExtractMethod {
    public void generateReport(String title, String[] sections, int[] wordCounts) {
        System.out.println("####################################");
        System.out.println("REPORT: " + title);
        System.out.println("####################################");

        int totalWords = 0;
        for (int i = 0; i < sections.length; i++) {
            System.out.println("Sección: " + sections[i] + " - Palabras: " + wordCounts[i]);
            totalWords += wordCounts[i];
        }

        double avgWords = totalWords / (double) sections.length;
        System.out.println("Total de palabras: " + totalWords);
        System.out.println("Promedio por sección: " + avgWords);
    }

    public void generateReportArreglado(String title, String[] sections, int[] wordCounts) {
        printHeader(title);

        int totalWords = countWords(sections, wordCounts);

        averageWords(sections, totalWords);
    }

    private static void averageWords(String[] sections, int totalWords) {
        double avgWords = totalWords / (double) sections.length;
        System.out.println("Total de palabras: " + totalWords);
        System.out.println("Promedio por sección: " + avgWords);
    }

    private static int countWords(String[] sections, int[] wordCounts) {
        int totalWords = 0;
        for (int i = 0; i < sections.length; i++) {
            System.out.println("Sección: " + sections[i] + " - Palabras: " + wordCounts[i]);
            totalWords += wordCounts[i];
        }
        return totalWords;
    }

    private static void printHeader(String title) {
        System.out.println("####################################");
        System.out.println("REPORT: " + title);
        System.out.println("####################################");
    }
}
