/**
 * Beta version of the EmployeeStatistics program.
 * This program calculates the percentage of occurrences of the letters 'n' and
 * 'm' in a list of names.
 */

public class EmployeeStatistics {
    public static void main(String[] args) {
        String[] names = { "Aime", "Alliance", "Anabella", "Anathole", "Ange", "Barnabas", "Ben", "Aristote",
                "Benjamin", "Blaise", "Celestin", "Charles", "Christian", "Clement", "Eddy", "Emmanuel", "Esther",
                "Faustin", "Gilbert", "Tharcissie", "Aubin", "Eliab", "Japhet", "Gentile", "Levy", "Mireille", "Ngomde",
                "Olive", "Perfect", "Pritchard", "Roger", "Theophile", "Xavier", "Zachee" };

        int totalCharacters = getTotalCharacters(names);
        int nCount = countOccurrences(names, 'n');
        int mCount = countOccurrences(names, 'm');

        System.out.println("Number of n's: " + nCount);
        System.out.println("Number of m's: " + mCount);
        System.out.println("Total letters: " + totalCharacters);

        double percentage = calculatePercentage(nCount + mCount, totalCharacters);

        System.out.println("Output: " + percentage + "%");
    }

    private static int getTotalCharacters(String[] names) {
        int total = 0;
        for (String name : names) {
            total += name.length();
        }
        return total;
    }

    private static int countOccurrences(String[] names, char character) {
        int count = 0;
        char letter = Character.toLowerCase(character);
        for (String name : names) {
            for (int j = 0; j < name.length(); j++) {
                if (Character.toLowerCase(name.charAt(j)) == letter) {
                    count++;
                }
            }
        }
        return count;
    }

    private static double calculatePercentage(double totalOccurrences, int totalCharacters) {
        return ((double) totalOccurrences * 100) / totalCharacters;
    }
}
