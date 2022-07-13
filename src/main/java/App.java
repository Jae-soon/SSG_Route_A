import java.util.Scanner;

public class App {
    private Scanner sc;

    public App() {
        sc = new Scanner(System.in);
    }

    public void run() {
        WiseSayingController wiseSayingController = new WiseSayingController(sc);
        System.out.println("== 명연 SSG ==");

        outer:
        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine().trim();

            Rq rq = new Rq(cmd);

            switch(rq.getPath()) {
                case "명령어":
                    System.out.println("등록 / 목록 / 수정 / 삭제 / 종료");
                    break;
                case "등록":
                    wiseSayingController.regist(rq);
                    break;
                case "목록":
                    wiseSayingController.list(rq);
                    break;
                case "수정":
                    wiseSayingController.modify(rq);
                    break;
                case "삭제":
                    wiseSayingController.delete(rq);
                    break;
                case "종료":
                    break outer;
            }
        }
        sc.close();
    }
}
