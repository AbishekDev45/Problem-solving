class Solution{
if (s.length() != goal.length()) {
            return false;
        }
        String d = s + s;
        return d.contains(goal);
    }
