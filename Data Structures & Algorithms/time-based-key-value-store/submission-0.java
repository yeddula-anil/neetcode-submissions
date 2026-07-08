class Pair{
    String val;
    int stamp;
    Pair(String val,int stamp){
        this.val=val;
        this.stamp=stamp;
    }
}
class TimeMap {
    HashMap<String,List<Pair>> map;

    public TimeMap() {
        map=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Pair(value,timestamp));
        
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        int l=0;
        int r=map.get(key).size()-1;
        boolean flag=true;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int stamp=map.get(key).get(mid).stamp;
            String val=map.get(key).get(mid).val;
            if(stamp<=timestamp){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }


        }
        return (ans==-1)?"":map.get(key).get(ans).val;
        
    }
}
