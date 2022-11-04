package Lab2_2;

public class MainClass {
    public static void printAll(Files[] files){
        System.out.printf("----------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-20s | %10s | %-55s |%n", "File name", "Size", "Details");
        System.out.printf("----------------------------------------------------------------------------------------------%n");
        for (int i=0;i< files.length;i++){
            files[i].print();
        }
    }
    public static void main(String[] args) {
        Files [] files = new Files[4];
        files[0]=new Docx("j110-lab2-hiers.docx", 23212, "docx",2);
        files[1]=new Image("spb-map.png",1703527, "image",1024,3072);
        files[2]=new Audio("06-PrettyGirl.mp3",7893454, "audio", "Eric Clapton, Pretty Girl",328 );
        files[3]=new Video("BackToTheFuture1.avi", 1470984192,"video",  "Back to the future I, 1985", 6488,640,352);
        printAll(files);
    }
}
