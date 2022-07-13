import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingRepository {
    private List<WiseSaying> wiseSayings;
    private int wiseSayingLastId;

    WiseSayingRepository() {
        wiseSayings = new ArrayList<>();
        wiseSayingLastId = 0;
    }

    public WiseSaying findById(int paramId) {
        for(WiseSaying wiseSaying : wiseSayings) {
            if(wiseSaying.id == paramId) {
                return wiseSaying;
            }
        }
        return null;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public WiseSaying regist(String content, String author) {
        int id = ++wiseSayingLastId;
        WiseSaying wiseSaying = new WiseSaying(id, content, author);
        wiseSayings.add(wiseSaying);

        return wiseSaying;
    }

    public void modify(int id, String content, String author) {
        WiseSaying foundWiseSaying = findById(id);
        foundWiseSaying.content = content;
        foundWiseSaying.author = author;
    }

    public void delete(int id) {
        WiseSaying foundWiseSaying = findById(id);
        wiseSayings.remove(foundWiseSaying);
    }
}
