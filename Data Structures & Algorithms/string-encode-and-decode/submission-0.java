class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for(String st : strs){
            sizes.add(st.length());
        }
        for(int size : sizes){
            str.append(size).append(',');
        }
        str.append('#');
        for(String st : strs){
            str.append(st);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        if(str.length() == 0) return strs;
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder current = new StringBuilder();
            while(str.charAt(i) != ','){
                current.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        for(int size : sizes){
            strs.add(str.substring(i,i+size));
            i += size;
        }
        return strs;
    }
}
