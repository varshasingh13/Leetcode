class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int left = 0, right = skill.length - 1;
        int target = skill[left] + skill[right]; // First team's sum
        long sum = 0;

        while (left < right) {
            if (skill[left] + skill[right] != target) {
                return -1; // If any pair has a different sum, return -1
            }
            sum += (long) skill[left] * skill[right]; // Multiply and add
            left++;
            right--;
        }
        return sum;
    }
}