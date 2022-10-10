package TDDDemo;

import java.util.List;

public class Iterator {

    public int iterate(List<Integer> data) {
        int res = 0;
        Comparator c = new Comparator();

        for(int i = 0; i < data.size()-1; i++) {
            if(c.compare(data.get(i), data.get(i + 1))) res++;  // Kan skriva såhär på samma rad
        }

        return res;
    }
}
