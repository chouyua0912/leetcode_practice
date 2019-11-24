package z.learn;

public class Q0535TinyUrl {
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char[] s = new char[longUrl.length()];
        for (int i = 0; i < longUrl.length(); i++) {
            s[i] = (char) (longUrl.charAt(i) + '0');
        }
        return new String(s);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        char[] s = new char[shortUrl.length()];
        for (int i = 0; i < shortUrl.length(); i++) {
            s[i] = (char) (shortUrl.charAt(i) - '0');
        }
        return new String(s);
    }
}
