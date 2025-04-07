class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = a +"" + b;
        int intValue = Integer.parseInt(c);
        int d = 2 * a * b;
        if(intValue < d){
            answer += d;
        } else {
            answer += intValue;
        }
        return answer;
    }
}