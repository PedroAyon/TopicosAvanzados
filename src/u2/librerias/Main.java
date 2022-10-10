package u2.librerias;

import com.cedarsoftware.util.CaseInsensitiveMap;
import com.cedarsoftware.util.DateUtilities;
import com.cedarsoftware.util.StringUtilities;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CaseInsensitiveMap<String, Integer> map = new CaseInsensitiveMap<>();
        map.put("abc", 100);
        System.out.println(map);
        System.out.println(map.get("ABC"));
        System.out.println(StringUtilities.getRandomString(new Random(), 5, 100));
        System.out.println(DateUtilities.parseDate("October 5, 2022, 11:30"));
    }
}
