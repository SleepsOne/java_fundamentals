import javax.management.QueryEval;
import java.util.ArrayList;
import java.util.List;

public class QuerryList <T extends Student & QuerryItem> extends ArrayList<T>{
    public QuerryList(){

    }
    public QuerryList(List <T> items){
        super(items);
    }

    public static <S extends Student & QuerryItem> QuerryList<S> getMatches(QuerryList<S> items, String field, String value){
        QuerryList<S> matches = new QuerryList<>();
        for (var item : items){
            if (item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }

    public QuerryList<T> getMatches(String field, String value){
        QuerryList<T> matches = new QuerryList<>();
        for (var item : this){
            if (item.matchFieldValue(field, value)){
                matches.add(item);
            }
        }
        return matches;
    }


}
