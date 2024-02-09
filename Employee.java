/**
 * Uncleaned code
 */
class Employee {
    public static void main(String[] args) {
        String[] names = { "Aime", "Alliance", "Anabella", "Anathole", "Ange", "Barnabas", "Ben", "Aristote",
                "Benjamin", "Blaise", "Celestin", "Charles", "Christian", "Clement", "Eddy", "Emmanuel", "Esther",
                "Faustin", "Gilbert", "Tharcissie", "Aubin", "Eliab", "Japhet", "Gentile", "Levy", "Mireille", "Ngomde",
                "Olive", "Perfect", "Pritchard", "Roger", "Theophile", "Xavier", "Zachee" };

        int n = 0;
        int m = 0;

        int total = 0;

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                total++;
            }
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                if (names[i].charAt(j) == 'n') {
                    n++;
                } else if (names[i].charAt(j) == 'm') {
                    m++;
                }
            }
        }

        System.out.println("Number of n's: " + n);
        System.out.println("Number of m's: " + m);
        System.out.println("Total letters: " + total);

        System.out.println("Output: " + ((double) (n + m) * 100 / (double) total) + "%");
    }
}