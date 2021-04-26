/*
Desert Island Playlist

You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪

Also, this is a chance to put your hard-earned Java skills to the test. Your mission, should you choose to accept it:

Build Playlist.java with the best possible playlist of music using a Java ArrayList. Choose wisely.

https://www.codecademy.com/courses/learn-java/projects/java-desert-island-playlist

*/

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    // Choose 7 songs to take on a desert island...
    desertIslandPlaylist.add("Blue Suede Shoes");
    desertIslandPlaylist.add("A Little Less Conversation");
    desertIslandPlaylist.add("Return to Sender");
    desertIslandPlaylist.add("Jailhouse Rock");
    desertIslandPlaylist.add("Can't Help Falling in Love'");
    desertIslandPlaylist.add("Suspicious Minds");
    desertIslandPlaylist.add("Hound Dog");

    System.out.println("Your seven song playlist is: \n " + desertIslandPlaylist);

    // Can only take 5 songs now...
    desertIslandPlaylist.remove(1); // "...Less Conversation"
    desertIslandPlaylist.remove(1); // "Return to Sender"

    // Change playlist order...
    String song1 = desertIslandPlaylist.get(0);
    String song2 = desertIslandPlaylist.get(3);
    desertIslandPlaylist.set(0, song2);
    desertIslandPlaylist.set(3, song1);

    System.out.println("Your changed song playlist is: \n " + desertIslandPlaylist);

  }
  
}