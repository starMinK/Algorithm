import java.lang.Math;

class Solution {
    public int solution(double slice, double n) {
        return (int) Math.ceil(n/slice);
    }
}