public class Hybird {
    private final int R;       // the radix
    private int[][] dfa;       // the Hybird automoton
    private int R1;
    private int R2;
    private int[] right;

    private char[] pattern;    // either the character array for the pattern
    private String pat;        // or the pattern string

    /**
     * Preprocesses the pattern string.
     *
     * @param pat the pattern string
     */
    public Hybird(String pat) {
        this.R = 256;
        this.pat = pat;

        // build DFA from pattern
        int m = pat.length();
        dfa = new int[R][m];
        dfa[pat.charAt(0)][0] = 1;
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][x];     // Copy mismatch cases.
            dfa[pat.charAt(j)][j] = j+1;   // Set match case.
            x = dfa[pat.charAt(j)][x];     // Update restart state.
        }
    }

    /**
     * Preprocesses the pattern string.
     *
     * @param pattern the pattern string
     * @param R the alphabet size
     */
    public Hybird(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for (int j = 0; j < pattern.length; j++)
            this.pattern[j] = pattern[j];

        // build DFA from pattern
        int m = pattern.length;
        dfa = new int[R][m];
        dfa[pattern[0]][0] = 1;
        for (int x = 0, j = 1; j < m; j++) {
            for (int c = 0; c < R; c++)
                dfa[c][j] = dfa[c][x];     // Copy mismatch cases.
            dfa[pattern[j]][j] = j+1;      // Set match case.
            x = dfa[pattern[j]][x];        // Update restart state.
        }
    }

    /**
     * Returns the index of the first occurrrence of the pattern string
     * in the text string.
     *
     * @param  txt the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; N if no such match
     */
    public int search(String txt) {

        // simulate operation of DFA on text
        int m = pat.length();
        int n = txt.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if (j == m) return i - m;    // found
        return n;                    // not found
    }

    /**
     * Returns the index of the first occurrrence of the pattern string
     * in the text string.
     *
     * @param  text the text string
     * @return the index of the first occurrence of the pattern string
     *         in the text string; N if no such match
     */
    public int search(char[] text) {

        // simulate operation of DFA on text
        int m = pattern.length;
        int n = text.length;
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = dfa[text[i]][j];
        }
        if (j == m) return i - m;    // found
        return n;                    // not found
    }
    public static void main(String[] args) {}   /**
     * Takes a pattern string and an input string as command-line arguments;
     * searches for the pattern string in the text string; and prints
     * the first occurrence of the pattern string in the text string.
     *
     * @param args the command-line arguments
     */
    public static void main1(String[] args) {
        String pat = args[0];
        String txt = args[1];
        char[] pattern = pat.toCharArray();
        char[] text    = txt.toCharArray();

        Hybird Hybird1 = new Hybird(pat);
        int offset1 = Hybird1.search(txt);

        Hybird Hybird2 = new Hybird(pattern, 256);
        int offset2 = Hybird2.search(text);

        // print results
        System.out.println("text:    " + txt);

        System.out.print("pattern: ");
        for (int i = 0; i < offset1; i++)
            System.out.print(" ");
        System.out.println(pat);

        System.out.print("pattern: ");
        for (int i = 0; i < offset2; i++)
            System.out.print(" ");
        System.out.println(pat);
    }

    public void BoyerMoore(String pat) {
			int R=0;
	        this.R1 = 256;
	        this.pat = pat;

	        // position of rightmost occurrence of c in the pattern
	        right = new int[R];
	        for (int c = 0; c < R; c++)
	            right[c] = -1;
	        for (int j = 0; j < pat.length(); j++)
	            right[pat.charAt(j)] = j;
	    }

	    /**
	     * Preprocesses the pattern string.
	     *
	     * @param pattern the pattern string
	     * @param R the alphabet size
	     */
	    public void BoyerMoore(char[] pattern, int R) {
	        this.R2 = R1;
	        this.pattern = new char[pattern.length];
	        for (int j = 0; j < pattern.length; j++)
	            this.pattern[j] = pattern[j];

	        // position of rightmost occurrence of c in the pattern
	        right = new int[R];
	        for (int c = 0; c < R; c++)
	            right[c] = -1;
	        for (int j = 0; j < pattern.length; j++)
	            right[pattern[j]] = j;
	    }








}