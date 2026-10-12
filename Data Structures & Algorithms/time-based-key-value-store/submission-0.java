class TimeMap {
    Map<String, List<Pair>> timeMap;

    public TimeMap() {
        this.timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        this.timeMap.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<Pair> list = this.timeMap.get(key);
        if(list == null){
            return "";
        }

        int start = 0, end = list.size() - 1;
        String result = "";
        while(start <= end){
            int mid = start + (end-start)/2;

            if(list.get(mid).timestamp <= timestamp){
                result = list.get(mid).val;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}

class Pair {
    String val;
    int timestamp;

    Pair(String val, int ts){
        this.timestamp = ts;
        this.val = val;
    }
}
