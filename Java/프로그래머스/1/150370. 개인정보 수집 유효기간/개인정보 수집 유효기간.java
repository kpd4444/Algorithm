import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        
        for (String t : terms) {
            String[] split = t.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]));
        }
        
        int todayTotal = toDays(today);
        
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            String dateStr = split[0];
            String termType = split[1];
            
            // 수집일 + (유효기간 * 28일)
            int expireTotal = toDays(dateStr) + termMap.get(termType) * 28;
            
            // 오늘 날짜가 만료일 이상이면 파기 대상
            if (todayTotal >= expireTotal) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 날짜를 총 일수로 변환하는 헬퍼 메서드
    private int toDays(String date) {
        String[] s = date.split("\\.");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        return (y * 12 * 28) + (m * 28) + d;
    }
}