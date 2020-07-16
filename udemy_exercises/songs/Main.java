package udemy_exercises.songs;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {


        Album blonde = new Album("Blonde", "Frank Ocean");
        blonde.addSong("Nike", 4.6);
        blonde.addSong("Ivy", 4.22);
        blonde.addSong("Pink + White", 4.3);
        blonde.addSong("Be Yourself", 5.6);
        blonde.addSong("Solo", 3.21);
        albums.add(blonde);



        Album mamasGun = new Album("Mama's Gun", "Erykah Badu");
        mamasGun.addSong("Didn't Cha Know", 3.58);
        mamasGun.addSong("My Life", 3.59);
        mamasGun.addSong("...And on", 3.34);
        albums.add(mamasGun);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Solo", playList);
        albums.get(0).addToPlayList("Nike", playList);
        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList(3, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        }


        else {
            System.out.println("Now playing " + listIterator.next().toString());
            showActions();
        }


        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();



            switch(action) {


                case 0:
                    System.out.println("Quiting...");
                    quit = true;
                    break;

                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Error. Now playing " + listIterator.previous().toString());
                        forward = true;
                    }
                    break;




                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Error. Now playing " + listIterator.previous().toString());
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of playlist");
                        }
                    }
                    break;



                case 4:
                    printList(playList);
                    break;


                case 5:
                    showActions();
                    break;

                case 6:
                    if(playList.size() >0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;



            }
        }
    }

    private static void showActions() {
        System.out.println("Available actions:\npress");
        System.out.println(
                "[1] Next\n" +
                "[2] Previous\n" +
                "[3] Replayg\n" +
                "[4] Playlist\n" +
                "[5] Show Options.\n" +
                "[6] Delete song from playlist. \n" +
                "or press [0] to quit");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==========");
    }
}
