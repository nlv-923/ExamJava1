package bai3;

public class VanBan {
    String st;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public VanBan(String st) {
        this.st = st;
    }

    public VanBan() {
    }
    public int countSt(){
        char[] st_c = st.toCharArray();
        char space = ' ';
        int space_count = 0;
        for(int i = 0; i < st_c.length; i++){
            if(st_c[i] == space){
                space_count += 1;
            }
        }
        return space_count + 1;
    }
    public void upperSt(){
        this.st = st.toUpperCase();
    }
    public void lowerSt(){
        this.st = st.toLowerCase();
    }
    public void standardSt(){
        String standardSt ="";
        this.setSt(st.strip());
        String[] str_arr = st.split("\\s+");
        for(int i = 0; i <str_arr.length; i++){
            str_arr[i] = str_arr[i].strip();
        }
        for(int i = 0; i <str_arr.length; i++){
            if(i !=(str_arr.length - 1)) {
                standardSt = standardSt + str_arr[i] + " ";
            }
            else{
                standardSt = standardSt + str_arr[i];
            }
        }
        this.st = standardSt;
    }
    public void pasalCaseSt(){
        String standardSt ="";
        this.setSt(st.strip());
        String[] str_arr = st.split("\\s+");
        for(int i = 0; i <str_arr.length; i++){
            str_arr[i] = str_arr[i].strip().substring(0,1).toUpperCase() + str_arr[i].strip().substring(1,str_arr[i].length());
        }
        for(int i = 0; i <str_arr.length; i++){
            if(i !=(str_arr.length - 1)) {
                standardSt = standardSt + str_arr[i] + " ";
            }
            else{
                standardSt = standardSt + str_arr[i];
            }
        }
        this.st = standardSt;
    }
}
