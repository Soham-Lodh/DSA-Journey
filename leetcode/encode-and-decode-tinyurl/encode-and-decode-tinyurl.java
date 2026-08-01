public class Codec {
    HashMap<String,String> hs=new HashMap<>();
    String chars="01234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    // Encodes a URL to a shortened URL.
    String getCode(){
        char code[]=new char[6];
        for(int i=0;i<6;i++){
            code[i]=chars.charAt((int)(Math.random()*62));
        }
        return "http://tinyurl.com/"+String.valueOf(code);
    }
    public String encode(String longUrl) {
        String url=getCode();
        while(hs.containsKey(url))url=getCode();
        hs.put(url,longUrl);
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hs.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));