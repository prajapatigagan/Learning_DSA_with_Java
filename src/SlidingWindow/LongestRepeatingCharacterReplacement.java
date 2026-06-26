package SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static int CharacterReplacement(String s,int k){
        int freq[]=new int[26];
        int left=0;
        int maxfreq=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxlength, freq[s.charAt(right)-'A']);

            while((right-left+1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength, freq[s.charAt(left)-'A']);
        }
        return maxlength;
        
    }
    public static void main(String[] args) {
        String s="ABABABBAAA";
        int k=2;
        System.out.println(CharacterReplacement(s,k));
    }

}
