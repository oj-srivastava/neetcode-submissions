class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size();
        int have = 0;

        int l = 0;

        int resL = 0;
        int resLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c)
                    && window.get(c).equals(need.get(c))) {
                have++;
            }

            // Window is valid: shrink it
            while (have == required) {

                if (r - l + 1 < resLen) {
                    resL = l;
                    resLen = r - l + 1;
                }

                char left = s.charAt(l);

                window.put(left, window.get(left) - 1);

                if (need.containsKey(left)
                        && window.get(left) < need.get(left)) {
                    have--;
                }

                l++;
            }
        }

        return resLen == Integer.MAX_VALUE
                ? ""
                : s.substring(resL, resL + resLen);
    }
}