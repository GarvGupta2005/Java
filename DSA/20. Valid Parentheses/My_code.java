class Solution {
    public boolean isValid(String s) {
       while(s.contains("()") || s.contains("{}") || s.contains("[]"))
       {
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");
       }
       if(s==""){
        return true;
       }
       else{
        return false;
       }
    }
}
