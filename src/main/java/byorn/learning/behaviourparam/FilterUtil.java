package byorn.learning.behaviourparam;

import java.util.ArrayList;
import java.util.List;

public class FilterUtil {

    public static <T>List<T> filter(List<T> list, MyFilterFuncInterface<T> p){
            List<T> result = new ArrayList<>();
            for(T e: list){
                if(p.test(e)){
                    result.add(e);
                }
            }
            return result;
    }
}
