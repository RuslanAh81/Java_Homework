import java.util.Map;
import java.util.Comparator;
class CountComparator implements Comparator<String>{
    Map<String, Integer> base;
    public CountComparator(Map<String, Integer>base) {
        this.base = base;
    }

    public int compare(String x,String y) {
        if (base.get(x) >=base.get(y)) {
            return -1;
        }else return 1;
    }
}
