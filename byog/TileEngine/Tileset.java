package byog.TileEngine;

import java.awt.Color;

/**
 * Contains constant tile objects, to avoid having to remake the same tiles in different parts of
 * the code.
 *
 * You are free to (and encouraged to) create and add your own tiles to this file. This file will
 * be turned in with the rest of your code.
 *
 * Ex:
 *      world[x][y] = Tileset.FLOOR;
 *
 * The style checker may crash when you try to style check this file due to use of unicode
 * characters. This is OK.
 */

public class Tileset {

    public static TETile PLAYER = new TETile('@', Color.yellow, Color.black, "player",
            "byog/Images/player/d0.png");
    public static final TETile WALL = new TETile('#', new Color(216, 128, 128), Color.darkGray,
            "wall", "byog/Images/wall2.png");
    public static final TETile FLOOR = new TETile('·', new Color(128, 192, 128), Color.black,
            "floor", "byog/Images/floor2.png");
    public static final TETile NOTHING = new TETile(' ', Color.black, Color.black, "nothing",
            "byog/Images/nothing.png");
    public static final TETile GRASS = new TETile('"', Color.green, Color.black, "grass");
    public static final TETile WATER = new TETile('≈', Color.blue, Color.black, "water");
    public static final TETile FLOWER = new TETile('❀', Color.magenta, Color.pink, "flower",
            "byog/Images/bullet2.png");
    public static final TETile LOCKED_DOOR = new TETile('█', Color.orange, Color.black,
            "locked door");
    public static final TETile UNLOCKED_DOOR = new TETile('▢', Color.orange, Color.black,
            "unlocked door", "byog/Images/unlockedDoor.png");
    public static final TETile SAND = new TETile('▒', Color.yellow, Color.black, "sand");
    public static final TETile BOT1 = new TETile('a', Color.gray, Color.black, "bot1",
            "byog/Images/bot/d0.png");
    public static final TETile BOT2 = new TETile('b', Color.gray, Color.black, "bot2",
            "byog/Images/bot/d0.png");
    public static final TETile BOT3 = new TETile('c', Color.gray, Color.black, "bot3",
            "byog/Images/bot/d0.png");
    public static final TETile BOT4 = new TETile('d', Color.gray, Color.black, "bot4",
            "byog/Images/bot/d0.png");
    public static final TETile TREE = new TETile('♠', Color.green, Color.black, "tree");
}


